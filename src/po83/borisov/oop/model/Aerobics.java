package po83.borisov.oop.model;

public class Aerobics extends AbstractExercise implements Exercise {


    private  int duration; //продолжительность в минутах
    public  static  final  int dur = 3; //время выполнения - упражнения 3 минуты

    public Aerobics (String name, Equipments equipments, Approach[] approaches) // конструктор, принимающий три параметра – название упражнения, используемый спортинвентарь и массив подходов
    {
        super(name, equipments);
        WeightTraining weightTraining = new WeightTraining(name, approaches);
    }

    public  int getDuration() { return  duration; } // метод, возвращающий продолжительность

    public void setDuration(int newDuration) { duration = newDuration; } // метод, возвращающий новое значение продолжительности

}
