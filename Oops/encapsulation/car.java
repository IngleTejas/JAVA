package Oops.encapsulation;

//get and set is used in encapsulation
class car {
    private String maker;
    private String model;
    private int year;

    
//constructor
    car(String maker,String model,int year){
        this.setMaker(maker);
        this.setModel(model);
        this.setYear(year);
    }
    
//get
    public String getMaker(){
        return this.maker;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }

 
//set
    public void setMaker(String maker){
        this.maker=maker;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }

    
}
