package FirstPractice.Head03.example05;

class BusinessUser extends User {
    private String companyName;     // 최소 1개 필드 추가 (회사명)
    private String bizEmail;        // 선택: 비즈니스 이메일

    public BusinessUser(String id, String name, String companyName, String bizEmail) {
        super(id, name);            // 부모 생성자 호출
        this.companyName = companyName;
        this.bizEmail = bizEmail;
    }

    @Override
    public void printUserInfo() {
        // 실습 1: super 호출 O (부모 출력 + 자식 출력 덧붙이기)
        super.printUserInfo();
        System.out.println("회사: " + companyName);
        System.out.println("업무 이메일: " + bizEmail);
    }

    /* ───────── 참고: super 호출 X 버전 (비교 실습용) ─────────
    @Override
    public void printUserInfo() {
        // super.printUserInfo();  // ← 주석 처리: 부모 출력 생략
        // 부모의 기본 정보가 출력되지 않고, 아래 두 줄만 출력됩니다.
        System.out.println("회사: " + companyName);
        System.out.println("업무 이메일: " + bizEmail);
    }
    */
}