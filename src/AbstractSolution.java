public class AbstractSolution  {
    public static String description = "you need to override this method in each problem";
    public static String 中文描述 ="请在每个问题中给出中文描述";
    public static String title ="问题标题";
    /*
    *分割符
    */
    public static String sc="\n\t";
    protected void QuestionDescribe()  {
        Class clazz = this.getClass();
        String title = AbstractSolution.title;
        String description =  AbstractSolution.description;
        String 中文描述 = AbstractSolution.中文描述;
        try{
            title = "题目:"+(String)clazz.getDeclaredField("title").get(this.getClass().getName());
            description = "描述:"+(String)clazz.getDeclaredField("description").get(this.getClass().getName());
            中文描述 = "描述:"+(String)clazz.getDeclaredField("中文描述").get(this.getClass().getName());
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(title);
        System.out.println(description);
        System.out.println(中文描述);
    }

}