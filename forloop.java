public class forloop{
    public static void main( String[] args){

        for(int i= 1; i<=5; i++){
            System.out.println("Day " +i);

            for (int j = 1; j<=10; j++){
                System.out.println("Working Hours " + (j+9) + "---" +(j+10));
            }
        }
        
    }
}
