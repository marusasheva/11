package classwork;


public class PersonalInfo {
    long storage;

    public void setAge(int newage){
       setParam(newage,48);

    }
    public int getAge(){
       return getParam(48);

    }
    public void setWeight(int newweight){
       setParam(newweight,32);

    }
    public int getWeight(){
       return getParam(32);

    }
    public void setYear(int newyear){
       setParam(newyear,0);

    }
    public int getYear(){
       return getParam(0);

    }
    public void setHeight(int newheight){
       setParam(newheight,16);

    }
    public int getHeight(){
       return getParam(16);

    }
    public void setParam(int newparam,int shift){

        long mask=0xFFFFl<<shift;//сдвиг влево
        mask=~mask;//меням значение на противоположное
        storage=storage&mask;
        long age=(long)newparam<<shift;
        storage=storage|age;

    }
    public int getParam(int shift){
        long newparam=storage>>>shift;
        newparam=newparam&0xFFFF;
        return (int)newparam;

    }


}
