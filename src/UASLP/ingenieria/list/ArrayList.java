package UASLP.ingenieria.list;

public class ArrayList <H> implements List<H>{

    //List->Coleccion de elementos que mantienen el orden en el que fueron insertados
    //Ordered->Orden en el que fueron insertados
    //Sorted -> Orden natural, alfabetico, de menor a mayor
    //Tree->sorted
    //Hash->No son ni sorted ni ordered

    //arraylist es un arreglo

    private Object array[];
    private int size;

    public ArrayList(){
        this.array=new Object[10];
    }

    @Override
    public void add(H data) {

        this.array[size++] = data;
    }

    @Override
    public H get(int index) {
        return (H)this.array[index];
    }

    //implementar el iterator y el reverse iterator y que el main funcione igual.

    @Override
    public void delate(int index) {

        for (int i = index; i < size-1; i++) {
            array[i] = array[i + 1];
        }
        size--;

    }

    @Override
    public int getSize() {

        return size;
    }

    @Override
    public Iterator<H> getIterator() {

        return new ForwardIterator();
    }

    @Override
    public void insert(H data, Position position, Iterator<H> it) {

    }

    @Override
    public Iterator<H> getReverseIterator() {
        return new ReverseIterator();
    }

    public class ForwardIterator implements Iterator<H> {

        private int current;
        public ForwardIterator(){ this.current = 0; }

        public ForwardIterator(int currentIndex){ this.current = currentIndex; }

        @Override
        public boolean hasNext(){ return current<size; }

        @Override
        public H next(){
            H data= (H)array[current];
             current++;
            return data;
        }
    }

    public class ReverseIterator implements Iterator<H>{
        private int current;
        public ReverseIterator(){
            this.current = size-1;
        }

        public ReverseIterator(int currentIntex){
            this.current = currentIntex;
        }

        @Override
        public boolean hasNext(){
            return current >= 0;
        }

        @Override
        public H next(){
            H data = (H)array[current];
            current--;
            return data;
        }
    }

}
