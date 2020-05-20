package po83.borisov.oop.model;

public abstract class AbstractExercise implements Exercise {

    private  String name; // название
    private  Equipments equipments; // используемый инвентарь


    public AbstractExercise() // конструктор, не принимающий параметров, инициализирует название пустой строкой, а используемый спортинвентарь – Equipments.NONE
    {
        name = "";
        equipments = Equipments.NONE;
    }

    public AbstractExercise(String name, Equipments equipments) // конструктор, принимающий 2 параметра – название и используемый спортинвентарь
    {
        this.name = name;
        this.equipments = equipments;
    }

    @Override
    public String getName() // метод, возвращающий название
    {
       return  name;
    }

    @Override
    public void setName(String name) // метод, устанавливающий новое значение названия
    {
        this.name = name;
    }

    @Override
    public Equipments getEquipments() // метод, возвращающий используемый спортинвентарь
    {
        return equipments;
    }

    @Override
    public void setEquipments(Equipments equipments) // метод, устанавливающий новое значение спортинвентаря
    {
        this.equipments = equipments;
    }
}
