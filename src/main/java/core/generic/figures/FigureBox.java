package core.generic.figures;

//"mówimy", że nasza klasa generyczna będzie pracować tylko na klasach które implementują Figure
class FigureBox<E extends Figure> {

    private E element;

    public FigureBox(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return getElement().getName();
    }
}
