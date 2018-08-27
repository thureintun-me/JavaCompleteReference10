public class Shipment extends BoxWeight{

    double cost ;
     Shipment(Shipment ob){
       super(ob);
       cost = ob.cost ;
     }
     Shipment(double w,double h,double d , double m,double c){
       super(w,h,d,m);//call super class constructor
       cost = c ;
     }

     //default constructor
     Shipment(){
       super();
       cost = -1;
     }
     Shipment(double len , double m , double c){
       super(len,m);
       cost = c;
     }
}
