package treeCoding;

public class DataStructure {
        int[] tree;
        int[] lazy;
        int n;

        public DataStructure(int[] nums) {
            n = nums.length;
            tree = new int[4 * n];
            lazy = new int[4 * n];
            buildTree(nums, 0, 0, n - 1);
        }

        private void buildTree(int[] nums, int index, int left, int right) {
            if (left == right) {
                tree[index] = nums[left];
                return;
            }
            int mid = left + (right - left) / 2;
            buildTree(nums, 2 * index + 1, left, mid);
            buildTree(nums, 2 * index + 2, mid + 1, right);
            tree[index] = tree[2 * index + 1] + tree[2 * index + 2];
        }

        public void update(int i, int val) {
            updateTree(0, 0, n - 1, i, val);
        }

        private void updateTree(int index, int left, int right, int idx, int val) {
            if (left == right) {
                tree[index] = val;
                return;
            }
            int mid = left + (right - left) / 2;
            if (idx <= mid) {
                updateTree(2 * index + 1, left, mid, idx, val);
            } else {
                updateTree(2 * index + 2, mid + 1, right, idx, val);
            }
            tree[index] = tree[2 * index + 1] + tree[2 * index + 2];
        }

        public int query(int l, int r) {
            return queryTree(0, 0, n - 1, l, r);
        }

        private int queryTree(int index, int left, int right, int qLeft, int qRight) {
            if (lazy[index] != 0) {
                tree[index] += (right - left + 1) * lazy[index];
                if (left != right) {
                    lazy[2 * index + 1] += lazy[index];
                    lazy[2 * index + 2] += lazy[index];
                }
                lazy[index] = 0;
            }


            if (qLeft > right || qRight < left) {
                return 0; // Out of range
            }
            if (qLeft <= left && qRight >= right) {
                return tree[index]; // Current segment is fully within the query range
            }
            int mid = left + (right - left) / 2;
            int leftSum = queryTree(2 * index + 1, left, mid, qLeft, qRight);
            int rightSum = queryTree(2 * index + 2, mid + 1, right, qLeft, qRight);
            return leftSum + rightSum;
        }

        public void set(int l, int r, int val) {
            setTree(0, 0, n - 1, l, r, val);
        }

        private void setTree(int index, int left, int right, int qLeft, int qRight, int val) {
            if (lazy[index] != 0) {
                tree[index] += (right - left + 1) * lazy[index];
                if (left != right) {
                    lazy[2 * index + 1] += lazy[index];
                    lazy[2 * index + 2] += lazy[index];
                }
                lazy[index] = 0;
            }

            if (qLeft > right || qRight < left) {
                return; // Out of range
            }
            if (qLeft <= left && qRight >= right) {
                tree[index] += (right - left + 1) * val;
                if (left != right) {
                    lazy[2 * index + 1] += val;
                    lazy[2 * index + 2] += val;
                }
                return;
            }
            int mid = left + (right - left) / 2;
            setTree(2 * index + 1, left, mid, qLeft, qRight, val);
            setTree(2 * index + 2, mid + 1, right, qLeft, qRight, val);
            tree[index] = tree[2 * index + 1] + tree[2 * index + 2];
        }

        // Test the implementation
        public static void main(String[] args) {
            int[] nums = {1, 3, 5, 7, 9, 11};
            DataStructure segmentTree = new DataStructure(nums);

            System.out.println(segmentTree.query(1, 4)); // Output: 24 (sum of elements from index 1 to 4)

            segmentTree.update(2, 10);
            System.out.println(segmentTree.query(1, 4)); // Output: 29 (after updating index 2 to 10)

            segmentTree.set(0,2,2);
            System.out.println(segmentTree.query(0,5));
        }
        }



