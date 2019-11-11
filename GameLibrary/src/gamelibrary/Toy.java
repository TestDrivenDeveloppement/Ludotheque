/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

/**
 *
 * @author ablo1
 */
public class Toy extends Game implements FactoryGame{
    private String material;

    public Toy(String material, String name, String manufacturer) {
        super(name, manufacturer);
        this.material = material;
    }


    public Toy() {
        super();
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void displayMaterial(Toy toy){
        System.out.println(toy.getMaterial());
    }
    
    @Override
    void displayInfos(){
        System.out.printf("Name : %s ; Manufacturer: %s ; Id : %s ; Statut : %s ; Material : %s%n", getName(), 
                        getManufacturer(), 
                        getId(), 
                        getStatut(),
                        getMaterial());
    }


    public void CreateGame() {
        System.out.println("Inside Toy::CreateGame method.");
    }
    
}
