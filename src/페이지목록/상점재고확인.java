package 페이지목록;

class 상점재고확인 extends 상품탐색페이지{
    private String 입고상품, 매진상품, 혜택;
    private double 가격;

    public void subpage1(String 입고상품, double 가격){
        this.입고상품 = 입고상품; this.가격 = 가격;
        System.out.println("입고 >>");
        System.out.println("상품. " + 입고상품);System.out.println("가격: " + 가격);System.out.println();
    }
    public void subpage2(String 매진상품){
        this.매진상품 = 매진상품;
        System.out.println("매진 >>");
        System.out.println("상품. " + 매진상품);System.out.println();
    }
    public void subpage3(String 혜택){
        System.out.println("혜택 >>");
        System.out.println(혜택);System.out.println();
    }
    @Override
    public void showSubpage() {
        super.showSubpage();
    }
}
