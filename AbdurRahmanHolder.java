
public class AbdurRahmanHolder
{
    private int size;
    private String bucket[];

    public AbdurRahmanHolder(){
        bucket = new String[10];
        size = 0;
    }
    
    public int getSize(){
        return size;
    }
    
    public void addToBucket(String someUserInputString){
        bucket[size] = someUserInputString;
        size++;
        String[] temp = new String[20]; 
        for(int i = 0; i < size; i++){
            temp[i] = bucket [i];
        }
        bucket = temp;
    }
    
    public String getValue(int p) {
       return bucket[p];
    }
    
   public void clear(){
        bucket = new String[10];
        size = 0;
        }            
        
    public void print(){
        for(int i = 0; i < size; i++){
            System.out.println(bucket[i]);
    }
}

    public void remove(int p){
        
        for(int i = p; i < size - 1; i++){
            bucket[i] = bucket[i+1];
        }
        
        bucket[size-1] = null;
        size--;
    }
    
    public void addAgain(int p, String userInput){
        for(int i = size; i > p; i--){
            bucket[i] = bucket[i-1];
        }
        
        bucket[p] = userInput;
        size++;
    }
    
    public void addToEnd(String value){
        bucket[size] = value;
        size++;
    }
    
    public AbdurRahmanHolder cloneClass(){
        
        AbdurRahmanHolder copy = new AbdurRahmanHolder();
        
        for(int i = 0; i < size; i++){
            copy.addToEnd(bucket[i]);
        }
        return copy;
    }
    
    public String[] getBucket(){
        return bucket;
    }
    
    public void replace(int p, String v){
        bucket[p] = v;
    }
    
    public boolean find(String v){
        for(int i = 0; i < size; i++){
            if(bucket[i].equals(v)){
                return true;
            }
        }
        
        return false;
    }
    
    public int findCount(String v){
        
        int count = 0;
        
        for(int i = 0; i < size; i++){
            if(bucket[i].equals(v)){
                count++;
            }
        }
        
        return count;
    }
}