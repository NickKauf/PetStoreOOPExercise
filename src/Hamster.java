public class Hamster extends Animal{
    private String food = "pellets";

    public Hamster(){

    }

    public Hamster(String name, String type, String description, double price, boolean isInStock){
        this.setName(name);
        this.setType(type);
        this.setDescription(description);
        this.setPrice(price);
        this.setInStock(isInStock);
    }


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String getPet(){
        return "Name: "+this.getName()+"\nType: "+this.getType()+"\nDescription: "+this.getDescription()+"\nFood: "+this.getFood();
    }

}
