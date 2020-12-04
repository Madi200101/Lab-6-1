package FractionPackage;

public class Number implements SimpleFraction{
    // числитель дроби
    private final int numerator;
    private final int denominator;
    // знаменатель дроби
    public Number(int n, int d){
        numerator=n;
        denominator=d;
    }
    public int getX(){ return numerator;}
    public int getY(){ return denominator;}
    //------- реализация интерфейса ---------------

public Number multiply(SimpleFraction p){//Произведение дробей
        return new Number(numerator *((Number)p).getX(), denominator *((Number)p).getY());
}
public Number divide(SimpleFraction p){//Частное дробей
        return new Number(numerator*((Number)p).getY(), denominator*((Number)p).getX());

}
public Number add(SimpleFraction p){//сумма дробей
        final int n = ((Number)p).getX();
        final int d = ((Number)p).getY();
        return new Number(numerator *d +denominator *n, denominator *d);
}
public Number subtract(SimpleFraction p){//разность дробей
    final int n = ((Number)p).getX();
    final int d = ((Number)p).getY();
    return new Number(numerator *d -denominator *n, denominator *d);
}
@Override
public String toString()
{return "" + numerator + "/" +denominator;}
    }

