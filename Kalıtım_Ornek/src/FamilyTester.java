public class FamilyTester {
    public static void main(String args[]){
        Grandparent gramps=new Parent();
        gramps.whoAmI();
        Parent papa=new Child();
        papa.whoAmI();
        Child sonny=new Child();
        sonny.whoAmI();
    }
    static class Grandparent{
        public void whoAmI(){
            System.out.println("I am a grandparent");
        }  
    }
    
    static class Parent extends Grandparent{
        public void whoAmI(){
            System.out.println("I am a parent");
        }
    }
    
    static class Child extends Parent{
        public void whoAmI(){
          
        }
    }
}
