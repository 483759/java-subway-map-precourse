package subway.menu;

/**
 * 지하철 프로그램에서 '구간 관리' 메뉴의 기능들을 관리하는 enum 클래스
 *
 * @author 483759@naver.com / 윤이진
 * @version 1.0 2020/12/13
 */
public enum RouteFunction {
    ADD('1'), DELETE('2'), GET_BACK('B');

    final private char menu;

    RouteFunction(char menu) {
        this.menu = menu;
    }

    public char getMenu() {
        return menu;
    }

    public boolean matchMenu(char menu) {
        if (this.menu == menu) {
            return true;
        }
        return false;
    }

}