class Base {
    public void baseMethod() { 
           System.out.println("Base"); 	    
     }
     Base(){
    	super();
 	   System.out.println("Base Constructor");
    }
    
 }
class Derived extends Base {
	 Derived() { System.out.println("Derived Constructor"); }
	
      public void derivedMethod() { 
          super. baseMethod ();
          System.out.println("Derived"); 
       }
  }

class DerivedNext extends Derived {
	DerivedNext(int i) { System.out.println("DerivedNext Constructor " + i); }
	DerivedNext() { System.out.println("DerivedNext Constructor "); }
	
	public void derivedMethod() { 
        super. baseMethod ();
        System.out.println("DerivedNext"); 
     }
}

  class Test {
       public static void main(String args[]){
	 DerivedNext derivednext=new DerivedNext(10);
	derivednext. derivedMethod();
	
	/*
	Derived derived=new Derived();
	derived. derivedMethod();
	*/
        } 
}

