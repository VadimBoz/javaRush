//write code of the Shelf class here
class Shelf<T extends Book> {

    T elem;
    public void setElement (T elem) {
        this.elem = elem;
    }


    public T getElement() {
        return elem;
    }
}
