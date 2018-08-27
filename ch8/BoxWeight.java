//listing 6
class BoxWeight extends Box{
  double weight ;

  BoxWeight(BoxWeight ob){
    super(ob);
    weight = ob.weight;
  }

  //initailize with , height and depth using super
  BoxWeight(double w , double h , double d , double m){
    super(w,h,d); // call superclass constructor
    weight= m ;
  }

  // default constructor
  BoxWeight(){
    super();
    weight = -1 ;
  }

  //constructor used when cube us created
  BoxWeight(double len,double m){
    super(len);
    weight = m ;

  }

}
