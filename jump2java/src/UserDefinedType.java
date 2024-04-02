// 사용자 정의 자료형 UserDefinedType 클래스 정의
public class UserDefinedType {
    // 멤버 변수 선언
    private String name;
    private int idCode;

    // 생성자 정의
    public UserDefinedType(String name, int idCode) {
        this.name = name;
        this.idCode = idCode;
    }

    // 출력 메서드
    public static void main(String[] args) {
        UserDefinedType tmp00 = new UserDefinedType("userint", 0);
        UserDefinedType tmp01 = new UserDefinedType("userStr", 1);
    }
}