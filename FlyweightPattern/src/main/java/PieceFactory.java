// 棋子工厂，负责返回棋子对象
class PieceFactory {
    private Piece[] pieces = {new WhitePiece(), new BlackPiece()};

    public Piece getPiece(int key) {
        if (key == 0) return pieces[0];
        else return pieces[1];
    }
}
