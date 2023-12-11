package cunstrunctor;

public class Non_or_Parameterize {
    int serial;
    String name;
    //todo we can create non- parameterize constructor
    private Non_or_Parameterize(/*zero parameterize*/){
      this.serial =50;
      this.name= "paramvir singh";
    }

    //todo this is parameterize constructor
    public Non_or_Parameterize(int serial, String name){
        this.name=name;
        this.serial=serial;

    }
}
