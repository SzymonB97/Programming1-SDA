package core.generic.figures;

class PrintFigures {

    public static void main(String[] args) {
        FigureBox<Circle> circle = new FigureBox<>(new Circle());
        FigureBox<Square> square = new FigureBox<>(new Square());

        //dzięki '?' nie określamy z góry typu/rodzaju więc możemy go zmieniać na inne
        FigureBox<?> someFigure = new FigureBox<>(new Square());

        System.out.println(circle.getElement().getName());
        System.out.println(square.getElement().getName());
    }
}
