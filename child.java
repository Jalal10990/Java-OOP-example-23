public  class child extends parent {
    private int bayFormNo ;
    child(){
        bayFormNo = 0;
    }
    child(String na,int bay){
     super(na);
     this.bayFormNo=bay;
    }
    public int getBayFormNo(){
       return  bayFormNo;
    }
    public void setBayFormNo(int BayFo){
        this.bayFormNo=BayFo;
    } 
    void displayData(){
        super.displayName();
        System.out.println("The number of child bayform is :"+bayFormNo);
    }

}
