public class MainExam {
    public static void main(String[] args) {
        Exam m = new MathExam(100);
        Exam s = new ScienceExam(89);
        Exam e = new EnglishExam(32);

        System.out.println("In the math exam you have ");
        // System.out.println();
        m.result();
        System.out.println("In the science exam you have ");
        s.result();
        System.out.println("In the english exam you have");
        e.result();

    }

}
