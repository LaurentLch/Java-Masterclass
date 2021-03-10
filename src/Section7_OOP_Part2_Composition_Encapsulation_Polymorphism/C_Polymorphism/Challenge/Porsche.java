package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.C_Polymorphism.Challenge;

//////////////////////////////////////////////////////////////////
class Porsche extends Car{

    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

//////////////////////////////////////////////////////////////////

