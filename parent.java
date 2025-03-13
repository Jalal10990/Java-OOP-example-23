 class parent {
    
    private String name;

    parent(){
        name = "null";
    }
    parent(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    void displayName(){
        System.out.println("The name of parent is :"+name);
    }
}
