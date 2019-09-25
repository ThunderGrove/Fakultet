public class Fakultet{
    public int fakultet(int x){
        if(x<0){
            return -1;
        }

        int result=0;

        for(int i=1;i<=x;i++){
            result=result*i;
        }

        return result;
    }
}