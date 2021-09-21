// Characterクラス。
// 未来の開発者はこれを継承してHeroやWizardを作る。
public abstract class Character {
    protected String name;
    /* : */
    /* キャラが自己紹介を行うメソッド。
        何を話させるかは、それぞれの子クラスで決める
        （今は未定）ため、abstractにしてあります。
      【オーバーライドする未来の開発者様へのお願い】
        あいさつ内容は自由ですが、必ず、以下のようにしてください。
          「私の名前は○○です。」
          「（それぞれのキャラによる自由な発言）」
          「よろしくお願いします。」
    */
    public abstract void introduce();
}