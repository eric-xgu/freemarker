package com.ringo.servlet;


import freemarker.template.Configuration;
import freemarker.template.Template;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "MyServlet",value = "/f02")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Configuration configuration=new Configuration();
        //加载模板上下文与路径
        configuration.setServletContextForTemplateLoading(getServletContext(),"/template");
        //设置模板编码
        configuration.setDefaultEncoding("UTF-8");
        Template template=configuration.getTemplate("news.ftl");
        //设置数据模型
        Map<String,Object> map=new HashMap();
        map.put("title","中共中央 全国人大常委会 国务院 全国政协 中央军委\n" +
                "关于庆祝西藏和平解放70周年的贺电");
        map.put("source","《 人民日报 》");
        map.put("publish_time","（ 2021年08月20日   第 01 版）");
        map.put("content","中共西藏自治区委员会、西藏自治区人大常委会、西藏自治区人民政府、西藏自治区政协、西藏军区：<br>\n" +
                "\n" +
                "　　在庆祝中国共产党百年华诞、开启全面建设社会主义现代化国家新征程、向第二个百年奋斗目标进军之际，我们迎来了西藏和平解放70周年。中共中央、全国人大常委会、国务院、全国政协、中央军委向西藏各族干部群众和各界人士，向驻藏人民解放军指战员、武警部队官兵、公安干警和消防救援队伍指战员，向所有参加和支援西藏建设、关心帮助西藏发展进步的同志们、朋友们，致以热烈的祝贺和亲切的慰问！<br>\n" +
                "\n" +
                "　　70年前西藏和平解放，是西藏历史上具有划时代意义的转折点，不仅彻底驱逐了帝国主义势力，沉重打击了各种分裂势力，有力推进了中国人民解放事业，坚决捍卫了国家主权和领土完整，维护了国家统一和民族团结，而且开辟了百万农奴翻身解放的道路，开启了西藏繁荣进步的光明前程。从此，西藏人民在中国共产党领导下，在社会主义祖国大家庭里，走上了团结进步发展的康庄大道。<br>\n" +
                "\n" +
                "　　70年来，西藏推翻了旧制度、建立了新政权，实行民族区域自治制度，党的民族政策和宗教政策全面贯彻，社会主义建设和改革开放深入推进，社会制度实现历史性跨越，经济社会实现全面发展，人民生活极大改善，城乡面貌今非昔比，实现了从黑暗走向光明、从落后走向进步、从贫穷走向富裕、从专制走向民主、从封闭走向开放的历史性转变。西藏发展进步取得巨大成就，书写了中国共产党百年光辉历程和伟大成就的生动篇章！<br>\n" +
                "\n" +
                "　　党的十八大以来，在以习近平同志为核心的党中央坚强领导下，在全国人民大力支持下，西藏各族人民团结奋斗、顽强拼搏，解决了许多长期想解决而没有解决的难题，办成了许多过去想办而没有办成的大事，脱贫攻坚全面胜利，彻底消除绝对贫困，同全国人民一道步入了全面小康社会，各项事业取得全方位进步、历史性成就。当前西藏社会大局和谐稳定，发展质量不断提升，人民生活水平全面提高，生态安全屏障日益坚实，民族和睦宗教和顺，边疆巩固边境安全，党的建设全面加强，社会主义新西藏呈现勃勃生机。<br>\n" +
                "\n" +
                "　　70年来，西藏翻天覆地的巨大变化充分证明：没有中国共产党就没有新中国，也就没有新西藏，党中央关于西藏工作的方针政策是完全正确的。只有坚持中国共产党领导，坚持中国特色社会主义制度，坚持民族区域自治制度，坚持新时代党的治藏方略，才能实现西藏繁荣进步，才能开创西藏更加美好的未来！<br>\n" +
                "\n" +
                "　　习近平总书记在庆祝中国共产党成立100周年大会上的重要讲话，为全党全国各族人民向第二个百年奋斗目标迈进指明了前进方向、提供了根本遵循。前不久，习近平总书记赴西藏考察调研，充分肯定西藏各项工作取得的成绩，提出实现西藏长治久安和高质量发展的新要求。站在新的历史起点上，西藏各级党委和政府要团结带领全区各族干部群众在党中央的坚强领导下，以习近平新时代中国特色社会主义思想为指导，增强“四个意识”、坚定“四个自信”、做到“两个维护”，牢记“国之大者”，全面贯彻新时代党的治藏方略，坚持以人民为中心的发展思想，坚持稳中求进工作总基调，立足新发展阶段，完整、准确、全面贯彻新发展理念，服务和融入新发展格局，推动高质量发展，深化反分裂斗争，铸牢中华民族共同体意识，推进藏传佛教中国化，保障和改善民生，保护好地球第三极生态，加强边境地区建设，加强党的组织和政权建设，切实抓好稳定、发展、生态、强边四件大事，确保国家安全和长治久安，确保人民生活水平不断提高，确保生态环境良好，确保边疆巩固边境安全，为建设团结富裕文明和谐美丽的社会主义现代化新西藏，为实现中华民族伟大复兴的中国梦作出新的更大贡献！<br>\n" +
                "\n" +
                "　　驻藏人民解放军、武警部队和政法队伍是保卫祖国边疆、维护国家安全、推进西藏长治久安的坚强柱石。要始终牢记党和人民的重托，发扬光荣传统、弘扬优良作风，加强练兵备战、履行职责使命，当好党和人民忠诚卫士，巩固军政军民警民团结，为边疆巩固、民族团结、经济发展、社会和谐再立新功。\n" +
                "\n" +
                "　　让我们更加紧密地团结在以习近平同志为核心的党中央周围，坚定信念、锐意进取，团结一致、顽强拼搏，奋力谱写雪域高原长治久安和高质量发展新篇章！<br>\n" +
                "\n" +
                "　　祝西藏自治区繁荣昌盛！<br>\n" +
                "\n" +
                "　　祝西藏各族人民幸福安康！<br>\n" +
                "\n" +
                "　　全国各族人民大团结万岁！<br>\n" +
                "\n" +
                "　　中共中央    <br>\n" +
                "\n" +
                "　　全国人大常委会    <br>\n" +
                "\n" +
                "　　国务院    <br>\n" +
                "\n" +
                "　　全国政协    <br>\n" +
                "\n" +
                "　　中央军委    <br>\n" +
                "\n" +
                "　　2021年8月19日  <br>\n" +
                "\n" +
                "　　（新华社北京8月19日电）<br");
        //文件存放路径(项目根目录)
        String basepath=req.getServletContext().getRealPath("/");
        File file=new File(basepath+"/html");
        if(!file.exists()){
            file.mkdir();
        }
        //得到生成的文件名
        String filename=System.currentTimeMillis()+".html";
        File file1=new File(file,filename);
        //文件输出流
        FileWriter fileWriter=new FileWriter(file1);

        //生成html
        try {
            template.process(map, fileWriter);
        }catch (Exception e){
            e.printStackTrace();
        }
        fileWriter.close();
    }
}
