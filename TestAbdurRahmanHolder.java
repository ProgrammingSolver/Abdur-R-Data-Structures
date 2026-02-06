public class TestAbdurRahmanHolder
{
    public static void main(String[] args){
        
        AbdurRahmanHolder test = new AbdurRahmanHolder();
        
        for (int i = 0; i < 5; i++) {
            test.addToEnd(String.format("Element %d was added.", i));
        }

        test.print();
        
       //Test getter
       System.out.println("\nElement at index 3:");
       System.out.println(test.getValue(3));
       
       //Test remove
       test.remove(2);
       
       System.out.println("\nAfter removing index 2:");
       test.print();
       
       //Test addAgain
       test.addAgain(1, "X");
       
       System.out.println("\nAfter inserting X at index 1:");
       test.print();
       
       test.clear();
       
       System.out.println("\nAfter clearing:");
       test.print();
       
       System.out.println("Size: " + test.getSize());
    
    
       test.addToEnd("A");
       test.addToEnd("B");
       test.addToEnd("A");
       test.addToEnd("C");
       
       test.print();
       
       System.out.println("Find A: " + test.find("A"));
       System.out.println("Count A: " + test.findCount("A"));
       
       test.replace(1, "Z");
       test.print();
       
       test.remove(0);
       test.print();
       
       AbdurRahmanHolder copy = test.cloneClass();
       System.out.println("Cloned list:");
       copy.print();
       
       test.clear();
       System.out.println("Original cleared:");
       test.print();
       
       copy.print();
       copy.getSize();
    }
}