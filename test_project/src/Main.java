public class Main {


    public static void var_func(Vehicle...T)
    {
        for(Vehicle V:T)
        {
            V.speed();
        }



    }


    public static void do_something( Vehicle T )
    {

        if(T instanceof  Car)
        {
            Car C = (Car) T;
            C.a_func();
        }
        else if (T instanceof  Ship)
        {
            Ship S = (Ship) T;
            S.a_func();

        }
        else if (T instanceof  Plane)
        {
            Plane P = (Plane) T;
            P.a_func();

        }



    }


    public static  void main(String[] args){



        do_something( new Car() );
        do_something( new Ship() );
        do_something( new Plane() );
        var_func( new Car() , new Ship(), new Plane() );







    }





}
