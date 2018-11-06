package inegrationstest;

public class Regnemaskine {

    private KanSumme sum;

    public  Regnemaskine(KanSumme sum){

        this.sum = sum;
    }

    public int add(int a, int b){

        return  sum.laegSammen(a,b) + 1;  // integration test failed
        // unit test i Sum vil passe
        //


    }

    public boolean bla(int a,int b){

        if(this.add(a,b) == 3) {
            return true;
        }
        return false;

    }

    // SumStub sum = new StumStub();  i stedet af sum
}
