// 抽象棋子类，有内部状态颜色和外部状态下棋位置方法
abstract class Piece {
    protected String color;

    public abstract void draw(int x, int y);
}

// 具体化白棋
class WhitePiece extends Piece {
    public WhitePiece() {
        this.color = "white";
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("draw a color" + color + "piece x:" + x + " ,y:" + y);
    }
}

// 具体化黑棋
class BlackPiece extends Piece {
    public BlackPiece() {
        this.color = "black";
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("draw a color" + color + "piece x:" + x + " ,y:" + y);
    }
}