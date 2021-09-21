interface OthelloAI {

	/**
	 * 現在の盤の状態から、次に打つ場所を決める処理.
	 * @param board
	 *            現在の盤状態(8x8のint配列)。0=石なし、1=白、-1=黒。
	 * @return 次に石を打つべきx座標とy座標を格納した要素数2の配列。
	 */
	public int[] decide(int[][] board);
}