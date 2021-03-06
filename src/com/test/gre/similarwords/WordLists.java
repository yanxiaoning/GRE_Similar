package com.test.gre.similarwords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class WordLists {
	private static WordLists wordlists = null; 
	
	
	private static final String a="adj.";
	private static final String v="v.";
	private static final String n="n.";
	private static final String d="adv.";
	
	
	private Map<String, ArrayList<String>> map;
	private Set<String> set;
	private List<String> list;//for view in sequence
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(new WordLists().topKsimilarwords("consent", 5));
		System.out.println(System.currentTimeMillis() - start);
	}
	
	private WordLists () {
		map = new HashMap<String, ArrayList<String>>();
		set = new HashSet<String>();
		list = new ArrayList<String>();
		
		doList_1();
		doList_2();
		doList_3();
		doList_4();
		doList_5();
		doList_6();
		doList_7();
		doList_8();
		doList_9();
		doList_10();

		doList_11();
		doList_12();
		doList_13();
		doList_14();
		doList_15();
		doList_16();
		doList_17();
		doList_18();
		doList_19();
		doList_20();
		
		doList_21();
		doList_22();
		doList_23();
		doList_24();
		doList_25();
		doList_26();
		doList_27();
		doList_28();
		doList_29();
		doList_30();
		
		doList_31();
		doList_32();
		doList_33();
		doList_34();
		doList_35();
		doList_36();
		doList_37();
		doList_38();
		doList_39();
		doList_40();
		
		doList_41();
		doList_42();
		doList_43();
		doList_44();
		doList_45();
		doList_46();
		doList_47();
		doList_48();
		doList_49();
		
		
	}
	
	 public static WordLists getInstance() { 
		    if (wordlists == null) { 
		    	wordlists = new WordLists(); 
		    } 
		    return wordlists; 
		  } 
	
	
    private void doList_1(){
		
String[][] v1={
		{"abandon","放弃,放纵","v./n.","0"},
		
        {"abash","使羞愧,使尴尬","v.","0"},
        {"abat","减轻,减少","v.","0"},
        {"abbreviate","缩短,缩写","v.","0"},
        {"abdicate","退位","v.","0"},
        {"aberrant","越轨的","adj.","0"},
        {"abet","教唆","v.","0"},
       
        
        
        
        {"abeyance","中止,搁置","n.","0"},
        {"abhor","憎恨,嫌恶","v.","0"},
        {"abide","容忍","v.","0"},
        {"abject","极可怜的,卑下的","adj.","0"},
        {"abjure","弃绝","v.","0"},
        {"ablution","净礼,沐浴","n.","0"},
        {"abnegate","否认,放弃","v.","0"},
        {"abolish","废止","v.","0"},
        {"abominate","痛恶","v.","0"},
        {"aboveboard","光明正大地","adj./adv.","0"},
        
        
        
        {"abrade","刮除,磨损","v.","0"},
        {"abreast","并列地","adv.","0"},
        {"abridge","删减","v.","0"},
        {"abrogate","废止","v.","0"},
        {"abscission","切除,脱离","v.","0"},
        {"abscond","潜逃","v.","0"},
        {"absenteeism","旷课,旷工","n.","0"},
        {"absolute","绝对的,完全的,无限制的","adj.","0"},
        {"absolve","赦免","v.","0"},
        {"absorb","吸收,同化","v.","0"},
        
        {"abstain","禁绝,放弃","v.","0"},
        {"abstemious","有节制的","v.","0"},
        {"abstract","摘要,抽象的","n. adj.","0"},
        {"abstruse","深奥难懂的","adj.","0"},
        {"absurd","荒谬的","adj.","0"},
        {"abundant","丰富的","adj.","0"},
        {"abuse","辱骂","n./v.","0"},
        {"abusive","谩骂的,诽谤的,虐待的","adj.","0"},
        {"abut","接界,毗连","v.","0"},
        {"abysmal","无底的，深不可测的,极坏的,糟糕的","adj.","0"},
        
        {"academic","学院的,学术的","adj.","0"},
        {"accede","同意","v.","0"},
        {"accelerate","加速,促进","v.","0"},
        {"accentuate","重读,强调","v.","0"},
        {"access","通路","n.","0"},
        {"accessible","易达到的,易受影响的","adj.","0"},
        {"accessory","附属的,次要的","adj.","0"},
        {"acclaim","欢呼,称赞","v.","0"},
        {"acclimate","使服水土,使适应","v.","0"},
        {"accolade","推崇","v.","0"},
        
        {"accommodate","与...一致,提供食宿","v.","0"},
        {"accomodating","乐于助人的","adj.","0"},
        {"accompany","伴随","v.","0"},
        
        {"accomplice","同谋,帮凶",n,"0"},
    	{"accomplish","完成,成功",v,"0"},
    	{"accord","同意,一致",v+"/"+n,"0"},
    	{"accost","搭讪",v,"0"},
    	{"accountability","负有责任",n,"0"},
    	{"accrete","逐渐增长",v,"0"},
    	{"accrue","增大",v,"0"},
    	{"accumulate","积累",v,"0"},
    	{"accurate","精确的",a,"0"},
    	{"accuse","谴责",v,"0"},
    	
    	{"acerbic","苦涩的,刻薄的",a,"0"},
    	{"acknowledge","承认,致谢",v,"0"},
    	{"acme","顶点极点",n,"0"},
    	{"acolyte","(教士的)助手,侍僧",n,"0"},
    	{"acorn","橡子",n,"0"},
    	{"acoustic","听觉的,有关声音的",a,"0"},
    	{"acquaint","使熟知",v,"0"},
    	{"acquiesce","默许",v,"0"},
    	{"acquired","后天习得的",a,"0"},
    	{"acquisitive","渴望的,贪婪的",a,"0"},
    	
    	{"acquit","宣告无罪,脱卸义务、责任,还清",v,"0"},
    	{"acquittal","开释",n,"0"},
    	{"acrid","辛辣的刻薄的",a,"0"},
    	{"acrimony","尖刻",n,"0"},
    	{"acrobat","杂技演员",n,"0"},
    	{"acrophobia","恐高症",n,"0"},
    	{"acuity","敏锐",n,"0"},
    	{"acumen","敏锐,精明",n,"0"},
    	{"acute","敏锐的",a,"0"},
    	{"adage","格言",n,"0"},
    	
    	{"adamant","强硬固执的",a,"0"},
    	{"adaptable","有适应能力的,可改编的",a,"0"},
    	{"addendum","补充附录",n,"0"},
    	{"addict","沉溺","v./n.","0"},
    	{"additive","添加剂",n,"0"},
    	{"address","处理,致辞",v,"0"},
    	{"adept","老练的",a,"0"},
    	{"adequate","足够的",a,"0"},
    	{"adhere","粘着,坚持",v,"0"},
    	{"adherent","拥护者,信徒",n,"0"},
    	
    	{"adhesive","胶粘的,胶粘剂",a+"/"+n,"0"},
    	{"adjacent","毗连的",a,"0"},
    	{"adjourn","使延期",v,"0"},
    	{"adjunct","附件",n,"0"},
    	{"adjust","调整使适应",v,"0"},
    	{"admire","赞赏",v,"0"},
    	{"admission","许可,入场费,坦白",v+"/"+n+"/"+v,"0"},
    	{"admonish","训诫,警告",v,"0"},
    	{"adobe","土坯",n,"0"},
    	{"adolescent","青春期的,青少年",a+"/"+n,"0"},
    	
    	{"adore","崇拜,热爱",v,"0"},
    	{"adorn","装饰",v,"0"},
    	{"adroit","熟练灵巧的",a,"0"},
    	{"adulate","谄媚",v,"0"},
    	{"adumbrate","预示",v,"0"},
    	{"advent","到来",n,"0"},
    	{"adventitious","偶然的",a,"0"},
    	{"adverse","不利的,相反的,敌对的",a,"0"},
    	{"advertise","做广告",v,"0"},
    	{"advisable","适当可行的",a,"0"},
    	
    	{"advocate","拥护,支持,鼓吹,支持者",v+"/"+n,"0"},
    	{"aegis","盾,保护",n,"0"},
    	{"aerate","充气",v,"0"},
    	{"aerial","空中的",a,"0"},
    	{"aesthete","审美家",n,"0"},
    	{"aesthetic","美学的",a,"0"},
    	{"affable","和蔼而易于交谈的",a,"0"},
    	{"affectation","做作",n,"0"}
};
    	
    	
    	
    	
       //插入单词，插入到库里
      for(int i=0;i<v1.length;i++)
		subInitial(v1[i]);
		
		
		
		
	
		
		
		
	}
    private void doList_2(){
	
	String[][] v1={
	{"affected","假装做作的","adj.","0"},
	{"affidavit","宣誓书","n.","0"},
	{"affiliate","加入,联合","v.","0"},
	{"affinity","密切关系,吸引力","n.","0"},
	{"affirm","确认,肯定","v.","0"},
	{"affix","粘上","v.","0"},
	{"afflict","折磨","v.","0"},
	{"affluent","丰富的","adj.","0"},
	{"affordable","能够支付的","adj.","0"},
	{"affront","冒犯","v.","0"},
	
	{"agenda","议程","n.","0"},
	{"agglomerate","凝聚,结块","v.","0"},
	{"aggrandize","扩张,吹捧","v.","0"},
	{"aggravate","恶化","v.","0"},
	{"aggregate","集合,合计","v.","0"},
	{"aggression","侵略,敌对情绪、行为","n.","0"},
	{"aggressive","好战的,进取的","adj.","0"},
	{"aggressor","侵略者","n.","0"},
	{"aggrieve","使痛苦","v.","0"},
	{"agile","灵活的","adj.","0"},
	
	{"agitate","搅动,使焦虑","v./n.","0"},
	{"agnostic","不可知论的,不可知论者","v./n.","0"},
	{"agog","兴奋的,兴趣强烈的","adj.","0"},
	{"agony","极大的痛苦","n.","0"},
	{"agarian","土地的","adj.","0"},
	{"agreeable","令人舒适的,欣然同意的","adj.","0"},
	{"agronomy","农学","n.","0"},
	{"ail","生病","v.","0"},
	{"airborne","空气传播的","adj.","0"},
	{"airtight","密不透气的","adj.","0"},
	
	{"alabaster","雪白润滑的","adj.","0"},
	{"alacrity","乐意,敏捷","adj.","0"},
	{"albeit","虽然","conj.","0"},
	{"alchemy","炼金术","n.","0"},
	{"alcove","凹室","n.","0"},
	{"alert","警惕的,警报","adj./n.","0"},
	{"alias","化名,别名","n.","0"},
	{"alibi","不在场申辩,证明","n.","0"},
	{"alienate","疏远,离间","v.","0"},
	{"align","排成直线,结盟","v.","0"},
	
	{"alimentary","饮食的,营养的","adj.","0"},
	{"alkali","碱","n.","0"},
	{"allay","缓解","v.","0"},
	{"allege","无据宣称","v.","0"},
	{"allegiance","忠诚,拥护","v./n.","0"},
	{"allegory","寓言","n.","0"},
	{"allergic","过敏的","adj.","0"},
	{"alleviate","缓和","v.","0"},
	{"allocate","分配","v.","0"},
	{"allowance","津贴,承认,允许","n.","0"},

	
	 {"allude","间接提到，暗指",v,"0"},
 	{"alluring","吸引人的，迷人的",a,"0"},
 	{"aloft","在空中",d,"0"},
 	{"aloof","冷淡的，孤零的",a,"0"},
 	{"alphabetical","按字母表顺序的",a,"0"},
 	{"alter","改变",v,"0"},
 	{"alternate","轮流的,轮流,候选人，替代选择",a+v+n,"0"},
 	{"altruism","利他主义，无私",n,"0"},
 	{"aluminium","铝",n,"0"},
 	{"amalgam","混合物",n,"0"},
 	
 	{"amalgamate","合并，混合",v,"0"},
 	{"amass","积聚",v,"0"},
 	{"amateur","业余爱好者",n,"0"},
 	{"ambidextrous","十分灵巧的",a,"0"},
 	{"ambiguous","含糊的",a,"0"},
 	{"ambivalent","有矛盾看法的",a,"0"},
 	{"amble","漫步",n+v,"0"},
 	{"ambush","埋伏",n+v,"0"},
 	{"ameliorate","改善",v,"0"},
 	{"amenable","愿服从的，通情达理的",a,"0"},
 	
 	{"amend","修正",v,"0"},
 	{"amenity","礼仪，令人感到舒适的事物",n,"0"},
 	{"amiable","和蔼亲切的",a,"0"},
 	{"amicable","友好的",a,"0"},
 	{"amity","友好关系",n,"0"},
 	{"amnesia","健忘症",n,"0"},
 	{"amnesty","大赦",n,"0"},
 	{"amorphous","无定形的",a,"0"},
 	{"amortize","分期偿还",v,"0"},
 	{"amphibian","两栖动物，水陆两用飞行器",n,"0"},
 	
 	{"ample","充足的，丰富的",a,"0"},
 	{"amplify","放大",v,"0"},
 	{"amplitude","广阔，广大",n,"0"},
 	{"amulet","护身符",n,"0"},
 	{"amuse","使愉快，逗乐",v,"0"},
 	{"anachronistic","时代错误的",a,"0"},
 	{"anaerobic","厌氧的",a,"0"},
 	{"anagram","变形词",n,"0"},
 	{"analgesia","无痛觉，痛觉丧失",n,"0"},
 	{"analgesic","镇痛剂",n,"0"},
 	
 	{"analogy","相似，类比",n,"0"},
 	{"analyze","分析，分解",v,"0"},
 	{"anarchy","无政府，政治上的混乱",n,"0"},
 	{"anathema","诅咒，被诅咒的人",n,"0"},
 	{"anatomical","解剖学的",a,"0"},
 	{"ancestor","祖先，祖宗",n,"0"},
 	{"ancestry","家系",n,"0"},
 	{"anchor","稳固，固定,锚",v+n,"0"},
 	{"ancillary","辅助的",a,"0"},
 	{"anecdote","短故事，轶事",n,"0"},
 	
 	{"anemia","贫血，贫血症",n,"0"},
 	{"anguish","极大的痛苦",n,"0"},
 	{"angular","有角的，瘦削的",a,"0"},
 	{"anhydrous","无水的",a,"0"},
 	{"animate","活的，有生命的,赋予生命",a+v,"0"},
 	{"animosity","憎恶，仇恨",n,"0"},
 	{"animus","敌意，憎恨",n,"0"},
 	{"annals","编年史",n,"0"},
 	{"annexation","吞并，合并",n,"0"},
 	{"annihilate","消灭",v,"0"},
 	{"annotate","注解",v,"0"},
 	{"announce","宣布，发表，通报...的到来",v,"0"},
 	{"annoy","惹恼，打搅，骚扰",v,"0"},
 	{"annul","宣告无效，取消",v,"0"},
 	{"anomaly","异常，反常，异常事物",n,"0"},
 	{"anonymity","无名，匿名",n,"0"},
 	{"anorexia","厌食症",n,"0"},
 	{"antagonize","使对抗，与...对抗",v,"0"},
 	{"antarctic","南极的",a,"0"},
 	{"antecedent","前事，前辈,先行的",n+a,"0"},
 	{"antediluvian","史前的，陈旧的",a,"0"},
 	{"antenna","触角，天线",n,"0"},
 	{"anterior","较早的，以前的",a,"0"},
 	{"anthem","圣歌，赞美歌，国歌",n,"0"}
};
 	
	
	
	 for(int i=0;i<v1.length;i++)
		subInitial(v1[i]);
	
	}
    private void doList_3(){
    	String[][] v1={
    			{"anthology","选集","n.","0"},
    			    	{"anthropologist","人类学家","n.","0"},
    			    	{"antibiotic","抗生素,抗菌的","n./adj.","0"},
    			{"antibody","抗体","n.","0"},
    			{"antic","古怪的","adj.","0"},
    			{"anticipate","预期,期待","v..","0"},
    			{"antidote","解毒药","n.","0"},
    			 {"antihistamine","抗组胺剂","n.","0"},
    			{"antipathy","反感","n.","0"},
    			 {"antique","古时的,古老的,古董","adj./n.","0"},
    			    	
    			 {"antiseptic","杀菌剂,防腐的","n./adj.","0"},
    			{"antithesis","对立","n.","0"},
    			    {"anvil","主动脉","n.","0"},
    			   {"apex","顶(最高)点","n.","0"},
    			    {"aphorism","格言","n.","0"},
    			    {"aplomb","沉着","n.","0"},
    			    {"apocalyptic","预示世界末日的,启示的","adj.","0"},
    			    {"apocrypha","伪经,伪书","n.","0"},
    			    {"apocryphal","假冒的","adj.","0"},
    			    	
    			    {"apogee","远地点","n.","0"},
    			    {"apologize","道歉,辩解","v.","0"},
    			    {"apoplectic","中风的,愤怒的","adj.","0"},
    			    {"apostasy","脱党,变节","n.","0"},
    			    {"apostate","变节者","n.","0"},
    			   {"apostrophe","撇号","n.","0"},
    			    {"apothecary","药剂师","n.","0"},
    			   {"appall","使惊骇","v.","0"},
    			    {"apparatus","仪器,设备","n.","0"},
    			    {"apparel","(精美的)衣服","n.","0"},
    			    	
    			    {"apparition","幽灵,神奇的现象","n.","0"},
    			    {"appeal","恳求,吸引","v.","0"},
    			   {"appease","安抚,使平静","v.","0"},
    			   {"appellation","名称,称呼","n.","0"},
    			    {"appetite","欲望,食欲,爱好","n.","0"},
    			    {"appetizer","开胃品","n.","0"},
    			    {"appetizing","美味可口的","v./n.","0"},
    			    {"applaud","鼓掌","v.","0"},
    			    {"applause","喝彩,赞许","n.","0"},
    			    {"applicable","可应用的,适合的","adj.","0"},
    			    	
    			    {"applicant","申请人","n.","0"},
    			    {"appoint","任命,指定","v.","0"},
    			    {"apposite","适当的","adj.","0"},
    			    {"appraise","评价","v.","0"},
    			    {"appreciable","明显的","adj.","0"},
    			    {"appreciate","欣赏,感激","v.","0"},
    			    {"apprehend","逮捕,恐惧","v.","0"},
    			    {"apprentice","学徒","n.","0"},
    			    {"apprise","通知,告诉","v./n.","0"},
    			    {"approach","接近,着手处理,方法","v./v./n.","0"},
    			    	
    			    {"approbation","称赞,认可","n.","0"},
    			    	
    			    {"appropriate","拨款，盗用，挪用,恰当的",v+a,"0"},
    			    {"approximate","估计的，大约的",a,"0"},
    			    {"apron","围裙",n,"0"},
    			    {"apropos","适宜的(地)，有关",a+d,"0"},
    			    {"apt","易于的，恰当的",a,"0"},
    			    {"aptitude","适宜，才能，资质",n,"0"},
    			    {"aquatic","水生的，水中的",a,"0"},
    			    {"arabesque","蔓藤图饰",n,"0"},
    			    {"arable","可耕的，适合种植的",a,"0"},
    			    	
    			    {"arbiter","权威人士，泰斗",n,"0"},
    			    {"arbitary","专横的，不理智的",a,"0"},
    			   {"arbitrate","仲裁，公断",v,"0"},
    			    {"arboreal","树木的",a,"0"},
    			    {"arboretum","植物园",n,"0"},
    			    {"arcane","神秘的，秘密的",a,"0"},
    			    {"arch","拱门，拱形,使成弓形",n+v,"0"},
    			    {"archaeology","考古学",n,"0"},
    			   {"archetype","原型，典型例子",n,"0"},
    			    {"archipelago","群岛",n,"0"},
    			    	
    			    {"architect","建筑师",n,"0"},
    			   {"archive","档案室",n,"0"},
    			    {"arctic","北极的，严寒的",a,"0"},
    			    {"ardent","热心的，热烈的",a,"0"},
    			    {"arena","竞技场",n,"0"},
    			    {"argot","隐语，黑话",n,"0"},
    			    {"aria","独唱曲，咏叹调",n,"0"},
    			    {"arid","干旱的，枯燥的",a,"0"},
    			    {"aristocracy","贵族，贵族统治",n,"0"},
    			    {"armada","舰队",n,"0"},
    			    	
    			    {"armistice","停战",n,"0"},
    			    {"armory","军械库",n,"0"},
    			    {"aroma","香气",n,"0"},
    			    {"array","部署,陈列，大批",v+n,"0"},
    			    {"arrest","逮捕，拘留，阻止，抑制",v,"0"},
    			    {"arresting","显著的，引人注意的",a,"0"},
    			    {"arrhythmic","无节奏的，不规则的",a,"0"},
    			    {"arrogant","傲慢的，自大的",a,"0"},
    			    {"arrogate","冒称，霸占",v,"0"},
    			    {"arsenal","军械库",n,"0"},
    			    	
    			    {"arson","纵火",n,"0"},
    			    {"artery","动脉",n,"0"},
    			    {"arthritis","关节炎",n,"0"},
    			    {"articulate","清除说话，接合",v,"0"},
    			    {"artifact","人工制品",n,"0"},
    			    {"artifice","巧办法，诡计",n,"0"},
    			    {"artificial","人造的，假的",a,"0"},
    			    {"artistry","艺术技巧",n,"0"},
    			    {"artless","粗俗的，自然的",a,"0"},
    			    {"ascendancy","统治权，支配力量",n,"0"},
    			    	
    			    	{"ascetic","禁欲的,苦行者",a+n,"0"},
    			    	{"ascribe","归功于，归咎于",v,"0"},
    			    {"aseptic","洁净的，无菌的",a,"0"},
    			    	{"aspect","方面，面貌，外表",n,"0"},
    			    	{"aspen","白杨",n,"0"},
    			    	{"asperity","严酷，粗鲁",n,"0"},
    			    	{"aspersion","诽谤",n,"0"},
    			    	{"asphyxiate","使窒息",v,"0"},
    			    	{"aspiration","抱负",n,"0"},
    			    	{"aspire","有志于",v,"0"},
    			    	{"assail","抨击，猛攻",v,"0"},
    			    	{"assault","突袭",n,"0"},
    			    {"assay","试验，测定",n+v,"0"},
    			    	{"assemble","集合，收集，装配，安装",v+n,"0"},
    			    	{"assent","同意",v,"0"},
    			    	{"assert","断言，主张",v,"0"},
    			    	{"assertive","过分自信的，有进取心的",a,"0"},
    			    	{"assess","评定",v,"0"},
    			    	{"assessment","估计，评价",n,"0"},
    			    	{"asset","资产，财产，有价值的人或物，可取之处",n,"0"},
    			    	{"assiduous","勤勉的，专心的",a,"0"},
    			    	{"assimilate","同化，吸收",v,"0"},
    			    	{"associate","联合的,合伙人,将事物联系",a+n+v,"0"},
    			    	{"assorted","混杂的",a,"0"},
    			    	{"assuage","缓和，减轻",v,"0"},
    			    	{"assume","假定，承担，担任",v,"0"},
    			    	{"assumption","设想，夺取",n,"0"},
    			    	{"assure","想...保证，使确信",v,"0"},
    			    	{"asterisk","星号",n,"0"},
    			    	{"asteroid","小行星",n,"0"},
    			    	{"asthma","哮喘",n,"0"},
    			    	{"astound","使震惊",v,"0"},
    			    	{"astray","迷路的，误入歧途的",a,"0"},
    			    	{"astringent","止血的，收缩的,止血剂，收缩剂",a+n,"0"},
    			    	{"astrolabe","星盘",n,"0"},
    			    	{"astrology","占星学",n,"0"},
    			    	{"astronomical","天文学的，庞大的",a,"0"},
    			    	{"astute","机敏的",a,"0"},
    			    	{"asunder","分离的(地)，化为碎片",a+d,"0"},
    			    	{"asylum","避难所",n,"0"},
    			    	{"asymmetric","不对称的",a,"0"},
    			    	{"athletics","运动，体育",n,"0"},
    			    	{"atonal","(音乐)无调的",a,"0"},
    			    	{"atrocious","残忍的",a,"0"},
    			    	{"atrophy","萎缩，衰退",n,"0"},
    			    	{"attach","将某物附在(另一物)上",v,"0"},
    			    	{"attain","达到，实现",v,"0"}
    			};
    	
    	 for(int i=0;i<v1.length;i++)
    			subInitial(v1[i]);

    	
	
}
    private void doList_4(){
    	String[][] v1={
    			{"attenuate","变薄,变弱",v,"0"},
    					{"attest","证明为真",v,"0"},
    					{"attic","阁楼,顶楼",n,"0"},
    					{"attorney","律师",n,"0"},
    					{"attribute","属性,品质,把...归于",v,"0"},
    					{"attune","使调和",v,"0"},
    					{"auction","拍卖",n,"0"},
    					{"audacious","大胆的,无畏的,愚勇的",a,"0"},
    					{"audible","听的见的",a,"0"},
    					{"augment","增大",v,"0"},
    					
    					{"augur","占卜师,占卜","n./adj.","0"},
    					{"august","威严高贵的",a,"0"},
    					{"auspices","资助",v,"0"},
    					{"auspicious","吉兆的",a,"0"},
    					{"austere","朴素的",a,"0"},
    					{"authentic","真正的,法律证实的",a,"0"},
    					{"authoritarian","独裁主义者,极权主义者",n,"0"},
    					{"autobiograghy","自传",n,"0"},
    					{"autocrat","独裁者",n,"0"},
    					{"autonomy","自治,独立",n,"0"},
    					
    					{"auxiliary","辅助的,协助的,附加的",a,"0"},
    					{"available","可用的",a,"0"},
    					{"avalanche","雪崩",n,"0"},
    					{"avarice","贪财",n,"0"},
    					{"avenge","为...报仇",v,"0"},
    					{"aver","极力声明,断言,确证",v,"0"},
    					{"averse","反对的",a,"0"},
    					{"aversion","憎恨",n,"0"},
    					{"avert","避免",v,"0"},
    					{"aviary","鸟舍",n,"0"},
    					
    					{"avid","渴望的",a,"0"},
    					{"avoid","避开",v,"0"},
    					{"avow","承认",v,"0"},
    					{"awe","敬畏","n./v.","0"},
    					{"awe-inspiring","令人敬畏的",a,"0"},
    					{"awkward","笨拙的",a,"0"},
    					{"awl","尖钻",n,"0"},
    					{"awning","遮阳篷,雨棚",n,"0"},
    					{"awry","扭曲的",a,"0"},
    					{"axiom","公理",n,"0"},
    					
    					{"axis","轴",n,"0"},
    					{"axle","轮轴",n,"0"},
    					{"babble","胡言乱语,喋喋不休,牙牙学语",v,"0"},
    					{"backdrop","(事物)背景,背景幕布",n,"0"},
    					{"backhanded","间接的",a,"0"},
    					{"bacterium","细菌",n,"0"},
    					{"badge","徽章",n,"0"},
    					{"badger","獾,一再烦扰、要求","","0"},
    					{"badinage","打趣",n,"0"},
    					{"bail","保释,保释金",n,"0"},
    			        
    					{"bait","诱饵,逗弄，激怒",n+v,"0"},
    			    	{"bale","大包裹，灾祸，不幸",n,"0"},
    			    	{"baleful","有害的，邪恶的，恶意的",a,"0"},
    			    	{"balk","大方木料,阻碍，(因困难)不愿前进、继续",n+v,"0"},
    			    	{"ballad","歌谣，小曲",n,"0"},
    			    	{"ballast","压舱物",n,"0"},
    			    	{"ballerina","芭蕾舞女演员",n,"0"},
    			    	{"balloon","气球,快速增加",n+v,"0"},
    			    	{"ballot","投票",v+n,"0"},
    			    	
    			    	{"balm","香油，药膏，镇痛剂，安慰物",n,"0"},
    			    	{"balmy","温和的，芳香的，能止痛的",a,"0"},
    			    	{"ban","禁令,明令禁止",n+v,"0"},
    			    	{"banal","陈腐乏味的",a,"0"},
    			    	{"band","带子，收音机波段",n,"0"},
    			    	{"bandage","绷带,用绷带包扎",n+v,"0"},
    			    	{"bane","祸根",n,"0"},
    			    	{"banish","放逐",v,"0"},
    			    	{"banister","(楼梯的)栏杆",n,"0"},
    			    	{"bankrupt","破产",a,"0"},
    			    	
    			    	{"banquet","宴会",n,"0"},
    			    	{"banter","打趣，玩笑",n,"0"},
    			    	{"bar","禁止，阻挡,条，棒",v+n,"0"},
    			    	{"barb","倒钩，批评的话",n,"0"},
    			    	{"barbarous","野蛮的，粗俗的，残暴的",a,"0"},
    			    	{"barbecue","烤肉架，烤肉",n,"0"},
    			    	{"bard","吟游诗人",n,"0"},
    			    	{"bare","暴露,赤裸的",v+a,"0"},
    			    	{"barefaced","公然的，厚颜无耻的",a,"0"},
    			    	{"bargain","交易，物美价廉的东西,讨价还价",n+v,"0"},
    			    	
    			    	{"barge","平地货船，驳船",n,"0"},
    			    	{"bark","犬吠，树皮",v+n,"0"},
    			    	{"barn","谷仓",n,"0"},
    			    	{"barometer","气压计，晴雨表",n,"0"},
    			    	{"baroque","过分雕琢",n+a,"0"},
    			    	{"barrage","弹幕",n,"0"},
    			    	{"barren","贫瘠的，不育的，不结果实的",a,"0"},
    			    	{"barricade","设栅阻挡,栅栏",v+n,"0"},
    			    	{"barrier","路障，障碍",n,"0"},
    			    	{"barter","易货贸易",v,"0"},
    			    	
    			    	{"base","卑鄙的",a,"0"},
    			    	{"bask","晒太阳，取暖",v,"0"},
    			    	{"baste","倒油脂于..",v,"0"},
    			    	{"batch","一批，一炉",n,"0"},
    			    	{"bathetic","假作悲伤的，陈腐的",a,"0"},
    			    	{"baton","指挥棒，警棍",n,"0"},
    			    	{"battalion","军营，军队",n,"0"},
    			    	{"bauxite","铝土岩",n,"0"},
    			    	{"bawdy","淫猥的，好色的",a,"0"},
    			    	{"bazzar","集市，商店集中区",n,"0"},
    			    	
    			    	{"beacon","烽火，灯塔",n,"0"},
    			    	{"beam","大梁，光线",n,"0"},
    			    	{"bearing","关系，意义，方位",n,"0"},
    			    	{"beat","心跳，搅拌",v,"0"},
    			    	{"bedeck","装饰，修饰",v,"0"},
    			    	{"bedlam","混乱，骚乱",n,"0"},
    			    	{"befuddlement","迷惑不解",n,"0"},
    			    	{"begrudge","吝啬，勉强给",v,"0"},
    			    	{"beholder","旁观者，目击者",n,"0"},
    			    	{"behoove","理应，有义务",v,"0"},
    			    	{"belabor","过分冗长地做或说，痛打",v,"0"},
    			    	{"belated","来得太迟的",a,"0"},
    			    	{"beleaguer","围攻，骚扰",v,"0"},
    			    	{"belie","掩饰，证明为假",v,"0"},
    			    	{"belittle","轻视，贬抑",v,"0"},
    			    	{"bellicose","好战的",a,"0"},
    			    	{"belligerence","交战，好战性",n,"0"},
    			    	{"bellwether","领头羊，领导者",n,"0"},
    			    	{"bench","法官席，长凳",n,"0"},
    			    	{"bend","弯曲，屈服",v,"0"},
    			    	{"benediction","祝福，祈祷",n,"0"},
    			    	{"benefactor","行善者，捐助者",n,"0"},
    			    	{"benevolent","善心的，仁心的",a,"0"},
    			    	{"benign","慈祥的",a,"0"},
    			    	{"benison","祝福，赐福",n,"0"},
    			    	{"bent","特长爱好,弯曲的",n+a,"0"},
    			    	{"bequeath","遗赠",v,"0"},
    			    	{"bequest","遗产，遗赠物",n,"0"},
    			    	{"berate","猛烈责骂",v,"0"},
    			    	{"bereft","被剥夺的，丧失的，缺少的",a,"0"},
    			    	{"beset","镶嵌，困扰",v,"0"},
    			    	{"besiege","围攻，困扰",v,"0"},
    			    	{"besmirch","诽谤",v,"0"},
    			    	{"bestial","野兽的，残忍的",a,"0"},
    			    	{"bestow","给予，赐赠",v,"0"},
    			    	{"betray","背叛，暴露",v,"0"},
    			    	{"betroth","许配，和...订婚",v,"0"},
    			    	{"beverage","饮料",n,"0"}
    			};
    	for(int i=0;i<v1.length;i++)
			subInitial(v1[i]);

	
}
    private void doList_5(){
    	String[][] v1={
{"bewilder","使迷惑",v,"0"},
    	 {"bewildering","费解的",a,"0"},
    	{"bibliography","文献学，参考书目",n,"0"},
    	 {"bibliophile","爱书者，藏书家",n,"0"},
    	 {"bicker","为小事争吵",v,"0"},
    	 {"bid","命令",v,"0"},
    	 {"bifurcate","分叉",v,"0"},
    	 {"bigot","(宗教)顽固盲从者，偏执者",n,"0"},
    	 {"bile","胆汁，愤怒",n,"0"},
    	 {"bilingual","说两种语言的",a,"0"},
    	
    	 {"bilk","躲债，骗取",v,"0"},
    	 {"billowy","如波浪般翻滚的",a,"0"},
    	 {"bin","大箱子",n,"0"},
    	 {"biosphere","生物圈",n,"0"},
    	 {"biped","两足动物",n,"0"},
    	 {"bit","钻头",n,"0"},
    	 {"bizarre","怪异的",a,"0"},
    	 {"blade","刀锋",n,"0"},
    	 {"blanch","使变白，使(脸色)变苍白",v,"0"},
    	 {"bland","情绪平稳的",a,"0"},
    	
    	 {"blandishment","奉承",n,"0"},
    	 {"blasphemy","渎神",n,"0"},
    	 {"blast","一阵(大风)，冲击波,爆破，枯萎",n+v,"0"},
    	 {"blatant","厚颜无耻的，显眼的，炫耀的",a,"0"},
    	 {"blazon","纹章，装饰,精确描绘",n+v,"0"},
    	 {"bleach","漂白,漂白剂",v+n,"0"},
    	 {"bleak","寒冷的，阴沉的，阴郁的",a,"0"},
    	 {"blemish","损害，玷污,瑕疵",v+n,"0"},
    	 {"blight","枯萎病,使枯萎",n+v,"0"},
    	 {"bliss","狂喜，极大的幸福，天赐之福",n,"0"},
    	
    	 {"blithe","快乐的，无忧无虑的",a,"0"},
    	 {"blizzard","暴风雪",n,"0"},
    	 {"blockade","封锁",v+n,"0"},
    	 {"blockage","障碍物",n,"0"},
    	 {"blooming","有花的，精力旺盛的",a,"0"},
    	 {"blotch","(皮肤)斑点，墨斑",n,"0"},
    	 {"blowhard","自吹自擂者",n,"0"},
    	 {"blue","忧伤的，沮丧的",a,"0"},
    	 {"blueprint","蓝图，方案",n,"0"},
    	 {"blunder","犯大错，笨拙的做,愚蠢之举",v+n
    			,"0"},
    	
    	 {"blunt","钝的，直率的,变钝",a+v,"0"},
    	 {"blur","模糊不清的事物,使模糊",n+v,"0"},
    	 {"blurb","简介，书籍套上的推荐广告",n,"0"},
    	 {"blurt","脱口而出",v,"0"},
    	 {"blush","因某事脸红,(脸)红晕",v+n,"0"},
    	{"bluster","(风)猛刮",v,"0"},
    	{"blustering","大吵大闹的",a,"0"},
    	{"boast","自夸",v+n,"0"},
    	{"bodyguard","保镖，侍卫",n,"0"},
    	{"bog","沼泽,使陷入泥沼",n+v,"0"},
     
           {"boggle","畏缩不前，使退缩",v,"0"},
        	{"bogus","假的",a,"0"},
        	{"boisterous","喧闹的，猛烈的",a,"0"},
        	{"bolster","枕垫,支持，鼓励",n+v,"0"},
        	{"bolt","急逃,螺栓，门闩",v+n,"0"},
        	{"bombast","高调，夸大之辞",n,"0"},
        	{"bondage","奴役，束缚",n,"0"},
        	{"bonnet","圆帽，扁平软帽",n,"0"},
        	{"boom","繁荣时期,发出深沉有回响的声音",n+v,"0"},
        	{"boon","恩惠，天赐福利",n,"0"},
        	
        	{"boor","乡巴佬",n,"0"},
        	{"boost","往上推，增加，增高",v,"0"},
        	{"bootless","无益处的，无用的",a,"0"},
        	{"bore","钻孔，使厌烦,孔，令人厌烦的人",v+n,"0"},
        	{"boredom","厌烦，令人厌烦的事物",n,"0"},
        	{"botany","植物学",n,"0"},
        	{"boulder","巨砾",n,"0"},
        	{"bouquet","花束，芳香",n,"0"},
        	{"bourgeois","中产阶级的，小市民的",a,"0"},
        	{"bout","一回合，一阵",n,"0"},
        	
        	{"boycott","抵制",v,"0"},
        	{"brace","使稳固,支撑物",v+n,"0"},
        	{"bracelet","手镯",n,"0"},
        	{"bracing","令人振奋的",a,"0"},
        	{"bracket","支架",n,"0"},
        	{"brag","吹嘘",v,"0"},
        	{"braggadocio","吹牛大王，大吹大擂",n,"0"},
        	{"braggart","吹牛者",n,"0"},
        	{"braid","穗子，发辫,编成辫子",n+v,"0"},
        	{"brake","刹车,减速",v+n,"0"},
        	
        	{"brandish","(威胁性的)挥舞",v,"0"},
        	{"brash","性急的，无礼的",a,"0"},
        	{"brassy","厚脸皮的，无礼的",a,"0"},
        	{"brat","孩子，顽童",n,"0"},
        	{"bravado","故作勇敢，虚张声势",n,"0"},
        	{"bravura","华美乐段,华美的，显示技巧的",n+a,"0"},
        	{"brawl","争吵，打架",v+n,"0"},
        	{"brazen","厚脸皮的",a,"0"},
        	{"breach","裂缝，缺口,打破，裂开，违背",n+v,"0"},
        	{"breadth","宽度",n,"0"},
        	
        	{"breed","繁殖，教养,品种",v+n,"0"},
        	{"bribe","贿赂",v,"0"},
        	{"bricklayer","泥瓦匠",n,"0"},
        	{"bridle","马笼头",n,"0"},
        	{"brink","(峭壁的)边沿",n,"0"},
        	{"brisk","敏捷活泼的，清新健康的",a,"0"},
        	{"bristle","短而硬的毛发,竖起，发怒",n+v,"0"},
        	{"brittle","易碎的，脆弱的",a,"0"},
        	{"broach","开(瓶)，提出(讨论)",v,"0"},
        	{"brochure","小册子，说明书",n,"0"},
        	
        	{"broker","经纪人",n,"0"},
        	{"bromide","平庸的人或话，镇静剂，安眠药",n,"0"},
        	{"brood","一窝幼鸟,孵蛋，冥想",n+v,"0"},
        	{"brook","小河",n,"0"},
        	{"browbeat","欺侮，吓唬",v,"0"},
        	{"bruise","受伤，擦伤",v,"0"},
        	{"bruit","散布(谣言)",v,"0"},
        	{"brunt","主要冲击力或影响",n,"0"},
        	{"brusque","唐突的，鲁莽的",a,"0"},
        	{"brutal","残忍的，严酷的",a,"0"},
        	{"buck","反对,雄鹿，雄兔",v+n,"0"},
        	{"bucket","圆桶",n,"0"},
        	{"bucolic","乡村的，牧羊的",a,"0"},
        	{"bud","芽蕾",n,"0"},
        	{"budge","移动一点，改变立场",v,"0"},
        	{"budget","预算",n,"0"},
        	{"buffoon","丑角，粗笨的人",n,"0"},
        	{"bulb","植物的球茎，灯泡",n,"0"},
        	{"bulge","膨胀，鼓起",n+v,"0"},
        	{"bulk","体积，数量，大多数",n,"0"},
        	{"bully","恃强凌弱，猥亵,欺负别人者",v+n,"0"},
        	{"bumptious","傲慢的，自夸的",a,"0"},
        	{"bungle","笨拙的做",v,"0"},
        	{"buoy","浮标，救生圈,支持，鼓励",n+v,"0"},
        	{"buoyant","有浮力的，快乐的",a,"0"},
        	{"bureaucracy","官僚政治",n,"0"},
        	{"burgeon","迅速成长，发展",v,"0"},
        	{"burial","埋葬，埋藏",n,"0"},
        	{"burlesque","讽刺或滑稽的戏剧",n,"0"},
        	{"burnish","擦亮，磨光",v,"0"},
        	{"bust","半身(雕)像",n,"0"},
        	{"butt","用头抵撞，顶撞,粗大的一端，烟蒂",v+n,"0"},
        	{"buttress","拱墙,支持",n+v,"0"},
        	{"byline","(列作者名字的)报刊文章首行",n,"0"},
        	{"byproduct","副产品，副作用",n,"0"},
        	{"bystander","旁观者",n,"0"},
        	{"byzantine","迷宫似的，难变更的",a,"0"},
        	{"cabal","政治阴谋小集团",n,"0"},
        	{"cabinet","橱柜，内阁",n,"0"},
        	{"cache","贮藏处,将...藏于",n+v,"0"},
        	{"cacophony","难听的声音",n,"0"},
        	{"cadet","军校或警校的学员",n,"0"},
        	{"cadge","乞讨，占便宜",v,"0"},
        	{"cajole","哄骗",v,"0"}
};
        	
	for(int i=0;i<v1.length;i++)
			subInitial(v1[i]);

        	

    		
}
    private void doList_6(){
    	String[][] v1={
{"calamity","大灾",n,"0"},
    	{"calcium","钙",n,"0"},
    	{"calculated","蓄意的",a,"0"},
    	{"calculating","深谋远虑的",a,"0"},
    	{"calculus","微积分，结石",n,"0"},
    	{"caldron","大锅",n,"0"},
    	{"calibrate","量口径，校准",v,"0"},
    	{"calipers","测径双脚规",n,"0"},
    	{"calligraphy","书法",n,"0"},
    	{"callous","结硬块的",a,"0"},
    	
    	{"callow","(鸟)未生羽毛的，(人)未成熟的",a,"0"},
    	{"calorie","卡路里",n,"0"},
    	{"calumniate","诽谤",v,"0"},
    	{"calumny","诽谤",n,"0"},
    	{"cameo","浮雕宝石，生动刻画，出演",n,"0"},
    	{"camouflage","伪装",n+v,"0"},
    	{"campaign","战役，竞选活动",n,"0"},
    	{"canary","金丝雀，女歌星",n,"0"},
    	{"candid","率直的",a,"0"},
    	{"candidacy","候选人资格",n,"0"},
    	
    	{"candor","坦白，率直",n,"0"},
    	{"cane","拐杖",n,"0"},
    	{"canine","犬的，似犬的",a,"0"},
    	{"canny","精明仔细的",a,"0"},
    	{"canon","经典",n,"0"},
    	{"canonical","按照教规的",a,"0"},
    	{"canopy","蚊帐",n,"0"},
    	{"cant","斜面，术语，黑话,使倾斜",n+v,"0"},
    	{"cantankerous","脾气坏的，好争吵的",a,"0"},
    	{"canto","(长诗的)篇",n,"0"},
    	
    	{"canvas","画布，帆布",n,"0"},
    	{"canvass","细查，拉选票",v,"0"},
    	{"canyon","峡谷",n,"0"},
    	{"cape","披肩，海角",n,"0"},
    	{"capillary","毛细血管",n,"0"},
    	{"capitulate","投降",v,"0"},
    	{"caprice","奇思怪想，变化无常，任性",n,"0"},
    	{"capsule","荚，胶囊",n,"0"},
    	{"caption","标题",n,"0"},
    	{"captious","吹毛求疵的",a,"0"},
    	
    	{"captivate","迷惑，吸引",v,"0"},
    	{"capture","俘获，赢得,战利品",v+n,"0"},
    	{"carafe","玻璃瓶",n,"0"},
    	{"carapace","甲壳",n,"0"},
    	{"carbohydrate","碳水化合物",n,"0"},
    	{"carcinogen","致癌物",n,"0"},
    	{"cardinal","最重要的,红衣主教",a+n,"0"},
    	{"cardiologist","心脏病专家",n,"0"},
    	{"caress","爱抚",n+v,"0"},
    	{"careworn","饱经折磨的",a,"0"},
     
           {"cargo","货物",n,"0"},
        	{"caricature","讽刺画，滑稽模仿",n,"0"},
        	{"carnivorous","肉食的",a,"0"},
        	{"carol","颂歌,欢唱",n+v,"0"},
        	{"carouse","寻欢作乐",n,"0"},
        	{"carp","鲤鱼,吹毛求疵",n+v,"0"},
        	{"carpenter","木匠",n,"0"},
        	{"carrion","腐肉",n,"0"},
        	{"cartographer","绘制地图者",n,"0"},
        	{"carve","雕刻，切成片",v,"0"},
        	
        	{"cast","演员阵容，剧团,扔，铸造",n+v,"0"},
        	{"caste","社会等级",n,"0"},
        	{"castigate","惩治，严责",v,"0"},
        	{"casual","偶然的",a,"0"},
        	{"casualty","伤亡事故",n,"0"},
        	{"cataclysm","剧变，灾难",n,"0"},
        	{"catalyst","催化剂，促使事情发展的因素",n,"0"},
        	{"catastrophe","突如其来的大灾难",n,"0"},
        	{"categorical","无条件的,分类的",a,"0"},
        	{"cater","迎合，提供饮食及服务",v,"0"},
        	
        	{"caterpillar","毛毛虫",n,"0"},
        	{"catharsis","宣泄，净化",n,"0"},
        	{"cathedral","主教堂",n,"0"},
        	{"catholic","普遍的，广泛的，宽厚的",a,"0"},
        	{"caucus","政党高层会议",n,"0"},
        	{"caulk","填塞",v,"0"},
        	{"causal","因果关系的",a,"0"},
        	{"caustic","腐蚀的，刻薄的,腐蚀剂",a+n,"0"},
        	{"cauterize","烧灼以消毒或止血",v,"0"},
        	{"cavalier","骑士",n,"0"},
        	
        	{"cavalry","骑兵部队，装甲部队",n,"0"},
        	{"caveat","警告",n,"0"},
        	{"cavern","大洞穴",n,"0"},
        	{"cavil","挑毛病，吹毛求疵",v,"0"},
        	{"cavity","洞，腔",n,"0"},
        	{"cavort","欢跃",v,"0"},
        	{"cede","割让，放弃",v,"0"},
        	{"celebrated","有名的",a,"0"},
        	{"celebrity","名声，知名人士",n,"0"},
        	{"celestial","天体的，天上的",a,"0"},
        	
        	{"cellar","地下室，酒窖",n,"0"},
        	{"cello","大提琴",n,"0"},
        	{"cement","水泥，胶粘剂,粘合，巩固",n+v,"0"},
        	{"censor","审查",v,"0"},
        	{"census","人口统计",n,"0"},
        	{"centaur","人头马",n,"0"},
        	{"centigrade","摄氏度的",a,"0"},
        	{"centralization","集中，集权",n,"0"},
        	{"centurion","古罗马的百人队长",n,"0"},
        	{"ceramic","陶瓷制品,陶器的",n+a,"0"},
        	
        	{"cereal","谷类，谷类食品",n,"0"},
        	{"cerebral","大脑的，深思的",a,"0"},
        	{"ceremonious","仪式隆重的",a,"0"},
        	{"ceremony","典礼，仪式",n,"0"},
        	{"certainty","确定的事情",n,"0"},
        	{"certification","证明",n,"0"},
        	{"certitude","确定无疑",n,"0"},
        	{"cessation","中止",n,"0"},
        	{"cession","割让",n,"0"},
        	{"chafe","擦热，擦痛，激怒",v,"0"},
        	{"chaff","谷壳，米糠",n,"0"},
        	{"chagrin","失望，懊恼",n+v,"0"},
        	{"chalice","大酒杯，圣餐杯",n,"0"},
        	{"chameleon","变色龙，善变之人",n,"0"},
        	{"champion","冠军，斗士，拥护者,拥护",n+v,"0"},
        	{"championship","冠军头衔，锦标赛",n,"0"},
        	{"chancellor","大臣，总理，首席法官，大学校长",n,"0"},
        	{"chandelier","枝形吊灯",n,"0"},
        	{"chant","圣歌,歌唱，背诵",n+v,"0"},
        	{"chaos","混乱",n,"0"},
        	{"chapel","小教堂",n,"0"},
        	{"char","烧焦",v,"0"},
        	{"characteristic","有特色的，典型的,特征",a+n,"0"},
        	{"characterization","描绘，刻画",n,"0"},
        	{"characterize","描绘，刻画",v,"0"},
        	{"charade","用动作表演的字谜游戏",n,"0"},
        	{"charisma","领袖气质，魅力",n,"0"},
        	{"charity","仁慈，施舍",n,"0"},
        	{"charlatan","江湖郎中，骗子",n,"0"},
        	{"charm","魅力，咒语，,吸引，迷住",n+v,"0"},
        	{"charter","特权，豁免权",n,"0"},
        	{"chary","小心的",a,"0"},
        	{"chase","雕镂，追捕",v,"0"},
        	{"chasm","深渊，大沟，大差别",n,"0"},
        	{"chaste","贞洁的，朴实的",a,"0"},
        	{"chastise","严厉惩罚，谴责",v,"0"},
        	{"chauvinistic","沙文主义的",a,"0"},
        	{"check","突然停止，阻止",v,"0"},
        	{"chef","厨师",n,"0"},
        	{"cherubic","胖乎乎而天真无邪的",a,"0"},
        	{"chicanery","轨迹，狡诈",n,"0"},
        	{"chide","叱责",v,"0"},
        	{"chimera","神话怪物，梦幻",n,"0"},
        	{"chip","薄片，碎片，集成电路片",n,"0"},
        	{"chipmunk","花栗鼠",n,"0"},
        	{"chisel","凿",n+v,"0"},
        	{"chivalrous","武士精神的，对女人彬彬有礼的",a,"0"},
        	{"choice","上等的",a,"0"},
        	{"choir","唱诗班",n,"0"},
        	{"choke","窒息，阻塞",v,"0"},
        	{"choleric","暴躁的",a,"0"},
        	{"chord","和弦",n,"0"},
        	{"choreography","舞蹈，编舞",n,"0"},
        	{"chorus","合唱队",n,"0"}
};

for(int i=0;i<v1.length;i++)
			subInitial(v1[i]);
        	
			

}
    private void doList_7(){
    	    String[][] v1={
{"chromatic","彩色的",a,"0"},
{"chromosome","染色体",n,"0"},
{"chronic","慢性的",a,"0"},
{"chrysanthemum","菊花",n,"0"},
{"chuckle","轻声笑",v,"0"},
{"churl","粗鄙之人",n,"0"},
{"cinder","余烬，煤渣",n,"0"},
   {"cipher","零，无影响力的人，密码",n,"0"},
{"circuit","环行，线路，电路",n,"0"},
 {"circuitous","绕圈子的",a,"0"},
    		
{"circulate","循环，流通",v,"0"},
{"circumference","周围，圆周，周长",n,"0"},
{"circumlocution","迂回累赘的陈述",n,"0"},
{"circumscribe","限制",v,"0"},
{"circumstantial","不重要的，偶然的，描述详细的",a,"0"},
{"circumvent","回避，用计谋规避",v,"0"},
{"cistern","贮水池",n,"0"},
{"cite","引用",v,"0"},
{"civil","国内的，公民的，文明的",a,"0"},
{"civilian","平民",n,"0"},
    		
{"civility","斯文",n,"0"},
{"claim","要求，索要",v,"0"},
{"clairvoyance","超人的洞察力",n,"0"},
{"clam","蛤蛎，守秘密的人",n,"0"},
{"clamor","吵闹",n,"0"},
{"clamp","钳子",n,"0"},
{"clandestine","秘密的",a,"0"},
  {"clannish","排他的",a,"0"},
{"clarify","澄清",v,"0"},
{"clash","冲突，撞击",v,"0"},
    		
{"clasp","钩子，扣子，紧握",n,"0"},
  {"classify","分类，归类",v,"0"},
  {"clause","从句,条款",n,"0"},
{"clay","黏土",n,"0"},
{"cleft","裂缝,劈开的",n+a,"0"},
{"clemency","温和，仁慈宽厚",n,"0"},
{"clement","仁慈的",a,"0"},
{"climax","顶点，高潮",n,"0"},
{"clinch","钉牢,最后确定",v,"0"},
{"cling","紧抓住，舍不得放弃",v,"0"},
    		
{"clinical","临床的，冷静客观的",a,"0"},
{"clip","夹子，别针,修剪",n+v,"0"},
{"clipper","大剪刀，快速帆船",n,"0"},
{"clique","朋党派系",n,"0"},
{"clog","障碍,阻塞",n+v,"0"},
 {"cloister","修道院",n,"0"},
{"closet","壁橱,秘密的",n+a,"0"},
 {"clot","凝块,使凝固",n+v,"0"},
{"cloture","辩论的终结",n,"0"},
{"cloudburst","豪雨",n,"0"},
    	 
{"clout","用手猛击，权利，影响力",n,"0"},
{"clown","小丑,扮小丑",n+v,"0"},
{"cloying","甜得发腻的",a,"0"},
{"clumsy","笨拙的，拙劣的",a,"0"},
{"cluster","束，群,成群",n+v,"0"},
{"coagulant","凝结剂，凝血剂",n,"0"},
{"coagulate","使凝结",v,"0"},
{"coalesce","联合，合并",v,"0"},
{"coalition","联合，结合",n,"0"},
{"coarse","粗糙的，低劣的粗俗的",a,"0"},
    	    	
{"coarsen","使粗糙",v,"0"},
{"coax","哄，诱",v,"0"},
{"cob","玉米棒子，雄天鹅",n,"0"},
{"cobbler","补鞋匠",n,"0"},
 {"cocoon","茧",n,"0"},
  {"coda","乐曲的尾声",n,"0"},
{"coddle","溺爱，悉心照料",v,"0"},
 {"code","密码，法典,编码",n+v,"0"},
{"codify","将法律编成法典",v,"0"},
 {"coerce","强迫，压制",v,"0"},
    	    	
 {"coercion","强制，高压统治",n,"0"},
  {"coeval","同年代的",a,"0"},
{"congent","有说服力的",a,"0"},
{"cogitate","慎重思考",v,"0"},
{"cognizance","认识",n,"0"},
 {"cognizant","认识的",a,"0"},
{"cohabit","共栖",v,"0"},
{"coherent","连贯的，一致的",a,"0"},
{"cohesion","凝聚力",n,"0"},
{"cohesive","凝聚的",a,"0"},
    	    	
{"coincide","巧合，一致",v,"0"},
{"colander","漏勺",n,"0"},
{"cold-blooded","冷血残酷的",a,"0"},
{"collaborate","合作，通敌",v,"0"},
{"collage","拼贴画",n,"0"},
{"collapse","坍塌，虚脱",v,"0"},
{"collar","衣领，戴在动物颈部的项圈",n,"0"},
{"collate","对照，核对",v,"0"},
{"collateral","平行的，旁系的,担保品",a+n,"0"},
{"collected","泰然自若的",a,"0"},
    	    	
{"collection","收藏品",n,"0"},
{"collision","碰撞，冲突",n,"0"},
{"colloquial","口语的，口头的",a,"0"},
{"colloquium","学术讨论会",n,"0"},
{"collude","串通",v,"0"},
{"colon","冒号",n,"0"},
{"colonize","建立殖民地",v,"0"},
{"colonnade","柱廊",n,"0"},
{"colony","菌群",n,"0"},
{"coloration","着色法，颜色，色泽",n,"0"},
    	    	
{"colossal","巨大的，庞大的",a,"0"},
{"colossus","巨人，巨型雕像",n,"0"},
{"coltish","似小马的，不受拘束的",a,"0"},
{"coma","昏迷状态",n,"0"},
{"comatose","昏迷的",a,"0"},
{"combat","搏斗",n+v,"0"},
{"combustible","易燃的，易激动的",a,"0"},
{"comedienne","女谐星",n,"0"},
{"comely","动人的，美丽的",a,"0"},
{"comic","可笑的，喜剧的",a,"0"},
{"comity","礼让，礼仪",n,"0"},
{"comma","逗号",n,"0"},
{"commemorate","纪念(伟人,大事件)",v,"0"},
{"commence","开始，着手",v,"0"},
{"commencement","开始，大学毕业典礼",n,"0"},
{"commensurate","等大的，相称的",a,"0"},
{"commentary","实况报道，(书的)集注",n,"0"},
{"commingle","掺和，混合",v,"0"},
{"commission","委托，佣金",n,"0"},
{"commit","托付，承诺，犯罪",v,"0"},
{"commited","尽忠的",a,"0"},
{"commodious","宽敞的",a,"0"},
{"commodity","商品",n,"0"},
{"commonplace","平常的",a,"0"},
{"commonwealth","共和国",n,"0"},
{"commotion","骚乱",n,"0"},
{"communal","共享的",a,"0"},
{"commune","公社,与...亲密交谈",n+v,"0"},
{"communicate","传送信息，沟通",v,"0"},
{"commute","交换",v,"0"},
{"compact","结实的，简洁的,合同",a+n,"0"},
{"companion","比较，比喻",n,"0"},
{"compartment","隔间，车厢",n,"0"},
{"compass","指南针，界限，范围",n,"0"},
{"compassion","同情",n,"0"},
{"compatible","相容的",a,"0"},
{"compatriot","同胞",n,"0"},
{"compel","强迫",v,"0"},
{"compelling","引起兴趣的",a,"0"},
{"compendium","简要，概略",n,"0"},
{"compensate","补偿，赔偿",v,"0"},
{"competence","胜任，能力",n,"0"},
{"compile","汇集，编辑",v,"0"}
    	    	
    	    	

    	};
		
	
for(int i=0;i<v1.length;i++)
			subInitial(v1[i]);
}
    private void doList_8(){
    	String[][] v1={
{"comlacency","满足，安心",n,"0"},
    	{"complaisance","彬彬有礼，殷勤，柔顺",n,"0"},
    	{"complaisant","顺从的，讨好的",a,"0"},
    	{"complementary","互补的",a,"0"},
    	{"comliant","顺从的",a,"0"},
    	{"complicate","使复杂化",v,"0"},
    	{"compliment","恭维",v+n,"0"},
    	{"component","成分，零部件",n,"0"},
    	{"compose","写，创作,组成",v,"0"},
    	{"composed","镇定的",a,"0"},
    	
    	{"compost","混合肥料",n,"0"},
    	{"compsure","沉着自若",n,"0"},
    	{"compound","复合物",n,"0"},
    	{"comprehend","理解,包括",v,"0"},
    	{"comprehensible","能充分理解的",a,"0"},
    	{"comprehensive","全面综合的",a,"0"},
    	{"compress","压缩，浓缩",v,"0"},
    	{"compromise","妥协,危害",v,"0"},
    	{"compulsion","强迫,难以抗拒的冲动",n,"0"},
    	{"compunction","良心不安，懊悔",n,"0"},
    	
    	{"concatenate","连结",v,"0"},
    	{"concave","凹的",a,"0"},
    	{"conceal","隐藏，隐瞒",v,"0"},
    	{"concede","承认，让步",v,"0"},
    	{"conceit","自负",n,"0"},
    	{"conceive","构想，想象，怀孕",v,"0"},
    	{"concentrate","聚集，浓缩",v,"0"},
    	{"conception","概念",n,"0"},
    	{"concerto","协奏曲",n,"0"},
    	{"concession","让步",n,"0"},
    	
    	{"conciliate","安抚，驯服",v,"0"},
    	{"conciliatory","调和的，抚慰的",a,"0"},
    	{"concise","简洁的",a,"0"},
    	{"conclave","秘密会议",n,"0"},
    	{"conclusive","最后的，结论的,确凿的",a,"0"},
    	{"concomitant","伴随而来的",a,"0"},
    	{"concord","公约,和睦",n,"0"},
    	{"concrete","具体存在的,混凝土",a+n,"0"},
    	{"concur","意见相同，一致",v,"0"},
    	{"concussion","脑震荡，强烈震动",n,"0"},
    	
    	{"condemn","极力谴责；判刑",v,"0"},
    	{"condense","浓缩",v,"0"},
    	{"condescend","轻慢，怀有优越感",v,"0"},
    	{"condone","宽恕",v,"0"},
    	{"conducive","有助于...的",a,"0"},
    	{"conduct","行为，品德",n,"0"},
    	{"conduit","渠道,水渠，水管",n,"0"},
    	{"cone","松果,圆锥体",n,"0"},
    	{"confection","甜食",n,"0"},
    	{"confederacy","联盟，同盟",n,"0"},
     
           {"confer","商谈，赠与",v,"0"},
        	{"conference","商讨会",n,"0"},
        	{"confess","供认",v,"0"},
        	{"confide","吐露",v,"0"},
        	{"confidence","信心",n,"0"},
        	{"confidential","机密的",a,"0"},
        	{"configuration","配置",n,"0"},
        	{"confine","限制，禁闭",v,"0"},
        	{"confirm","证实",v,"0"},
        	{"confiscate","没收，充公",v,"0"},
        	
        	{"conflagration","建筑物或森里大火",n,"0"},
        	{"conflate","合并",v,"0"},
        	{"conflict","斗争，冲突",v+n,"0"},
        	{"conformist","尊奉传统者",n,"0"},
        	{"confound","使迷惑",v,"0"},
        	{"confront","面临，对抗",v,"0"},
        	{"congeal","冻结，凝固",v,"0"},
        	{"congenial","意气相投的，性情好的",a,"0"},
        	{"congest","使拥挤，充血",v,"0"},
        	{"conglomerate","集聚",v,"0"},
        	
        	{"congregate","聚集",v,"0"},
        	{"congruent","全等的，一致的",a,"0"},
        	{"congruous","全等的，一致的，符合的",a,"0"},
        	{"conifer","针叶树",n,"0"},
        	{"conjecture","臆测",v+n,"0"},
        	{"conjoin","使结合",v,"0"},
        	{"conjunction","联合，连词",n,"0"},
        	{"conjure","召唤，想起",v,"0"},
        	{"connive","默许，纵容，共谋",v,"0"},
        	{"connoisseur","鉴赏家，行家",n,"0"},
        	
        	{"connotation","言外之意，内涵",n,"0"},
        	{"conquer","以武力征服",v,"0"},
        	{"conquest","征服，战利品",n,"0"},
        	{"conscience","良心，是非感",n,"0"},
        	{"conscientious","尽责的，小心谨慎的",a,"0"},
        	{"conscript","征召",v,"0"},
        	{"consensus","意见一致",n,"0"},
        	{"consent","同意，允许",v,"0"},
        	{"consequence","结果，后果，重要性，价值",n,"0"},
        	{"consequential","傲慢的，自以为是的",a,"0"},
        	
        	{"conservative","保守的，守旧的",a,"0"},
        	{"conservatory","温室，音乐学院",n,"0"},
        	{"conserve","保全，保存",v,"0"},
        	{"considerable","相当多的，值得考虑的",a,"0"},
        	{"consign","托运，托管",v,"0"},
        	{"consistent","前后一致的，持续的",a,"0"},
        	{"console","安慰",v,"0"},
        	{"consolidate","巩固，合并",v,"0"},
        	{"consolidation","巩固，合并",n,"0"},
        	{"consonant","调和一致的",a,"0"},
        	
        	{"conspicuous","显著的",a,"0"},
        	{"conspire","阴谋，共谋",v,"0"},
        	{"constant","稳定不变的,常数",a+n,"0"},
        	{"constellation","星座，星群",n,"0"},
        	{"consternation","惊骇",n,"0"},
        	{"constituent","成分，选区内的选民",n,"0"},
        	{"constitute","构成，组成，建立",v,"0"},
        	{"constitution","宪法,体质",n,"0"},
        	{"constitutional","章程的，本质的",a,"0"},
        	{"constrain","束缚，强迫，限制",v,"0"},
        	{"constraint","强制，强迫，对感情的压抑",n,"0"},
        	{"constrict","压缩，收缩",v,"0"},
        	{"construct","建造，构成",v,"0"},
        	{"construe","解释，翻译",v,"0"},
        	{"consul","领事",n,"0"},
        	{"consummate","完全的,完成",a+v,"0"},
        	{"contact","接触，互通信息",v,"0"},
        	{"contagious","传染的",a,"0"},
        	{"contain","包含,遏制，阻止",v,"0"},
        	{"containment","阻止",n,"0"},
        	{"contaminate","污染",v,"0"},
        	{"contemplate","深思",v,"0"},
        	{"contempt","轻视",n+v,"0"},
        	{"contemptible","令人轻视的",a,"0"},
        	{"contemptuous","鄙视的",a,"0"},
        	{"contend","争夺，据理力争，主张",v,"0"},
        	
        	};

for(int i=0;i<v1.length;i++)
			subInitial(v1[i]);
}

    private void doList_9(){
	String[][] v1={
{"content","满意的,内容,满意",a+"/"+n+"/"+n,"0"},
{"contented","心满意足的",a,"0"},
{"contention","争论",n,"0"},
{"contentious","好辩的",a,"0"},
{"contest","竞争,质疑",v,"0"},
{"context","上下文",n,"0"},
{"contigious","接壤的,接近的",a,"0"},
{"continent","自制的,大陆",a+"/"+n,"0"},
{"contingent","意外的,视情况条件而定的",a,"0"},
{"contort","使扭曲,歪曲",v,"0"},
		
{"contraband","违禁品,走私货",n,"0"},
{"contract","合同,订合同,收缩",n+"/"+v+"/"+v,"0"},
{"contradict","驳斥",v,"0"},
{"contrast","对比",n+"/"+v,"0"},
{"contravene","违背",v,"0"},
{"contrite","悔罪的",a,"0"},
{"contrive","计划,设计",v,"0"},
{"contrived","不自然的,做作的",a,"0"},
{"control","实验对照组",n,"0"},
{"controversial","争议的",a,"0"},
		
{"controvert","驳斥",v,"0"},
{"contumacious","不服从的",a,"0"},
{"conundrum","谜语,难题",n,"0"},
{"convalesce","康复",v,"0"},
{"convalescent","修养病人",n,"0"},
{"convenience","便利",n,"0"},
{"conventional","传统的",a,"0"},
{"converge","会聚,集中",v,"0"},
{"convergent","会聚的",a,"0"},
{"conversant","精通的",a,"0"},
		
{"converse","谈话,逆向的,相反的事物",v+"/"+a+"/"+n,"0"},
{"convert","使改变,改变信仰的人",v+"/"+n,"0"},
{"convertible","可转换的,敞篷车",a+"/"+n,"0"},
{"convey","运载,表达",v,"0"},
{"convict","定罪,罪犯",v+"/"+n,"0"},
{"conviction","判罪,坚信",n,"0"},
{"convince","使确信,说服",v,"0"},
{"convivial","狂欢的",a,"0"},
{"conviviality","欢乐,外向性格",n,"0"},
{"convoke","召集",v,"0"},
		
{"convoluted","旋绕的,费解的",a,"0"},
{"convulse","使震动,使震惊",v,"0"},
{"convulsion","骚动,痉挛",n,"0"},
{"coop","笼栏",n,"0"},
{"cooperate","与他人合作",v,"0"},
{"coordinate","同等物,坐标,使各部分协调,同等的",n+"/"+n+"/"+v+"/"+a,"0"},
{"copious","丰富的,多产的",a,"0"},
{"cord","考得(体积单位),绳索",n,"0"},
{"core","核心,刨去中心部分",n+"/"+v,"0"},
{"cornucopia","象征丰收的羊角",n,"0"},
	 
{"coronation","加冕",n,"0"},
{"corporate","团体的,共同的",a,"0"},
{"corporeal","肉体的,物质的",a,"0"},
{"corpuscle","血球,细胞",n,"0"},
{"corral","畜栏",n,"0"},
{"correspondent","符合的,记者",a+"/"+n,"0"},
{"corroborate","支持,证实,强化",v,"0"},
{"corrode","腐蚀,侵蚀",v,"0"},
{"corrosive","腐蚀的,蚀坏的",a,"0"},
{"corrugate","起波,起皱",v,"0"},
	    	
{"corrupt","腐化的,文体错误的",a,"0"},
{"cosmic","宇宙的",a,"0"},
{"cosmopolitan","世界主义者,四海为家的人",n,"0"},
{"cosmopotitanism","世界性,世界主义",n,"0"},
{"cosmos","宇宙",n,"0"},
{"cosset","宠爱",v,"0"},
{"costume","服装,剧装",n,"0"},
{"coterie","兴趣小组",n,"0"},
{"coterminous","毗连的",a,"0"},
{"cougar","美洲豹",n,"0"},
	    	
{"countenance","支持,容忍,表情",v+"/"+v+"/"+n,"0"},
{"counteract","抵消",v,"0"},
{"counterbalance","起平衡作用",v,"0"},
{"counterfeit","伪造",v,"0"},
{"countermand","撤回,取消",v,"0"},
{"counterpart","相对应的物(人)",n,"0"},
{"counterproductive","事与愿违的",a,"0"},
{"coup","意外而成功的行动",n,"0"},
{"court","法庭,献殷勤,追求",n+"/"+v+"/"+v,"0"},
{"covenant","契约,立书保证",n+"/"+v,"0"},
	    	
{"covert","秘密的",a,"0"},
{"covet","贪求,妄想",v,"0"},
{"cow","威胁",v,"0"},
{"coward","胆小鬼",n,"0"},
{"cower","蜷缩,畏缩",v,"0"},
{"coy","腼腆的",a,"0"},
{"cozen","哄骗",v,"0"},
{"crab","螃蟹,抱怨",n+"/"+v,"0"},
{"crabbed","暴躁的",a,"0"},
{"crack","爆裂声,裂缝,破解",n+"/"+n+"/"+v,"0"},
	    	
{"craft","行业,手艺",n,"0"},
{"cram","填塞,抱佛脚,考前突击",v,"0"},
{"cramp","铁箍,箍紧",n+"/"+v,"0"},
{"cranky","任性怪癖的",a,"0"},
{"crass","愚钝的，粗糙的",a,"0"},
{"crate","板条箱",n,"0"},
{"crater","火山口",n,"0"},
{"cravat","领结",n,"0"},
{"craven","懦弱的",a,"0"},
{"craving","强烈的愿望",n,"0"},
	    	
{"crayon","蜡笔,蜡笔画",n,"0"},
{"crease","折痕",n,"0"},
{"credence","信任",n,"0"},
{"credible","可信的",a,"0"},
{"credit","赊购,信任,片头字幕",n,"0"},
{"credulous","轻信的",a,"0"},
{"creek","小溪",n,"0"},
{"creep","匍匐前进,悄悄移动",v,"0"},
{"crescendo","渐强,高潮",n,"0"},
{"crest","山顶,浪尖,羽冠",n,"0"},
{"crestfallen","挫败的",a,"0"},
{"cringe","畏缩,谄媚",v,"0"},
{"cringing","畏缩的，谄媚的",a,"0"},
{"criteria","评判标准",a,"0"},
{"criterion","评判标准、尺度",a,"0"},
{"critic","批评者",a,"0"},
{"critical","挑毛病的,关键的,危急的",a,"0"},
{"critique","批评性分析",n,"0"},
{"croak","蛙鸣声,抱怨",n+"/"+v,"0"},
{"crochet","钩针织物",n,"0"},
{"crockery","陶器",n,"0"},
{"cronyism","任人唯亲,对亲友偏袒",n,"0"},
{"crook","使弯曲,钩状物",v+"/"+n,"0"},
{"cross","生气的",a,"0"},
{"crouch","弯腰,蹲伏",v,"0"},
{"crucial","决定性的",a,"0"},
{"crudity","粗糙,生硬",n,"0"},
{"crumb","饼屑,面包屑",n,"0"},
{"crumble","弄碎",v,"0"},
{"crumple","弄皱",v,"0"},
{"crusade","捍卫理想和原则的斗争",n,"0"},
{"crust","硬壳面包片，地壳",n,"0"},
{"crutch","拐杖,支撑",n+"/"+v,"0"},
{"crux","症结所在的关键",n,"0"},
{"cryptic","神秘的",a,"0"},
{"cub","幼兽,年轻无经验的人",n,"0"},
{"cubicle","小隔间",n,"0"},
{"cue","暗示,提示",v+"/"+n,"0"},
{"cuisine","烹饪",n,"0"},
{"culinary","厨房的,烹调的",a,"0"},
{"culmination","顶点,结果",n,"0"},
{"culpable","有罪的,应受谴责的",a,"0"},
{"cult","宗派,崇拜",n,"0"},
{"cultivate","种植，讨好",v,"0"},
{"cultivated","种植的，有修养的",a,"0"}
	    	
	    	
	    	
	    	};
	    	
	    	
	    
for(int i=0;i<v1.length;i++)
			subInitial(v1[i]);	
	    	
	    	

}

    private void doList_10(){
    	String[][] v1={
{"cumbersome","笨重的","adj.","0"},
{"cumulus","积云","n.","0"},
{"cunning","善于骗人的；欺诈行为",a+n,"0"},
{"cupidity","贪婪","n.","0"},
{"curator","（博物馆等）馆长","n.","0"},
{"curb","路缘，（街道的）镶边石；马勒；控制",n+v,"0"},
{"curdle","使凝结，变稠","v.","0"},
{"curmudgeon","脾气暴躁之人","n.","0"},
{"curriculum","（全部的）课程","n.","0"},

{"cursory","粗略的，草率的","adj.","0"},
{"curt","（言行、行为）简略而草率的","adj.","0"},
{"curtail","削减，缩短","v.","0"},
 {"cushion","坐垫","n.","0"},
{"custodian","管理员，监护人","n.","0"},
{"custody","监管，保管","n.","0"},
{"customary","合乎习俗的","adj.","0"},
{"cuticle","表皮","n.","0"},
{"cutlery","（刀、叉、匙等）餐具","n.","0"},
{"cyclical","循环的","adj.","0"},
{"cyclone","气旋，飓风","n.","0"},
{"cylinder","圆柱","n.","0"},
{"cynic","犬儒主义的，愤世嫉俗者","n.","0"},
{"cypress","柏树","n.","0"},
{"cytology","[生]细胞学","n.","0"},
{"dabble","涉足，浅尝","v.","0"},
{"daft","傻的","adj.","0"},
{"dagger","短剑，匕首","n.","0"},
{"daguerreotype","（早期）银版照片","n.","0"},
{"dainty","量少而美味的食物","n.","0"},
{"dally","闲荡，嬉戏","v.","0"},
{"damp","减弱，抑制；潮湿的",v+a,"0"},
{"damped","减震的；压低（声音）的","adj.","0"},
{"dampen","（使）潮湿；使沮丧，泼凉水","v.","0"},
{"dandy","花花公子，好打扮的人","n.","0"},

{"dapper","整洁漂亮的","adj.","0"},
{"dappled","有斑点的，斑驳的","adj.","0"},
{"daredevil","胆大的（人），冒失的（人）","adj./n.","0"},
{"dart","飞镖","n.","0"},
{"daunt","使胆怯，使畏缩","v.","0"},
{"dawdle","闲荡，虚度","v.","0"},
{"deaden","减低某物的力量或强度","v.","0"},
{"deadlock","相持不下，僵局","n.","0"},
{"deadpan","无表情的（脸）","adj./n.","0"},
{"dealing","生意行为；作风","n.","0"},
{"dearth","缺乏，短缺","n.","0"},
{"debacle","解冻","n.","0"},

{"debark","下船，下飞机，下车；卸载","v.","0"},
{"debase","贬低，贬损","v.","0"},
{"debate","正式的辩论，讨论","n.","0"},
{"debilitate","使衰弱","v.","0"},
{"debouch","流出，流入","v.","0"},
{"debrief","向...询问情况，听取汇报","v.","0"},
{"debris","废墟，残骸","n.","0"},
{"debunk","揭穿真相，暴露","v.","0"},
{"debut","初次登台，初次露面","n.","0"},
{"decadence","衰落，颓废","n.","0"},
{"deveit","欺骗，欺诈","n.","0"},
{"decency","正派，端庄","n.","0"},
{"deception","欺骗手段","n.","0"},

{"decible","分贝","n.","0"},
{"deciduous","费用旧的；短暂的；脱落的；每年落叶的","adj.","0"},
{"decimate","毁掉大部分；大量杀死","v.","0"},
{"decipher","解开","v.","0"},
{"declaim","高谈阔论","v.","0"},
{"declamation","雄辩，高调","n.","0"},
{"decline","拒绝；变弱，变小；消减",v+n,"0"},
{"decode","译解（密码）","v.","0"},
{"decompose","（使）腐烂","v.","0"},
{"decomposition","分解，腐烂；崩溃","n.","0"},
{"decorate","装饰某事物","v.","0"},
{"decorum","礼节，礼貌","n.","0"},
{"decrepit","衰老的；破旧的","adj.","0"},

{"decry","责难；贬低（价值）","v.","0"},
{"dedication","对某事业或目的的忠诚","n.","0"},
{"deduce","演绎，推断","v.","0"},
{"deduct","减去，扣除","v.","0"},
{"deductive","推理的，演绎的","adj.","0"},
{"deed","行为；（土地或建筑物的）转让契约、证书","n.","0"},
{"deface","损坏","v.","0"},
{"default","拖债；未履行责任的","n.","0"},
{"defeatist","失败主义者","n.","0"},
{"defect","缺点，瑕疵；变节，脱党",n+v,"0"},
{"defendant","被告","n.","0"},
{"defense","防御，防护","n.","0"},
{"defer","推延；听从","v.","0"},
{"deference","敬重，尊重","n.","0"},
{"deferential","顺从的，恭顺的","adj.","0"},

{"defiance","挑战；违抗，反抗","n.","0"},
{"deficiency","缺陷；不足","n.","0"},
{"deficit","不足；赤字","n.","0"},
{"defile","弄污，弄脏；（山间）小道",v+n,"0"},
{"definitive","明确的，有权威的；最终的","adj.","0"},
{"deflated","灰心丧气的","adj.","0"},
{"deflect","偏离，转向","v.","0"},
{"defoliator","落叶剂","n.","0"},
{"defraud","欺骗某人的","v.","0"},
{"deft","灵巧的，熟练的","adj.","0"},

{"defuse","从（爆破装置）中卸除引信；缓和紧张状态或危机局面","v.","0"},
{"defy","违抗，藐视","v.","0"},
{"degradation","降低身份，受辱","n.","0"},
{"dehydrate","除去水分，脱水","v.","0"},
{"deify","奉为神；崇拜","v.","0"},
{"deign","屈尊；惠允（做某事）","v.","0"},
{"dejected","沮丧的，失望的","adj.","0"},
{"delectable","赏心悦目的","adj.","0"},
{"delegate","代表；委派...为代表，授权",n+v,"0"},
{"deleterious","（对身心）有害的，有毒的","adj.","0"},

{"deliberate","深思熟虑的；故意的；慎重考虑的",a+v,"0"},
{"delicacy","细嫩；精致，优雅","n.","0"},
{"delicate","娇嫩的；精致的，优美的","adj.","0"},
{"delimit","定界，划界","v.","0"},
{"delineate","描画","v.","0"},
{"delinquency","失职，过失","n.","0"},
{"delinquent","疏忽职务的","adj.","0"},
{"delirious","精神错乱的","adj.","0"},
{"delirium","精神错乱","n.","0"},
{"delta","三角洲","n.","0"},
{"delude","欺骗，哄骗","v.","0"},
{"deluge","大洪水；暴雨","n.","0"},

{"delusion","欺骗；幻想","n.","0"},
{"delve","深入研究，钻研","v.","0"},
{"demagogue","蛊惑民心的政客","n.","0"},
{"demand","要求，苛求","v.","0"},
{"demean","贬抑，降低","v.","0"},
{"demise","死亡；财产转让","n.","0"},
{"demography","人口统计，人口学","n.","0"},
{"demolish","破坏；拆除","v.","0"},
{"demolition","破坏，毁坏","n.","0"},
{"demonstrate","证明，论证；示威","v.","0"},
{"demonstrative","证明性的,喜怒形于色的","adj.","0"},
{"demoralize","使士气低落","v.","0"},
{"demote","降级，降职","v.","0"},

{"demotic","民众的，通俗的","adj.","0"},
{"demur","表示异议，反对","v.","0"},
{"demystify","弄清楚","v.","0"},
{"den","兽穴，窝","n.","0"},
{"denigrate","污蔑，诽谤","v.","0"},
{"denizen","居民；外籍居民","n.","0"},
{"denomination","命名；（长度、币值的）单位","n.","0"},
{"denote","表示；指示意义","v.","0"},
{"denouement","（小说的）结尾，结局","n.","0"},
{"denounce","指责","v.","0"}
        
        
        
        
        
        
        
     };

for(int i=0;i<v1.length;i++)
			subInitial(v1[i]);	
		
    }
    private void doList_11(){
    	
    	String[] v1={"dent","缺口，凹痕","n.","0"};
        String[] v2={"denture","假牙","n.","0"};
        String[] v3={"denude","脱去；剥蚀；剥夺","v.","0"};
        String[] v4={"depict","描绘，描画","v.","0"};
        String[] v5={"deplete","大量减少；耗尽，枯竭","v.","0"};
        String[] v6={"deplore","悲悼，哀叹","v.","0"};
        String[] v7={"deport","（将外国人、罪犯等）驱逐出境","v.","0"};
        String[] v8={"depose","免职","v.","0"};

        String[] v9={"deposition","免职;作证","n.","0"};
        String[] v10={"depraved","堕落的，腐化的","adj.","0"};
        String[] v11={"depravity","堕落，恶习","n.","0"};
        String[] v12={"deprecate","反对；轻视","v.","0"};
        String[] v13={"depreciate","轻视","v.","0"};
        String[] v14={"depressed","消沉的；凹陷的","adj.","0"};
        String[] v15={"depression","沮丧，消沉；降低，削弱","n.","0"};
        String[] v16={"deprivation","剥夺；缺乏","n.","0"};
        String[] v17={"deputy","代表；副警长","n.","0"};
        String[] v18={"deracinate","根除，杜绝","v.","0"};
        String[] v19={"derelict","荒废的；玩忽职守的；被遗弃的人",a+n,"0"};

        String[] v20={"dereliction","遗弃，弃置","n.","0"};
        String[] v21={"deride","嘲弄，愚弄","v.","0"};
        String[] v22={"derivation","发展，起源；词源","n.","0"};
        String[] v23={"derivative","派生的；无创意的","adj.","0"};
        String[] v24={"dermatologist","皮肤病学家","n.","0"};
        String[] v25={"derogate","贬低，诽谤","v.","0"};
        String[] v26={"descendant","后代，后裔","n.","0"};
        String[] v27={"descent","降落；侵袭；血统","n.","0"};
        String[] v28={"descry","远远看到，望见","v.","0"};
        String[] v29={"desecrate","玷辱，亵渎","v.","0"};
        String[] v30={"desert","放弃，离弃","v.","0"};
        String[] v31={"desiccate","（使）完全干沽，脱水","v.","0"};

        String[] v32={"designation","指定；名称，称呼","n.","0"};
        String[] v33={"desirable","值得要的","adj.","0"};
        String[] v34={"desperate","绝望的；特别强烈的；渴望至极以至痛苦绝望的","adj.","0"};
        String[] v35={"despicable","可鄙的，卑劣的","adj.","0"};
        String[] v36={"despise","鄙视，藐视","v.","0"};
        String[] v37={"despot","暴君","n.","0"};
        String[] v38={"destitution","匮乏，贫困","n.","0"};
        String[] v39={"desultory","不连贯的；散漫的","adj.","0"};
        String[] v40={"detach","分离，分遣","v.","0"};
        String[] v41={"detached","分开的，超然的","adj.","0"};
        String[] v42={"detain","拘留；使延迟","v.","0"};

        String[] v43={"detection","查出，探获","n.","0"};
        String[] v44={"deter","威慑，吓住","v.","0"};
        String[] v45={"detergent","净化的；清洁剂",a+n,"0"};
        String[] v46={"deteriorate","（使）变坏，恶化","v.","0"};
        String[] v47={"detest","厌恶，憎恨","v.","0"};
        String[] v48={"detonation","爆炸，爆炸声","n.","0"};
        String[] v49={"detour","弯路；绕行之路","n.","0"};
        String[] v50={"detraction","贬低，诽谤","n.","0"};
        String[] v51={"detrimental","损害的，造成伤害的","adj.","0"};
        String[] v52={"detritus","碎屑","n.","0"};
        String[] v53={"devastate","摧毁，破坏","v.","0"};
        String[] v54={"deviant","越出常规的","adj.","0"};
        String[] v55={"deviate","越轨，脱离","v.","0"};

        String[] v56={"deviation","背离","n.","0"};
        String[] v57={"devious","不正直的","adj.","0"};
        String[] v58={"devise","发明，设计；图谋‘馈赠给","adj.","0"};
        String[] v59={"devoid","空的，全无的","adj.","0"};
        String[] v60={"devoted","投入的，热爱的","adj.","0"};
        String[] v61={"devotee","爱好者","n.","0"};
        String[] v62={"devotional","献身的，崇拜的","adj.","0"};
        String[] v63={"devour","吞食","v.","0"};
        String[] v64={"devout","虔诚的；忠诚的","adj.","0"};
        String[] v65={"dexterity","纯熟，灵巧","n.","0"};
        String[] v66={"dexterous","灵巧的，熟练的","adj","0"};
        String[] v67={"diabetes","糖尿病","n.","0"};
        String[] v68={"diabolical","恶毒的，狠毒的","adj.","0"};
        String[] v69={"diagnose","判断，诊断","v.","0"};

        String[] v70={"diagonal","对角线的；对角线",a+n,"0"};
        String[] v71={"diagram","图解，图表","n.","0"};
        String[] v72={"dialect","方言","n.","0"};
        String[] v73={"diameter","直径","n.","0"};
        String[] v74={"diaphanous","精致的；透明的","adj.","0"};
        String[] v75={"diatribe","（口头或书面强烈的）抨击","n.","0"};
        String[] v76={"dictate","口述；命令","v.","0"};
        String[] v77={"didactic","教诲的；说教的","adj.","0"};
        String[] v78={"die","金属模子，印模","n.","0"};
        String[] v79={"die-hard","顽固分子","n.","0"};

        String[] v80={"diffident","缺乏自信的","adj.","0"};
        String[] v81={"diffuse","散布，（光等）漫射；漫射的，散漫的；不简洁的",v+a,"0"};
        String[] v82={"digestion","消化，吸收","n.","0"};
        String[] v83={"digit","手指，脚趾；数字，数码","n.","0"};
        String[] v84={"dignity","尊严，尊贵","n.","0"};
        String[] v85={"digress","离题","v.","0"};
        String[] v86={"dilapidate","（使)荒废，（使）毁坏","v.","0"};
        String[] v87={"dilapidated","破旧的，倒塌的","adj.","0"};
        String[] v88={"dilate","（身体某部位）张开，扩大","v.","0"};
        String[] v89={"dilatory","慢吞吞的，磨蹭的","adj.","0"};
        String[] v90={"dilemma","困境，左右为难","n.","0"};

        String[] v91={"dilettante","半瓶醋，业余爱好者","n.","0"};
        String[] v92={"diligence","勤勉，勤奋","n.","0"};
        String[] v93={"dilute","把（液体）弄稀，弄淡","v.","0"};
        String[] v94={"dim","使暗淡，使模糊","v.","0"};
        String[] v95={"dimension","维度，尺寸","n.","0"};
        String[] v96={"diminution","减少，缩减","n.","0"};
        String[] v97={"dimple","酒窝，笑靥","n.","0"};
        String[] v98={"din","喧闹声，嘈杂声","n.","0"};
        String[] v99={"dingy","肮脏的；褪色的","adj.","0"};
        String[] v100={"diplomatic","外交的；圆滑的","adj.","0"};
        String[] v101={"dire","可怕的；悲惨的","adj.","0"};
        String[] v102={"dirge","哀歌","n.","0"};
        String[] v103={"disabuse","打消（某人的）错误念头；纠正","v.","0"};
        String[] v104={"disaffect","使不满；使不忠","v.","0"};
        String[] v105={"disagreeable","讨厌的，乖戾的","adj.","0"};

        String[] v106={"disarm","缴某人的械","v.","0"};
        String[] v107={"disarray","混乱，漫无秩序","n.","0"};
        String[] v108={"disaster","灾难，大不幸","n.","0"};
        String[] v109={"disbar","取消律师资格","v.","0"};
        String[] v110={"disburse","支付，支出","v.","0"};
        String[] v111={"discard","扔掉，抛弃","v.","0"};
        String[] v112={"discern","（费劲）识别，看出","v.","0"};
        String[] v113={"discernible","可识别的，依稀可辨的","adj.","0"};
        String[] v114={"discerning","识别能力强的","adj.","0"};
        String[] v115={"discharge","流出；释放；解雇；履行义务","v.","0"};
        String[] v116={"disciple","信徒，弟子","n.","0"};

        String[] v117={"discipline","训练，训导；纪律；惩罚，处分",v+n,"0"};
        String[] v118={"disclaim","放弃权利；拒绝承认","v.","0"};
        String[] v119={"disclose","使某物显露","adj.","0"};
        String[] v120={"discogaphy","唱片分类目录；录音音乐研究","n.","0"};
        String[] v121={"discombobulate","扰乱，使困惑","v.","0"};
        String[] v122={"discombobulated","扰乱的，打乱的","adj.","0"};
        String[] v123={"discomfit","使懊恼；使难堪","v.","0"};
        String[] v124={"discompose","使失态，慌张","v.","0"};
        String[] v125={"disconcert","使...尴尬","v.","0"};
        String[] v126={"discord","不和，纷争","n.","0"};
        String[] v127={"discount","折扣","n.","0"};
        String[] v128={"discourse","演讲，论述","n.","0"};

        String[] v129={"discredit","怀疑；丧失名誉",v+n,"0"};
        String[] v130={"discreet","小心的，言行谨慎的","adj.","0"};
        String[] v131={"discrepancy","不同，矛盾","n.","0"};
        String[] v132={"discrete","个别的；不连续的","adj.","0"};
        String[] v133={"discretion","谨慎，审慎","n.","0"};
        String[] v134={"discretionary","自由决定的","adj.","0"};
        String[] v135={"discriminate","区分；歧视","v.","0"};
        String[] v136={"discriminatory","歧视的，差别对待的","adj.","0"};
        String[] v137={"discursive","散漫的，无层次的","adj.","0"};
        String[] v138={"disdain","轻视，鄙视","n./v.","0"};
        String[] v139={"disembodied","无实体的，空洞的","adj.","0"};

        String[] v140={"disenchant","对…不再抱幻想，使清醒","v.","0"};
        String[] v141={"disengage","脱离，解开","v.","0"};
        String[] v142={"disentangle","解决；解脱，解开","v.","0"};

        
    ////插入函数(不用了解)
   	subInitial(v1);
   	subInitial(v2);
   	subInitial(v3);
   	subInitial(v4);
   	subInitial(v5);
   	subInitial(v6);
   	subInitial(v7);
   	subInitial(v8);
   	subInitial(v9);
   	subInitial(v10);
   	subInitial(v11);
   	subInitial(v12);
   	subInitial(v13);
   	subInitial(v14);
   	subInitial(v15);
   	subInitial(v16);
   	subInitial(v17);
   	subInitial(v18);
   	subInitial(v19);
   	subInitial(v20);
   	subInitial(v21);
   	subInitial(v22);
   	subInitial(v23);
   	subInitial(v24);
   	subInitial(v25);
   	subInitial(v26);
   	subInitial(v27);
   	subInitial(v28);
   	subInitial(v29);
   	subInitial(v30);
   	subInitial(v31);
   	subInitial(v32);
   	subInitial(v33);
   	subInitial(v34);
   	subInitial(v35);
   	subInitial(v36);
   	subInitial(v37);
   	subInitial(v38);
   	subInitial(v39);
   	subInitial(v40);
   	subInitial(v41);
   	subInitial(v42);
   	subInitial(v43);
   	subInitial(v44);
   	subInitial(v45);
   	subInitial(v46);
   	subInitial(v47);
   	subInitial(v48);
   	subInitial(v49);
   	subInitial(v50);
   	subInitial(v51);
   	subInitial(v52);
   	subInitial(v53);
   	subInitial(v54);
   	subInitial(v55);
   	subInitial(v56);
   	subInitial(v57);
   	subInitial(v58);
   	subInitial(v59);
   	subInitial(v60);
   	subInitial(v61);
   	subInitial(v62);
   	subInitial(v63);
   	subInitial(v64);
   	subInitial(v65);
   	subInitial(v66);
   	subInitial(v67);
   	subInitial(v68);
   	subInitial(v69);
   	subInitial(v70);
   	subInitial(v71);
   	subInitial(v72);
   	subInitial(v73);
   	subInitial(v74);
   	subInitial(v75);
   	subInitial(v76);
   	subInitial(v77);
   	subInitial(v78);
   	subInitial(v79);
   	subInitial(v80);
   	subInitial(v81);
   	subInitial(v82);
   	subInitial(v83);
   	subInitial(v84);
   	subInitial(v85);
   	subInitial(v86);
   	subInitial(v87);
   	subInitial(v88);
   	subInitial(v89);
   	subInitial(v90);
   	subInitial(v91);
   	subInitial(v92);
   	subInitial(v93);
   	subInitial(v94);
   	subInitial(v95);
   	subInitial(v96);
   	subInitial(v97);
   	subInitial(v98);
   	subInitial(v99);
   	subInitial(v100);
   	subInitial(v101);
   	subInitial(v102);
   	subInitial(v103);
   	subInitial(v104);
   	subInitial(v105);
   	subInitial(v106);
   	subInitial(v107);
   	subInitial(v108);
   	subInitial(v109);
   	subInitial(v110);
   	subInitial(v111);
   	subInitial(v112);
   	subInitial(v113);
   	subInitial(v114);
   	subInitial(v115);
   	subInitial(v116);
   	subInitial(v117);
   	subInitial(v118);
   	subInitial(v119);
   	subInitial(v120);
   	subInitial(v121);
   	subInitial(v122);
   	subInitial(v123);
   	subInitial(v124);
   	subInitial(v125);
   	subInitial(v126);
   	subInitial(v127);
   	subInitial(v128);
   	subInitial(v129);
   	subInitial(v130);
   	subInitial(v131);
   	subInitial(v132);
   	subInitial(v133);
   	subInitial(v134);
   	subInitial(v135);
   	subInitial(v136);
   	subInitial(v137);
   	subInitial(v138);
   	subInitial(v139);
   	subInitial(v140);
   	subInitial(v141);
   	subInitial(v142);
	
}
    private void doList_12(){
    /////*********************声明单词元组(单词+中文+词性+难度(默认为0))*****************************//////////////
        String[] v1={"disfigure","毁容","v.","0"};
        String[] v2={"disfranchise","剥夺（某人的）选举权","v.","0"};
        String[] v3={"disgorge","呕出；（水）流走","v.","0"};
        String[] v4={"disgruntle","使不满意","v.","0"};
        String[] v5={"disguise","假扮；掩饰","v.","0"};
        String[] v6={"disgust","反感，厌恶","n.","0"};
        String[] v7={"disillusion","梦想破灭，醒悟","v.","0"};
        String[] v8={"disinfect","杀菌，消毒","v.","0"};
        String[] v9={"disinfectant","杀毒剂","n.","0"};
        String[] v10={"disinter","挖出，挖掘","v.","0"};

        String[] v11={"disinterested","公正的，客观的","adj.","0"};
        String[] v12={"disjunction","分离，分裂","n.","0"};
        String[] v13={"disjunctiove","分离的；相反的","adj.","0"};
        String[] v14={"dislocate","使脱臼；把…弄乱","v.","0"};
        String[] v15={"dislodge","逐出，取出","v.","0"};
        String[] v16={"dismal","使人悲伤的，阴沉的","adj.","0"};
        String[] v17={"dismantle","拆除","v.","0"};
        String[] v18={"dismay","沮丧，气馁；使气馁",n+v,"0"};
        String[] v19={"disparage","贬抑，轻蔑","v.","0"};
        String[] v20={"disparate","迥然不同的","adj.","0"};
        String[] v21={"dispassionate","平心静气的","adj.","0"};

        String[] v22={"dispatch","派遣；一下子做完的；吃完；迅速",v+n,"0"};
        String[] v23={"dispel","驱散，消除","v.","0"};
        String[] v24={"dispensable","不必要的，可有可无的","adj.","0"};
        String[] v25={"dispense","分配，分发","v.","0"};
        String[] v26={"disperse","消散，驱散","v.","0"};
        String[] v27={"displace","换置；使某人某物离开原位","v.","0"};
        String[] v28={"disposable","一次性使用的","adj.","0"};
        String[] v29={"disposal","消除，处理","n.","0"};
        String[] v30={"dispose","使倾向；处理掉","v.","0"};
        String[] v31={"disposed","愿意的，想干的","adj.","0"};
        String[] v32={"disposition","处理；天性，气质","n.","0"};

        String[] v33={"disproof","反证，反驳","adj.","0"};
        String[] v34={"disprove","证明…有误","v.","0"};
        String[] v35={"dispute","争论","v.","0"};
        String[] v36={"disegard","疏忽，漠视","v./n.","0"};
        String[] v37={"disrepute","名声不好","n.","0"};
        String[] v38={"disrupt","弄乱，扰乱","v.","0"};
        String[] v39={"disruptive","制造混乱的","adj.","0"};
        String[] v40={"dissect","解剖","v.","0"};
        String[] v41={"dissemble","隐藏，掩饰","v.","0"};
        String[] v42={"diseminate","散布，传播","v.","0"};
        String[] v43={"dissent","不同意，持异议","v.","0"};
        String[] v44={"dissertation","专题论文","n.","0"};
        String[] v45={"dissident","唱反调者","n.","0"};
        String[] v46={"dissimulate","隐藏，掩饰","v.","0"};

        String[] v47={"dissipate","（使）驱散；浪费","v.","0"};
        String[] v48={"dissociation","分离，脱离关系","n.","0"};
        String[] v49={"dissolute","放荡的，无节制的","adj.","0"};
        String[] v50={"dissolve","使固体溶解","v.","0"};
        String[] v51={"dissonant","不和谐的，不一致的","adj.","0"};
        String[] v52={"dissuade","劝阻，阻止","v.","0"};
        String[] v53={"distant","疏远的，冷淡的","adj.","0"};
        String[] v54={"distend","（使）膨胀，胀大","v.","0"};
        String[] v55={"distension","膨胀","n.","0"};
        String[] v56={"distill","蒸馏","v.","0"};
        String[] v57={"distinct","清楚的，明显的","adj.","0"};

        String[] v58={"distintion","区别，差别；知名","n.","0"};
        String[] v59={"distinctive","出众的，有特色的","adj.","0"};
        String[] v60={"distinguished","著名的，卓越的","adj.","0"};
        String[] v61={"distort","扭曲，弄歪","v.","0"};
        String[] v62={"distract","分心，转移；使发狂","v.","0"};
        String[] v63={"distracted","心烦意乱的，精神不集中的","adj.","0"};
        String[] v64={"distraught","心神狂乱的","adj.","0"};
        String[] v65={"distress","痛苦，悲痛","n.","0"};
        String[] v66={"distribute","分发，分配某事物","v.","0"};
        String[] v67={"district","地区，行政区","n.","0"};
        String[] v68={"ditty","小曲，小调","n.","0"};
        String[] v69={"diurnal","白昼的，白天的","adj.","0"};
        String[] v70={"diva","歌剧中的女主角","n.","0"};

        String[] v71={"diver","潜水员","n.","0"};
        String[] v72={"diverge","分歧，分开","v.","0"};
        String[] v73={"diverse","不同的；多样的","adj.","0"};
        String[] v74={"diversity","多样的，千变万化的","n.","0"};
        String[] v75={"divert","使某事物转向；使娱乐","v.","0"};
        String[] v76={"divest","卸下盛装","v.","0"};
        String[] v77={"divestiture","脱衣，卸下装饰；剥夺财产；取消称号","v.","0"};
        String[] v78={"divine","推测，预言","v.","0"};
        String[] v79={"divulge","泄露，透露","v.","0"};
        String[] v80={"docile","驯服的，听话的","adj.","0"};
        String[] v81={"doctrinaire","空论家；教条的，迂腐的",n+a,"0"};
        String[] v82={"doctrine","教义，主义；学说","n.","0"};
        String[] v83={"document","文件，公文；为…提供书面证明",n+v,"0"};

        String[] v84={"dodder","蹒跚","v.","0"};
        String[] v85={"dodge","闪开，躲避","v.","0"};
        String[] v86={"doff","脱掉","v.","0"};
        String[] v87={"dogged","顽强的","adj.","0"};
        String[] v88={"doggerel","歪诗，打油诗.","n","0"};
        String[] v89={"dogma","教条，信条","n.","0"};
        String[] v90={"dogmatism","教条主义，武断","n.","0"};
        String[] v91={"dolddrums","赤道无风带；情绪低落","n.","0"};
        String[] v92={"doleful","忧愁的，消沉的","adj.","0"};
        String[] v93={"dolorous","悲哀的，忧愁的","adj.","0"};
        String[] v94={"dolt","傻瓜","n.","0"};
        String[] v95={"domain","领土；领域","n.","0"};
        String[] v96={"dome","圆顶屋","n.","0"};
        String[] v97={"domesticate","驯养","v.","0"};

        String[] v98={"domicile","住处，住所","n.","0"};
        String[] v99={"dominant","显性的；优势的","adj.","0"};
        String[] v100={"dominate","控制，支配","v.","0"};
        String[] v101={"donate","捐赠，赠送","v.","0"};
        String[] v102={"donor","捐赠者，赠送者；献血者","n.","0"};
        String[] v103={"doodle","胡画；混时间","v.","0"};
        String[] v104={"dormant","冬眠的；静止的","adj.","0"};
        String[] v105={"dorsal","背部的","adj.","0"};
        String[] v106={"dose","剂量，一剂","n.","0"};
        String[] v107={"dossier","卷宗，档案","n.","0"};
        String[] v108={"dote","溺爱；昏聩","v.","0"};
        String[] v109={"doting","溺爱的","adj.","0"};
        String[] v110={"dour","严厉的，脸色阴沉的","adj.","0"};
        String[] v111={"douse","把…浸入水中；熄灭","v.","0"};

        String[] v112={"down","羽毛；汗毛","n.","0"};
        String[] v113={"downplay","贬低，不予重视","v.","0"};
        String[] v114={"downpour","暴雨","n.","0"};
        String[] v115={"down-to-earth","实际的","adj.","0"};
        String[] v116={"doyen","老前辈","n.","0"};
        String[] v117={"drab","土褐色的","adj.","0"};
        String[] v118={"draconian","严厉的，严酷的","adj.","0"};
        String[] v119={"draft","草稿，草案；汇票","n.","0"};
        String[] v120={"draftmanship","起草术，制图术","n.","0"};
        String[] v121={"drain","排出沟外；曝光","v.","0"};
        String[] v122={"drainage","排水，排水系统","n.","0"};
        String[] v123={"drastic","猛烈的，激烈的","adj.","0"};
        String[] v124={"drawbridge","吊桥","n.","0"};
        String[] v125={"drawl","慢吞吞地说","v./n.","0"};
        String[] v126={"dreary","沉闷的，乏味的","adj.","0"};
        String[] v127={"dregs","糟粕，沉淀，废物","n.","0"};
        String[] v128={"drench","使湿透","v.","0"};

        String[] v129={"drill","钻；钻床","n.","0"};
        String[] v130={"drivel","（说）废话","n./v.","0"};
        String[] v131={"drizzle","下毛毛雨；毛毛雨",v+n,"0"};
        String[] v132={"drizzly","毛毛细雨的","adj.","0"};
        String[] v133={"droll","古怪的，好笑的","adj.","0"};
        String[] v134={"drone","嗡嗡地响，单调地说；单调的低音",v+n,"0"};
        String[] v135={"droop","低垂；沮丧","v.","0"};
        String[] v136={"droplet","小水滴","n.","0"};
        String[] v137={"dross","浮渣","n.","0"};
        String[] v138={"drought","干旱；干旱时期","n.","0"};
        String[] v139={"drove","畜群；人群","n.","0"};
        String[] v140={"druggery","苦工；苦活","n.","0"};
        String[] v141={"dual","双重的","adj.","0"};
        String[] v142={"dubious","可疑的；名声不太好的","adj.","0"};

        String[] v143={"duckling","雏鸭，小鸭","n.","0"};
        String[] v144={"duct","管道，槽","n.","0"};
        String[] v145={"duel","决斗","n.","0"};
        String[] v146={"duet","二重唱","n","0"};
        String[] v147={"dull","不鲜明的；迟钝的；变迟钝",a+v,"0"};
        String[] v148={"dummy","人体模型，假人","n.","0"};
        String[] v149={"dune","沙丘","n.","0"};
        String[] v150={"dupe","上当者","n.","0"};
        String[] v151={"duplicitous","搞两面派的，奸诈的","adj.","0"};
        String[] v152={"duolicity","欺骗，口是心非","n.","0"};
        String[] v153={"duration","持续的时间","n.","0"};
        String[] v154={"duress","胁迫","n.","0"};
        String[] v155={"dutiful","恭敬顺从的；尽职的","adj.","0"};
        String[] v156={"dwarf","侏儒；矮小的动物或植物；使变矮小",n+v,"0"};
        String[] v157={"dwelling","住处","n.","0"};
        String[] v158={"dewindle","变小","v.","0"};
        String[] v159={"dynamic","动态的；有活力的","adj.","0"};
        
    ////插入函数(不用了解)
   	subInitial(v1);
   	subInitial(v2);
   	subInitial(v3);
   	subInitial(v4);
   	subInitial(v5);
   	subInitial(v6);
   	subInitial(v7);
   	subInitial(v8);
   	subInitial(v9);
   	subInitial(v10);
   	subInitial(v11);
   	subInitial(v12);
   	subInitial(v13);
   	subInitial(v14);
   	subInitial(v15);
   	subInitial(v16);
   	subInitial(v17);
   	subInitial(v18);
   	subInitial(v19);
   	subInitial(v20);
   	subInitial(v21);
   	subInitial(v22);
   	subInitial(v23);
   	subInitial(v24);
   	subInitial(v25);
   	subInitial(v26);
   	subInitial(v27);
   	subInitial(v28);
   	subInitial(v29);
   	subInitial(v30);
   	subInitial(v31);
   	subInitial(v32);
   	subInitial(v33);
   	subInitial(v34);
   	subInitial(v35);
   	subInitial(v36);
   	subInitial(v37);
   	subInitial(v38);
   	subInitial(v39);
   	subInitial(v40);
   	subInitial(v41);
   	subInitial(v42);
   	subInitial(v43);
   	subInitial(v44);
   	subInitial(v45);
   	subInitial(v46);
   	subInitial(v47);
   	subInitial(v48);
   	subInitial(v49);
   	subInitial(v50);
   	subInitial(v51);
   	subInitial(v52);
   	subInitial(v53);
   	subInitial(v54);
   	subInitial(v55);
   	subInitial(v56);
   	subInitial(v57);
   	subInitial(v58);
   	subInitial(v59);
   	subInitial(v60);
   	subInitial(v61);
   	subInitial(v62);
   	subInitial(v63);
   	subInitial(v64);
   	subInitial(v65);
   	subInitial(v66);
   	subInitial(v67);
   	subInitial(v68);
   	subInitial(v69);
   	subInitial(v70);
   	subInitial(v71);
   	subInitial(v72);
   	subInitial(v73);
   	subInitial(v74);
   	subInitial(v75);
   	subInitial(v76);
   	subInitial(v77);
   	subInitial(v78);
   	subInitial(v79);
   	subInitial(v80);
   	subInitial(v81);
   	subInitial(v82);
   	subInitial(v83);
   	subInitial(v84);
   	subInitial(v85);
   	subInitial(v86);
   	subInitial(v87);
   	subInitial(v88);
   	subInitial(v89);
   	subInitial(v90);
   	subInitial(v91);
   	subInitial(v92);
   	subInitial(v93);
   	subInitial(v94);
   	subInitial(v95);
   	subInitial(v96);
   	subInitial(v97);
   	subInitial(v98);
   	subInitial(v99);
   	subInitial(v100);
   	subInitial(v101);
   	subInitial(v102);
   	subInitial(v103);
   	subInitial(v104);
   	subInitial(v105);
   	subInitial(v106);
   	subInitial(v107);
   	subInitial(v108);
   	subInitial(v109);
   	subInitial(v110);
   	subInitial(v111);
   	subInitial(v112);
   	subInitial(v113);
   	subInitial(v114);
   	subInitial(v115);
   	subInitial(v116);
   	subInitial(v117);
   	subInitial(v118);
   	subInitial(v119);
   	subInitial(v120);
   	subInitial(v121);
   	subInitial(v122);
   	subInitial(v123);
   	subInitial(v124);
   	subInitial(v125);
   	subInitial(v126);
   	subInitial(v127);
   	subInitial(v128);
   	subInitial(v129);
   	subInitial(v130);
   	subInitial(v131);
   	subInitial(v132);
   	subInitial(v133);
   	subInitial(v134);
   	subInitial(v135);
   	subInitial(v136);
   	subInitial(v137);
   	subInitial(v138);
   	subInitial(v139);
   	subInitial(v140);
   	subInitial(v141);
   	subInitial(v142);
   	subInitial(v143);
   	subInitial(v144);
   	subInitial(v145);
   	subInitial(v146);
   	subInitial(v147);
   	subInitial(v148);
   	subInitial(v149);
   	subInitial(v150);
   	subInitial(v151);
   	subInitial(v152);
   	subInitial(v153);
   	subInitial(v154);
   	subInitial(v155);
   	subInitial(v156);
   	subInitial(v157);
   	subInitial(v158);
   	subInitial(v159);
}
    private void doList_13(){
    /////*********************声明单词元组(单词+中文+词性+难度(默认为0))*****************************//////////////
        String[] v1={"dynamo","发电机","n.","0"};
        String[] v2={"dyslexia","诵读困难","n.","0"};
        String[] v3={"dyspeptic","消化不良的；不高兴的","adj.","0"};
        String[] v4={"earnest","认真的","adj.","0"};
        String[] v5={"earplug","耳塞","n.","0"};
        String[] v6={"earring","耳环，耳饰","n.","0"};
        String[] v7={"earshot","听力所及之范围","n.","0"};
        String[] v8={"earsplitting","震耳欲聋的","adj.","0"};
        String[] v9={"earthly","现世的，尘世的","adj.","0"};
        String[] v10={"earthy","粗俗的，粗陋的","adj.","0"};
        String[] v11={"easel","黑板，画架","n.","0"};

        String[] v12={"eavesdrop","偷听，窃听","v.","0"};
        String[] v13={"ebb","退潮；衰退","v.","0"};
        String[] v14={"ebullience","精力充沛；洋溢；奔放","n.","0"};
        String[] v15={"eccentric","古怪的，反常的；（指圆形）没有共同圆心的；古怪的人",a+n,"0"};
        String[] v16={"eclectic","折衷的，综合性的","adj.","0"};
        String[] v17={"eclecticism","折衷主义","n.","0"};
        String[] v18={"ecologist","生态学家，生态学者","n.","0"};
        String[] v19={"economical","经济的，节约的","adj.","0"};
        String[] v20={"ecstasy","狂喜；激情状态","n.","0"};
        String[] v21={"ecstatic","狂喜的，心花怒放的","adj.","0"};
        String[] v22={"eddy","涡，涡流","n.","0"};
        String[] v23={"edifice","宏伟的建筑","n.","0"};
        String[] v24={"edify","陶冶，启发","v.","0"};
        String[] v25={"efface","擦去，抹去","v.","0"};

        String[] v26={"effervesce","冒泡；热情洋溢","v.","0"};
        String[] v27={"effete","无生产力的；虚弱的","adj.","0"};
        String[] v28={"efficacy","功效，有效性","n.","0"};
        String[] v29={"effluvia","气味；恶臭；废料","n.","0"};
        String[] v30={"effrontery","厚颜无耻，鲁莽","n.","0"};
        String[] v31={"effulgent","灿烂的","adj.","0"};
        String[] v32={"egalitarian","主张人人平等的","adj.","0"};
        String[] v33={"egocentric","利己的","adj.","0"};
        String[] v34={"egotist","自私利己者","n.","0"};
        String[] v35={"egregious","（缺点等）过分的，惊人的","adj.","0"};
        String[] v36={"egress","出去，出口","n.","0"};

        String[] v37={"elaborate","精致的，复杂的；详尽地说明，阐明",a+v,"0"};
        String[] v38={"elaboration","详尽的细节，详尽阐述","n.","0"};
        String[] v39={"elated","得意洋洋的，振奋的","adj.","0"};
        String[] v40={"elbow","肘","n.","0"};
        String[] v41={"elegy","哀歌，挽歌","n.","0"};
        String[] v42={"elementary","初级的","adj.","0"};
        String[] v43={"elephantine","笨拙的；庞大的","adj.","0"};
        String[] v44={"elevate","将某人或某物举起","v.","0"};
        String[] v45={"elicit","引出，探出","v.","0"};
        String[] v46={"eligible","合格的","adj.","0"};
        String[] v47={"eliminate","除去，淘汰","v.","0"};
        String[] v48={"elite","精华，中坚","n.","0"};

        String[] v49={"ellipsis","省略","n.","0"};
        String[] v50={"ellipical","椭圆的；晦涩的；省略的","adj.","0"};
        String[] v51={"elocution","演说的艺术","n.","0"};
        String[] v52={"elongate","延长，伸长","v.","0"};
        String[] v53={"eloquence","雄辩，口才","n.","0"};
        String[] v54={"elucidate","阐明，说明","v.","0"};
        String[] v55={"elude","逃避；搞不清","v.","0"};
        String[] v56={"elusive","难懂的","adj.","0"};
        String[] v57={"emaciate","使瘦弱，使憔悴","v.","0"};
        String[] v58={"emanate","散发，发出；发源","v.","0"};
        String[] v59={"emancipate","解放，解除","v.","0"};

        String[] v60={"embargo","禁运令，封港令","n.","0"};
        String[] v61={"embarrass","使忸怩，使难堪","v.","0"};
        String[] v62={"embed","牢牢插入，嵌于","v.","0"};
        String[] v63={"embellish","装饰，润饰","v.","0"};
        String[] v64={"embezzlement","贪污，盗用","n.","0"};
        String[] v65={"emblematic","作为象征的","adj.","0"};
        String[] v66={"embody","表达，体现","v.","0"};
        String[] v67={"embolden","壮胆，鼓励","v.","0"};
        String[] v68={"emboss","加浮雕花纹于，使凸出","v.","0"};
        String[] v69={"embrace","拥抱；包含","v.","0"};

        String[] v70={"embroider","刺绣，修饰","v.","0"};
        String[] v71={"emend","订正，校订","v.","0"};
        String[] v72={"emergency","紧急事件，紧急情况","n.","0"};
        String[] v73={"emigrate","移居外国","v.","0"};
        String[] v74={"eminence","卓越，杰出","n.","0"};
        String[] v75={"eminent","著名的，显著的","adj.","0"};
        String[] v76={"emissary","密使，特使","n.","0"};
        String[] v77={"emit","放射，发出（光、热、味等）","v.","0"};
        String[] v78={"emollient","润肤剂","n.","0"};
        String[] v79={"emote","激动地表达感情","v.","0"};
        String[] v80={"empathy","同感；感情移入；全神贯注","n.","0"};
        String[] v81={"emphatic","重视的，强调的","adj.","0"};
        String[] v82={"empirical","经验的，实证的","adj.","0"};

        String[] v83={"empiricism","经验主义","n.","0"};
        String[] v84={"empower","授权（给某人）采取行动","v.","0"};
        String[] v85={"empyreal","天空的","adj.","0"};
        String[] v86={"emulate","努力赶上或超越","v.","0"};
        String[] v87={"emulsify","使乳化","v.","0"};
        String[] v88={"enact","制定（法律）；扮演（角色）","v.","0"};
        String[] v89={"enamel","珐琅，瓷釉","n.","0"};
        String[] v90={"enamored","珍爱的，喜爱的","adj.","0"};
        String[] v91={"encapsulate","装入胶囊；概括，摘要","v.","0"};
        String[] v92={"enchant","使陶醉；施魔法于","v.","0"};
        String[] v93={"enclosure","圈地；围占；附件","n.","0"};
        String[] v94={"encomiast","赞美者","n.","0"};
        String[] v95={"encomium","赞颂，颂辞","n.","0"};

        String[] v96={"encompass","包围，围绕","v.","0"};
        String[] v97={"encounter","遭遇；邂逅（友人等）","v.","0"};
        String[] v98={"encroach","侵占，侵害，侵入","v.","0"};
        String[] v99={"encumber","妨碍，阻碍","v.","0"};
        String[] v100={"encyclopedia","百科全书","n.","0"};
        String[] v101={"endearing","讨人喜欢的","adj.","0"};
        String[] v102={"endemic","地方性的","adj.","0"};
        String[] v103={"endorse","背书","v.","0"};
        String[] v104={"endow","资助，捐助","v.","0"};
        String[] v105={"endure","忍受，忍耐","v.","0"};
        String[] v106={"enduring","持续的","adj.","0"};

        String[] v107={"enervate","使衰弱，使无力","v.","0"};
        String[] v108={"enfeeble","使衰弱，使无力","v.","0"};
        String[] v109={"enfetter","给…上脚镣；束缚，使受制于","v.","0"};
        String[] v110={"enflame","使愤怒或激动","v.","0"};
        String[] v111={"engaged","忙碌的，使用中的","adj.","0"};
        String[] v112={"engaging","迷人的，吸引注意力的","adj.","0"};
        String[] v113={"engender","产生，引起","v.","0"};
        String[] v114={"engrave","在（硬物）上雕刻；牢记，铭记","v.","0"};
        String[] v115={"engross","全神贯注于","v.","0"};
        String[] v116={"engulf","吞噬","v.","0"};
        String[] v117={"enhance","提高，增加，改善","v.","0"};
        String[] v118={"enjoin","命令，吩咐","v.","0"};
        String[] v119={"enlighten","启发，开导，教导，授予…知识","v.","0"};

        String[] v120={"enlightening","有启迪作用的；令人领悟的","adj.","0"};
        String[] v121={"enlist","（使）入伍从军，征募","v.","0"};
        String[] v122={"enliven","使…更活跃","v.","0"};
        String[] v123={"enmesh","（通常用被动语态）绊住，陷入网中","v.","0"};
        String[] v124={"enmity","敌意，仇恨","n.","0"};
        String[] v125={"ennui","倦怠；无聊；使无聊",n+v,"0"};
        String[] v126={"enormity","极恶；暴行；巨大","n.","0"};
        String[] v127={"enormous","极大的，巨大的","adj.","0"};
        String[] v128={"enrage","激怒，触怒","v.","0"};
        String[] v129={"enrapture","使狂喜，使高兴","v.","0"};
        String[] v130={"ensconce","安置，安顿","v.","0"};
        String[] v131={"ensemble","全体，整体；大合唱","n.","0"};
        String[] v132={"ensign","舰旗","n.","0"};
        String[] v133={"ensue","继而发生；接着","v.","0"};

        String[] v134={"ensure","确保，担保","v.","0"};
        String[] v135={"entail","需要，需求，必须","v.","0"};
        String[] v136={"entangle","使纠缠，卷入","v.","0"};
        String[] v137={"enterprise","公司，事业单位；进取心","n.","0"};
        String[] v138={"enthralling","迷人的，吸引人的","adj.","0"};
        String[] v139={"entice","怂恿，引诱","v.","0"};
        String[] v140={"entirety","整体，全面","n.","0"};
        String[] v141={"entitle","使有权（做某事）","v.","0"};
        String[] v142={"entity","实体，统一体","n.","0"};
        String[] v143={"entrance","使出神，使入迷","v.","0"};
        String[] v144={"entreat","恳求","v.","0"};
        String[] v145={"entreaty","恳求，哀求","n.","0"};
        String[] v146={"entree","主菜；获准进入的权利或特权","n.","0"};
        String[] v147={"entrepreneur","企业家，创业人","n.","0"};

        
    ////插入函数(不用了解)
   	subInitial(v1);
   	subInitial(v2);
   	subInitial(v3);
   	subInitial(v4);
   	subInitial(v5);
   	subInitial(v6);
   	subInitial(v7);
   	subInitial(v8);
   	subInitial(v9);
   	subInitial(v10);
   	subInitial(v11);
   	subInitial(v12);
   	subInitial(v13);
   	subInitial(v14);
   	subInitial(v15);
   	subInitial(v16);
   	subInitial(v17);
   	subInitial(v18);
   	subInitial(v19);
   	subInitial(v20);
   	subInitial(v21);
   	subInitial(v22);
   	subInitial(v23);
   	subInitial(v24);
   	subInitial(v25);
   	subInitial(v26);
   	subInitial(v27);
   	subInitial(v28);
   	subInitial(v29);
   	subInitial(v30);
   	subInitial(v31);
   	subInitial(v32);
   	subInitial(v33);
   	subInitial(v34);
   	subInitial(v35);
   	subInitial(v36);
   	subInitial(v37);
   	subInitial(v38);
   	subInitial(v39);
   	subInitial(v40);
   	subInitial(v41);
   	subInitial(v42);
   	subInitial(v43);
   	subInitial(v44);
   	subInitial(v45);
   	subInitial(v46);
   	subInitial(v47);
   	subInitial(v48);
   	subInitial(v49);
   	subInitial(v50);
   	subInitial(v51);
   	subInitial(v52);
   	subInitial(v53);
   	subInitial(v54);
   	subInitial(v55);
   	subInitial(v56);
   	subInitial(v57);
   	subInitial(v58);
   	subInitial(v59);
   	subInitial(v60);
   	subInitial(v61);
   	subInitial(v62);
   	subInitial(v63);
   	subInitial(v64);
   	subInitial(v65);
   	subInitial(v66);
   	subInitial(v67);
   	subInitial(v68);
   	subInitial(v69);
   	subInitial(v70);
   	subInitial(v71);
   	subInitial(v72);
   	subInitial(v73);
   	subInitial(v74);
   	subInitial(v75);
   	subInitial(v76);
   	subInitial(v77);
   	subInitial(v78);
   	subInitial(v79);
   	subInitial(v80);
   	subInitial(v81);
   	subInitial(v82);
   	subInitial(v83);
   	subInitial(v84);
   	subInitial(v85);
   	subInitial(v86);
   	subInitial(v87);
   	subInitial(v88);
   	subInitial(v89);
   	subInitial(v90);
   	subInitial(v91);
   	subInitial(v92);
   	subInitial(v93);
   	subInitial(v94);
   	subInitial(v95);
   	subInitial(v96);
   	subInitial(v97);
   	subInitial(v98);
   	subInitial(v99);
   	subInitial(v100);
   	subInitial(v101);
   	subInitial(v102);
   	subInitial(v103);
   	subInitial(v104);
   	subInitial(v105);
   	subInitial(v106);
   	subInitial(v107);
   	subInitial(v108);
   	subInitial(v109);
   	subInitial(v110);
   	subInitial(v111);
   	subInitial(v112);
   	subInitial(v113);
   	subInitial(v114);
   	subInitial(v115);
   	subInitial(v116);
   	subInitial(v117);
   	subInitial(v118);
   	subInitial(v119);
   	subInitial(v120);
   	subInitial(v121);
   	subInitial(v122);
   	subInitial(v123);
   	subInitial(v124);
   	subInitial(v125);
   	subInitial(v126);
   	subInitial(v127);
   	subInitial(v128);
   	subInitial(v129);
   	subInitial(v130);
   	subInitial(v131);
   	subInitial(v132);
   	subInitial(v133);
   	subInitial(v134);
   	subInitial(v135);
   	subInitial(v136);
   	subInitial(v137);
   	subInitial(v138);
   	subInitial(v139);
   	subInitial(v140);
   	subInitial(v141);
   	subInitial(v142);
   	subInitial(v143);
   	subInitial(v144);
   	subInitial(v145);
   	subInitial(v146);
   	subInitial(v147);
}
    private void doList_14(){
    /////*********************声明单词元组(单词+中文+词性+难度(默认为0))*****************************//////////////
        String[] v1={"entrust","委托；托付","v.","0"};
        String[] v2={"entry","条目；记录；报关手续；入口","n.","0"};
        String[] v3={"enumerate","列举，枚举","v.","0"};
        String[] v4={"enunciate","发音；（清楚地）表达，阐明","v.","0"};
        String[] v5={"environ","包尾，围绕","v.","0"};
        String[] v6={"envision","想象，预想","v.","0"};
        String[] v7={"enzyme","酵素，酶","n.","0"};
        String[] v8={"epaulet","肩章","n.","0"};
        String[] v9={"ephemeral","朝生暮死的；生命短暂的","adj.","0"};

        String[] v10={"epic","叙事诗，史诗；英雄的，大规模的","adj.","0"};
        String[] v11={"epicure","美食家","n.","0"};
        String[] v12={"epidemic","传染性的，流行性的","adj.","0"};
        String[] v13={"epidermis","表皮，外皮","n.","0"};
        String[] v14={"epigram","讽刺短句，警句","n.","0"};
        String[] v15={"epilogue","收场白；尾声","n.","0"};
        String[] v16={"episodic","偶然发生的；分散性的","adj.","0"};
        String[] v17={"epitaph","墓志铭","n.","0"};
        String[] v18={"epithet","（贬低人的）短语或形容词；绰号，别称","n.","0"};
        String[] v19={"epitome","典型；梗概，摘要","n.","0"};
        String[] v20={"epitomize","概括，摘要","v.","0"};

        String[] v21={"epoch","纪元；重大的事件","n.","0"};
        String[] v22={"equable","稳定的，不变的","adj.","0"};
        String[] v23={"equanimity","镇定，沉着","n.","0"};
        String[] v24={"equate","认为…相等或相仿","v.","0"};
        String[] v25={"equation","等式；等同，相等","n.","0"};
        String[] v26={"equator","赤道","n.","0"};
        String[] v27={"equilibrium","平衡","n.","0"};
        String[] v28={"equine","马的，似马的","adj.","0"};
        String[] v29={"equity","公平，公正","n.","0"};
        String[] v30={"equivalent","相等的，等值的","adj.","0"};
        String[] v31={"equivocate","模棱两可地说，支吾其词，说谎","adj.","0"};
        String[] v32={"eradicate","根除","v.","0"};

        String[] v33={"erase","擦掉，抹去","v.","0"};
        String[] v34={"erasure","擦掉；消除；消灭","n.","0"};
        String[] v35={"erect","竖立的，笔直的，直立的","adj.","0"};
        String[] v36={"err","犯错误，出错","v.","0"};
        String[] v37={"errand","差使；差事","n","0"};
        String[] v38={"erratic","反复无常的；古怪的","adj.","0"};
        String[] v39={"ersatz","代用的；假的","adj.","0"};
        String[] v40={"erstwhile","从前的，过去的","adj.","0"};
        String[] v41={"erudite","博学的","adj.","0"};
        String[] v42={"erupt","爆发；喷出","v.","0"};
        String[] v43={"escalate","（战争等）升级；扩大，上升","v.","0"};
        String[] v44={"escapism","逃避现实（的习气）","n.","0"};
        String[] v45={"eschew","避开；戒绝","v.","0"};

        String[] v46={"esophagus","食道，食管","n.","0"};
        String[] v47={"esoteric","秘传的；神秘的","adj.","0"};
        String[] v48={"espionage","间谍活动","n.","0"};
        String[] v49={"espousal","拥护，支持","n.","0"};
        String[] v50={"espouse","支持，拥护","v.","0"};
        String[] v51={"espy","（从远处等）突然看到","v.","0"};
        String[] v52={"essential","本质的；要素，实质",a+n,"0"};
        String[] v53={"estimable","值得尊敬的；可估计的","adj.","0"};
        String[] v54={"estranged","疏远的；分开的，分离的","adj.","0"};
        String[] v55={"etch","蚀刻；铭记","v.","0"};
        String[] v56={"etching","蚀刻术；蚀刻版画","n.","0"};
        String[] v57={"eternal","永久的，永恒的","adj.","0"};

        String[] v58={"ethereal","太空的；轻巧的","adj.","0"};
        String[] v59={"ethics","伦理学；道德规范","n.","0"};
        String[] v60={"ethnic","民族的；种族的","adj.","0"};
        String[] v61={"ethnology","人种学，人类文化学","n.","0"};
        String[] v62={"ethos","（个人、团体或民族）道德风貌，思潮，信仰","n.","0"};
        String[] v63={"etiquette","礼仪；礼节","n.","0"};
        String[] v64={"etymology","语源学","n.","0"};
        String[] v65={"eulogistic","颂扬的，歌功颂德的","adj.","0"};
        String[] v66={"eulogize","称赞，颂扬","v.","0"};
        String[] v67={"eulogy","颂词，颂文","n.","0"};
        String[] v68={"euphemism","婉言，委婉的说法","n.","0"};
        String[] v69={"euphonious","悦耳的","adj.","0"};

        String[] v70={"euphoria","极度愉快的心情","n.","0"};
        String[] v71={"evauate","撤退；撤离","v.","0"};
        String[] v72={"evade","逃避；规避","v.","0"};
        String[] v73={"evaluation","评价，评估","n.","0"};
        String[] v74={"evanescent","迅速消失的；短暂的","adj.","0"};
        String[] v75={"evaporate","（使某物）蒸发掉","v.","0"};
        String[] v76={"evasion","躲避，借口","n.","0"};
        String[] v77={"evasive","回避的，逃避的，托辞的","adj.","0"};
        String[] v78={"even","平的","adj.","0"};
        String[] v79={"evenhanded","公平的，不偏不倚的","adj.","0"};
        String[] v80={"evict","（依法）驱逐","v.","0"};

        String[] v81={"evince","表明，表示","v.","0"};
        String[] v82={"evocative","唤起的，激起的","adj.","0"};
        String[] v83={"evoke","引起；唤起","v.","0"};
        String[] v84={"evolve","使逐渐形成，进化","v.","0"};
        String[] v85={"ewe","母羊","n.","0"};
        String[] v86={"ewer","大口水罐","n.","0"};
        String[] v87={"exacerbate","加重，恶化","v.","0"};
        String[] v88={"exact","精确的；强求，强索付款",a+v,"0"};
        String[] v89={"exacting","苛求的；要求严格的","adj.","0"};
        String[] v90={"exactitude","正确性；精确性","n.","0"};
        String[] v91={"exaggerate","夸张；夸大","v.","0"};
        String[] v92={"exalt","（高度）赞扬，歌颂","v.","0"};
        String[] v93={"exaltation","（成功带来的）得意，高兴","n.","0"};
        String[] v94={"exasperate","激怒，使恼怒","v.","0"};

        String[] v95={"excavate","挖掘；挖出","v.","0"};
        String[] v96={"exceed","超过；超出","v.","0"};
        String[] v97={"exceptional","特别（好）的","adj.","0"};
        String[] v98={"excess","过分，过度","n.","0"};
        String[] v99={"excise","切除，删去","v.","0"};
        String[] v100={"excitability","易兴奋性，易激动性","n.","0"};
        String[] v101={"exclaim","惊叫，呼喊","v.","0"};
        String[] v102={"exclamation","惊叹词；惊呼","n.","0"};
        String[] v103={"exclude","排斥；排除","v.","0"};
        String[] v104={"exclusive","（人）孤僻的；（物）专用的","adj.","0"};
        String[] v105={"excoriate","撕去皮；严厉批评","v.","0"};
        String[] v106={"excrete","排泄，分泌","v.","0"};

        String[] v107={"exculpate","开脱；申明无罪","v.","0"};
        String[] v108={"excursion","短途旅游","n.","0"};
        String[] v109={"excursive","离题的；随意的","adj.","0"};
        String[] v110={"execrable","极坏的","adj.","0"};
        String[] v111={"execrate","憎恶；咒骂","v.","0"};
        String[] v112={"execute","执行，履行；将某人处死","v.","0"};
        String[] v113={"exemplary","可做楷模的","adj.","0"};
        String[] v114={"exemplify","是…的典型","v.","0"};
        String[] v115={"exempt","被免除的；使免除",a+v,"0"};
        String[] v116={"exert","运用（力量等）","v.","0"};
        String[] v117={"exhale","呼出（气）","v.","0"};

        String[] v118={"exhaust","（机器排出的）废气，蒸气；使非常疲倦",n+v,"0"};
        String[] v119={"exhaustive","彻底的；无遗漏的","adj.","0"};
        String[] v120={"exhilarate","使高兴","v.","0"};
        String[] v121={"exhilartion","高兴，活跃","n.","0"};
        String[] v122={"exhort","力劝；勉励","v.","0"};
        String[] v123={"exigent","紧急的，迫切的","adj.","0"};
        String[] v124={"existential","有关存在的，存在主义的","adj.","0"};
        String[] v125={"exodus","大批离去，成群外出","n.","0"};
        String[] v126={"exonerate","免除责任；宣布无罪","v.","0"};
        String[] v127={"exorbitant","过分的，过度的","adj.","0"};
        String[] v128={"exorcise","驱魔；去除","v.","0"};

        String[] v129={"exotic","珍奇的；来自异国的","adj.","0"};
        String[] v130={"expand","扩大，膨胀","v.","0"};
        String[] v131={"expansive","（指人）健谈的，开朗的；可扩大的，可伸展的","adj.","0"};
        String[] v132={"expediency","方便；权宜之计","n.","0"};
        String[] v133={"expedient","权宜之计，临时手段；（指行动）有用的",n+a,"0"};
        String[] v134={"expeditious","迅速的，敏捷的","adj.","0"};
        String[] v135={"expel","排出；开除","v.","0"};
        String[] v136={"expend","花费；用光","v.","0"};
        String[] v137={"expediture","消耗，支出","n.","0"};
        String[] v138={"expertise","专门技术，专业知识","n.","0"};

        
    ////插入函数(不用了解)
   	subInitial(v1);
   	subInitial(v2);
   	subInitial(v3);
   	subInitial(v4);
   	subInitial(v5);
   	subInitial(v6);
   	subInitial(v7);
   	subInitial(v8);
   	subInitial(v9);
   	subInitial(v10);
   	subInitial(v11);
   	subInitial(v12);
   	subInitial(v13);
   	subInitial(v14);
   	subInitial(v15);
   	subInitial(v16);
   	subInitial(v17);
   	subInitial(v18);
   	subInitial(v19);
   	subInitial(v20);
   	subInitial(v21);
   	subInitial(v22);
   	subInitial(v23);
   	subInitial(v24);
   	subInitial(v25);
   	subInitial(v26);
   	subInitial(v27);
   	subInitial(v28);
   	subInitial(v29);
   	subInitial(v30);
   	subInitial(v31);
   	subInitial(v32);
   	subInitial(v33);
   	subInitial(v34);
   	subInitial(v35);
   	subInitial(v36);
   	subInitial(v37);
   	subInitial(v38);
   	subInitial(v39);
   	subInitial(v40);
   	subInitial(v41);
   	subInitial(v42);
   	subInitial(v43);
   	subInitial(v44);
   	subInitial(v45);
   	subInitial(v46);
   	subInitial(v47);
   	subInitial(v48);
   	subInitial(v49);
   	subInitial(v50);
   	subInitial(v51);
   	subInitial(v52);
   	subInitial(v53);
   	subInitial(v54);
   	subInitial(v55);
   	subInitial(v56);
   	subInitial(v57);
   	subInitial(v58);
   	subInitial(v59);
   	subInitial(v60);
   	subInitial(v61);
   	subInitial(v62);
   	subInitial(v63);
   	subInitial(v64);
   	subInitial(v65);
   	subInitial(v66);
   	subInitial(v67);
   	subInitial(v68);
   	subInitial(v69);
   	subInitial(v70);
   	subInitial(v71);
   	subInitial(v72);
   	subInitial(v73);
   	subInitial(v74);
   	subInitial(v75);
   	subInitial(v76);
   	subInitial(v77);
   	subInitial(v78);
   	subInitial(v79);
   	subInitial(v80);
   	subInitial(v81);
   	subInitial(v82);
   	subInitial(v83);
   	subInitial(v84);
   	subInitial(v85);
   	subInitial(v86);
   	subInitial(v87);
   	subInitial(v88);
   	subInitial(v89);
   	subInitial(v90);
   	subInitial(v91);
   	subInitial(v92);
   	subInitial(v93);
   	subInitial(v94);
   	subInitial(v95);
   	subInitial(v96);
   	subInitial(v97);
   	subInitial(v98);
   	subInitial(v99);
   	subInitial(v100);
   	subInitial(v101);
   	subInitial(v102);
   	subInitial(v103);
   	subInitial(v104);
   	subInitial(v105);
   	subInitial(v106);
   	subInitial(v107);
   	subInitial(v108);
   	subInitial(v109);
   	subInitial(v110);
   	subInitial(v111);
   	subInitial(v112);
   	subInitial(v113);
   	subInitial(v114);
   	subInitial(v115);
   	subInitial(v116);
   	subInitial(v117);
   	subInitial(v118);
   	subInitial(v119);
   	subInitial(v120);
   	subInitial(v121);
   	subInitial(v122);
   	subInitial(v123);
   	subInitial(v124);
   	subInitial(v125);
   	subInitial(v126);
   	subInitial(v127);
   	subInitial(v128);
   	subInitial(v129);
   	subInitial(v130);
   	subInitial(v131);
   	subInitial(v132);
   	subInitial(v133);
   	subInitial(v134);
   	subInitial(v135);
   	subInitial(v136);
   	subInitial(v137);
   	subInitial(v138);
}
    private void doList_15(){
    /////*********************声明单词元组(单词+中文+词性+难度(默认为0))*****************************//////////////
        String[] v1={"expiate","赎罪，补偿","v.","0"};
        String[] v2={"expiration","期满，终止","n.","0"};
        String[] v3={"expire","期满；去世","v.","0"};
        String[] v4={"explicate","详细解说","v.","0"};
        String[] v5={"explicit","清楚明确的;成熟","adj.","0"};
        String[] v6={"exploit","剥削；开发利用；英勇行为",v+n,"0"};
        String[] v7={"explosive","炸药；爆炸性的；使人冲动的",n+a,"0"};
        String[] v8={"exponent","说明者，支持者；指数","n.","0"};

        String[] v9={"exponentially","指数地；迅速增长地","adv.","0"};
        String[] v10={"exposition","阐释；博览会","n.","0"};
        String[] v11={"expository","说明的","adj.","0"};
        String[] v12={"expostulate","（对人或行为进行）争论，抗议；告诫","v.","0"};
        String[] v13={"exposure","暴露，显露，曝光","n.","0"};
        String[] v14={"expound","解释；阐述","v.","0"};
        String[] v15={"expressly","清楚地；特意地","adv.","0"};
        String[] v16={"expunge","删除","v.","0"};
        String[] v17={"expurgate","删除；使纯洁","v.","0"};
        String[] v18={"exquisite","精致的；近乎完美的","adj.","0"};
        String[] v19={"extant","现存的","adj.","0"};
        String[] v20={"extemporaneous","即席的，没有准备的","adj.","0"};

        String[] v21={"extemporize","即席演说","v.","0"};
        String[] v22={"extend","延展，延长；舒展","v.","0"};
        String[] v23={"extenuate","掩饰（罪行）；减轻罪过","v.","0"};
        String[] v24={"exterminate","消灭，灭绝","v.","0"};
        String[] v25={"externalize","使…表面化","v.","0"};
        String[] v26={"extinct","绝种的，不存在的","adj.","0"};
        String[] v27={"extinguish","使…熄灭；使…不复存","v.","0"};
        String[] v28={"extirpation","根除，铲除","n.","0"};
        String[] v29={"extol","赞美","v.","0"};

        String[] v30={"extort","勒索，敲诈","v.","0"};
        String[] v31={"extract","拔出；强索","v.","0"};
        String[] v32={"extraneous","外来的；无关的","adj.","0"};
        String[] v33={"extrapolate","预测，推测","v.","0"};
        String[] v34={"extravagance","奢侈，挥霍","n.","0"};
        String[] v35={"extremist","极端主义者","n.","0"};
        String[] v36={"extricable","可解救的，能脱险的","adj.","0"};
        String[] v37={"extricate","摆脱，脱离；拯救，救出","v.","0"};
        String[] v38={"extrovert","性格外向者","n.","0"};

        String[] v39={"exuberance","愉快；茁壮","n.","0"};
        String[] v40={"exuberant","（人）充满活力的；（植物）茂盛的","adj.","0"};
        String[] v41={"exude","使慢慢流出；四溢","v.","0"};
        String[] v42={"exult","欢腾，喜悦","v.","0"};
        String[] v43={"fabric","纺织品；结构","n.","0"};
        String[] v44={"fabricate","捏造；制造","v.","0"};
        String[] v45={"facade","建筑物的正面；（虚伪的）外表","n.","0"};
        String[] v46={"facet","（宝石等的）小平面","n.","0"};
        String[] v47={"facetious","轻浮的，好开玩笑的","adj.","0"};
        String[] v48={"facile","容易做的；肤浅的","adj.","0"};
        String[] v49={"facilitate","使容易，促进","v.","0"};

        String[] v50={"facilities","（使事情便利的）设备，工具","n.","0"};
        String[] v51={"faction","派系；派系斗争","n.","0"};
        String[] v52={"factorable","能分解因子","adj.","0"};
        String[] v53={"factotum","杂工，打杂","n.","0"};
        String[] v54={"factual","真实的，事实的","adj.","0"};
        String[] v55={"faculty","全体教员；官能","n.","0"};
        String[] v56={"fad","（流行一时的）狂热，时尚","n.","0"};
        String[] v57={"faddish","流行一时的，时尚","adj.","0"};
        String[] v58={"fade","褪色，消失，凋谢","v.","0"};
        String[] v59={"falcon","猎鹰；隼","n.","0"};
        String[] v60={"fallacious","欺骗的；谬误的","adj.","0"};
        String[] v61={"fallacy","谬误，错误","n.","0"};
        String[] v62={"fallibility","易于出错，出错性","n.","0"};
        String[] v63={"fallible","会犯错的，易犯错的","adj.","0"};
        String[] v64={"fallow","休耕地；（土地）休耕的",n+a,"0"};
        String[] v65={"falsehood","谎言","n.","0"};

        String[] v66={"falter","摇晃，蹒跚；支吾地说","v.","0"};
        String[] v67={"familiarity","精通；亲近；不拘礼仪","n.","0"};
        String[] v68={"famine","饥荒","n.","0"};
        String[] v69={"famish","使饥饿","v.","0"};
        String[] v70={"fanatic","狂热者","n.","0"};
        String[] v71={"fang","（蛇的）毒牙","n.","0"};
        String[] v72={"fantasy","想象；幻想","n.","0"};
        String[] v73={"farce","闹剧；荒谬，胡闹","n.","0"};
        String[] v74={"farewell","再会，再见；辞行，告别","interj.;n.","0"};
        String[] v75={"far-reaching","影响深远的","adj.","0"};
        String[] v76={"fast","绝食，斋戒","n.","0"};
        String[] v77={"fasten","固定某物","v.","0"};
        String[] v78={"fastidious","难以取悦的；爱挑剔的","adj.","0"};
        String[] v79={"fastness","要塞，堡垒","n.","0"};
        String[] v80={"fatal","致命的；灾难性的","adj.","0"};
        String[] v81={"fathom","英寻（水深量度单位，等于1.8米）；彻底明白，了解",n+v,"0"};
        String[] v82={"fatigue","疲劳，劳累","n.","0"};

        String[] v83={"fatten","使长肥；使土壤肥沃；装满","v.","0"};
        String[] v84={"fatuity","愚蠢，愚昧","n.","0"};
        String[] v85={"fatuous","愚昧而不自知的","adj.","0"};
        String[] v86={"faucet","水龙头","n.","0"};
        String[] v87={"fault","错误；（地质学）断层","n.","0"};
        String[] v88={"faultfinder","喜欢挑剔的人","n.","0"};
        String[] v89={"favorable","有利的；赞成的","adj.","0"};
        String[] v90={"fawn","未满周岁的小鹿；巴结，奉承",n+v,"0"};
        String[] v91={"faze","使狼狈，折磨","v.","0"};
        String[] v92={"feasible","可行的，可能的","adj.","0"};
        String[] v93={"feat","功绩，壮举","n.","0"};
        String[] v94={"feature","特色，特点，特征","n.","0"};
        String[] v95={"feckless","效率低的，不负责的","adj.","0"};
        String[] v96={"fecundity","多产，富饶；繁殖力，生产力","n.","0"};
        String[] v97={"feeble","虚弱的","adj.","0"};
        String[] v98={"feign","假装，伪装","v.","0"};
        String[] v99={"feigned","假装的；不真诚的","adj.","0"};

        String[] v100={"feint","佯攻，佯击","v./n.","0"};
        String[] v101={"felicitous","（话语等）适当的，得体的","adj.","0"};
        String[] v102={"fell","兽皮；砍伐；凶猛的，毁灭性的",n+v+a,"0"};
        String[] v103={"felon","重罪犯","n.","0"};
        String[] v104={"felony","重罪","n.","0"};
        String[] v105={"feminist","女权运动者","n.","0"};
        String[] v106={"fender","挡泥板；护舷的垫子","n.","0"};
        String[] v107={"feral","凶猛的；野的","adj.","0"};
        String[] v108={"ferment","发酵；骚动","v./n.","0"};
        String[] v109={"fern","羊齿植物，蕨","n.","0"};
        String[] v110={"ferret","雪貂；用雪貂猎取；搜寻",n+v,"0"};
        String[] v111={"ferrous","含铁的","adj.","0"};
        String[] v112={"fertile","多产的；肥沃的","adj.","0"};
        String[] v113={"fertilize","受精，受粉；施肥","v.","0"};
        String[] v114={"fertilizer","肥料，化肥","n.","0"};

        String[] v115={"fervid","炽热的，热情的","adj.","0"};
        String[] v116={"fervor","热诚，热心","n.","0"};
        String[] v117={"fester","（指伤口）溃烂，化脓","v.","0"};
        String[] v118={"festive","欢乐地","adj.","0"};
        String[] v119={"fetid","有恶臭的","adj.","0"};
        String[] v120={"fetter","（带）脚镣；束缚","n./v.","0"};
        String[] v121={"fetus","胎儿","n.","0"};
        String[] v122={"feud","宿怨，不合","n.","0"};
        String[] v123={"fiasco","大失败，惨败","n.","0"};
        String[] v124={"fiat","命令","n.","0"};
        String[] v125={"fickle","（爱情或友谊）易变的，不坚定的","adj.","0"};
        String[] v126={"fictitious","假的；虚构的","adj.","0"};
        String[] v127={"fidget","坐立不安；烦躁之人",v+n,"0"};
        String[] v128={"fig","无花果；毫不理会；一点儿","n.","0"};
        String[] v129={"figment","虚构的东西","n.","0"};

        String[] v130={"figurative","比喻的，借喻的","adj.","0"};
        String[] v131={"figurehead","名义领袖；傀儡","n.","0"};
        String[] v132={"figurine","小塑像，小雕像","n.","0"};
        String[] v133={"file","锉刀；锉平",n+v,"0"};
        String[] v134={"filibuster","妨碍议事，阻挠","v./n.","0"};
        String[] v135={"filigree","金银丝做的工艺品","n.","0"};
        String[] v136={"filings","锉屑","n.","0"};
        String[] v137={"filly","小母马","n.","0"};
        String[] v138={"filter","滤纸；过滤",n+v,"0"};
        String[] v139={"filth","肮脏；粗语","n.","0"};
        String[] v140={"finale","最后，最终；乐章的最后部分","n.","0"};
        String[] v141={"finesse","技巧；计谋；手段","n.","0"};
        String[] v142={"finicky","苛求的，过分讲究的","adj.","0"};
        String[] v143={"finite","有限的","adj.","0"};

        String[] v144={"firearm","（便携式）枪支","n.","0"};
        String[] v145={"firefly","萤火虫","n.","0"};
        String[] v146={"fiscal","国库的，财政的","adj.","0"};
        String[] v147={"fissure","裂缝","n.","0"};
        String[] v148={"fixate","使固定；使不变；注视，凝视","v.","0"};
        String[] v149={"flacid","松弛的；软弱的","adj.","0"};
        String[] v150={"flag","减弱，衰退；枯萎","v.","0"};
        String[] v151={"flagging","下垂的；衰弱的","adj.","0"};
        String[] v152={"flaggy","枯萎的；松软无力的","adj.","0"};
        String[] v153={"flail","连枷（打谷工具）；打，打击",n+v,"0"};
        String[] v154={"flak","高射炮；指责","n.","0"};
        String[] v155={"flamboyant","艳丽的，炫耀的","adj.","0"};
        String[] v156={"flammable","易燃的","adj.","0"};

        
    ////插入函数(不用了解)
   	subInitial(v1);
   	subInitial(v2);
   	subInitial(v3);
   	subInitial(v4);
   	subInitial(v5);
   	subInitial(v6);
   	subInitial(v7);
   	subInitial(v8);
   	subInitial(v9);
   	subInitial(v10);
   	subInitial(v11);
   	subInitial(v12);
   	subInitial(v13);
   	subInitial(v14);
   	subInitial(v15);
   	subInitial(v16);
   	subInitial(v17);
   	subInitial(v18);
   	subInitial(v19);
   	subInitial(v20);
   	subInitial(v21);
   	subInitial(v22);
   	subInitial(v23);
   	subInitial(v24);
   	subInitial(v25);
   	subInitial(v26);
   	subInitial(v27);
   	subInitial(v28);
   	subInitial(v29);
   	subInitial(v30);
   	subInitial(v31);
   	subInitial(v32);
   	subInitial(v33);
   	subInitial(v34);
   	subInitial(v35);
   	subInitial(v36);
   	subInitial(v37);
   	subInitial(v38);
   	subInitial(v39);
   	subInitial(v40);
   	subInitial(v41);
   	subInitial(v42);
   	subInitial(v43);
   	subInitial(v44);
   	subInitial(v45);
   	subInitial(v46);
   	subInitial(v47);
   	subInitial(v48);
   	subInitial(v49);
   	subInitial(v50);
   	subInitial(v51);
   	subInitial(v52);
   	subInitial(v53);
   	subInitial(v54);
   	subInitial(v55);
   	subInitial(v56);
   	subInitial(v57);
   	subInitial(v58);
   	subInitial(v59);
   	subInitial(v60);
   	subInitial(v61);
   	subInitial(v62);
   	subInitial(v63);
   	subInitial(v64);
   	subInitial(v65);
   	subInitial(v66);
   	subInitial(v67);
   	subInitial(v68);
   	subInitial(v69);
   	subInitial(v70);
   	subInitial(v71);
   	subInitial(v72);
   	subInitial(v73);
   	subInitial(v74);
   	subInitial(v75);
   	subInitial(v76);
   	subInitial(v77);
   	subInitial(v78);
   	subInitial(v79);
   	subInitial(v80);
   	subInitial(v81);
   	subInitial(v82);
   	subInitial(v83);
   	subInitial(v84);
   	subInitial(v85);
   	subInitial(v86);
   	subInitial(v87);
   	subInitial(v88);
   	subInitial(v89);
   	subInitial(v90);
   	subInitial(v91);
   	subInitial(v92);
   	subInitial(v93);
   	subInitial(v94);
   	subInitial(v95);
   	subInitial(v96);
   	subInitial(v97);
   	subInitial(v98);
   	subInitial(v99);
   	subInitial(v100);
   	subInitial(v101);
   	subInitial(v102);
   	subInitial(v103);
   	subInitial(v104);
   	subInitial(v105);
   	subInitial(v106);
   	subInitial(v107);
   	subInitial(v108);
   	subInitial(v109);
   	subInitial(v110);
   	subInitial(v111);
   	subInitial(v112);
   	subInitial(v113);
   	subInitial(v114);
   	subInitial(v115);
   	subInitial(v116);
   	subInitial(v117);
   	subInitial(v118);
   	subInitial(v119);
   	subInitial(v120);
   	subInitial(v121);
   	subInitial(v122);
   	subInitial(v123);
   	subInitial(v124);
   	subInitial(v125);
   	subInitial(v126);
   	subInitial(v127);
   	subInitial(v128);
   	subInitial(v129);
   	subInitial(v130);
   	subInitial(v131);
   	subInitial(v132);
   	subInitial(v133);
   	subInitial(v134);
   	subInitial(v135);
   	subInitial(v136);
   	subInitial(v137);
   	subInitial(v138);
   	subInitial(v139);
   	subInitial(v140);
   	subInitial(v141);
   	subInitial(v142);
   	subInitial(v143);
   	subInitial(v144);
   	subInitial(v145);
   	subInitial(v146);
   	subInitial(v147);
   	subInitial(v148);
   	subInitial(v149);
   	subInitial(v150);
   	subInitial(v151);
   	subInitial(v152);
   	subInitial(v153);
   	subInitial(v154);
   	subInitial(v155);
   	subInitial(v156);
	
}
    private void doList_16(){
    /////*********************声明单词元组(单词+中文+词性+难度(默认为0))*****************************//////////////
        String[] v1={"flange","（火车车轮的）凸缘，轮缘","n.","0"};
        String[] v2={"flare","（火焰）摇曳，闪耀","n./v.","0"};
        String[] v3={"flask","烧瓶，细颈瓶","n.","0"};
        String[] v4={"flatcar","平台型铁路货车","n.","0"};
        String[] v5={"flatten","变平；彻底打败某人","v.","0"};
        String[] v6={"flatter","恭维，奉承","v.","0"};
        String[] v7={"flaw","瑕疵；生裂缝；有瑕疵",n+v,"0"};
        String[] v8={"flax","亚麻","n.","0"};
        String[] v9={"fledge","小鸟长飞羽，变的羽毛丰满","v.","0"};
        String[] v10={"fledgling","（刚会飞的）幼鸟；无经验","n.","0"};
        String[] v11={"fleeting","短暂的；飞逝的","adj.","0"};

        String[] v12={"flexible","易弯曲的，灵活的","adj.","0"};
        String[] v13={"flight","飞行，飞翔；逃跑","n.","0"};
        String[] v14={"flimsy","（指布料或材料）轻而薄的；脆弱的","adj.","0"};
        String[] v15={"flinch","畏缩，退缩","v.","0"};
        String[] v16={"flint","打火石，燧石","n.","0"};
        String[] v17={"flip","无礼的；冒失的；轻率的","adj.","0"};
        String[] v18={"flirt","挑逗，调戏","v.","0"};
        String[] v19={"flit","掠过，迅速飞过","v.","0"};
        String[] v20={"flock","羊群；鸟群","n.","0"};
        String[] v21={"floodgate","（水闸的）闸门","n.","0"};
        String[] v22={"flora","（某地区或时代的）植物群","n.","0"};
        String[] v23={"florid","华丽的；（脸）红润的","adj.","0"};
        String[] v24={"flounder","挣扎；艰苦地移动；比目鱼",v+n,"0"};
        String[] v25={"flourish","昌盛，兴旺；活跃而有影响力","v.","0"};

        String[] v26={"flout","蔑视，违抗","v.","0"};
        String[] v27={"fluctuate"," 波动；变化","v.","0"};
        String[] v28={"fluffy","有绒毛的；空洞的","adj.","0"};
        String[] v29={"fluke","侥幸成功；意想不到的事","n.","0"};
        String[] v30={"fluorescent","荧光的，发光的","adj.","0"};
        String[] v31={"flush","脸红；奔流；冲洗","n./v.","0"};
        String[] v32={"flustered","慌张的","adj.","0"};
        String[] v33={"flutter","拍翅","v.","0"};
        String[] v34={"fluvial","河流的，生在河中的","adj.","0"};
        String[] v35={"flux","不断的变动；动荡不定","n.","0"};
        String[] v36={"foible","小缺点，小毛病","n.","0"};
        String[] v37={"foil","钝剑；箔，锡箔纸","n.","0"};
        String[] v38={"fold","羊栏，畜栏","n.","0"};
        String[] v39={"folder","文件夹，纸夹","n.","0"};

        String[] v40={"foliage","叶子（总称）","n.","0"};
        String[] v41={"folklore","民间传说；民俗学","n.","0"};
        String[] v42={"folly","愚蠢；愚蠢的行为、思想或做法","n.","0"};
        String[] v43={"foment","煽动；助长（坏事）","v.","0"};
        String[] v44={"foodstuff","食料，食品","n.","0"};
        String[] v45={"foolproof","容易懂的，简单而不会误用的","adj.","0"};
        String[] v46={"foppish","（似）纨绔子弟的；浮华的，俗丽的","adj.","0"};
        String[] v47={"forage","（牛马的）饲料，粮草；搜寻，翻寻",n+v,"0"};
        String[] v48={"forager","为动物寻找饲料的人","n.","0"};
        String[] v49={"forbearance","自制；忍耐","n.","0"};
        String[] v50={"forbid","不许，禁止；妨碍，阻止","v.","0"};
        String[] v51={"forbidding","（表情）冷淡的；形势险恶的","adj.","0"};
        String[] v52={"ford","浅滩，水浅可涉处；涉水",n+v,"0"};

        String[] v53={"forebode","预感，凶兆","v.","0"};
        String[] v54={"forecast","预报，预测；预测",v+n,"0"};
        String[] v55={"foreknowledge","预知","n.","0"};
        String[] v56={"forerunner","预兆，前兆；先驱","n.","0"};
        String[] v57={"foreshadow","预示","v.","0"};
        String[] v58={"foresight","远见，深谋远虑","n.","0"};
        String[] v59={"forestall","预先阻止；阻止","v.","0"};
        String[] v60={"forestry","森林学；林产；林地","n.","0"};
        String[] v61={"forfeit","丧失，被罚没收；丧失的东西",v+n,"0"};
        String[] v62={"forge","铁匠铺；锤炼；伪造",n+v,"0"};
        String[] v63={"forger","伪造者；打铁匠","n.","0"};
        String[] v64={"forgery","伪造（物）","n.","0"};
        String[] v65={"forgo","放弃，抛弃","v.","0"};
        String[] v66={"formality","遵循的规范；拘泥形式；正式","n.","0"};

        String[] v67={"formation","组织，形成；（军队）编队","n.","0"};
        String[] v68={"formidable","可怕的；难以克服的","adj.","0"};
        String[] v69={"formula","[化]分子式；[数]公式；套语，惯用语","n.","0"};
        String[] v70={"forsake","遗弃，放弃","v.","0"};
        String[] v71={"forte","长处，擅长的事；（音乐）强音的",n+a,"0"};
        String[] v72={"forthright","直率的","adj.","0"};
        String[] v73={"fortify","加强防卫","v.","0"};
        String[] v74={"fortitude","坚毅，坚忍不拔","n.","0"};
        String[] v75={"fortuitous","偶然发生的，巧合的；幸运的","adj.","0"};
        String[] v76={"forum","辩论的场所，论坛","n.","0"};
        String[] v77={"forward","过激的；莽撞的","adj.","0"};
        String[] v78={"fosse","护城河","n.","0"};
        String[] v79={"fossilize","（使）成为化石；（使）过时","v.","0"};
        String[] v80={"foster","培养，鼓励；领养","v.","0"};

        String[] v81={"foul","恶臭的；邪恶的；弄脏；犯规",a+v+n,"0"};
        String[] v82={"founder","（船）沉没；（计划）失败；（尤指马）摔倒，绊","v.","0"};
        String[] v83={"four-poster","四柱大床","n.","0"};
        String[] v84={"foyer","门厅，休息室","n.","0"};
        String[] v85={"fracas","喧嚷，吵闹","n.","0"};
        String[] v86={"fraction","碎片；小部分","n.","0"};
        String[] v87={"fractious","（脾气）易怒的，好争吵的","adj.","0"};
        String[] v88={"fracture","骨折；折断；裂口","n.","0"};
        String[] v89={"fragile","易碎的，易坏的","adj.","0"};
        String[] v90={"fragment","碎片；分裂","n.","0"};
        String[] v91={"fragrance","香料；香味","n.","0"};
        String[] v92={"fragrant","芳香的","adj.","0"};
        String[] v93={"frail","脆弱的；不坚实的","adj.","0"};
        String[] v94={"frantic","疯狂的，狂乱的","adj.","0"};

        String[] v95={"fraud","欺诈，欺骗；骗子","n.","0"};
        String[] v96={"fraudulent","欺骗的，不诚实的","adj.","0"};
        String[] v97={"fraught","充满…的","adj.","0"};
        String[] v98={"freckle","雀斑，斑点","n.","0"};
        String[] v99={"freelancer","自由职业者","n.","0"};
        String[] v100={"freight","货物；装货于（船等）",n+v,"0"};
        String[] v101={"frenetic","狂乱的，发狂的","adj.","0"};
        String[] v102={"frenzy","极度激动的状态；狂暴","n.","0"};
        String[] v103={"frequency","频率","n.","0"};
        String[] v104={"frequent","时常来访；惯常的",v+a,"0"};
        String[] v105={"fresco","壁画","n.","0"};
        String[] v106={"fret","（使）烦躁，焦虑","n./v.","0"};
        String[] v107={"friable","易碎的","adj.","0"};
        String[] v108={"friction","摩擦；矛盾，冲突","n.","0"};
        String[] v109={"frieze","（在墙顶与天花板间起装饰作用的）横条，饰带","n.","0"};
        String[] v110={"frigid","寒冷的；冷淡的","adj.","0"};
        String[] v111={"frigidity","寒冷；冷淡","n.","0"};

        String[] v112={"fringe","（窗帘等）须边；边缘","n.","0"};
        String[] v113={"frisky","活泼的，快活的","adj.","0"};
        String[] v114={"frivolous","轻薄的，轻佻的","adj.","0"};
        String[] v115={"frond","蕨类或棕榈类的叶子","n.","0"};
        String[] v116={"frothy","起泡的；空洞的","adj.","0"};
        String[] v117={"frugal","节约的，节俭的","adj.","0"};
        String[] v118={"fruition","实现，完成","n.","0"};
        String[] v119={"frustrate","挫折，使沮丧","v.","0"};
        String[] v120={"fulcrum","杠杆支点，支柱","n.","0"};
        String[] v121={"fulfill","履行；满足，符合","v.","0"};
        String[] v122={"full-blown","（鲜花）盛开的","adj.","0"};
        String[] v123={"full-bodied","（味道等）浓郁而强烈的","adj.","0"};
        String[] v124={"full-fledged","羽毛丰满的；成熟的","adj.","0"};
        String[] v125={"fulminate","猛烈抨击，严厉谴责","v.","0"};
        String[] v126={"fulsome","虚情假意的；充足的","adj.","0"};
        String[] v127={"fumble","摸索，笨拙搜寻；弄乱，搞糟","v.","0"};

        String[] v128={"fume","愤怒；冒烟","v./n.","0"};
        String[] v129={"fumigate","以烟熏消毒","v.","0"};
        String[] v130={"functional","起作用的，能转运的；实用的","adj.","0"};
        String[] v131={"functionary","小官，低级公务员","n.","0"};
        String[] v132={"fundamental","最根本的，基本的；十分重要的","adj.","0"};
        String[] v133={"fungi","菌类，蘑菇","n.","0"};
        String[] v134={"fungicide","杀真菌剂","n.","0"};
        String[] v135={"furnace","锅炉","n.","0"};
        String[] v136={"furor","轰动；盛怒","n.","0"};
        String[] v137={"furrow","犁沟；皱纹","n.","0"};
        String[] v138={"furtive","偷偷的，秘密的","adj.","0"};
        String[] v139={"fusillade","（枪炮）齐射，连发","n./v.","0"};
        String[] v140={"fusion","融合；聚变","n.","0"};
        String[] v141={"fuss","大惊小怪","n.","0"};

        String[] v142={"fussy","爱挑剔的","adj.","0"};
        String[] v143={"fusty"," 陈腐的；霉臭的","adj.","0"};
        String[] v144={"futile","无效的，无用的；（人）没出息的；琐细的","adj.","0"};
        String[] v145={"futility","无用，无益","n.","0"};
        String[] v146={"gadfly","虻，牛虻；讨厌的人","n.","0"};
        String[] v147={"gadget","小工具，小机械","n.","0"};
        String[] v148={"gaffe","（社交上令人不快的）失言，失态","n.","0"};
        String[] v149={"gaggle","鹅群","n.","0"};
        String[] v150={"gainsay","否认","v.","0"};
        String[] v151={"gait","步法，步态","n.","0"};
        String[] v152={"galaxy","（银河）星群；显赫的人","n.","0"};
        String[] v153={"gall","胆汁；怨恨；激怒","n.","0"};
        String[] v154={"gallant","勇敢的；（向女人）献殷勤的","adj.","0"};
        String[] v155={"galley","船上的厨房","n.","0"};
        String[] v156={"gallon","加仑","n.","0"};
        String[] v157={"galvanize","电镀；通电；激励","v.","0"};

        String[] v158={"gamble","赌博；孤注一掷","v./n.","0"};
        String[] v159={"gambol","雀跃；嬉戏","n./v.","0"};
        String[] v160={"gangway","（上下船的）跳板","n.","0"};
        String[] v161={"gape","裂开；目瞪口呆地凝视","v.","0"};
        String[] v162={"garble","曲解，篡改","v.","0"};
        String[] v163={"garbled","引起误解的；篡改的","adj.","0"};
        String[] v164={"gardenia","栀子花","n.","0"};
        String[] v165={"gargantuan","巨大的，庞大的","adj.","0"};

        
    ////插入函数(不用了解)
   	subInitial(v1);
   	subInitial(v2);
   	subInitial(v3);
   	subInitial(v4);
   	subInitial(v5);
   	subInitial(v6);
   	subInitial(v7);
   	subInitial(v8);
   	subInitial(v9);
   	subInitial(v10);
   	subInitial(v11);
   	subInitial(v12);
   	subInitial(v13);
   	subInitial(v14);
   	subInitial(v15);
   	subInitial(v16);
   	subInitial(v17);
   	subInitial(v18);
   	subInitial(v19);
   	subInitial(v20);
   	subInitial(v21);
   	subInitial(v22);
   	subInitial(v23);
   	subInitial(v24);
   	subInitial(v25);
   	subInitial(v26);
   	subInitial(v27);
   	subInitial(v28);
   	subInitial(v29);
   	subInitial(v30);
   	subInitial(v31);
   	subInitial(v32);
   	subInitial(v33);
   	subInitial(v34);
   	subInitial(v35);
   	subInitial(v36);
   	subInitial(v37);
   	subInitial(v38);
   	subInitial(v39);
   	subInitial(v40);
   	subInitial(v41);
   	subInitial(v42);
   	subInitial(v43);
   	subInitial(v44);
   	subInitial(v45);
   	subInitial(v46);
   	subInitial(v47);
   	subInitial(v48);
   	subInitial(v49);
   	subInitial(v50);
   	subInitial(v51);
   	subInitial(v52);
   	subInitial(v53);
   	subInitial(v54);
   	subInitial(v55);
   	subInitial(v56);
   	subInitial(v57);
   	subInitial(v58);
   	subInitial(v59);
   	subInitial(v60);
   	subInitial(v61);
   	subInitial(v62);
   	subInitial(v63);
   	subInitial(v64);
   	subInitial(v65);
   	subInitial(v66);
   	subInitial(v67);
   	subInitial(v68);
   	subInitial(v69);
   	subInitial(v70);
   	subInitial(v71);
   	subInitial(v72);
   	subInitial(v73);
   	subInitial(v74);
   	subInitial(v75);
   	subInitial(v76);
   	subInitial(v77);
   	subInitial(v78);
   	subInitial(v79);
   	subInitial(v80);
   	subInitial(v81);
   	subInitial(v82);
   	subInitial(v83);
   	subInitial(v84);
   	subInitial(v85);
   	subInitial(v86);
   	subInitial(v87);
   	subInitial(v88);
   	subInitial(v89);
   	subInitial(v90);
   	subInitial(v91);
   	subInitial(v92);
   	subInitial(v93);
   	subInitial(v94);
   	subInitial(v95);
   	subInitial(v96);
   	subInitial(v97);
   	subInitial(v98);
   	subInitial(v99);
   	subInitial(v100);
   	subInitial(v101);
   	subInitial(v102);
   	subInitial(v103);
   	subInitial(v104);
   	subInitial(v105);
   	subInitial(v106);
   	subInitial(v107);
   	subInitial(v108);
   	subInitial(v109);
   	subInitial(v110);
   	subInitial(v111);
   	subInitial(v112);
   	subInitial(v113);
   	subInitial(v114);
   	subInitial(v115);
   	subInitial(v116);
   	subInitial(v117);
   	subInitial(v118);
   	subInitial(v119);
   	subInitial(v120);
   	subInitial(v121);
   	subInitial(v122);
   	subInitial(v123);
   	subInitial(v124);
   	subInitial(v125);
   	subInitial(v126);
   	subInitial(v127);
   	subInitial(v128);
   	subInitial(v129);
   	subInitial(v130);
   	subInitial(v131);
   	subInitial(v132);
   	subInitial(v133);
   	subInitial(v134);
   	subInitial(v135);
   	subInitial(v136);
   	subInitial(v137);
   	subInitial(v138);
   	subInitial(v139);
   	subInitial(v140);
   	subInitial(v141);
   	subInitial(v142);
   	subInitial(v143);
   	subInitial(v144);
   	subInitial(v145);
   	subInitial(v146);
   	subInitial(v147);
   	subInitial(v148);
   	subInitial(v149);
   	subInitial(v150);
   	subInitial(v151);
   	subInitial(v152);
   	subInitial(v153);
   	subInitial(v154);
   	subInitial(v155);
   	subInitial(v156);
   	subInitial(v157);
   	subInitial(v158);
   	subInitial(v159);
   	subInitial(v160);
   	subInitial(v161);
   	subInitial(v162);
   	subInitial(v163);
   	subInitial(v164);
   	subInitial(v165);
}
    private void doList_17(){
    /////*********************声明单词元组(单词+中文+词性+难度(默认为0))*****************************//////////////
        String[] v1={"gargoyle","（雕刻成怪兽状的）滴水嘴；面貌丑恶的人","n.","0"};
        String[] v2={"garish","俗丽的；过于艳丽的","adj.","0"};
        String[] v3={"garment","衣服","n.","0"};
        String[] v4={"garner","收藏，积累","v.","0"};
        String[] v5={"garnish","装饰","v.","0"};
        String[] v6={"garrulity","唠叨，饶舌","n.","0"};
        String[] v7={"garrulous","唠叨的，多话的","adj.","0"};
        String[] v8={"gaseous","似气体的","adj.","0"};
        String[] v9={"gash","深长的伤口；裂缝","n.","0"};
        String[] v10={"gasification","气化","n.","0"};
        String[] v11={"gaucherie","笨拙","n.","0"};

        String[] v12={"gaudy","俗丽的","adj.","0"};
        String[] v13={"gauge","标准规格；测量仪；测量",n+v,"0"};
        String[] v14={"gavel","（法官所用的）槌，小木槌","n.","0"};
        String[] v15={"gaze","凝视，注视","v./n.","0"};
        String[] v16={"gazetteer","地名词典，地名表","n.","0"};
        String[] v17={"gear","齿轮；装备；仪器","n.","0"};
        String[] v18={"gem","宝石，珠宝；精华","n.","0"};
        String[] v19={"gene","基因","n.","0"};
        String[] v20={"genealogy","家谱学","n.","0"};
        String[] v21={"generality","概述","n.","0"};
        String[] v22={"generalize","归纳","v.","0"};
        String[] v23={"generate","造成；产生","v.","0"};
        String[] v24={"generation","一代人；（产品类型的）代；产生，发生","n.","0"};
        String[] v25={"generator","发电机","n.","0"};
        String[] v26={"generic","种类的，类属的","adj.","0"};
        String[] v27={"generosity","慷慨，大方","n.","0"};
        String[] v28={"genesis","创始，起源","n.","0"};
        String[] v29={"genetic","遗传的；起源的","adj.","0"};

        String[] v30={"genetics","遗传学","n.","0"};
        String[] v31={"genial","愉快的，脾气好的","adj.","0"};
        String[] v32={"genome","[生]基因组，染色体组","n.","0"};
        String[] v33={"genre","（文艺的）类型","n.","0"};
        String[] v34={"genteel","上流社会的；装作彬彬有礼的","adj.","0"};
        String[] v35={"gentle","温和的，慈祥的","adj.","0"};
        String[] v36={"gentry","绅士，上等人","n.","0"};
        String[] v37={"genuine","真的；真诚的","n.","0"};
        String[] v38={"genus","（动植物的）属","n.","0"};
        String[] v39={"geometrician","几何学家","n.","0"};
        String[] v40={"germ","胚芽，芽孢；微生物，细菌","n.","0"};
        String[] v41={"germane","有密切关系的；贴切的","adj.","0"};
        String[] v42={"germicide","杀菌剂","n.","0"};
        String[] v43={"germinate","发芽；发展","v.","0"};

        String[] v44={"gerontocracy","老人统治的政府","n.","0"};
        String[] v45={"gerontology","老人病学","n.","0"};
        String[] v46={"gerrymander","（为使某政党在选举中取得优势）不公正地将（某地区）划成选区","v.","0"};
        String[] v47={"gesture","姿势，手势，姿态","n.","0"};
        String[] v48={"geyser","天然热喷泉","n.","0"};
        String[] v49={"gibe","嘲弄，讥笑","n./v.","0"};
        String[] v50={"giddy","轻浮的，不严肃的","adj.","0"};
        String[] v51={"giggle","咯咯笑","v.","0"};
        String[] v52={"gild","镀金；虚饰","v.","0"};
        String[] v53={"gimmick","吸引人的花招，噱头","n.","0"};
        String[] v54={"ginger","姜；活力","n.","0"};
        String[] v55={"gingerly","小心的（地）；谨慎的（地）","adj./adv.","0"};
        String[] v56={"girder","大梁","n.","0"};
        String[] v57={"girth","腰身；周长","n.","0"};
        String[] v58={"gist","要点，要旨","n.","0"};

        String[] v59={"glacial","冰期的，冰河期的；寒冷的","adj.","0"};
        String[] v60={"glade","林中的空地","n.","0"};
        String[] v61={"gladiator","角斗士，与野兽搏斗者","n.","0"};
        String[] v62={"glance","一瞥","v./n.","0"};
        String[] v63={"glare","发出炫目光芒；怒目而视","v.","0"};
        String[] v64={"glaze","装玻璃于；上釉彩；釉",v+n,"0"};
        String[] v65={"glean","拾落穗；收集（材料等）","v.","0"};
        String[] v66={"glib","流利圆滑的，善辩的","adj.","0"};
        String[] v67={"glide","滑行，滑动","v.","0"};
        String[] v68={"glimmer","发微光；摇曳的微光",v+n,"0"};
        String[] v69={"glisten","闪烁，闪耀","v.","0"};
        String[] v70={"glitch","小故障","n.","0"};
        String[] v71={"gloat","幸灾乐祸地看，窃喜","v.","0"};
        String[] v72={"gloom","黑暗；忧郁","n.","0"};
        String[] v73={"gloomy","阴暗的；没有希望的；阴郁的","adj.","0"};

        String[] v74={"gloss","光泽","n.","0"};
        String[] v75={"glossary","词汇表；难词表","n.","0"};
        String[] v76={"glossy","光泽的，光滑的","adj.","0"};
        String[] v77={"glow","光亮，发热；（脸）红","v./n.","0"};
        String[] v78={"glower","怒目而视","v.","0"};
        String[] v79={"glowing","热情赞扬的","adj.","0"};
        String[] v80={"glucose","葡萄糖","n.","0"};
        String[] v81={"glut","过多；供过于求","v./n.","0"};
        String[] v82={"glutinous","粘的，胶状的","adj.","0"};
        String[] v83={"gluttonous","贪吃的，贪嘴的","adj.","0"};
        String[] v84={"gnarled","（树木）多节的；粗糙的","adj.","0"};
        String[] v85={"gnaw","啃，咬","v.","0"};
        String[] v86={"goad","赶牛棒；刺激，激励",n+v,"0"};
        String[] v87={"gobble","贪婪地吃；吞没","v.","0"};
        String[] v88={"goblet","高脚酒杯","n.","0"};
        String[] v89={"goldbrick","逃避责任，偷懒","v.","0"};

        String[] v90={"goodwill","友好","n.","0"};
        String[] v91={"gospel","教义，信条","n.","0"};
        String[] v92={"gossamer","蛛丝；薄纱；轻而薄的",n+a,"0"};
        String[] v93={"gouge","半圆凿；挖出；敲竹杠",n+v,"0"};
        String[] v94={"gourmand","嗜食者","n.","0"};
        String[] v95={"gourmet","美食家","n.","0"};
        String[] v96={"grace","优美","n.","0"};
        String[] v97={"gracious","大方的，和善的；奢华的","adj.","0"};
        String[] v98={"gradation","渐变；阶段，等级","n.","0"};
        String[] v99={"graduated","按等级（高度，困难等）分的","adj.","0"};
        String[] v100={"graft","嫁接；贪污","v./n.","0"};
        String[] v101={"grain","谷物；小的硬物","n.","0"};
        String[] v102={"grandeur","壮丽，伟大","n.","0"};
        String[] v103={"grandiose","宏伟的；夸大的","adj.","0"};
        String[] v104={"grandstand","大看台；哗众取宠",n+v,"0"};
        String[] v105={"granite","花岗石","n.","0"};
        String[] v106={"grant","同意给予","v.","0"};
        String[] v107={"graphic","图表的；生动的","adj.","0"};
        String[] v108={"graphite","石墨","n.","0"};
        String[] v109={"grasping","贪心的，贪婪的","adj.","0"};
        String[] v110={"grate","吱嘎磨碎；使人烦躁","v.","0"};
        String[] v111={"grateful","感激的","adj.","0"};
        String[] v112={"gratification","满足，喜悦","n.","0"};
        String[] v113={"gratify","使高兴，使满足","v.","0"};
        String[] v114={"grating","（声音）刺耳的；恼人的","adj.","0"};
        String[] v115={"gratitude","感激","n.","0"};
        String[] v116={"gratuitous","无缘无故的；免费的","adj.","0"};

        String[] v117={"gratuity","赏钱，小费","n.","0"};
        String[] v118={"grave","严峻的；墓穴",a+n,"0"};
        String[] v119={"gravel","碎石，沙砾","n.","0"};
        String[] v120={"gravitational","万有引力的","adj.","0"};
        String[] v121={"gravity","严肃，庄重","n.","0"};
        String[] v122={"graze","（动物）吃（地上长的）草；放牧","v.","0"};
        String[] v123={"grease","（炼出的）动物油脂；滑脂","n.","0"};
        String[] v124={"green","新鲜的，未成熟的；无经验的","adj.","0"};
        String[] v125={"greenhouse","花房，温室","n.","0"};
        String[] v126={"gregarious","群居的；爱社交的","adj.","0"};
        String[] v127={"gregariousness","群居；合群","n.","0"};
        String[] v128={"grief","忧伤，悲伤","n.","0"};
        String[] v129={"grievance","委屈，抱怨","n.","0"};

        String[] v130={"grieve","是某人极为悲伤","v.","0"};
        String[] v131={"grievous","严重伤害的","adj.","0"};
        String[] v132={"grill","烤；拷问；烤架",v+n,"0"};
        String[] v133={"grim","冷酷的，可怕的","adj.","0"};
        String[] v134={"grimace","做鬼脸，面部歪扭","v./n.","0"};
        String[] v135={"grin","露齿而笑","v.","0"};
        String[] v136={"grind","枯燥乏味的工作；磨碎，碾碎",n+v,"0"};
        String[] v137={"gripe","抱怨","v.","0"};
        String[] v138={"gripping","紧紧抓住注意力的","adj.","0"};
        String[] v139={"grisly","恐怖的，可怕的","adj.","0"};
        String[] v140={"gristle","软骨；肉中难吃的硬组织","n.","0"};
        String[] v141={"grit","沙粒；决心，勇气；下定决心，咬紧牙关",n+v,"0"};
        String[] v142={"groan","呻吟，叹息","v./n.","0"};
        String[] v143={"groom","马夫；新郎","n.","0"};
        String[] v144={"groove","凹线；（刻出的）线条；习惯","n.","0"};
        String[] v145={"grope","摸索，探索","v.","0"};
        String[] v146={"gross","总的；粗野的；整个，全部",a+n,"0"};

        String[] v147={"grotto","洞穴","n.","0"};
        String[] v148={"grouch","牢骚，不满","n.","0"};
        String[] v149={"grounded","有理由的；地面上","adj.;adv.","0"};
        String[] v150={"group","使…集合；群，集",v+n,"0"};
        String[] v151={"grouse","松鸡；发牢骚，诉苦",n+v,"0"};
        String[] v152={"grove","小树林，树林","n.","0"};
        String[] v153={"grovel","摇尾乞怜，奴颜婢膝","v.","0"};
        String[] v154={"grueling","繁重而累人的","adj.","0"};
        String[] v155={"grumble","喃喃诉苦，发怨言","v.","0"};
        String[] v156={"guarantee","保证，担保","v.","0"};
        String[] v157={"guffaw","哄笑，大笑","n./v.","0"};
        String[] v158={"guile","欺诈；狡猾","n.","0"};
        String[] v159={"guileless","厚道的，老实的","adj.","0"};
        String[] v160={"guillotine","断头台","n.","0"};
        String[] v161={"guilt","罪行；内疚","n.","0"};
        String[] v162={"guilty","有罪的","adj.","0"};
        String[] v163={"guise","外观，装束","n.","0"};

        String[] v164={"gullible","易受骗的","adj.","0"};
        String[] v165={"gulp","吞食，咽下","v.","0"};
        String[] v166={"gum","树胶，橡皮","n.","0"};
        String[] v167={"guru","古鲁（印度的宗教领袖）；（受尊敬的）教师或权威","n.","0"};
        String[] v168={"gush","涌出；滔滔不绝地说","v.","0"};
        String[] v169={"gusher","滔滔不绝的说话者；喷油井","n.","0"};
        String[] v170={"gust","阵风；一阵（情绪）","n.","0"};
        String[] v171={"gustation","品尝；味觉","n.","0"};
        String[] v172={"gustatory","味觉的，品尝的","adj.","0"};
        String[] v173={"gutter","水槽；街沟","n.","0"};
        String[] v174={"guy","（铁塔等的）支索，牵索","n.","0"};
        String[] v175={"guzzle","大吃大喝","v.","0"};
        String[] v176={"gyrate","旋转的；旋转",a+v,"0"};
        String[] v177={"habitat","自然环境，栖息地","n.","0"};
        String[] v178={"habituate","使习惯于","v.","0"};

        
    ////插入函数(不用了解)
   	subInitial(v1);
   	subInitial(v2);
   	subInitial(v3);
   	subInitial(v4);
   	subInitial(v5);
   	subInitial(v6);
   	subInitial(v7);
   	subInitial(v8);
   	subInitial(v9);
   	subInitial(v10);
   	subInitial(v11);
   	subInitial(v12);
   	subInitial(v13);
   	subInitial(v14);
   	subInitial(v15);
   	subInitial(v16);
   	subInitial(v17);
   	subInitial(v18);
   	subInitial(v19);
   	subInitial(v20);
   	subInitial(v21);
   	subInitial(v22);
   	subInitial(v23);
   	subInitial(v24);
   	subInitial(v25);
   	subInitial(v26);
   	subInitial(v27);
   	subInitial(v28);
   	subInitial(v29);
   	subInitial(v30);
   	subInitial(v31);
   	subInitial(v32);
   	subInitial(v33);
   	subInitial(v34);
   	subInitial(v35);
   	subInitial(v36);
   	subInitial(v37);
   	subInitial(v38);
   	subInitial(v39);
   	subInitial(v40);
   	subInitial(v41);
   	subInitial(v42);
   	subInitial(v43);
   	subInitial(v44);
   	subInitial(v45);
   	subInitial(v46);
   	subInitial(v47);
   	subInitial(v48);
   	subInitial(v49);
   	subInitial(v50);
   	subInitial(v51);
   	subInitial(v52);
   	subInitial(v53);
   	subInitial(v54);
   	subInitial(v55);
   	subInitial(v56);
   	subInitial(v57);
   	subInitial(v58);
   	subInitial(v59);
   	subInitial(v60);
   	subInitial(v61);
   	subInitial(v62);
   	subInitial(v63);
   	subInitial(v64);
   	subInitial(v65);
   	subInitial(v66);
   	subInitial(v67);
   	subInitial(v68);
   	subInitial(v69);
   	subInitial(v70);
   	subInitial(v71);
   	subInitial(v72);
   	subInitial(v73);
   	subInitial(v74);
   	subInitial(v75);
   	subInitial(v76);
   	subInitial(v77);
   	subInitial(v78);
   	subInitial(v79);
   	subInitial(v80);
   	subInitial(v81);
   	subInitial(v82);
   	subInitial(v83);
   	subInitial(v84);
   	subInitial(v85);
   	subInitial(v86);
   	subInitial(v87);
   	subInitial(v88);
   	subInitial(v89);
   	subInitial(v90);
   	subInitial(v91);
   	subInitial(v92);
   	subInitial(v93);
   	subInitial(v94);
   	subInitial(v95);
   	subInitial(v96);
   	subInitial(v97);
   	subInitial(v98);
   	subInitial(v99);
   	subInitial(v100);
   	subInitial(v101);
   	subInitial(v102);
   	subInitial(v103);
   	subInitial(v104);
   	subInitial(v105);
   	subInitial(v106);
   	subInitial(v107);
   	subInitial(v108);
   	subInitial(v109);
   	subInitial(v110);
   	subInitial(v111);
   	subInitial(v112);
   	subInitial(v113);
   	subInitial(v114);
   	subInitial(v115);
   	subInitial(v116);
   	subInitial(v117);
   	subInitial(v118);
   	subInitial(v119);
   	subInitial(v120);
   	subInitial(v121);
   	subInitial(v122);
   	subInitial(v123);
   	subInitial(v124);
   	subInitial(v125);
   	subInitial(v126);
   	subInitial(v127);
   	subInitial(v128);
   	subInitial(v129);
   	subInitial(v130);
   	subInitial(v131);
   	subInitial(v132);
   	subInitial(v133);
   	subInitial(v134);
   	subInitial(v135);
   	subInitial(v136);
   	subInitial(v137);
   	subInitial(v138);
   	subInitial(v139);
   	subInitial(v140);
   	subInitial(v141);
   	subInitial(v142);
   	subInitial(v143);
   	subInitial(v144);
   	subInitial(v145);
   	subInitial(v146);
   	subInitial(v147);
   	subInitial(v148);
   	subInitial(v149);
   	subInitial(v150);
   	subInitial(v151);
   	subInitial(v152);
   	subInitial(v153);
   	subInitial(v154);
   	subInitial(v155);
   	subInitial(v156);
   	subInitial(v157);
   	subInitial(v158);
   	subInitial(v159);
   	subInitial(v160);
   	subInitial(v161);
   	subInitial(v162);
   	subInitial(v163);
   	subInitial(v164);
   	subInitial(v165);
   	subInitial(v166);
   	subInitial(v167);
   	subInitial(v168);
   	subInitial(v169);
   	subInitial(v170);
   	subInitial(v171);
   	subInitial(v172);
   	subInitial(v173);
   	subInitial(v174);
   	subInitial(v175);
   	subInitial(v176);
   	subInitial(v177);
   	subInitial(v178);
}
    private void doList_18(){
    /////*********************声明单词元组(单词+中文+词性+难度(默认为0))*****************************//////////////
        String[] v1={"hack","乱劈，乱砍；雇佣文人",v+n,"0"};
        String[] v2={"hackneyed","陈腐的，不新奇的","adj.","0"};
        String[] v3={"hail","冰雹；致敬",n+v,"0"};
        String[] v4={"halcyon","平静的；愉快的","adj.","0"};
        String[] v5={"hale","健壮的，矍铄的","adj.","0"};
        String[] v6={"halfhearted","不认真的，不热心的","adj.","0"};
        String[] v7={"hallmark","（在金银上的）纯度印证；特征","n.","0"};
        String[] v8={"hallow","把…视为神圣，尊敬","v.","0"};
        String[] v9={"hallowed","神圣的","adj.","0"};
        String[] v10={"hallucination","幻觉","n.","0"};

        String[] v11={"halo","（日、月等）晕；神像之光环","n.","0"};
        String[] v12={"halting","踌躇的，吞吞吐吐的","adj.","0"};
        String[] v13={"hammer","锤子，槌","n.","0"};
        String[] v14={"hamper","妨碍，阻挠；有盖提篮",v+n,"0"};
        String[] v15={"handle","柄，把手；处理",n+v,"0"};
        String[] v16={"hangar","飞机库","n.","0"};
        String[] v17={"hangdog","忧愁的；低贱的","adj.","0"};
        String[] v18={"hankering","渴望","n.","0"};
        String[] v19={"haphazard","任意的，偶然的","adj.","0"};
        String[] v20={"harangue","[贬]长篇指责性演说","n.","0"};
        String[] v21={"harass","侵扰，烦扰","v.","0"};
        String[] v22={"harbinger","先驱，先兆","n.","0"};
        String[] v23={"harbor","港，避难所；包庇，隐匿",n+v,"0"};
        String[] v24={"harden","变硬，变坚强","v.","0"};
        String[] v25={"hardheaded","（商业上）现实的，精明的","adj.","0"};

        String[] v26={"hardy","耐寒的；强壮的","adj.","0"};
        String[] v27={"harmony","相符，一致；协调，匀称","n.","0"};
        String[] v28={"harness","马具；束以马具；利用",n+v,"0"};
        String[] v29={"harp","竖琴’喋喋不休地说或写",n+v,"0"};
        String[] v30={"harpsichord","键琴（钢琴前身）","n.","0"};
        String[] v31={"harridan","凶恶的老妇，老巫婆","n.","0"};
        String[] v32={"harrow","耙；使痛苦",n+v,"0"};
        String[] v33={"harrowing","悲痛的，难受的","adj.","0"};
        String[] v34={"harry","掠夺；袭扰；折磨","v.","0"};
        String[] v35={"harsh","严厉的；粗糙的；刺耳的","adj.","0"};
        String[] v36={"harshly","严酷地，无情地","adv.","0"};
        String[] v37={"hasten","催促，促进","v.","0"};
        String[] v38={"hasty","急急忙忙的","adj.","0"};
        String[] v39={"hatch","船舱盖；孵化",n+v,"0"};
        String[] v40={"haughty","傲慢的，自大的","adj.","0"};
        String[] v41={"haunt","常到；鬼魂出没；（事情）萦绕心头；常去的地方",v+n,"0"};

        String[] v42={"hauteur","傲慢","n.","0"};
        String[] v43={"haven","安息所，避难所","n.","0"};
        String[] v44={"havoc","大破坏，混乱","n.","0"};
        String[] v45={"hawk","隼，鹰","n.","0"};
        String[] v46={"hazard","危险","n.","0"};
        String[] v47={"hazardous","危险的","adj.","0"};
        String[] v48={"headlong","轻率的（地），迅猛的（地）","adj./adv.","0"};
        String[] v49={"headstrong","刚愎自用的","adj.","0"};
        String[] v50={"headway","进步，进展","n.","0"};
        String[] v51={"heal","治愈","v.","0"};
        String[] v52={"hearken","倾听","v.","0"};
        String[] v53={"hearten","鼓励，激励","v.","0"};
        String[] v54={"heartrending","令人心碎的","adj.","0"};
        String[] v55={"heavy-handedness","笨拙，粗劣","n.","0"};
        String[] v56={"heckle","诘问，困扰","v.","0"};
        String[] v57={"hectic","兴奋的；繁忙的","adj.","0"};
        String[] v58={"hector","凌辱，威吓","v.","0"};

        String[] v59={"hedge","树篱；限制","n.","0"};
        String[] v60={"hedonist","享乐主义者","n.","0"};
        String[] v61={"heed","注意，留心；关心",v+n,"0"};
        String[] v62={"hegemony","霸权，领导权","n.","0"};
        String[] v63={"heinous","十恶不赦的，可憎的","adj.","0"};
        String[] v64={"heir","继承人","n.","0"};
        String[] v65={"heirloom","传家宝","n.","0"};
        String[] v66={"helmet","头盔，钢盔","n.","0"};
        String[] v67={"hem","包尾；吞吞吐吐地说；袖边，边缘",v+n,"0"};
        String[] v68={"henisphere","半球","n.","0"};
        String[] v69={"hemophilia","血友病，出血不止","n.","0"};
        String[] v70={"hemorrhage","出血（尤指大出血）","n.","0"};
        String[] v71={"hemostat","止血器；止血剂","n.","0"};
        String[] v72={"herbacesous","草本植物的","adj.","0"};

        String[] v73={"herbicide","除草剂","n.","0"};
        String[] v74={"herbivorous","食草的","adj.","0"};
        String[] v75={"herd","兽群；聚集",n+v,"0"};
        String[] v76={"hereditary","祖传的，世袭的","adj.","0"};
        String[] v77={"heresy","异端邪说","n.","0"};
        String[] v78={"heretic","异教徒","n.","0"};
        String[] v79={"heretical","异端邪说的","adj.","0"};
        String[] v80={"hermetic","密封的；深奥的","adj.","0"};
        String[] v81={"hermit","隐士，修道者","n.","0"};
        String[] v82={"herpetologist","爬行动物学家","n.","0"};
        String[] v83={"heterodox","异端的，非正统的","adj.","0"};
        String[] v84={"heterogeneous","异类的，不同的","adj.","0"};
        String[] v85={"hew","砍伐；遵守","v.","0"};
        String[] v86={"hexagon","六角形，六边形","n.","0"};

        String[] v87={"hiatus","空隙，裂缝","v.","0"};
        String[] v88={"hibernate","冬眠，蜇伏","v.","0"};
        String[] v89={"hide","兽皮","n.","0"};
        String[] v90={"hidebound","顽固的，心胸狭窄的","adj.","0"};
        String[] v91={"hideous","讨厌的，丑恶的","adj.","0"};
        String[] v92={"hie","疾走；催促","v.","0"};
        String[] v93={"hierarchy","阶层；等级制度","n.","0"};
        String[] v94={"hieroglyph","象形文字，图画文字","n.","0"};
        String[] v95={"hieroglypic","象形文字","n.","0"};
        String[] v96={"highbrow","自以为文化修养很高的人","n.","0"};
        String[] v97={"hike","高涨，上升；徒步旅行",v+n,"0"};

        String[] v98={"hilarious","充满欢乐的；引起大笑的","adj.","0"};
        String[] v99={"hinder","阻碍，妨碍","v.","0"};
        String[] v100={"hinge","铰链；关键","n.","0"};
        String[] v101={"hirsute","多毛的","adj.","0"};
        String[] v102={"hiss","作嘘声；（蛇等）发出嘶嘶声","v.","0"};
        String[] v103={"histology","细胞组织学","n.","0"};
        String[] v104={"histrionic","演戏的；剧院的","adj","0"};
        String[] v105={"hitherto","到目前为止","adv.","0"};
        String[] v106={"hive","蜂房；忙碌之地","n.","0"};
        String[] v107={"hoard","贮藏，秘藏","v./n.","0"};
        String[] v108={"hoary","（头发）灰白的；古老的","adj.","0"};
        String[] v109={"hoax","骗局，欺骗","n./v.","0"};
        String[] v110={"hodgepodge","混淆；杂烩","n.","0"};
        String[] v111={"hoe","锄头","n.","0"};
        String[] v112={"hoist","吊高，升起；起重机",v+n,"0"};
        String[] v113={"hold","（船）货舱","n.","0"};

        String[] v114={"holster","手枪皮套","n.","0"};
        String[] v115={"homage","效忠，崇敬","n.","0"};
        String[] v116={"homeostasis","体内平衡","n.","0"};
        String[] v117={"homiletics","讲道术，说教术","n.","0"};
        String[] v118={"homogeneity","同种，同质","n.","0"};
        String[] v119={"homogeneous","同类的，相似的","adj.","0"};
        String[] v120={"homogenize","使均匀，使一致","v.","0"};
        String[] v121={"hone","磨刀石；磨刀",n+v,"0"};
        String[] v122={"honorarium","酬劳金，谢礼","n.","0"};
        String[] v123={"hoodwink","蒙混，欺骗","v.","0"};
        String[] v124={"hoof","（牛、马的）蹄","n.","0"};
        String[] v125={"hoop","（桶之）铁环","n.","0"};
        String[] v126={"horizontal","水平的","adj.","0"};
        String[] v127={"hormone","荷尔蒙，激素","n.","0"};

        String[] v128={"horn","角，角质；喇叭","n.","0"};
        String[] v129={"horrific","可怕的","adj.","0"};
        String[] v130={"hortative","激励的","adj.","0"};
        String[] v131={"horticulture","园艺学","n.","0"};
        String[] v132={"hospitable","思想开放的，善于接受的","adj.","0"};
        String[] v133={"hostile","敌对的，敌意的","adj.","0"};
        String[] v134={"hostility","敌对，不友好；憎恨","n.","0"};
        String[] v135={"hovel","茅舍；肮脏的小屋","n.","0"};
        String[] v136={"hover","翱翔；（人）徘徊","v.","0"};
        String[] v137={"hub","轴心","n.","0"};
        String[] v138={"hubris","过分自傲，目中无人","n.","0"};
        String[] v139={"huskster","叫卖小贩，零售商","n.","0"};
        String[] v140={"hue","色彩，色泽","n.","0"};
        String[] v141={"hulk","废船，船壳；笨重的人或物","n.","0"};
        String[] v142={"hull","外壳；荚；船身；剥去外壳",n+v,"0"};

        String[] v143={"humane","人道的，慈悲的","adj.","0"};
        String[] v144={"humble","卑微的；使谦卑",a+v,"0"};
        String[] v145={"humdrum","单调的，乏味的","adj.","0"};
        String[] v146={"humid","湿润的","adj.","0"};
        String[] v147={"humidity","湿度，湿气","n.","0"};
        String[] v148={"humiliate","使屈辱","v.","0"};
        String[] v149={"humility","谦逊，谦恭","n.","0"};
        String[] v150={"humor","纵容，迁就","v.","0"};
        String[] v151={"hunch","直觉，预感","n.","0"};
        String[] v152={"hurdle","跳栏；障碍；克服（障碍）",n+v,"0"};
        String[] v153={"hurl","猛投；大声叫骂","v.","0"};
        String[] v154={"hurricane","飓风","n.","0"};
        String[] v155={"husband","妥善而又节约地管理","v.","0"};
        String[] v156={"husbandry","耕种，务农；节俭；管理","n.","0"};

        String[] v157={"hush","肃静，安静","v./n.","0"};
        String[] v158={"husk","外壳；皮，荚","n.","0"};
        String[] v159={"husky","声音沙哑的","adj.","0"};
        String[] v160={"hybrid","杂种；混血人","n.","0"};
        String[] v161={"hydrant","（消防）水龙头；消防栓","n.","0"};
        String[] v162={"hydrate","水化物；水化",n+v,"0"};
        String[] v163={"hymn","赞美诗","n.","0"};
        String[] v164={"hyperactivity","活动过强，极度亢奋","n.","0"};
        String[] v165={"hyperbole","夸张法","n.","0"};
        String[] v166={"hypertension","高血压","n.","0"};
        String[] v167={"hyphen","连字号（即“-”）","n.","0"};

        
    ////插入函数(不用了解)
   	subInitial(v1);
   	subInitial(v2);
   	subInitial(v3);
   	subInitial(v4);
   	subInitial(v5);
   	subInitial(v6);
   	subInitial(v7);
   	subInitial(v8);
   	subInitial(v9);
   	subInitial(v10);
   	subInitial(v11);
   	subInitial(v12);
   	subInitial(v13);
   	subInitial(v14);
   	subInitial(v15);
   	subInitial(v16);
   	subInitial(v17);
   	subInitial(v18);
   	subInitial(v19);
   	subInitial(v20);
   	subInitial(v21);
   	subInitial(v22);
   	subInitial(v23);
   	subInitial(v24);
   	subInitial(v25);
   	subInitial(v26);
   	subInitial(v27);
   	subInitial(v28);
   	subInitial(v29);
   	subInitial(v30);
   	subInitial(v31);
   	subInitial(v32);
   	subInitial(v33);
   	subInitial(v34);
   	subInitial(v35);
   	subInitial(v36);
   	subInitial(v37);
   	subInitial(v38);
   	subInitial(v39);
   	subInitial(v40);
   	subInitial(v41);
   	subInitial(v42);
   	subInitial(v43);
   	subInitial(v44);
   	subInitial(v45);
   	subInitial(v46);
   	subInitial(v47);
   	subInitial(v48);
   	subInitial(v49);
   	subInitial(v50);
   	subInitial(v51);
   	subInitial(v52);
   	subInitial(v53);
   	subInitial(v54);
   	subInitial(v55);
   	subInitial(v56);
   	subInitial(v57);
   	subInitial(v58);
   	subInitial(v59);
   	subInitial(v60);
   	subInitial(v61);
   	subInitial(v62);
   	subInitial(v63);
   	subInitial(v64);
   	subInitial(v65);
   	subInitial(v66);
   	subInitial(v67);
   	subInitial(v68);
   	subInitial(v69);
   	subInitial(v70);
   	subInitial(v71);
   	subInitial(v72);
   	subInitial(v73);
   	subInitial(v74);
   	subInitial(v75);
   	subInitial(v76);
   	subInitial(v77);
   	subInitial(v78);
   	subInitial(v79);
   	subInitial(v80);
   	subInitial(v81);
   	subInitial(v82);
   	subInitial(v83);
   	subInitial(v84);
   	subInitial(v85);
   	subInitial(v86);
   	subInitial(v87);
   	subInitial(v88);
   	subInitial(v89);
   	subInitial(v90);
   	subInitial(v91);
   	subInitial(v92);
   	subInitial(v93);
   	subInitial(v94);
   	subInitial(v95);
   	subInitial(v96);
   	subInitial(v97);
   	subInitial(v98);
   	subInitial(v99);
   	subInitial(v100);
   	subInitial(v101);
   	subInitial(v102);
   	subInitial(v103);
   	subInitial(v104);
   	subInitial(v105);
   	subInitial(v106);
   	subInitial(v107);
   	subInitial(v108);
   	subInitial(v109);
   	subInitial(v110);
   	subInitial(v111);
   	subInitial(v112);
   	subInitial(v113);
   	subInitial(v114);
   	subInitial(v115);
   	subInitial(v116);
   	subInitial(v117);
   	subInitial(v118);
   	subInitial(v119);
   	subInitial(v120);
   	subInitial(v121);
   	subInitial(v122);
   	subInitial(v123);
   	subInitial(v124);
   	subInitial(v125);
   	subInitial(v126);
   	subInitial(v127);
   	subInitial(v128);
   	subInitial(v129);
   	subInitial(v130);
   	subInitial(v131);
   	subInitial(v132);
   	subInitial(v133);
   	subInitial(v134);
   	subInitial(v135);
   	subInitial(v136);
   	subInitial(v137);
   	subInitial(v138);
   	subInitial(v139);
   	subInitial(v140);
   	subInitial(v141);
   	subInitial(v142);
   	subInitial(v143);
   	subInitial(v144);
   	subInitial(v145);
   	subInitial(v146);
   	subInitial(v147);
   	subInitial(v148);
   	subInitial(v149);
   	subInitial(v150);
   	subInitial(v151);
   	subInitial(v152);
   	subInitial(v153);
   	subInitial(v154);
   	subInitial(v155);
   	subInitial(v156);
   	subInitial(v157);
   	subInitial(v158);
   	subInitial(v159);
   	subInitial(v160);
   	subInitial(v161);
   	subInitial(v162);
   	subInitial(v163);
   	subInitial(v164);
   	subInitial(v165);
   	subInitial(v166);
   	subInitial(v167);
}
    private void doList_19(){
    /////*********************声明单词元组(单词+中文+词性+难度(默认为0))*****************************//////////////
        String[] v1={"hypnotic","催眠的；催眠药",a+n,"0"};
        String[] v2={"hypocrite","伪善者，伪君子","n.","0"};
        String[] v3={"hypocritical","虚伪的","adj.","0"};
        String[] v4={"hypotenuse","（直角三角形的）斜边","n.","0"};
        String[] v5={"hypothesis","假设，假说","n.","0"};
        String[] v6={"hypothetical","假设的","adj.","0"};
        String[] v7={"hysteria","歇斯底里症；过度兴奋","n.","0"};
        String[] v8={"icicle","冰柱，冰垂","n.","0"};
        String[] v9={"icon","圣像，偶像","n.","0"};
        String[] v10={"iconoclast","攻击传统观念或风俗的人","n.","0"};

        String[] v11={"ideology","思想体系，思想意识，意识形态","n.","0"};
        String[] v12={"idiom","习语，语言的习惯用法；特色","n.","0"};
        String[] v13={"idle","（指人）无所事事的；无效的；懒散，无所事事",a+v,"0"};
        String[] v14={"idolater","神像（偶像）崇拜者","n.","0"};
        String[] v15={"idyll","田园生活；田园诗","n.","0"};
        String[] v16={"igneous","火的，火绒的","adj.","0"};
        String[] v17={"ignite","发光；点燃，燃烧","v.","0"};
        String[] v18={"ignoble","卑鄙的","adj.","0"};
        String[] v19={"ignominious","可耻的；耻辱的","adj.","0"};
        String[] v20={"ignominy","羞耻，屈辱","n.","0"};
        String[] v21={"ignorant","无知的，愚昧的","adj.","0"};
        String[] v22={"illegal","违法的","adj.","0"};
        String[] v23={"illegitimate","不合法的；私生的","adj.","0"};
        String[] v24={"illicit","违法的","adj.","0"};

        String[] v25={"illiterate","文盲的","adj.","0"};
        String[] v26={"illuminate","阐明，解释；照亮","v.","0"};
        String[] v27={"illuminati","先觉者，智者","n.","0"};
        String[] v28={"illusion","假象，错觉","n.","0"};
        String[] v29={"illusive","迷惑人的，迷幻的","adj.","0"};
        String[] v30={"illusory","虚幻的","adj.","0"};
        String[] v31={"illustrate","为…做插图或图表；说明，阐明","v.","0"};
        String[] v32={"imbibe","饮；吸入","v.","0"};
        String[] v33={"imbroglio","纠纷，纠葛","n.","0"};
        String[] v34={"imbue(with)","灌输（某人）强烈的情感或意见","v.","0"};
        String[] v35={"imitation","赝品；效法，冒充","n.","0"};
        String[] v36={"imitative","模仿的","adj.","0"};
        String[] v37={"immaculate","洁净的，无瑕的","adj.","0"};
        String[] v38={"immanent","内在的；普遍存在的","adj.","0"};

        String[] v39={"immemorial","太古的，极古的","adj.","0"};
        String[] v40={"immense","极大的；无限的","adj.","0"};
        String[] v41={"immensity","巨大之物；无限","n.","0"};
        String[] v42={"immerse","浸入；沉浸于","v.","0"};
        String[] v43={"imminent","即将发生的，逼近的","adj.","0"};
        String[] v44={"immolate","牺牲，焚祭","v.","0"};
        String[] v45={"immune","免疫的；免除的","adj.","0"};
        String[] v46={"immunity","免疫；豁免","n.","0"};
        String[] v47={"immunize","使免疫","v.","0"};
        String[] v48={"immure","监禁","v.","0"};
        String[] v49={"imp","小鬼；顽童","n.","0"};
        String[] v50={"impact","冲击，影响","n.","0"};
        String[] v51={"impair","损害，使弱","v.","0"};

        String[] v52={"impale","刺入，刺中","v.","0"};
        String[] v53={"impalpable","无法触及的；不易理解的","adj.","0"};
        String[] v54={"impart","传授，告知","v.","0"};
        String[] v55={"impartial","公平的，无私的","adj.","0"};
        String[] v56={"impasse","僵局；死路","n.","0"};
        String[] v57={"impassioned","慷慨激昂的","adj.","0"};
        String[] v58={"impassive","无动于衷的，冷漠的","adj.","0"};
        String[] v59={"impeach","指责；弹劾","v.","0"};
        String[] v60={"impeccable","无瑕疵的","adj.","0"};
        String[] v61={"impecunious","一文不名的，贫困的","adj.","0"};

        String[] v62={"impede","妨碍","v.","0"};
        String[] v63={"impediment","妨碍；阻碍物","n.","0"};
        String[] v64={"impel","推进；驱使","v.","0"};
        String[] v65={"impending","行将发生的，逼近的","adj.","0"};
        String[] v66={"impenetrable","不能穿透的；不可理解的","adj.","0"};
        String[] v67={"impenitent","不悔悟的","adj.","0"};
        String[] v68={"imperative","急需的","adj.","0"};
        String[] v69={"imperial","帝王的，至尊的","adj.","0"};
        String[] v70={"imperious","傲慢的，专横的","adj.","0"};
        String[] v71={"impermanent","暂时的","adj.","0"};
        String[] v72={"impermeable","不可渗透的，透不过的","adj.","0"};
        String[] v73={"impersonate","模仿；扮演","v.","0"};
        String[] v74={"impertinence","无礼，粗鲁","n.","0"};
        String[] v75={"imperturbable","冷静的，沉着的","adj.","0"};

        String[] v76={"impervious","不能渗透的；不为所动的","adj.","0"};
        String[] v77={"impetuous","冲动的，鲁莽的","adj.","0"};
        String[] v78={"impetus","推动力；刺激","n.","0"};
        String[] v79={"impinge","侵犯；撞击","v.","0"};
        String[] v80={"implant","注入；灌输","v.","0"};
        String[] v81={"implausible","难以置信的","adj.","0"};
        String[] v82={"implement","工具，器具；实现，实施",n+v,"0"};
        String[] v83={"implicate","牵连（于罪行中）；暗示","v.","0"};
        String[] v84={"implication","暗示","n.","0"};
        String[] v85={"implicit","含蓄的，不言而喻的","adj.","0"};
        String[] v86={"implode","内爆；剧减","v.","0"};

        String[] v87={"implore","哀求，恳求","v.","0"};
        String[] v88={"impolitic","不智的，失策的","adj.","0"};
        String[] v89={"imponderable","（重量等）无法衡量的","adj.","0"};
        String[] v90={"import","进口，输入","v./n.","0"};
        String[] v91={"importune","强求，不断请求","v.","0"};
        String[] v92={"impose","征（税）；加（负担等）于；强加于","v.","0"};
        String[] v93={"imposing","壮丽的，雄伟的","adj.","0"};
        String[] v94={"impostor","冒充者，骗子","n.","0"};
        String[] v95={"imposture","冒充","n.","0"};
        String[] v96={"impoverish","使成赤贫","v.","0"};
        String[] v97={"impregnable","攻不破的，征服不了的","adj.","0"};

        String[] v98={"impresario","（剧院或乐团等）经理人，主办者","n.","0"};
        String[] v99={"impressed","被打动的；被感动的","adj.","0"};
        String[] v100={"impression","印象，感想；盖印，压痕","n.","0"};
        String[] v101={"impressionable","易受影响的","adj.","0"};
        String[] v102={"imprint","盖印，刻印","v.","0"};
        String[] v103={"impromptu","即席的，即兴的","adj.","0"};
        String[] v104={"improvident","不节俭的，无远见的","adj.","0"};
        String[] v105={"improvise","即席而作","v.","0"};
        String[] v106={"imprudent","轻率的；不智的","adj.","0"};
        String[] v107={"impudent","鲁莽的，无礼的","adj.","0"};
        String[] v108={"impugn","指责，对…表示怀疑","v.","0"};
        String[] v109={"impuissance","无力，虚弱","n.","0"};

        String[] v110={"impulse","冲动；刺激","n.","0"};
        String[] v111={"impunity","免除惩罚","n.","0"};
        String[] v112={"inadvertence","漫不经心","n.","0"};
        String[] v113={"inalienable","不可剥夺的","adj.","0"};
        String[] v114={"inane","无意义的；愚蠢的；空洞的","adj.","0"};
        String[] v115={"inanimate","无生命的","adj.","0"};
        String[] v116={"inappreciable","微不足道的","adj.","0"};
        String[] v117={"inaugural","就职的，开幕的","adj.","0"};
        String[] v118={"inaugurate","举行就职典礼；开创","v.","0"};
        String[] v119={"inborn","天生的，天赋的","adj.","0"};
        String[] v120={"incandescence","白炽，炽热发光","n.","0"};
        String[] v121={"incantation","咒语","n.","0"};

        String[] v122={"incarcerate","下狱，监禁","v.","0"};
        String[] v123={"incarnate","具有肉体的；化身的","adj.","0"};
        String[] v124={"incendiary","放火的，纵火的","adj.","0"};
        String[] v125={"incense","香，香味；激怒",n+v,"0"};
        String[] v126={"incentive","刺激，鼓励；刺激因素","n.","0"};
        String[] v127={"inception","开端，开始；取得学位","n.","0"};
        String[] v128={"incessant","无间断的，连续的","adj.","0"};
        String[] v129={"inch","慢慢前进，慢慢移动","v.","0"};
        String[] v130={"inchoate","刚开始的；未发展的","adj.","0"};
        String[] v131={"incidence","事情发生；发生率","n.","0"};

        String[] v132={"incinerate","焚化，毁弃","v.","0"};
        String[] v133={"incipient","初期的，刚出现的","adj.","0"};
        String[] v134={"incise","切，切割","v.","0"};
        String[] v135={"incision","切口；切割","n.","0"};
        String[] v136={"incisive","一针见血的","adj.","0"};
        String[] v137={"incite","激发，刺激","v.","0"};
        String[] v138={"inclement","（天气）严酷的；严厉的","adj.","0"};
        String[] v139={"inclusive","包含一切的，范围广的","adj.","0"};
        String[] v140={"incogitant","无思维能力的，考虑不周的","adj.","0"};
        String[] v141={"incommensurate","不成比例的，不相称的","adj.","0"};
        String[] v142={"incompatible","不能和谐共存的","adj.","0"};
        String[] v143={"incompetetent","无能力的，不能胜任的","adj.","0"};
        String[] v144={"incongruity","不协调，不相称","n.","0"};
        String[] v145={"inconsequential","不重要的，微不足道的","adj.","0"};

        
    ////插入函数(不用了解)
   	subInitial(v1);
   	subInitial(v2);
   	subInitial(v3);
   	subInitial(v4);
   	subInitial(v5);
   	subInitial(v6);
   	subInitial(v7);
   	subInitial(v8);
   	subInitial(v9);
   	subInitial(v10);
   	subInitial(v11);
   	subInitial(v12);
   	subInitial(v13);
   	subInitial(v14);
   	subInitial(v15);
   	subInitial(v16);
   	subInitial(v17);
   	subInitial(v18);
   	subInitial(v19);
   	subInitial(v20);
   	subInitial(v21);
   	subInitial(v22);
   	subInitial(v23);
   	subInitial(v24);
   	subInitial(v25);
   	subInitial(v26);
   	subInitial(v27);
   	subInitial(v28);
   	subInitial(v29);
   	subInitial(v30);
   	subInitial(v31);
   	subInitial(v32);
   	subInitial(v33);
   	subInitial(v34);
   	subInitial(v35);
   	subInitial(v36);
   	subInitial(v37);
   	subInitial(v38);
   	subInitial(v39);
   	subInitial(v40);
   	subInitial(v41);
   	subInitial(v42);
   	subInitial(v43);
   	subInitial(v44);
   	subInitial(v45);
   	subInitial(v46);
   	subInitial(v47);
   	subInitial(v48);
   	subInitial(v49);
   	subInitial(v50);
   	subInitial(v51);
   	subInitial(v52);
   	subInitial(v53);
   	subInitial(v54);
   	subInitial(v55);
   	subInitial(v56);
   	subInitial(v57);
   	subInitial(v58);
   	subInitial(v59);
   	subInitial(v60);
   	subInitial(v61);
   	subInitial(v62);
   	subInitial(v63);
   	subInitial(v64);
   	subInitial(v65);
   	subInitial(v66);
   	subInitial(v67);
   	subInitial(v68);
   	subInitial(v69);
   	subInitial(v70);
   	subInitial(v71);
   	subInitial(v72);
   	subInitial(v73);
   	subInitial(v74);
   	subInitial(v75);
   	subInitial(v76);
   	subInitial(v77);
   	subInitial(v78);
   	subInitial(v79);
   	subInitial(v80);
   	subInitial(v81);
   	subInitial(v82);
   	subInitial(v83);
   	subInitial(v84);
   	subInitial(v85);
   	subInitial(v86);
   	subInitial(v87);
   	subInitial(v88);
   	subInitial(v89);
   	subInitial(v90);
   	subInitial(v91);
   	subInitial(v92);
   	subInitial(v93);
   	subInitial(v94);
   	subInitial(v95);
   	subInitial(v96);
   	subInitial(v97);
   	subInitial(v98);
   	subInitial(v99);
   	subInitial(v100);
   	subInitial(v101);
   	subInitial(v102);
   	subInitial(v103);
   	subInitial(v104);
   	subInitial(v105);
   	subInitial(v106);
   	subInitial(v107);
   	subInitial(v108);
   	subInitial(v109);
   	subInitial(v110);
   	subInitial(v111);
   	subInitial(v112);
   	subInitial(v113);
   	subInitial(v114);
   	subInitial(v115);
   	subInitial(v116);
   	subInitial(v117);
   	subInitial(v118);
   	subInitial(v119);
   	subInitial(v120);
   	subInitial(v121);
   	subInitial(v122);
   	subInitial(v123);
   	subInitial(v124);
   	subInitial(v125);
   	subInitial(v126);
   	subInitial(v127);
   	subInitial(v128);
   	subInitial(v129);
   	subInitial(v130);
   	subInitial(v131);
   	subInitial(v132);
   	subInitial(v133);
   	subInitial(v134);
   	subInitial(v135);
   	subInitial(v136);
   	subInitial(v137);
   	subInitial(v138);
   	subInitial(v139);
   	subInitial(v140);
   	subInitial(v141);
   	subInitial(v142);
   	subInitial(v143);
   	subInitial(v144);
   	subInitial(v145);
}
    private void doList_20(){
        /////*********************声明单词元组(单词+中文+词性+难度(默认为0))*****************************//////////////
            String[] v1={"inconstancy","（指人）反复无常","n.","0"};
            String[] v2={"incontrovertible","无可辩驳的","adj.","0"};
            String[] v3={"incorporate","合并，并入","v.","0"};
            String[] v4={"incorrigible","积习难改的，不可救药的","adj.","0"};
            String[] v5={"incorruptible","（道德上）不受腐蚀的","adj.","0"};
            String[] v6={"incredulity","怀疑，不相信","n.","0"};
            String[] v7={"increment","增值，增加","n.","0"};
            String[] v8={"incriminate","连累，牵连","v.","0"};

            String[] v9={"incubate","孵化；潜伏","v.","0"};
            String[] v10={"incubation","孵卵期；潜伏期","n.","0"};
            String[] v11={"incubator","孵卵器；早产婴儿保育箱","n.","0"};
            String[] v12={"incubus","恶梦；梦魇般的精神压力，负担","n.","0"};
            String[] v13={"inculcate","谆谆教诲，灌输","v.","0"};
            String[] v14={"inculpate","连累；控告；归咎于","v.","0"};
            String[] v15={"incumbent","在职者，现任者；义不容辞的",n+a,"0"};
            String[] v16={"incur","招惹","v.","0"};
            String[] v17={"indebted","感激的，感恩的","adj.","0"};
            String[] v18={"indecipherable","无法破译的","adj.","0"};
            String[] v19={"indecisive","非决定性的，迟疑不决的","adj.","0"};
            String[] v20={"indefatigable","不知疲惫的","adj.","0"};
            String[] v21={"indelible","擦拭不掉的，不可磨灭的","adj.","0"};

            String[] v22={"indemnify","赔偿，偿付","v.","0"};
            String[] v23={"indemnity","赔偿；保障","n.","0"};
            String[] v24={"indent","切割成锯齿状","v.","0"};
            String[] v25={"indenture","契约，合同","n.","0"};
            String[] v26={"indicate","显示，指出；象征","v.","0"};
            String[] v27={"indict","控诉，起诉","v.","0"};
            String[] v28={"indifferent","不感兴趣的，漠不关心的","adj.","0"};
            String[] v29={"indigence","贫穷","n.","0"};
            String[] v30={"indigenous","土产的，本地的；天生的","adj.","0"};
            String[] v31={"indigent","贫穷的，贫困的","adj.","0"};
            String[] v32={"indignant","愤慨的，愤愤不平的","adj.","0"};

            String[] v33={"indignation","愤慨","n.","0"};
            String[] v34={"indignity","侮辱，轻蔑；侮辱性的语言","n.","0"};
            String[] v35={"indispensability","不可缺少","n.","0"};
            String[] v36={"individual","单独的，特有的；个人，个体",a+n,"0"};
            String[] v37={"indoctrinate","教导；灌输思想","v.","0"};
            String[] v38={"indolent","懒惰的","adj.","0"};
            String[] v39={"indubitable","不容置疑的","adj.","0"};
            String[] v40={"induce","诱导；引起","v.","0"};
            String[] v41={"induct","使就职；使入伍","v.","0"};
            String[] v42={"induction","就职，入伍仪式；归纳","n.","0"};
            String[] v43={"indulge","放纵；满足","v.","0"};
            String[] v44={"indurate","使坚强；使巩固","v.","0"};
            String[] v45={"industrious","勤劳的，勤勉的","adj.","0"};
            String[] v46={"ineffable","妙不可言的","adj.","0"};
            String[] v47={"ineffectual","无效的，徒劳无益的","adj.","0"};

            String[] v48={"inelasticity","无弹性，无伸缩性","n.","0"};
            String[] v49={"ineluctable","不能逃避的","adj.","0"};
            String[] v50={"inept","无能的；不适应的","adj.","0"};
            String[] v51={"ineptitude","无能，不称职","n.","0"};
            String[] v52={"inequity","不公正，不公平","n.","0"};
            String[] v53={"inert","惰性的；行动迟钝的","adj.","0"};
            String[] v54={"inertia","惰性；懒惰","n.","0"};
            String[] v55={"inexhaustible","用不完的，取之不竭的","adj.","0"};
            String[] v56={"inexorable","不为所动的；坚决不变的","adj.","0"};
            String[] v57={"inexplicable","无法解释的","adj.","0"};
            String[] v58={"infant","婴儿","n.","0"};
            String[] v59={"infantry","步兵","n.","0"};
            String[] v60={"infatuation","迷恋","n.","0"};
            String[] v61={"infection","传染，感染","n.","0"};

            String[] v62={"infelicitous","不幸的，不妥当的","adj.","0"};
            String[] v63={"infelicity","不幸；不恰当","n.","0"};
            String[] v64={"infer","推断，推定","v.","0"};
            String[] v65={"inferior","下级的，低等的，质次的，较差的","adj.","0"};
            String[] v66={"inferno","火海，地狱般的场所","n.","0"};
            String[] v67={"infest","骚乱，扰乱","v.","0"};
            String[] v68={"infiltrate","渗透，渗入","v.","0"};
            String[] v69={"infinitesimal","极微小的；极小量",a+n,"0"};
            String[] v70={"infinity","无限的时间或空间","n.","0"};
            String[] v71={"infirm","虚弱的","adj.","0"};
            String[] v72={"inflame","使燃烧；激怒（某人）","v.","0"};

            String[] v73={"inflamed","发炎的","adj.","0"};
            String[] v74={"inflate","使充气，使膨胀","v.","0"};
            String[] v75={"inflict","遭受","v.","0"};
            String[] v76={"influx","注入，涌入","n.","0"};
            String[] v77={"informed","见多识广的；消息灵通的","adj.","0"};
            String[] v78={"infraction","违法","n.","0"};
            String[] v79={"infringe","违反，侵害","v.","0"};
            String[] v80={"infuriate","使（人）极为愤怒","v.","0"};
            String[] v81={"infuse","灌输；鼓励","v.","0"};
            String[] v82={"ingenious","聪明的，有发明天才的","adj.","0"};
            String[] v83={"ingenue","天真无邪的少女","n.","0"};
            String[] v84={"ingenuity","巧思，聪敏","n.","0"};

            String[] v85={"ingenuous","纯朴的，单纯的","adj.","0"};
            String[] v86={"ingest","咽下，吞下","v.","0"};
            String[] v87={"ingestion","摄取，吸收","n.","0"};
            String[] v88={"ingrained","根深蒂固的","adj.","0"};
            String[] v89={"ingrate","忘恩负义的人","n.","0"};
            String[] v90={"ingratiate","逢迎，讨好","v.","0"};
            String[] v91={"ingratiating","讨好的，谄媚的","adj.","0"};
            String[] v92={"ingredient","成分；（烹调的）原料","n.","0"};
            String[] v93={"inhabit","栖居于，占据","v.","0"};
            String[] v94={"inhabitant","居民；栖息的动物","n.","0"};
            String[] v95={"inherit","继承","v.","0"};
            String[] v96={"inhumance","不近人情的","adj.","0"};
            String[] v97={"inimical","敌意的，不友善的","adj.","0"};
            String[] v98={"inimitable","无法效仿的，不可比拟的","adj.","0"};

            String[] v99={"iniquitous","邪恶的，不公正的","adj.","0"};
            String[] v100={"iniquity","邪恶，不公正","n.","0"};
            String[] v101={"initial","开始的，最初的；（姓名的）首字母",a+n,"0"};
            String[] v102={"initiate","发起，创始；接纳或介绍某人加入某团体","v.","0"};
            String[] v103={"initiative","主动；首创精神","n.","0"};
            String[] v104={"injection","注射；注射剂","n.","0"};
            String[] v105={"injunction","命令，强制令","n.","0"};
            String[] v106={"injurious","有害的","adj.","0"};
            String[] v107={"inkling","暗示，迹象；略知，模糊概念","n.","0"};
            String[] v108={"innate","生来的，天赋的","adj.","0"};
            String[] v109={"innocence","无辜，清白","n.","0"};
            String[] v110={"innocuous","（行为、言论等）无害的","adj.","0"};

            String[] v111={"innovative","革新的","adj.","0"};
            String[] v112={"innuendo","含沙射影，暗讽","n.","0"};
            String[] v113={"inoculate","预防注射","v.","0"};
            String[] v114={"inordinate","过度的，过分的","adj.","0"};
            String[] v115={"inquiry","询问","n.","0"};
            String[] v116={"inquisitive","过份好问的；好奇的","adj.","0"};
            String[] v117={"inroad","袭击","n.","0"};
            String[] v118={"insatiable","不能满足的，贪心的","adj.","0"};
            String[] v119={"inscribe","在某物上写，题写","v.","0"};
            String[] v120={"inscrutable","高深莫测的，神秘的","adj.","0"};
            String[] v121={"insecticide","杀虫剂","n.","0"};
            String[] v122={"insensate","无感觉的；蠢笨的","adj.","0"};
            String[] v123={"insentient","无知觉的，无生命的","adj.","0"};

            String[] v124={"insider","局内人，圈内人","n.","0"};
            String[] v125={"insidious","隐藏诡计的","adj.","0"};
            String[] v126={"insignia","徽章，袖章","n.","0"};
            String[] v127={"insincerity","伪善","n.","0"};
            String[] v128={"insinuate","暗指，暗示","v.","0"};
            String[] v129={"insipid","乏味的，枯燥的","adj.","0"};
            String[] v130={"insolent","粗野的，无礼的","adj.","0"};
            String[] v131={"insoluble","不溶解的；不能解决的","adj.","0"};
            String[] v132={"insolvency","无力偿还的；破产","n.","0"};
            String[] v133={"insomnia","失眠症","n.","0"};
            String[] v134={"insouciant","漫不经心的","adj.","0"};
            String[] v135={"inspection","检查，细看","n.","0"};

            String[] v136={"grind","枯燥乏味的工作；磨碎，碾碎",n+v,"0"};
            String[] v137={"gripe","抱怨","v.","0"};
            String[] v138={"gripping","紧紧抓住注意力的","adj.","0"};
            String[] v139={"grisly","恐怖的，可怕的","adj.","0"};
            String[] v140={"gristle","软骨；肉中难吃的硬组织","n.","0"};
            String[] v141={"grit","沙粒；决心，勇气；下定决心，咬紧牙关",n+v,"0"};
            String[] v142={"groan","呻吟，叹息","v./n.","0"};
            String[] v143={"groom","马夫；新郎","n.","0"};
            String[] v144={"groove","凹线；（刻出的）线条；习惯","n.","0"};
            String[] v145={"grope","摸索，探索","v.","0"};
            String[] v146={"gross","总的；粗野的；整个，全部",a+n,"0"};

            String[] v147={"inspiration","启示，灵感","n.","0"};
            String[] v148={"inspired","有创见的，有灵感的","adj.","0"};
            String[] v149={"install","安装，装置；使就职","v.","0"};
            String[] v150={"instantaneous","立即的；瞬间发生的","adj.","0"};
            String[] v151={"instate","任命，安置","v.","0"};
            String[] v152={"instigate","发起，煽动","v.","0"};
            String[] v153={"instill","滴注；逐渐灌输","v.","0"};
            String[] v154={"instinctive","本能的","adj.","0"};
            String[] v155={"institute","制定，创立（社团、规章）；学院，协会",v+n,"0"};
            String[] v156={"institution","公共机构，协会；制度","n.","0"};
            String[] v157={"institutionalized","制度化的，有组织的","adj.","0"};

            String[] v158={"instructive","传授知识的，启蒙的","adj.","0"};
            String[] v159={"instrumental","有帮助的，有作用的","adj.","0"};

            
        ////插入函数(不用了解)
       	subInitial(v1);
       	subInitial(v2);
       	subInitial(v3);
       	subInitial(v4);
       	subInitial(v5);
       	subInitial(v6);
       	subInitial(v7);
       	subInitial(v8);
       	subInitial(v9);
       	subInitial(v10);
       	subInitial(v11);
       	subInitial(v12);
       	subInitial(v13);
       	subInitial(v14);
       	subInitial(v15);
       	subInitial(v16);
       	subInitial(v17);
       	subInitial(v18);
       	subInitial(v19);
       	subInitial(v20);
       	subInitial(v21);
       	subInitial(v22);
       	subInitial(v23);
       	subInitial(v24);
       	subInitial(v25);
       	subInitial(v26);
       	subInitial(v27);
       	subInitial(v28);
       	subInitial(v29);
       	subInitial(v30);
       	subInitial(v31);
       	subInitial(v32);
       	subInitial(v33);
       	subInitial(v34);
       	subInitial(v35);
       	subInitial(v36);
       	subInitial(v37);
       	subInitial(v38);
       	subInitial(v39);
       	subInitial(v40);
       	subInitial(v41);
       	subInitial(v42);
       	subInitial(v43);
       	subInitial(v44);
       	subInitial(v45);
       	subInitial(v46);
       	subInitial(v47);
       	subInitial(v48);
       	subInitial(v49);
       	subInitial(v50);
       	subInitial(v51);
       	subInitial(v52);
       	subInitial(v53);
       	subInitial(v54);
       	subInitial(v55);
       	subInitial(v56);
       	subInitial(v57);
       	subInitial(v58);
       	subInitial(v59);
       	subInitial(v60);
       	subInitial(v61);
       	subInitial(v62);
       	subInitial(v63);
       	subInitial(v64);
       	subInitial(v65);
       	subInitial(v66);
       	subInitial(v67);
       	subInitial(v68);
       	subInitial(v69);
       	subInitial(v70);
       	subInitial(v71);
       	subInitial(v72);
       	subInitial(v73);
       	subInitial(v74);
       	subInitial(v75);
       	subInitial(v76);
       	subInitial(v77);
       	subInitial(v78);
       	subInitial(v79);
       	subInitial(v80);
       	subInitial(v81);
       	subInitial(v82);
       	subInitial(v83);
       	subInitial(v84);
       	subInitial(v85);
       	subInitial(v86);
       	subInitial(v87);
       	subInitial(v88);
       	subInitial(v89);
       	subInitial(v90);
       	subInitial(v91);
       	subInitial(v92);
       	subInitial(v93);
       	subInitial(v94);
       	subInitial(v95);
       	subInitial(v96);
       	subInitial(v97);
       	subInitial(v98);
       	subInitial(v99);
       	subInitial(v100);
       	subInitial(v101);
       	subInitial(v102);
       	subInitial(v103);
       	subInitial(v104);
       	subInitial(v105);
       	subInitial(v106);
       	subInitial(v107);
       	subInitial(v108);
       	subInitial(v109);
       	subInitial(v110);
       	subInitial(v111);
       	subInitial(v112);
       	subInitial(v113);
       	subInitial(v114);
       	subInitial(v115);
       	subInitial(v116);
       	subInitial(v117);
       	subInitial(v118);
       	subInitial(v119);
       	subInitial(v120);
       	subInitial(v121);
       	subInitial(v122);
       	subInitial(v123);
       	subInitial(v124);
       	subInitial(v125);
       	subInitial(v126);
       	subInitial(v127);
       	subInitial(v128);
       	subInitial(v129);
       	subInitial(v130);
       	subInitial(v131);
       	subInitial(v132);
       	subInitial(v133);
       	subInitial(v134);
       	subInitial(v135);
       	subInitial(v136);
       	subInitial(v137);
       	subInitial(v138);
       	subInitial(v139);
       	subInitial(v140);
       	subInitial(v141);
       	subInitial(v142);
       	subInitial(v143);
       	subInitial(v144);
       	subInitial(v145);
       	subInitial(v146);
       	subInitial(v147);
       	subInitial(v148);
       	subInitial(v149);
       	subInitial(v150);
       	subInitial(v151);
       	subInitial(v152);
       	subInitial(v153);
       	subInitial(v154);
       	subInitial(v155);
       	subInitial(v156);
       	subInitial(v157);
       	subInitial(v158);
       	subInitial(v159);
}
    
    
    
    private void doList_21(){
        String[] v1={"instrumentalist","乐器演奏者",n,"0"};
    	String[] v2={"insular","心胸狭窄的",a,"0"};
    	String[] v3={"insularity","岛国状态，隔绝的状况，偏狭",n,"0"};
    	String[] v4={"insulate","使隔绝，使绝缘",v,"0"};
    	String[] v5={"insulin","胰岛素",n,"0"};
    	String[] v6={"insurgent","叛乱的，起事的；叛乱分子",a+n,"0"};
    	String[] v7={"insurrection","造反",n,"0"};
    	String[] v8={"intact","完整的，没动过的",a,"0"};
    	String[] v9={"intangible","不可触摸的",a,"0"};
    	String[] v10={"integral","完整的，构成整体所必需的",a,"0"};
    	String[] v11={"integrate","集成",v,"0"};
    	String[] v12={"integrity","诚实，正直，完整",n,"0"};
    	String[] v13={"intellect","智力，思维能力",n,"0"};
    	String[] v14={"intellectual","智力的；知识分子",a+n,"0"};
    	String[] v15={"intelligible","可了解的，清晰的",a,"0"};
    	String[] v16={"intensify","加剧",v,"0"};
    	String[] v17={"intent","专心的；目的",a+n,"0"};
    	String[] v18={"intentional","存心的，故意的",a,"0"};
    	String[] v19={"inter","埋葬",v,"0"};
    	String[] v20={"interaction","相互作用",n,"0"};
    	String[] v21={"intercede","说好话，代为求情",v,"0"};
    	String[] v22={"intercept","拦截",v,"0"};
    	String[] v23={"intercessor","仲裁者",n,"0"};
    	String[] v24={"interchangeable","可互换的",a,"0"};
    	String[] v25={"interdict","禁止，切断",v,"0"};
    	String[] v26={"interference","干涉",n,"0"};
    	String[] v27={"interim","中间、过渡时期",n,"0"};
    	String[] v28={"interjection","插入语，感叹词",n,"0"};
    	String[] v29={"interlock","连锁",v,"0"};
    	String[] v30={"interlooking","连锁的",a,"0"};
    	String[] v31={"interlude","暂时休息",n,"0"};
    	String[] v32={"intermediary","仲裁者，中间物；中间的，媒介的",n+a,"0"};
    	String[] v33={"interminable","无尽头的",a,"0"};
    	String[] v34={"intermingle","混合",v,"0"};
    	String[] v35={"intermission","暂停",n,"0"};
    	String[] v36={"intermittent","断断续续的",a,"0"};
    	String[] v37={"intern","拘禁，软禁；实习生",v+n,"0"};
    	String[] v38={"internecine","内讧的，两败俱伤的",a,"0"};
    	String[] v39={"interplay","相互影响",v+n,"0"};
    	String[] v40={"interpolate","插入，篡改",v,"0"};
    	String[] v41={"interpose","置于...之间",v,"0"};
    	String[] v42={"interregnum","无王时期",n,"0"};
    	String[] v43={"interrogate","审问，审讯",v,"0"};
    	String[] v44={"interrupt","暂时中止，打断，打扰",v,"0"};
    	String[] v45={"intersect","横截，横断",v,"0"};
    	String[] v46={"intersperse","散布，点缀",v,"0"};
    	String[] v47={"interwine","纠缠",v,"0"};
    	String[] v48={"intervene","干涉，介入",v,"0"};
    	String[] v49={"intimate","亲密的；密友",a+n,"0"};
    	String[] v50={"intimidate","恐吓，胁迫",v,"0"};
    	String[] v51={"intoxicate","使沉醉，使狂喜，使喝醉",v,"0"};
        String[] v52={"intractable","倔强的，难管的",a,"0"};
        String[] v53={"intransigent","不妥协的",a,"0"};
        String[] v54={"intrepid","无畏的，刚毅的",a,"0"};
        String[] v55={"intricacy","错综复杂",n,"0"};
        String[] v56={"intricate","复杂的",a,"0"};
        String[] v57={"intrigue","密谋，引起极大兴趣",v,"0"};
        String[] v58={"introspective","自省的",a,"0"};
        String[] v59={"intrude","把...强加于，闯入",v,"0"};
        String[] v60={"intuition","直觉，由直觉获取的知识",n,"0"};		
    	String[] v61={"intuitive","直觉的",a,"0"};
        String[] v62={"inundate","淹没，泛滥",v,"0"};
       	String[] v63={"inured","习惯的",a,"0"};
       	String[] v64={"invade","侵犯，入侵",v,"0"};
       	String[] v65={"invective","猛烈抨击，痛骂",n,"0"};
       	String[] v66={"inveigh","痛骂，抨击",v,"0"};
        String[] v67={"inveigle","诱骗，诱使",v,"0"};
        String[] v68={"inventory","详细目录，存货清单",n,"0"};
        String[] v69={"inverse","相反的，倒转的",a,"0"};
        String[] v70={"invert","上下倒置",v,"0"};
    	String[] v71={"invertebrate","无脊椎的(动物)",a+n,"0"};
        String[] v72={"investigate","调查",v,"0"};
       	String[] v73={"inveterate","积习已深的",a,"0"};
       	String[] v74={"invidious","惹人嫉妒、反感的，导致伤害、仇恨的",a,"0"};
       	String[] v75={"invigorate","鼓舞，激励",v,"0"};
        String[] v76={"invigorating","使人有精神的，使人健壮的",a,"0"};
        String[] v77={"inviolable","不可侵犯的，不可亵渎的",a,"0"};
        String[] v78={"invoke","祈求，恳求，(法律)生效",v,"0"};
        String[] v79={"involuntary","无意的",a,"0"};
        String[] v80={"invulnerable","无法伤害的",a,"0"};
    	String[] v81={"iodine","碘，碘酒",n,"0"};
        String[] v82={"iota","极小量，极小",n,"0"};
        String[] v83={"irascible","易怒的",a,"0"};
        String[] v84={"irate","发怒的",a,"0"};
        String[] v85={"ire","愤怒，激怒",v,"0"};
        String[] v86={"iridescent","闪彩光的",a,"0"};
        String[] v87={"irk","使苦恼",v,"0"};
        String[] v88={"irksome","令人不爽的",a,"0"};
        String[] v89={"ironclad","装铁甲的",a,"0"};
        String[] v90={"ironic","挖苦的，出乎意料的",a,"0"};
        String[] v91={"irony","反话，出人意料的事情或状况",n,"0"};
        String[] v92={"irradicable","不能根除的",a,"0"};
        String[] v93={"irreconcilable","不能协调的，矛盾的",a,"0"};
        String[] v94={"irredeemable","无法挽回的",a,"0"};
        String[] v95={"irreducible","(数)不可约的",a,"0"};
        String[] v96={"irremediable","无法治愈的",a,"0"};
        String[] v97={"irrepressible","无法约束或阻止的",a,"0"};
        String[] v98={"irrevocable","无法取消的",a,"0"};
        String[] v99={"irrigate","灌溉，冲洗伤口",v,"0"};
        String[] v100={"irritable","易怒的，易受刺激的",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"irritate","激怒，刺激",v,"0"};
        	String[] v102={"isolate","孤立，将...从种群中隔离",v,"0"};
        	String[] v103={"issue","出来，流出，发给，分发；(刊物)期",v+n,"0"};
        	String[] v104={"isthmus","地峡",n,"0"};
        	String[] v105={"itinerant","巡回的，流动的",a,"0"};
        	String[] v106={"itineracy","行程表，旅行路线",n,"0"};
        	String[] v107={"ivory","象牙，长牙",n,"0"};
        	String[] v108={"jabber","快而不清楚地说",v,"0"};
        	String[] v109={"jade","疲惫的老马，玉，翡翠",n,"0"};
        	String[] v110={"jaded","疲惫的，厌倦的",a,"0"};
        	String[] v111={"jagged","锯齿状的，不整齐的",a,"0"};
        	String[] v112={"jamb","门窗的侧柱",n,"0"};
        	String[] v113={"jar","冲突，抵触，震惊，发出刺耳声",v,"0"};
        	String[] v114={"jargon","暗语，行话",n,"0"};
        	String[] v115={"jarring","声音刺耳的",a,"0"};
        	String[] v116={"jaundice","偏见，黄疸",n,"0"};
        	String[] v117={"jaunt","短程旅游",n+v,"0"};
        	String[] v118={"jaunty","愉快的，满足的",a,"0"};
        	String[] v119={"jazz","爵士乐，喧闹",n,"0"};
        	String[] v120={"jealousy","猜忌，嫉妒",n,"0"};
        	String[] v121={"jeer","嘲笑",v,"0"};
        	String[] v122={"jejune","空洞的，不成熟的",a,"0"};
        	String[] v123={"jerk","突然猛拉",v,"0"};
        	String[] v124={"jeopardize","危及，危害",v,"0"};
        	String[] v125={"jeopardy","危险",n,"0"};
        	String[] v126={"jest","说笑，玩笑",v,"0"};
        	String[] v127={"jettison","(船)向外抛东西；抛弃的货物",v+n,"0"};
        	String[] v128={"jibe","与...一致，符合",v,"0"};
        	String[] v129={"jigsaw puzzle","拼图游戏",n,"0"};
        	String[] v130={"jingoism","沙文主义，侵略主义",n,"0"};
        	String[] v131={"jockey","骑师；用计获取",n+v,"0"};
        	String[] v132={"jocular","滑稽的，嬉戏的",a,"0"};
        	String[] v133={"jocund","快乐的",a,"0"};
        	String[] v134={"jog","慢而平静的前进",v,"0"};
        	String[] v135={"jolt","颠簸着移动；震动，摇晃",v+n,"0"};
        	String[] v136={"jot","摘要记录",v,"0"};
        	String[] v137={"jovial","愉快的",a,"0"};
        	String[] v138={"jubilation","欢快，欢庆",n,"0"};
        	String[] v139={"judical","法庭的，法官的",a,"0"};
        	String[] v140={"judicious","有判断力的，明智的",a,"0"};
        	String[] v141={"juggernaut","摧毁一切的强大力量",n,"0"};
        	String[] v142={"jumble","混杂，掺杂",v+n,"0"};
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    	
        	
    }
    private void doList_22(){
    	
    	String[] v1={"junction","交叉路口，连接",n,"0"};
    	String[] v2={"justifiable","有理由的，无可非议的",a,"0"};
    	String[] v3={"justification","正当理由，正义原因，辩护",n,"0"};
    	String[] v4={"justify","证明...正当",v,"0"};
    	String[] v5={"juvenile","少年的",a,"0"};
    	String[] v6={"juxtapose","并置",v,"0"};
    	String[] v7={"kaleidoscope","万花筒，产生有趣的对称效果",n,"0"};
    	String[] v8={"kangaroo","袋鼠",n,"0"};
    	String[] v9={"ken","视野范围，知识范围",n,"0"};
    	String[] v10={"kennel","狗窝",n,"0"};
    	String[] v11={"kernel","果仁，核心",n,"0"};
    	String[] v12={"kidnap","诱拐，绑架，勒赎",v,"0"};
    	String[] v13={"kidney","肾",n,"0"};
    	String[] v14={"killjoy","扫兴之人",n,"0"};
    	String[] v15={"kin","亲属",n,"0"};
    	String[] v16={"kindle","着火，点燃",v,"0"};
    	String[] v17={"kinetic","运动的",a,"0"};
    	String[] v18={"knack","特殊能力，窍门",n,"0"};
    	String[] v19={"knave","流氓",n,"0"};
    	String[] v20={"knead","揉制，捏制",v,"0"};
    	String[] v21={"knit","编织",v,"0"};
    	String[] v22={"knotty","有节疤的，困难的",a,"0"};
    	String[] v23={"know-how","专业技能，知识",n,"0"};
    	String[] v24={"kudos","荣誉",n,"0"};
    	String[] v25={"labile","不稳定的",a,"0"};
    	String[] v26={"labored","吃力的，不自然的",a,"0"};
    	String[] v27={"labyrinth","迷宫",n,"0"};
    	String[] v28={"lace","鞋带，系带，网眼花边，透孔织品",n,"0"};
    	String[] v29={"lacerate","撕裂，深深伤害",v,"0"};
    	String[] v30={"lachrymose","好流泪的，引人落泪的",a,"0"};
    	String[] v31={"lackadaisical","无精打采的，无兴趣的",a,"0"};
    	String[] v32={"lackluster","无光泽的，呆滞的",a,"0"};
    	String[] v33={"laconic","简洁的",a,"0"};
    	String[] v34={"lactic","乳汁的",a,"0"};
    	String[] v35={"lag","落后，滞留",v,"0"};
    	String[] v36={"lair","野兽巢穴",n,"0"};
    	String[] v37={"laity","俗家信徒，俗人阶级，外行",n,"0"};
    	String[] v38={"lambaste","痛打，痛骂",v,"0"};
    	String[] v39={"lament","悲伤，哀悼",n+v,"0"};
    	String[] v40={"lampoon","讽刺文章；讽刺",n+v,"0"};
    	String[] v41={"lance","长矛，鱼叉",n,"0"};
    	String[] v42={"lancet","手术刀",n,"0"};
    	String[] v43={"landfill","垃圾堆",n,"0"};
    	String[] v44={"landlocked","被陆地包围的",a,"0"};
    	String[] v45={"landmark","路标，里程碑",n,"0"};
    	String[] v46={"landslide","山崩，压倒性胜利",n,"0"};
    	String[] v47={"languid","没精打采的，倦怠的",a,"0"};
    	String[] v48={"languish","变得消瘦，衰弱",v,"0"};
    	String[] v49={"languor","身心疲惫",n,"0"};
    	String[] v50={"lank","瘦削的，长而软的",a,"0"};
    	String[] v51={"lap","舔食",v,"0"};
        String[] v52={"lapse","事物，(时间)流逝",n,"0"};
        String[] v53={"larder","食品室",n,"0"};
        String[] v54={"largess","赠送",n,"0"};
        String[] v55={"lark","玩乐",v,"0"};
        String[] v56={"larva","幼虫",n,"0"};
        String[] v57={"lash","鞭子；鞭打，捆住",n+v,"0"};
        String[] v58={"lassitude","无力，没精打采",n,"0"};
        String[] v59={"lasso","套索",n,"0"};
        String[] v60={"lasting","持久的",a,"0"};		
    	String[] v61={"latency","潜伏期",n,"0"};
        String[] v62={"latent","潜伏的",a,"0"};
       	String[] v63={"lateral","侧面的",a,"0"};
       	String[] v64={"latitude","言行自由",n,"0"};
       	String[] v65={"lattice","(篱笆的)格子架",n,"0"};
       	String[] v66={"laud","称赞",v,"0"};
        String[] v67={"lava","熔岩",n,"0"};
        String[] v68={"lave","洗浴，慢慢冲刷",v,"0"};
        String[] v69={"lavish","浪费的，丰富的",a,"0"};
        String[] v70={"laxative","通便的，放松的；轻泻药",a+n,"0"};
    	String[] v71={"leak","泄漏；泄漏漏出量，漏洞",v+n,"0"};
        String[] v72={"leakage","渗漏",n,"0"};
       	String[] v73={"lease","租约，租期；出租",n+v,"0"};
       	String[] v74={"leaven","发酵剂，影响力；发酵，影响",n+v,"0"};
       	String[] v75={"lectern","教堂的读经台",n,"0"};
        String[] v76={"ledger","账簿",n,"0"};
        String[] v77={"leer","斜眼看，送秋波",v,"0"};
        String[] v78={"leery","机警的，怀疑的",a,"0"};
        String[] v79={"legacy","遗产，遗留之物",n,"0"};
        String[] v80={"legend","地图了的说明文字或图例",n,"0"};
    	String[] v81={"legerdermain","手法，戏法",n,"0"};
        String[] v82={"legion","兵团，一大群",n,"0"};
        String[] v83={"legislate","制定法律",v,"0"};
        String[] v84={"legitimate","合法的",a,"0"};
        String[] v85={"leisureliness","悠然，从容",n,"0"};
        String[] v86={"leniency","温和，宽容",n,"0"};
        String[] v87={"lenient","宽大的，仁慈的",a,"0"};
        String[] v88={"lethal","致命的",a,"0"};
        String[] v89={"lethargic","昏睡的",a,"0"};
        String[] v90={"lethargy","昏睡，倦怠，懒散",n,"0"};
        String[] v91={"levee","防洪堤，堤岸",n,"0"};
        String[] v92={"levelheaded","头脑冷静的，稳健的",a,"0"};
        String[] v93={"lever","杠杆；撬动",n+v,"0"};
        String[] v94={"levity","轻率，轻浮",n,"0"};
        String[] v95={"levy","征税",n+v,"0"};
        String[] v96={"lexicographer","词典编纂人",n,"0"};
        String[] v97={"liability","责任，债务",n,"0"};
        String[] v98={"liaison","联系，暧昧关系",n,"0"};
        String[] v99={"libel","(文字)诽谤",n+v,"0"};
        String[] v100={"liberality","慷慨，心胸开阔",n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"liberate","释放，解放",v,"0"};
        	String[] v102={"libertine","浪荡之人",n,"0"};
        	String[] v103={"liberty","随意，冒失",n,"0"};
        	String[] v104={"libretto","歌词，剧本",n,"0"};
        	String[] v105={"license","放肆，自由，许可证，执照",n,"0"};
        	String[] v106={"licentious","纵欲的，放肆的",a,"0"};
        	String[] v107={"lien","扣押权，留置权",n,"0"};
        	String[] v108={"ligneous","木制的，木头的",a,"0"};
        	String[] v109={"liken","把...比作",v,"0"};
        	String[] v110={"limb","肢，翼",n,"0"};
        	String[] v111={"limber","易弯曲的，敏捷的",a,"0"};
        	String[] v112={"limerick","五行打油诗",n,"0"};
        	String[] v113={"limestone","石灰岩",n,"0"};
        	String[] v114={"limn","描写，画",v,"0"};
        	String[] v115={"limousine","大型轿车，大客车",n,"0"};
        	String[] v116={"limp","瘸行；软弱的，松软的",v+a,"0"};
        	String[] v117={"limpid","清澈透明的",a,"0"};
        	String[] v118={"lineage","宗系，血统",n,"0"};
        	String[] v119={"linen","亚麻织品，亚麻布",n,"0"};
        	String[] v120={"linger","逗留，留念",v,"0"};
        	String[] v121={"linguistics","语言学",n,"0"};
        	String[] v122={"lionize","崇拜，看重",v,"0"};
        	String[] v123={"liquefy","使液化，使溶解",v,"0"};
        	String[] v124={"liquid","清澈的",a,"0"};
        	String[] v125={"liquidate","清算，清偿",v,"0"};
        	String[] v126={"lissome","姿态优雅的，柔软的",a,"0"};
        	String[] v127={"list","倾斜",n+v,"0"};
        	String[] v128={"listless","无精打采的",a,"0"};
        	String[] v129={"literal","字面上的，忠实原意的，精确的",a,"0"};
        	String[] v130={"literate","有读写能力的，有文化修养的",a,"0"};
        	String[] v131={"literati","文人，学者(复)",n,"0"};
        	String[] v132={"lithe","柔软的，易弯曲的，敏捷的，轻快的",a,"0"};
        	String[] v133={"litigant","诉讼当事人",n,"0"};
        	String[] v134={"litigation","诉讼",n,"0"};
        	String[] v135={"litter","垃圾，一窝(动物)",n,"0"};
        	String[] v136={"loaf","一条(面包)；虚度光阴",n+v,"0"};
        	String[] v137={"loathe","憎恨，厌恶",v,"0"};
        	String[] v138={"lobby","大厅，休息厅",n,"0"};
        	String[] v139={"lobe","耳垂，(肝肺)叶",n,"0"};
        	String[] v140={"locale","事件发生的现场，地点",n,"0"};
        	String[] v141={"locomotion","运动，移动",n,"0"};
        	String[] v142={"locomotive","移动的；机车，火车头",a+n,"0"};
        	String[] v143={"locus","地点，所在地",n,"0"};
        	String[] v144={"lode","矿脉",n,"0"};
        	String[] v145={"lofty","崇高的",a,"0"};
        	String[] v146={"log","日志，记录",n+v,"0"};
        	String[] v147={"logistics","后勤学，后勤",n,"0"};
        	String[] v148={"loll","懒洋洋的坐或卧",v,"0"};
        	String[] v149={"longevity","长寿",n,"0"};
        	String[] v150={"longing","渴望",n,"0"};
        	String[] v151={"long-winded","冗长的",a,"0"};
        	String[] v152={"loom","织布机；隐约出现",n+v,"0"};
        	String[] v153={"loon","蠢人，疯子",n,"0"};
        	String[] v154={"loop","圈，金属线圈",n,"0"};
        	String[] v155={"loophole","枪眼，小窗，换气孔",n,"0"};
        	String[] v156={"loosen","变松，松开",v,"0"};
        	String[] v157={"lope","轻快的步伐",n,"0"};
        	String[] v158={"lopsided","倾向一方的，不平衡的",a,"0"};
        	String[] v159={"loquacious","多嘴的，饶舌的",a,"0"};
        	String[] v160={"lot","签；抽签，划分",n+v,"0"};
        	String[] v161={"lottery","彩票，抽彩给奖法",n,"0"};
        	String[] v162={"lounge","懒散的斜靠；休息室",v+n,"0"};
        	String[] v163={"loutish","粗鲁的",a,"0"};
        	String[] v164={"low","牛叫",v,"0"};
        	String[] v165={"loyal","忠诚的",a,"0"};
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);
    		subInitial(v159);
    		subInitial(v160);
    		subInitial(v161);
    		subInitial(v162);
    		subInitial(v163);
    		subInitial(v164);
    		subInitial(v165);
    		
        	
    }
    private void doList_23(){
    	
    	String[] v1={"lubricant","润滑剂",n,"0"};
    	String[] v2={"lubricate","润滑",v,"0"};
    	String[] v3={"lucid","表达清楚的，明白易懂的",a,"0"};
    	String[] v4={"lucrative","赚钱的，有利可图的",a,"0"};
    	String[] v5={"ludicrous","荒唐可笑的",a,"0"};
    	String[] v6={"lug","拖，拉",v+n,"0"};
    	String[] v7={"lukewarm","微温的，不热心的",a,"0"};
    	String[] v8={"lull","活动的暂停；使平静",n+v,"0"};
    	String[] v9={"lullaby","摇篮曲",n,"0"};
    	String[] v10={"lumber","蹒跚而行，笨拙的走；杂物；",v+n,"0"};
    	String[] v11={"lumberjack","伐木工",n,"0"};
    	String[] v12={"lumen","流明",n,"0"};
    	String[] v13={"luminary","杰出人物，名人",n,"0"};
    	String[] v14={"lump","一块，肿块；形成块状",n+v,"0"};
    	String[] v15={"lunar","月亮的",a,"0"};
    	String[] v16={"lunatic","疯子；极蠢的",n+a,"0"};
    	String[] v17={"lurch","突然向前或侧面倒；蹒跚而行",n+v,"0"};
    	String[] v18={"lurid","耀眼的，骇人听闻的",a,"0"};
    	String[] v19={"lurk","潜伏，埋伏",v,"0"};
    	String[] v20={"lush","繁茂的，茂盛的",a,"0"};
    	String[] v21={"lust","强烈的欲望",n,"0"};
    	String[] v22={"lustrous","有光泽的",a,"0"};
    	String[] v23={"luxuriant","繁茂的，肥沃的",a,"0"};
    	String[] v24={"luxurious","奢侈的，豪华的",a,"0"};
    	String[] v25={"luxury","奢侈(品)",n,"0"};
    	String[] v26={"lyric","抒情的；抒情诗，歌词",a+n,"0"};
    	String[] v27={"macabre","骇人的",a,"0"};
    	String[] v28={"macerate","浸软，使消瘦",v,"0"};
    	String[] v29={"machination","阴谋",n,"0"};
    	String[] v30={"maculated","有斑点的",a,"0"};
    	String[] v31={"madrigal","抒情短诗，情歌，合唱曲",n,"0"};
    	String[] v32={"maelstrom","大漩涡，大混乱",n,"0"};
    	String[] v33={"magenta","紫红色的；紫红色，紫红染料",a+n,"0"};
    	String[] v34={"magisterial","有权威的，威风的",a,"0"};
    	String[] v35={"magnanimity","慷慨",n,"0"};
    	String[] v36={"magnanimous","宽宏大量的，慷慨的",a,"0"};
    	String[] v37={"magnate","财主，巨头",n,"0"};
    	String[] v38={"magnificent","壮丽的，宏伟的；高尚的",a,"0"};
    	String[] v39={"magnify","放大，赞美",v,"0"};
    	String[] v40={"magnitude","重要，星球光亮度",n,"0"};
    	String[] v41={"magpie","鹊",n,"0"};
    	String[] v42={"maintenance","维持，维护",n,"0"};
    	String[] v43={"maize","玉米",n,"0"};
    	String[] v44={"majestic","雄伟的，庄严的",a,"0"};
    	String[] v45={"maladroit","笨拙的",a,"0"};
    	String[] v46={"malaise","不适，不舒服",n,"0"};
    	String[] v47={"malapropism","字的误用",n,"0"};
    	String[] v48={"malcontent","不满的；不满分子，反抗者",a+n,"0"};
    	String[] v49={"malevolent","恶意的，恶毒的",a,"0"};
    	String[] v50={"malfeasance","不法行为，渎职",n,"0"};
    	String[] v51={"malfunction","发生故障；故障",v+n,"0"};
        String[] v52={"malicious","恶毒的",a,"0"};
        String[] v53={"malign","诽谤；邪恶的",v+a,"0"};
        String[] v54={"malinger","装病以逃避工作",v,"0"};
        String[] v55={"malleable","可塑的，易改变的",a,"0"};
        String[] v56={"malpractice","玩忽职守，渎职",n,"0"};
        String[] v57={"mammoth","巨大的",a,"0"};
        String[] v58={"mandate","命令，指令",n,"0"};
        String[] v59={"mandatory","命令的，强迫的",a,"0"};
        String[] v60={"mangle","毁损，四岁，压碎",v,"0"};		
    	String[] v61={"mania","癫狂，狂热",n,"0"};
        String[] v62={"manifest","显然的；旅客名单，载货清单",a+n,"0"};
       	String[] v63={"manifesto","宣言，声明",n,"0"};
       	String[] v64={"manifold","繁多的，多种的",a,"0"};
       	String[] v65={"manipulate","操纵",v,"0"};
       	String[] v66={"manipulative","操纵别人的，老于世故的",a,"0"};
        String[] v67={"mannered","做作的",a,"0"};
        String[] v68={"mansion","公馆，大厦",n,"0"};
        
        String[] v69={"mantle","披风，斗篷；覆盖",n+v,"0"};
        String[] v70={"manumit","解放(奴隶)",v,"0"};
    	String[] v71={"manure","粪肥；给...施肥",n+v,"0"};
        String[] v72={"manuscript","手稿，手抄本",n,"0"};
       	String[] v73={"maple","枫树",n,"0"};
       	String[] v74={"mar","破坏，损伤",v,"0"};
       	String[] v75={"marble","大理石",n,"0"};
        String[] v76={"mare","母马，母驴",n,"0"};
        String[] v77={"margarine","黄油",n,"0"};
        String[] v78={"margin","页边空白，边缘",n,"0"};
        String[] v79={"marine","海的，海中的",a,"0"};
        String[] v80={"marionette","木偶",n,"0"};
    	String[] v81={"martial","婚姻的",a,"0"};
        String[] v82={"maritime","沿海的，海上的",a,"0"};
        String[] v83={"marked","明显的，被监视的",a,"0"};
        String[] v84={"maroon","栗色(的)",n+a,"0"};
        String[] v85={"marsh","沼泽，湿地",n,"0"};
        String[] v86={"marshal","整理，安排，设置",v,"0"};
        String[] v87={"marsupial","有袋动物(的)",n+a,"0"};
        String[] v88={"martial","战争的，军事的",a,"0"};
        String[] v89={"martyr","烈士，殉道者",n,"0"};
        String[] v90={"marvel","对...感到诧异；奇迹",v+n,"0"};
        String[] v91={"mash","捣成糊状",v,"0"};
        String[] v92={"mask","假面具；隐藏",n+v,"0"};
        String[] v93={"mason","泥瓦匠，石匠",n,"0"};
        String[] v94={"masquerade","化妆舞会；伪装",n+v,"0"};
        String[] v95={"massacre","大屠杀",n,"0"};
        String[] v96={"massive","巨大的，厚重的",a,"0"};
        String[] v97={"mast","船桅，旗杆",n,"0"};
        String[] v98={"masticate","咀嚼，把...磨成浆",v,"0"};
        String[] v99={"mate","伙伴，配偶；交配",n+v,"0"};
        String[] v100={"materialize","赋予形体，使具体化，实现",v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"maternal","母性的",a,"0"};
        	String[] v102={"matrix","模子，矩阵",n,"0"};
        	String[] v103={"mattress","床垫",n,"0"};
        	String[] v104={"mature","成熟的，深思熟虑的",a,"0"};
        	String[] v105={"maudlin","感情脆弱的，爱哭的",a,"0"};
        	String[] v106={"maul","撕裂皮肉，伤害",v,"0"};
        	String[] v107={"mauve","淡紫色的",a,"0"};
        	String[] v108={"maven","专家，内行",n,"0"};
        	String[] v109={"maverick","想法与众不同的人",n,"0"};
        	String[] v110={"mawkish","自作多情的，淡而无味的，令人作呕的",a,"0"};
        	String[] v111={"maximize","使增至最大限度",v,"0"};
        	String[] v112={"maze","迷宫",n,"0"};
        	String[] v113={"meager","贫乏的，瘦削的",a,"0"};
        	String[] v114={"mean","卑贱的，吝啬的",a,"0"};
        	String[] v115={"meander","蜿蜒而流",v,"0"};
        	String[] v116={"measly","患麻疹的，小得可怜的",a,"0"};
        	String[] v117={"measured","精确的，慎重的",a,"0"};
        	String[] v118={"mechanical","机械的，呆板的，体力的",a,"0"};
        	String[] v119={"mechanics","力学",n,"0"};
        	String[] v120={"mechanism","结构，机制",n,"0"};
        	String[] v121={"medal","奖牌，勋章",n,"0"};
        	String[] v122={"meddle","干涉",v,"0"};
        	String[] v123={"meddlesome","爱管闲事的",a,"0"};
        	String[] v124={"mediate","调停",v,"0"};
        	String[] v125={"medieval","中世纪的，中古的",a,"0"};
        	String[] v126={"mediocrity","平庸，碌碌无为",n,"0"};
        	String[] v127={"meditate","沉思，反省",v,"0"};
        	String[] v128={"medium","媒介，(细菌)生存环境",n,"0"};
        	String[] v129={"medley","各种混杂，混合歌曲",n,"0"};
        	String[] v130={"meek","温顺的",a,"0"};
        	String[] v131={"meet","合适的",a,"0"};
        	String[] v132={"melancholy","忧郁的，令人悲伤的",a,"0"};
        	String[] v133={"meld","(使)混合，(使)合并",v,"0"};
        	String[] v134={"mellifluous","(音乐)柔美流畅的",a,"0"};
        	String[] v135={"melodrama","情节剧，音乐戏剧",n,"0"};
        	String[] v136={"melon","甜瓜",n,"0"};
        	String[] v137={"membrane","薄膜，膜",n,"0"};
        	String[] v138={"memoir","回忆录，自传，记事录",n,"0"};
        	String[] v139={"memorial","纪念碑，纪念物；纪念的，悼念的",n+a,"0"};
        	String[] v140={"menace","威胁，恐吓",n+v,"0"};
        	String[] v141={"mend","修改，改进",v,"0"};
        	String[] v142={"mendacious","不真的，撒谎的",a,"0"};
        	String[] v143={"mendicant","行乞的；乞丐",a+n,"0"};
        	String[] v144={"menthol","薄荷醇",n,"0"};
        	String[] v145={"mentor","导师",n,"0"};
        	String[] v146={"mercantile","贸易的，商业的",a,"0"};
        	String[] v147={"mercenary","唯利是图的；雇佣兵",a+n,"0"};
        	String[] v148={"mercurial","善变的，活泼的",a,"0"};
        	String[] v149={"meretricious","华而不实的，俗艳的",a,"0"};
        	String[] v150={"merit","值得",v,"0"};
        	String[] v151={"merited","该得的，理所当然的",a,"0"};
        	String[] v152={"meritorious","值得赞赏的",a,"0"};
        	String[] v153={"mesa","高台地，平顶山",n,"0"};
        	String[] v154={"mesh","用网捕捉，齿合",v,"0"};
        	String[] v155={"metabolism","新陈代谢",n,"0"};
        	String[] v156={"metamorphose","变形",v,"0"};
        	String[] v157={"metaphor","隐喻，暗喻",n,"0"};
        	String[] v158={"metaphysics","形而上学，玄学",n,"0"};
        	String[] v159={"mete","给予，分配，测量；边界",v+n,"0"};
        	String[] v160={"meteoric","流星的，昙花一现的",a,"0"};
        	String[] v161={"methodical","细心的，有条不紊的",a,"0"};
        	String[] v162={"meticulous","细心的，一丝不苟的",a,"0"};
        	String[] v163={"metrical","测量的，韵律的",a,"0"};
        	String[] v164={"metropolis","大城市",n,"0"};
        	
        	
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);
    		subInitial(v159);
    		subInitial(v160);
    		subInitial(v161);
    		subInitial(v162);
    		subInitial(v163);
    		subInitial(v164);
    	
    	
    }
    private void doList_24(){
    	String[] v1={"metropolitan","大城市的",a,"0"};
    	String[] v2={"mettle","勇气，斗志",n,"0"};
    	String[] v3={"mettlesome","精神抖擞的",a,"0"};
    	String[] v4={"microbe","微生物",n,"0"};
    	String[] v5={"microorganism","微生物，细菌",n,"0"};
    	String[] v6={"microscopic","极小的，显微镜的",a,"0"};
    	String[] v7={"miff","小争吵",n,"0"};
    	String[] v8={"mighty","强有力的，强大的",a,"0"};
    	String[] v9={"migratory","迁移的，流浪的",a,"0"};
    	String[] v10={"milestone","里程碑，转折点",n,"0"};
    	String[] v11={"militia","民兵",n,"0"};
    	String[] v12={"milk","榨取",v,"0"};
    	String[] v13={"mill","磨坊，压榨机，制造厂",n,"0"};
    	String[] v14={"mime","哑剧",n,"0"};
    	String[] v15={"mimic","模仿，戏弄；模仿他人言行的人",v+n,"0"};
    	String[] v16={"minaret","清真寺的尖塔",n,"0"};
    	String[] v17={"minatory","威胁的，恐吓的",a,"0"};
    	String[] v18={"mince","切碎，小步走路",v,"0"};
    	String[] v19={"mingle","混合",v,"0"};
    	String[] v20={"miniature","小画像，缩影",n,"0"};
    	String[] v21={"minimize","最小化",v,"0"};
    	String[] v22={"minion","奴才",n,"0"};
    	String[] v23={"minnow","鲦鱼，小淡水鱼",n,"0"};
    	String[] v24={"mint","大量，巨额，造币厂",n,"0"};
    	String[] v25={"minuet","小步舞",n,"0"};
    	String[] v26={"minuscule","极小的",a,"0"};
    	String[] v27={"minutes","会议记录",n,"0"};
    	String[] v28={"minutia","细枝末节",n,"0"};
    	String[] v29={"miracle","奇事，奇迹",n,"0"};
    	String[] v30={"mirage","幻影，海市蜃楼",n,"0"};
    	String[] v31={"mire","泥沼，困境；使...陷入困境",n+v,"0"};
    	String[] v32={"mirth","欢乐，欢笑",n,"0"};
    	String[] v33={"misanthrope","愤世嫉俗者",n,"0"};
    	String[] v34={"mischievous","淘气的，有害处的",a,"0"};
    	String[] v35={"miscreant","恶棍，歹徒",n,"0"};
    	String[] v36={"miser","守财奴，吝啬鬼",n,"0"};
    	String[] v37={"miserly","吝啬的，贪婪的",a,"0"};
    	String[] v38={"misgiving","担心，疑虑",n,"0"};
    	String[] v39={"misinform","向...提供错误信息",v,"0"};
    	String[] v40={"misnomer","名字的误用",n,"0"};
    	String[] v41={"misperceive","误解",v,"0"};
    	String[] v42={"misrepresent","误传，歪曲",v,"0"};
    	String[] v43={"misshapen","畸形的，奇形怪状的",a,"0"};
    	String[] v44={"missile","发射物，导弹",n,"0"};
    	String[] v45={"mite","极小量，小虫",n,"0"};
    	String[] v46={"mitigate","减轻，缓和",v,"0"};
    	String[] v47={"mitten","连指手套",n,"0"};
    	String[] v48={"mnemonics","记忆法，记忆规则",n,"0"};
    	String[] v49={"moan","呻吟，抱怨",n+v,"0"};
    	String[] v50={"moat","壕沟，护城河",n,"0"};
    	String[] v51={"mobile","易于移动的",a,"0"};
        String[] v52={"mobility","可动性，流动性",n,"0"};
        String[] v53={"mock","嘲笑，嘲弄的模仿",v,"0"};
        String[] v54={"mode","样式，时尚，模式",n,"0"};
        String[] v55={"modest","谦虚的，谨慎的",a,"0"};
        String[] v56={"modicum","少量",n,"0"};
        String[] v57={"modify","修改，变更",v,"0"};
        String[] v58={"modish","时髦的",a,"0"};
        String[] v59={"modulate","调整",v,"0"};
        String[] v60={"mogul","显要人物",n,"0"};		
    	String[] v61={"molar","臼齿",n,"0"};
        String[] v62={"mold","模子，霉；塑造",n+v,"0"};
       	String[] v63={"molding","装饰线条，铸造物",n,"0"};
       	String[] v64={"moldy","发霉的",a,"0"};
       	String[] v65={"molecule","分子",n,"0"};
       	String[] v66={"mollify","安慰，安抚",v,"0"};
        String[] v67={"mollycoddle","过分爱惜，娇惯；娇惯的人",v+n,"0"};
        String[] v68={"molt","换羽，换毛",n+v,"0"};
        String[] v69={"molten","融化的",a,"0"};
        String[] v70={"moment","瞬间，重要",n,"0"};
    	String[] v71={"momentous","极重要的，严重的",a,"0"};
        String[] v72={"momentum","推进力，势头",n,"0"};
       	String[] v73={"monarch","君主，帝王",n,"0"};
       	String[] v74={"monarchy","君主制",n,"0"};
       	String[] v75={"monetary","货币的",a,"0"};
        String[] v76={"mongrel","杂种，混血儿",n,"0"};
        String[] v77={"monochromatic","单色的，单色画的",a,"0"};
        String[] v78={"monochrome","单色的，单色画的",n,"0"};
        String[] v79={"monocle","单片眼镜",n,"0"};
        String[] v80={"monogamy","一夫一妻制",n,"0"};
    	String[] v81={"monolithic","巨石的，巨大的",a,"0"};
        String[] v82={"monologue","独白，个人长篇演说",n,"0"};
        String[] v83={"monomania","偏执症，狂热病",n,"0"};
        String[] v84={"monopoly","专利权，垄断",n,"0"};
        String[] v85={"monotonous","单调的，无聊的",a,"0"};
        String[] v86={"monotony","单调，千篇一律",n,"0"};
        String[] v87={"monsoon","季风",n,"0"};
        String[] v88={"montage","蒙太奇，拼集画",n,"0"};
        String[] v89={"monumental","极大的，纪念碑的",a,"0"};
        String[] v90={"morale","士气，精神力量",n,"0"};
        String[] v91={"moralistic","道学气的",a,"0"};
        String[] v92={"moratorium","停止偿付，禁止活动",n,"0"};
        String[] v93={"morbid","病态的，不正常的",a,"0"};
        String[] v94={"mordant","讥讽的，尖酸的",a,"0"};
        String[] v95={"moribund","即将结束的，垂死的",a,"0"};
        String[] v96={"morose","阴郁的",a,"0"};
        String[] v97={"morsel","一小块(食物)，小量",n,"0"};
        String[] v98={"mortality","死亡率",n,"0"};
        String[] v99={"mortar","臼，研钵，迫击炮",n,"0"};
        String[] v100={"mortgage","抵押贷款，抵押证书；用...抵押",n+v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"mortification","耻辱，屈辱",n,"0"};
        	String[] v102={"mortify","使屈辱，使痛心",v,"0"};
        	String[] v103={"mortuary","停尸间",n,"0"};
        	String[] v104={"mosaic","马赛克，镶嵌细工",n,"0"};
        	String[] v105={"mosque","清真寺",n,"0"};
        	String[] v106={"mosquito","蚊子",n,"0"};
        	String[] v107={"mote","微粒，微尘",n,"0"};
        	String[] v108={"motif","(作品)主旨，主题",n,"0"};
        	String[] v109={"motility","运动性",n,"0"};
        	String[] v110={"motley","混杂的，杂色的",a,"0"};
        	String[] v111={"mottled","有杂色的，斑驳的",a,"0"};
        	String[] v112={"motto","座右铭，箴言",n,"0"};
        	String[] v113={"mountainous","多山的",a,"0"};
        	String[] v114={"mourn","哀悼，哀伤",v,"0"};
        	String[] v115={"mournful","悲伤的",a,"0"};
        	String[] v116={"movement","乐章",n,"0"};
        	String[] v117={"muffle","使声音降低，裹住",v,"0"};
        	String[] v118={"mulish","骡一样的，执拗的",a,"0"};
        	String[] v119={"multiple","多样的，多重的",a,"0"};
        	String[] v120={"multiplicity","多样性",n,"0"};
        	String[] v121={"multiply","乘，增加，繁殖",v,"0"};
        	String[] v122={"mumble","咕哝，含糊不清地说",v,"0"};
        	String[] v123={"mundane","现世的，世俗的",a,"0"};
        	String[] v124={"municipality","市，市政当局",n,"0"};
        	String[] v125={"minificence","慷慨，宽宏大量",n,"0"};
        	String[] v126={"munition","军火，弹药",n,"0"};
        	String[] v127={"mural","墙壁的；壁画",a+n,"0"};
        	String[] v128={"murky","黑暗的，朦胧的",a,"0"};
        	String[] v129={"murmur","柔声地说，抱怨",v,"0"};
        	String[] v130={"muse","沉思，冥想",v,"0"};
        	String[] v131={"musicologist","音乐学者",n,"0"};
        	String[] v132={"musket","毛瑟枪",n,"0"};
        	String[] v133={"muster","召集，聚集",v,"0"};
        	String[] v134={"mutate","变异",v,"0"};
        	String[] v135={"mute","沉默的；减弱声音；弱音器",a+v+n,"0"};
        	String[] v136={"muted","(声音)减弱的，变得轻柔的",a,"0"};
        	String[] v137={"mutineer","反叛者，背叛者",n,"0"};
        	String[] v138={"mutter","咕哝，嘀咕",v,"0"};
        	String[] v139={"myopia","近视，缺乏远见",n,"0"};
        	String[] v140={"myopic","近视眼的，缺乏辨别力的",a,"0"};
        	String[] v141={"myriad","许多的，无数的",a,"0"};
        	String[] v142={"mystic","神秘的，不可思议的",a,"0"};
        	String[] v143={"nadir","最低点",n,"0"};
        	String[] v144={"nag","唠叨，烦扰，找茬，抱怨",v,"0"};
        	String[] v145={"naive","天真的，淳朴的",a,"0"};
        	String[] v146={"narcissism","自恋",n,"0"};
        	String[] v147={"narcissist","自负的人，自恋者",n,"0"};
        	String[] v148={"narcotic","催眠药；催眠的",n+a,"0"};
        	String[] v149={"narrative","叙述的，讲故事的",a,"0"};
        	String[] v150={"nascent","初生的，萌芽的",a,"0"};
        	String[] v151={"natal","出生的，诞生时的",a,"0"};
        	String[] v152={"natty","整洁的，潇洒的",a,"0"};
        	String[] v153={"nausea","作呕，恶心",n,"0"};
        	String[] v154={"nauseate","使作呕，使厌恶",v,"0"};
        	String[] v155={"nautical","船员的，航海的",a,"0"};
        	String[] v156={"navigate","航海，导航",v,"0"};
        	String[] v157={"naysay","拒绝，说不",v,"0"};
        	String[] v158={"nebulous","模糊不清的",a,"0"};
        	String[] v159={"needle","针，针叶",n,"0"};
        	String[] v160={"needlework","缝纫，刺绣",n,"0"};
        	String[] v161={"needy","贫穷的",a,"0"};
        	String[] v162={"nefarious","邪恶的",a,"0"};
        	String[] v163={"negate","取消，否认",v,"0"};
        	String[] v164={"negation","否定，拒绝",n,"0"};
        	String[] v165={"negligence","粗心，疏忽",n,"0"};
        	String[] v166={"negotiable","可商量的",a,"0"};
        	String[] v167={"negotiate","商议，谈判，交涉",v,"0"};
        	String[] v168={"neolithic","新时期时代的",a,"0"};
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);
    		subInitial(v159);
    		subInitial(v160);
    		subInitial(v161);
    		subInitial(v162);
    		subInitial(v163);
    		subInitial(v164);
    		subInitial(v165);
    		subInitial(v166);
    		subInitial(v167);
    		subInitial(v168);
    		
        	
    	
    }
    
    private void doList_25(){
    	
    	String[] v1={"neologism","新字，新意",n,"0"};
    	String[] v2={"neophyte","初学者，新手",n,"0"};
    	String[] v3={"neopotism","裙带关系",n,"0"};
    	String[] v4={"nerve","勇气；鼓起勇气",n+v,"0"};
    	String[] v5={"nettle","荨麻；激恼",n+v,"0"};
    	String[] v6={"neurology","神经学",n,"0"};
    	String[] v7={"neutralize","使无效",v,"0"};
    	String[] v8={"neutron","中子",n,"0"};
    	String[] v9={"nexus","联系，连结",n,"0"};
    	String[] v10={"nib","钢笔尖",n,"0"};
    	String[] v11={"nibble","一点点地啃",v,"0"};
    	String[] v12={"nice","精密的",a,"0"};
    	String[] v13={"nick","小伤口，刻痕",n,"0"};
    	String[] v14={"nightmare","梦魇",n,"0"};
    	String[] v15={"nil","无，零",n,"0"};
    	String[] v16={"nip","小口啜饮",v,"0"};
    	String[] v17={"nitpick","吹毛求疵",v,"0"};
    	String[] v18={"nocturnal","夜晚的，夜间发生的",a,"0"};
    	String[] v19={"noisome","恶臭的，令人不爽的",a,"0"};
    	String[] v20={"nomad","流浪者，游牧的人",n,"0"};
    	String[] v21={"nomadic","游牧的",a,"0"};
    	String[] v22={"nominal","名义上的，有名无实的",a,"0"};
    	String[] v23={"nominate","提名，任命，指定",v,"0"};
    	String[] v24={"nonchalance","冷漠，沉着",n,"0"};
    	String[] v25={"noncommittal","态度暧昧的，不承担义务的",a,"0"};
    	String[] v26={"nonentity","不重要的人或事",n,"0"};
    	String[] v27={"nonflammable","不易燃的",a,"0"};
    	String[] v28={"nonplus","使困窘迷惑；迷惑，窘境",v+n,"0"};
    	String[] v29={"nonporous","无孔的，不渗漏的",a,"0"};
    	String[] v30={"nonradioactive","非放射性的",a,"0"};
    	String[] v31={"nonsensical","荒唐的，无意义的",a,"0"};
    	String[] v32={"nonthreatening","不威胁的",a,"0"};
    	String[] v33={"nonviable","无法生存的",a,"0"};
    	String[] v34={"norm","规范，准则",n,"0"};
    	String[] v35={"nostalgia","怀旧，思乡",n,"0"};
    	String[] v36={"nostrum","家传秘方，江湖药",n,"0"};
    	String[] v37={"notable","明显的，出众的，重要的",a,"0"};
    	String[] v38={"notch","V字形刻痕",n,"0"};
    	String[] v39={"notorious","臭名昭著的",a,"0"};
    	String[] v40={"nourish","滋养，怀有",v,"0"};
    	String[] v41={"nova","新星",n,"0"};
    	String[] v42={"novelty","新奇(的事物)",n,"0"};
    	String[] v43={"novice","新手",n,"0"};
    	String[] v44={"noxious","有害的，有毒的",a,"0"};
    	String[] v45={"nuance","细微差异",n,"0"};
    	String[] v46={"nubile","(女孩)到婚嫁年龄的，吸引人的，性感的",a,"0"};
    	String[] v47={"nucleate","使成核；有核的",v+a,"0"};
    	String[] v48={"nucleus","(原子)核",n,"0"};
    	String[] v49={"nudge","(用肘)轻触，轻推",v,"0"};
    	String[] v50={"nugatory","无价值的，琐碎的",a,"0"};
    	String[] v51={"nulify","使无效，取消",v,"0"};
        String[] v52={"numb","麻木的",a,"0"};
        String[] v53={"numerous","许多的，很多的",a,"0"};
        String[] v54={"numismatist","钱币学家，钱币收藏家",n,"0"};
        String[] v55={"nurture","抚育，滋养；养育，营养物，环境因素",v+n,"0"};
        String[] v56={"nutrient","滋养物质",n,"0"};
        String[] v57={"nutrition","营养，营养学",n,"0"};
        String[] v58={"oafishness","痴呆",n,"0"};
        String[] v59={"oak","橡树",n,"0"};
        String[] v60={"oasis","绿洲",n,"0"};		
    	String[] v61={"oath","誓言，咒骂",n,"0"};
        String[] v62={"obdurate","固执的，顽固的",a,"0"};
       	String[] v63={"obedient","服从的，顺从的",a,"0"};
       	String[] v64={"obeisance","鞠躬，敬礼",n,"0"};
       	String[] v65={"obese","极肥胖的",a,"0"};
       	String[] v66={"obfuscate","使困惑，使迷惑",v,"0"};
        String[] v67={"obituary","讣闻，讣告",n,"0"};
        String[] v68={"objection","厌恶，反对",n,"0"};
        String[] v69={"objective","客观的",a,"0"};
        String[] v70={"obligation","责任，债务",n,"0"};
    	String[] v71={"obligatory","强制性的，义务的",a,"0"};
        String[] v72={"oblige","束缚，恩惠于",v,"0"};
       	String[] v73={"obliging","恳切的，热心助人的",a,"0"};
       	String[] v74={"oblique","间接的，斜的",a,"0"};
       	String[] v75={"obliterate","涂掉，擦掉",v,"0"};
        String[] v76={"oblivious","遗忘的，疏忽的",a,"0"};
        String[] v77={"obloquy","大骂，斥责",n,"0"};
        String[] v78={"obnoxious","令人不爽的",a,"0"};
        String[] v79={"obscure","难理解的，不清楚的；隐藏，使...模糊",a+v,"0"};
        String[] v80={"obscurity","费解，不出名",n,"0"};
    	String[] v81={"obsequious","逢迎的，谄媚的",a,"0"};
        String[] v82={"observatory","天文台",n,"0"};
        String[] v83={"obsess","迷住，使困窘，使烦恼",v,"0"};
        String[] v84={"obsolete","废弃的，过时的",a,"0"};
        String[] v85={"obstacle","障碍，干扰",n,"0"};
        String[] v86={"obstinacy","固执，倔犟，顽固",n,"0"};
        String[] v87={"obstinate","固执的，倔强的",a,"0"};
        String[] v88={"obstreperous","吵闹的，难管束的",a,"0"};
        String[] v89={"obstruct","阻截，截断",v,"0"};
        String[] v90={"obtainable","能得到的",a,"0"};
        String[] v91={"obtuse","愚笨的，不锐利的",a,"0"};
        String[] v92={"obverse","正面(的)",n+a,"0"};
        String[] v93={"obviate","排除，消除(危险，困难)",v,"0"};
        String[] v94={"obvious","明显的，显而易见的",a,"0"};
        String[] v95={"occlude","使闭塞",v,"0"};
        String[] v96={"occult","秘密的，不公开的",a,"0"};
        String[] v97={"occupation","工作，职业，占领",n,"0"};
        String[] v98={"occurence","事件，发生",n,"0"};
        String[] v99={"octogenarian","八旬老人",n,"0"};
        String[] v100={"odds","机会，可能性",n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"ode","长诗，颂歌",n,"0"};
        	String[] v102={"odious","可憎的，讨厌的",a,"0"};
        	String[] v103={"odium","反感",n,"0"};
        	String[] v104={"odometer","里程表",n,"0"};
        	String[] v105={"odyssey","长途冒险旅行",n,"0"};
        	String[] v106={"offbeat","不规则的，不平常的",a,"0"};
        	String[] v107={"offence(offense)","冒犯，错事",n,"0"};
        	String[] v108={"offend","冒犯",v,"0"};
        	String[] v109={"offensive","令人不快的，得罪人的",a,"0"};
        	String[] v110={"offhand","事先无准备的，随便的",a+d,"0"};
        	String[] v111={"officious","爱发命令的，好忠告的，过度殷勤的",a,"0"};
        	String[] v112={"offish","冷淡的",a,"0"};
        	String[] v113={"off-key","走调的，不和谐的",a,"0"};
        	String[] v114={"offset","补偿，抵消",v,"0"};
        	String[] v115={"offspring","儿女，后代",n,"0"};
        	String[] v116={"offstage","幕后的",a+d,"0"};
        	String[] v117={"ogle","送秋波；媚眼",v+n,"0"};
        	String[] v118={"ointment","油膏，软膏",n,"0"};
        	String[] v119={"olfaction","嗅觉",n,"0"};
        	String[] v120={"oligarchy","寡头政治",n,"0"};
        	String[] v121={"omelet","煎蛋卷",n,"0"};
        	String[] v122={"ominous","预兆的，不详的",a,"0"};
        	String[] v123={"omit","省略，遗漏，疏忽",v,"0"};
        	String[] v124={"omnipotent","全能的，万能的",a,"0"};
        	String[] v125={"omnipresent","无处不在的",a,"0"};
        	String[] v126={"omniscient","无所不知的",a,"0"};
        	String[] v127={"onerous","繁重的，麻烦的",a,"0"};
        	String[] v128={"onset","(坏情况)开始发作",n,"0"};
        	String[] v129={"opacity","不透明性，晦涩",n,"0"};
        	String[] v130={"opalescence","(不透明的)乳白光",n,"0"};
        	String[] v131={"opaque","不透明的，难懂的",a,"0"};
        	String[] v132={"operative","实施中的",a,"0"};
        	String[] v133={"operetta","小歌剧",n,"0"};
        	String[] v134={"opine","想，以为",v,"0"};
        	String[] v135={"opinionated","固执己见的",a,"0"};
        	String[] v136={"opponent","对手",n,"0"};
        	String[] v137={"opportune","合适的，适当的",a,"0"};
        	String[] v138={"oppose","反对",v,"0"};
        	String[] v139={"oppress","压迫，压制",v,"0"};
        	String[] v140={"opprobrious","辱骂的，恶名声的",a,"0"};
        	String[] v141={"optimism","乐观主义",n,"0"};
        	String[] v142={"optimist","乐观主义者",n,"0"};
        	String[] v143={"optimum","最好的，最有利的",a,"0"};
        	String[] v144={"optional","可自由选择的",a,"0"};
        	String[] v145={"opulent","富裕的，充足的",a,"0"};
        	String[] v146={"oracle","代神发布神谕的人",n,"0"};
        	String[] v147={"oration","正式演说，演讲",n,"0"};
        	String[] v148={"oratorio","清唱剧",n,"0"};
        	String[] v149={"oratory","演讲术",n,"0"};
        	String[] v150={"orchard","果园",n,"0"};
        	String[] v151={"orchestra","管弦乐队",n,"0"};
        	String[] v152={"ordain","任命(神职)，颁发命令",v,"0"};
        	String[] v153={"ordeal","严峻考验，痛苦经验",n,"0"};
        	String[] v154={"ordnance","大炮，军械",n,"0"};
        	String[] v155={"ore","矿，矿石",n,"0"};
        	String[] v156={"organism","生物，有机体",n,"0"};
        	String[] v157={"orient","确定方向，使熟悉情况",v,"0"};
        	String[] v158={"original","最初的，原始的，有创意的",a,"0"};
        	String[] v159={"orginality","创造性，独特性",n,"0"};
        	String[] v160={"ornate","华美的，充满装饰的",a,"0"};
        	String[] v161={"ornithologist","鸟类学家",n,"0"};
        	String[] v162={"ornithology","鸟类学",n,"0"};
        	String[] v163={"orthodontics","畸齿矫正学",n,"0"};
        	String[] v164={"orthodox","正统的",a,"0"};
        	
        	
        	
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);
    		subInitial(v159);
    		subInitial(v160);
    		subInitial(v161);
    		subInitial(v162);
    		subInitial(v163);
    		subInitial(v164);
    		
        	
    	
    }
    private void doList_26(){
    	String[] v1={"oscillate","摆动，犹豫",v,"0"};
    	String[] v2={"osmosis","渗透，潜移默化",n,"0"};
    	String[] v3={"osseous","骨的，多骨的",a,"0"};
    	String[] v4={"ossify","骨化，硬化，僵化",v,"0"};
    	String[] v5={"ostensible","表面上的",a,"0"};
    	String[] v6={"ostentation","夸示，炫耀",n,"0"};
    	String[] v7={"ostracism","放逐，排斥",n,"0"};
    	String[] v8={"ostracize","放逐，排斥",v,"0"};
    	String[] v9={"ostrich","鸵鸟，不接受现实的人",n,"0"};
    	String[] v10={"other-directed","受人支配的",a,"0"};
    	String[] v11={"otter","水獭",n,"0"};
    	String[] v12={"oust","驱逐",v,"0"};
    	String[] v13={"outgoing","友善的，即将离去的",a,"0"};
    	String[] v14={"outgrowth","自然结果，副产品",n,"0"};
    	String[] v15={"outlandish","古怪的",a,"0"};
    	String[] v16={"outlet","出口",n,"0"};
    	String[] v17={"outline","轮廓，梗概",n,"0"};
    	String[] v18={"outmaneuver","以策略致胜",v,"0"};
    	String[] v19={"outmoded","不再流行的",a,"0"};
    	String[] v20={"outrage","暴行",n,"0"};
    	String[] v21={"outset","开始，开头",n,"0"};
    	String[] v22={"outshine","比...更好",v,"0"};
    	String[] v23={"outskirts","郊区，郊外",n,"0"};
    	String[] v24={"outspoken","直言不讳的",a,"0"};
    	String[] v25={"outstrip","超过，跑过",v,"0"};
    	String[] v26={"outwit","以机制胜过",v,"0"};
    	String[] v27={"ovation","热烈的欢迎，鼓掌",n,"0"};
    	String[] v28={"overbearing","专横的，独断的",a,"0"};
    	String[] v29={"overdose","过大的剂量",n,"0"};
    	String[] v30={"overdue","过期未付的，逾期的",a,"0"};
    	String[] v31={"overexposure","过分暴露，(照片)曝光过度",n,"0"};
    	String[] v32={"overflow","溢出，充满",v,"0"};
    	String[] v33={"overhaul","彻底检查，大修",v,"0"};
    	String[] v34={"overlap","(部分的)重叠",v,"0"};
    	String[] v35={"overlook","忽视，俯视",v,"0"};
    	String[] v36={"overpowering","压倒性的，不可抗拒的",a,"0"};
    	String[] v37={"overreach","做事过头",v,"0"};
    	String[] v38={"override","不理会，蹂躏践踏",v,"0"};
    	String[] v39={"overriding","最主要的，优先的",a,"0"};
    	String[] v40={"overrule","(上级对下级的)否决",v,"0"};
    	String[] v41={"oversee","监督",v,"0"};
    	String[] v42={"overshadow","遮蔽，使失色",v,"0"};
    	String[] v43={"overstate","言过其实",v,"0"};
    	String[] v44={"overt","公开的",a,"0"};
    	String[] v45={"overthrow","推翻，终止",n+v,"0"};
    	String[] v46={"overture","前奏曲，序曲",n,"0"};
    	String[] v47={"overturn","翻倒，推翻",v,"0"};
    	String[] v48={"overwhelm","泛滥，压倒",v,"0"};
    	String[] v49={"overwrought","紧张过度的，兴奋过度的",a,"0"};
    	String[] v50={"owl","猫头鹰",n,"0"};
    	String[] v51={"oxidize","氧化，生锈",v,"0"};
        String[] v52={"pacifist","反战主义者",n,"0"};
        String[] v53={"pacify","抚慰",v,"0"};
        String[] v54={"pack","狼群，一群动物",n,"0"};
        String[] v55={"packed","充满人的，拥挤的",a,"0"};
        String[] v56={"pact","协定，协约",n,"0"};
        String[] v57={"padding","衬垫，衬料",n,"0"};
        String[] v58={"paean","赞美歌，颂歌",n,"0"};
        String[] v59={"pagan","没有宗教信仰的人，异教徒",n,"0"};
        String[] v60={"pageant","壮观的游行，露天历史剧",n,"0"};		
    	String[] v61={"painkiller","止痛药",n,"0"};
        String[] v62={"painstaking","煞费苦心的",a,"0"};
       	String[] v63={"palate","上腭，口味，爱好",n,"0"};
       	String[] v64={"palatial","宫殿般的，宏伟的",a,"0"};
       	String[] v65={"palette","调色板，颜料配置",n,"0"};
       	String[] v66={"pall","令人发腻，失去吸引力",v,"0"};
        String[] v67={"palliate","减轻(痛苦)，掩饰(罪行)",v,"0"};
        String[] v68={"palliative","缓释剂；减轻的，缓和的",n+a,"0"};
        String[] v69={"pallid","苍白的，无血色的",a,"0"};
        String[] v70={"palmy","繁荣的，棕榈的",a,"0"};
    	String[] v71={"palpable","可触知的",a,"0"};
        String[] v72={"palpitate","(心脏)急速不规则的跳动",v,"0"};
       	String[] v73={"palter","含糊其词",v,"0"};
       	String[] v74={"paltry","无价值的，微不足道的",a,"0"};
       	String[] v75={"pamphlet","小册子",n,"0"};
        String[] v76={"pan","严厉批评",v,"0"};
        String[] v77={"panacea","万灵药",n,"0"};
        String[] v78={"panache","炫耀，羽饰",n,"0"};
        String[] v79={"pancreas","胰腺",n,"0"};
        String[] v80={"pandemic","(疾病)大范围流行的",a,"0"};
    	String[] v81={"pandemonium","喧嚣，大混乱",n,"0"};
        String[] v82={"panegyric","颂词，颂扬",n,"0"};
        String[] v83={"panel","专门小组，仪表板",n,"0"};
        String[] v84={"pang","一阵剧痛",n,"0"};
        String[] v85={"panic","恐慌(的)",n+a,"0"};
        String[] v86={"panorama","概观，全景",n,"0"};
        String[] v87={"panther","黑豹",n,"0"};
        String[] v88={"pantomime","哑剧",n,"0"};
        String[] v89={"pantry","食品室",n,"0"};
        String[] v90={"papyrus","莎草，莎草纸",n,"0"};
        String[] v91={"parable","寓言，比喻",n,"0"};
        String[] v92={"parabola","抛物线",n,"0"};
        String[] v93={"paradigm","范例，示范",n,"0"};
        String[] v94={"paradox","看似错误却正确的理论，与通常见解相反的观点",n,"0"};
        String[] v95={"paragon","模范，典型",n,"0"};
        String[] v96={"parallel","平行的，类似的；平行线；与...相似",a+n+v,"0"};
        String[] v97={"parallelism","平行，类似",n,"0"};
        String[] v98={"parameter","参量，变量",n,"0"};
        String[] v99={"paramount","最重要的，最高权力的",a,"0"};
        String[] v100={"paranoia","偏执狂，多疑症",n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"paranoid","偏执的，多疑的",a,"0"};
        	String[] v102={"paraphrase","解释，释义",v,"0"};
        	String[] v103={"parasite","食客，寄生物",n,"0"};
        	String[] v104={"parch","烘烤，烤焦",v,"0"};
        	String[] v105={"pare","削，修剪，缩减",v,"0"};
        	String[] v106={"pariah","贱民",n,"0"};
        	String[] v107={"parity","同等",n,"0"};
        	String[] v108={"parka","派克大衣",n,"0"};
        	String[] v109={"parlance","说法，用语",n,"0"};
        	String[] v110={"parody","模仿性的嘲弄文章或表演，拙劣的模仿",n,"0"};
        	String[] v111={"paroxysm","(感情的)突发",n,"0"};
        	String[] v112={"parquet","镶木地板",n,"0"};
        	String[] v113={"parry","挡开，避开",v,"0"};
        	String[] v114={"parse","对...做语法分析",v,"0"};
        	String[] v115={"parsimony","吝啬",n,"0"};
        	String[] v116={"partial","局部的，偏袒的",a,"0"};
        	String[] v117={"partiality","偏袒，偏心",n,"0"};
        	String[] v118={"particular","事实，细节",n,"0"};
        	String[] v119={"particularize","详述，列举",v,"0"};
        	String[] v120={"partisan","党徒，党派支持者",n,"0"};
        	String[] v121={"partition","隔开，隔墙",n,"0"};
        	String[] v122={"passionate","充满激情的",a,"0"};
        	String[] v123={"passive","被动的，缺乏活力的",a,"0"};
        	String[] v124={"pastel","彩色粉笔或蜡笔画，柔和的色彩",n,"0"};
        	String[] v125={"pasteurize","巴氏消毒",v,"0"};
        	String[] v126={"pastiche","混合拼凑的作品",n,"0"};
        	String[] v127={"pastoral","园里生活的，宁静的",a,"0"};
        	String[] v128={"pastry","糕点，点心",n,"0"};
        	String[] v129={"patch","补丁，一小片(土地)",n,"0"};
        	String[] v130={"patent","显而易见的；专利权",a+n,"0"};
        	String[] v131={"pathogen","病原体",n,"0"};
        	String[] v132={"pathology","病理学",n,"0"};
        	String[] v133={"patina","绿锈，光亮的外表",n,"0"};
        	String[] v134={"patrician","贵族",n,"0"};
        	String[] v135={"patrimony","祖传财产",n,"0"};
        	String[] v136={"patriot","爱国者",n,"0"};
        	String[] v137={"patriotism","爱国主义",n,"0"};
        	String[] v138={"patronage","赞助，惠顾",n,"0"};
        	String[] v139={"patronize","以高人一等的态度对待，惠顾",v,"0"};
        	String[] v140={"paucity","小量，缺乏",n,"0"};
        	String[] v141={"paunchy","大肚子的",a,"0"};
        	String[] v142={"pauper","贫民，乞丐",n,"0"};
        	String[] v143={"peak","憔悴，消瘦",v,"0"};
        	String[] v144={"pecan","山核桃",n,"0"};
        	String[] v145={"peccadillo","小过失",n,"0"};
        	String[] v146={"peck","啄食，轻啄",v,"0"};
        	String[] v147={"pedagogue","教师，教育者",n,"0"};
        	String[] v148={"pedagogy","教育学，教学法",n,"0"};
        	String[] v149={"pedal","踏板，脚蹬；骑脚踏车",n+v,"0"};
        	String[] v150={"pedant","迂腐之人，书呆子",n,"0"};
        	String[] v151={"pedestal","基座",n,"0"};
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    	
    	
    }
    private void doList_27(){
    	String[] v1={"pedestrian","徒步的，缺乏想象的；行人",a+n,"0"};
    	String[] v2={"pediatrics","小儿科",n,"0"};
    	String[] v3={"peel","剥...的皮；外皮",v+n,"0"};
    	String[] v4={"peer","同等之人，同辈",n,"0"};
    	String[] v5={"peerless","无可匹敌的",a,"0"};
    	String[] v6={"peeve","使气恼，怨恨",v,"0"};
    	String[] v7={"peevish","坏脾气的",a,"0"};
    	String[] v8={"pejorative","带轻蔑的，贬低的",a,"0"};
    	String[] v9={"pelf","钱财，不义之财",n,"0"};
    	String[] v10={"pell-mell","混乱地",d,"0"};
    	String[] v11={"pellucid","清晰的，清澈的",a,"0"};
    	String[] v12={"pen","围栏，监禁，母天鹅",n,"0"};
    	String[] v13={"penalize","置...于不利地位，处罚",v,"0"};
    	String[] v14={"penalty","刑罚，处罚",n,"0"};
    	String[] v15={"penance","自我惩罚",n,"0"};
    	String[] v16={"penchant","爱好，嗜好",n,"0"};
    	String[] v17={"pending","即将发生的，未决的",a,"0"};
    	String[] v18={"pendulum","摆，钟摆",n,"0"};
    	String[] v19={"penetrate","刺穿，渗入，了解",v,"0"};
    	String[] v20={"peninsula","半岛",n,"0"};
    	String[] v21={"penitent","后悔的，忏悔的",a,"0"};
    	String[] v22={"pennant","(船上的)信号旗",n,"0"};
    	String[] v23={"penultimate","倒数第二的",a,"0"};
    	String[] v24={"penury","贫穷，吝啬",n,"0"};
    	String[] v25={"perambulate","巡视，漫步",v,"0"};
    	String[] v26={"perception","感觉，洞察力",n,"0"};
    	String[] v27={"perch","栖息",v,"0"};
    	String[] v28={"percussionist","敲击乐器的乐师",n,"0"};
    	String[] v29={"peregrination","游历",n,"0"};
    	String[] v30={"peremptory","不容反抗的，专横的",a,"0"};
    	String[] v31={"perennial","终年的，永久的",a,"0"};
    	String[] v32={"perfervid","非常热心的",a,"0"};
    	String[] v33={"perfidious","不忠的，背信弃义的",a,"0"};
    	String[] v34={"perfidy","不忠，背叛",n,"0"};
    	String[] v35={"perforate","打洞",v,"0"};
    	String[] v36={"perfunctory","草率的",a,"0"};
    	String[] v37={"peril","危险",n,"0"};
    	String[] v38={"perilous","危险的，冒险的",a,"0"};
    	String[] v39={"perimeter","周长",n,"0"};
    	String[] v40={"periodical","期刊",n,"0"};
    	String[] v41={"peripatetic","巡游的",a,"0"};
    	String[] v42={"peripheral","不重要的，外围的",a,"0"};
    	String[] v43={"periphery","不重要的部分，外围",n,"0"};
    	String[] v44={"periscope","潜望镜",n,"0"};
    	String[] v45={"perish","死，消亡",v,"0"};
    	String[] v46={"perishing","严寒的",a,"0"};
    	String[] v47={"perjure","作伪证，发假誓",v,"0"};
    	String[] v48={"perjury","作伪证，发假誓",n,"0"};
    	String[] v49={"perky","神奇的，活泼的",a,"0"};
    	String[] v50={"permanent","长久的，永久的",a,"0"};
    	String[] v51={"permeable","可渗透的",a,"0"};
        String[] v52={"permeate","扩散，渗透",v,"0"};
        String[] v53={"permissive","过分纵容的",a,"0"};
        String[] v54={"pernicious","有害的，致命的",a,"0"};
        String[] v55={"perpendidcular","垂直的",a,"0"};
        String[] v56={"perpetual","连续不断的，永久的",a,"0"};
        String[] v57={"perpetuate","使永存，使永记不忘",v,"0"};
        String[] v58={"perquisite","固定津贴，利益",n,"0"};
        String[] v59={"persecute","迫害",v,"0"};
        String[] v60={"persiflage","挖苦，嘲弄",n,"0"};		
    	String[] v61={"personable","英俊的，风度好的",a,"0"};
        String[] v62={"personification","典型，化身，完美榜样",n,"0"};
       	String[] v63={"personnel","全体人员，员工",n,"0"};
       	String[] v64={"perspective","(看待事物的)角度，方法",n,"0"};
       	String[] v65={"perspicacious","独具慧眼的",a,"0"};
       	String[] v66={"perspicuity","明晰，聪明睿智",n,"0"};
        String[] v67={"perspicuous","明晰的，明了的",a,"0"};
        String[] v68={"perspire","流汗",v,"0"};
        String[] v69={"pertain","属于",v,"0"};
        String[] v70={"pertinacious","固执的，无法驾驭的，不妥协的",a,"0"};
    	String[] v71={"pertinent","有关的，相关的",a,"0"};
        String[] v72={"peruse","细读，精读",v,"0"};
       	String[] v73={"pervade","弥漫，普及",v,"0"};
       	String[] v74={"pervious","可渗透的",a,"0"};
       	String[] v75={"pessimism","悲观，悲观主义",n,"0"};
        String[] v76={"pest","害虫，令人讨厌的人或物",n,"0"};
        String[] v77={"pester","纠缠，强求",v,"0"};
        String[] v78={"pesticide","杀虫剂",n,"0"};
        String[] v79={"pestilent","致死的，有害的",a,"0"};
        String[] v80={"pestle","杵，乳钵槌",n,"0"};
    	String[] v81={"petal","花瓣",n,"0"};
        String[] v82={"petition","情愿，请愿书",n,"0"};
        String[] v83={"petitioner","情愿人",n,"0"};
        String[] v84={"petrify","石化，吓呆",v,"0"};
        String[] v85={"petroglyph","岩石雕刻",n,"0"};
        String[] v86={"petroleum","石油",n,"0"};
        String[] v87={"petrology","岩石学",n,"0"};
        String[] v88={"petty","琐碎的",a,"0"};
        String[] v89={"petulance","发脾气，性急",n,"0"};
        String[] v90={"petulant","性急的，暴躁的",a,"0"};
        String[] v91={"phantom","幽灵，幻象",n,"0"};
        String[] v92={"pharmaceutical","制药的",a,"0"};
        String[] v93={"phenomena","现象",n,"0"};
        String[] v94={"phenomenal","显著的",a,"0"};
        String[] v95={"philanthropic","博爱的",a,"0"};
        String[] v96={"philatelist","集邮家",n,"0"};
        String[] v97={"philately","集邮",n,"0"};
        String[] v98={"philistine","庸人，市侩",n,"0"};
        String[] v99={"phlegmatic","冷静的，冷淡的",a,"0"};
        String[] v100={"phoenix","凤凰，永生或再生的象征",n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"phonetic","语音的",a,"0"};
        	String[] v102={"photosynthesis","光合作用",n,"0"};
        	String[] v103={"physiological","生理的，生理学上的",a,"0"};
        	String[] v104={"piano","轻柔的",a,"0"};
        	String[] v105={"pictorial","绘画的，有图片的，用图片表示的",a,"0"};
        	String[] v106={"piddling","琐碎的，微不足道的",a,"0"};
        	String[] v107={"pied","杂色的",a,"0"};
        	String[] v108={"pierce","刺透，穿过",v,"0"};
        	String[] v109={"piercing","刺骨的，敏锐的",a,"0"};
        	String[] v110={"pigment","天然色素，干粉颜料",n,"0"};
        	String[] v111={"pilgrim","朝圣客，香客",n,"0"};
        	String[] v112={"pillar","柱子",n,"0"};
        	String[] v113={"pillory","颈手枷，示众，嘲弄",n,"0"};
        	String[] v114={"pilot","飞行员，领航员，领导人",n,"0"};
        	String[] v115={"pinch","捏，掐；一撮，一点",v+n,"0"};
        	String[] v116={"pine","松树，憔悴",n,"0"};
        	String[] v117={"pinnacle","尖塔，山峰，顶峰",n,"0"};
        	String[] v118={"pinpoint","精确的找出或描述；非常精确的",v+a,"0"};
        	String[] v119={"pious","虔诚的，尽责的",a,"0"};
        	String[] v120={"piquant","辛辣的，开胃的，兴奋的",a,"0"};
        	String[] v121={"pique","(自尊受伤害而)不悦，愤怒；冒犯",n+v,"0"};
        	String[] v122={"pirate","海盗，剽窃者；盗印，掠夺",n+v,"0"};
        	String[] v123={"pirouette","(舞蹈)脚尖着地的旋转",v+n,"0"};
        	String[] v124={"pistol","手枪",n,"0"};
        	String[] v125={"pitch","沥青，柏油，音调",n,"0"};
        	String[] v126={"pitcher","有柄水罐",n,"0"};
        	String[] v127={"pitfall","陷阱，未料到的危险或困难",n,"0"};
        	String[] v128={"pith","精髓，要点",n,"0"};
        	String[] v129={"pithiness","简洁",n,"0"};
        	String[] v130={"pithy","简练的",a,"0"};
        	String[] v131={"pitiful","值得同情的",a,"0"};
        	String[] v132={"pittance","微薄的薪俸",n,"0"};
        	String[] v133={"placate","抚慰，平息",v,"0"};
        	String[] v134={"placebo","安慰剂",n,"0"};
        	String[] v135={"placid","安静的，平和的",a,"0"};
        	String[] v136={"plagiarism","剽窃，抄袭",n,"0"};
        	String[] v137={"plagiarize","剽窃，抄袭",v,"0"};
        	String[] v138={"plague","瘟疫，讨厌的人或物；烦扰",n+v,"0"};
        	String[] v139={"plain","简单的，清楚的；平原",a+n,"0"};
        	String[] v140={"plaintiff","原告",n,"0"};
        	String[] v141={"plaintive","可怜的，伤心的",a,"0"};
        	String[] v142={"plait","发辫；编成辫",n+v,"0"};
        	String[] v143={"plane","刨子，平面；刨",n+v,"0"};
        	String[] v144={"plangent","轰鸣的，悲哀的",a,"0"};
        	String[] v145={"plankton","浮游生物",n,"0"};
        	String[] v146={"plaster","灰泥，石膏；抹灰泥",n+v,"0"};
        	String[] v147={"plateau","高原，平稳的状态",n,"0"};
        	String[] v148={"platitude","陈词滥调",n,"0"};
        	String[] v149={"platonic","理论的，纯精神的，无感官欲望的",a,"0"};
        	String[] v150={"plaudit","喝彩，赞扬",v,"0"};
        	String[] v151={"plausible","表面上看起来有道理的",a,"0"};
        	String[] v152={"plead","恳求，提出...为理由",v,"0"};
        	String[] v153={"pleat","(衣服上的)褶",n,"0"};
        	String[] v154={"pledge","誓言，保证；发誓",n+v,"0"};
        	String[] v155={"plenitude","完全，大量",n,"0"};
        	String[] v156={"plethora","过量，过剩",n,"0"};
        	String[] v157={"pliable","易弯的，柔软的",a,"0"};
        	String[] v158={"pliant","易受影响的，易弯的",a,"0"};
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);

        	
    	
    }
    private void doList_28(){
    	String[] v1={"plight","困境，苦境",n,"0"};
    	String[] v2={"plinth","柱脚，底座",n,"0"};
    	String[] v3={"plod","重步走",v,"0"};
    	String[] v4={"plot","情节，阴谋，策划",n,"0"};
    	String[] v5={"plough","犁",n+v,"0"};
    	String[] v6={"ploy","花招，策略",n,"0"};
    	String[] v7={"pluck","勇气，精力；拔毛，弹拉",n+v,"0"};
    	String[] v8={"plumb","精确地；垂直的；深入了解，测水深",d+a+v,"0"};
    	String[] v9={"plumber","管工",n,"0"};
    	String[] v10={"plume","羽毛；整理羽毛，搔首弄姿",n+v,"0"};
    	String[] v11={"plummet","(垂直或突然)坠下",v,"0"};
    	String[] v12={"plunder","掠夺",v,"0"};
    	String[] v13={"plunge","投入",v,"0"};
    	String[] v14={"plush","豪华的",a,"0"};
    	String[] v15={"plutocracy","财阀统治",n,"0"};
    	String[] v16={"pod","豆荚；剥(豆荚)",n+v,"0"};
    	String[] v17={"podiatrist","足病医生",n,"0"};
    	String[] v18={"podium","讲坛，指挥台",n,"0"};
    	String[] v19={"poignant","伤心的，尖锐的",a,"0"};
    	String[] v20={"poise","使平衡、相等；泰然自若",v+n,"0"};
    	String[] v21={"poisonous","有毒的，有害的",a,"0"};
    	String[] v22={"poke","刺，戳",v,"0"};
    	String[] v23={"polar","两极的，磁极的，地级的",a,"0"};
    	String[] v24={"polarity","极端性，两极分化",n,"0"};
    	String[] v25={"polarize","使...两极分化",v,"0"};
    	String[] v26={"polemic","论战",n,"0"};
    	String[] v27={"polemical","挑起论战的",a,"0"};
    	String[] v28={"polish","擦亮，抛光；上光剂，优雅",v+n,"0"};
    	String[] v29={"poll","民意测验，选举投票",n,"0"};
    	String[] v30={"pollen","花粉",n,"0"};
    	String[] v31={"pollinate","给...授粉",v,"0"};
    	String[] v32={"pollster","民意测验家",n,"0"};
    	String[] v33={"pomposity","自大的行为，傲慢，自命不凡",n,"0"};
    	String[] v34={"pompous","自大的",a,"0"};
    	String[] v35={"poncho","斗篷，雨衣",n,"0"};
    	String[] v36={"ponder","仔细考虑",v,"0"};
    	String[] v37={"ponderable","可估量的",a,"0"};
    	String[] v38={"ponderous","笨重的",a,"0"};
    	String[] v39={"pontifical","自以为是的，武断的",a,"0"};
    	String[] v40={"pontificate","自大或武断的做或说",v,"0"};
    	String[] v41={"populace","民众，老百姓",n,"0"};
    	String[] v42={"populous","人口稠密的",a,"0"};
    	String[] v43={"porcelain","瓷器",n,"0"};
    	String[] v44={"porcupine","豪猪",n,"0"};
    	String[] v45={"pore","毛孔，气孔",n,"0"};
    	String[] v46={"porous","多孔的，可渗透的",a,"0"};
    	String[] v47={"portentous","凶兆的，有危险的",a,"0"};
    	String[] v48={"portfolio","文件夹，股份单",n,"0"};
    	String[] v49={"portray","描绘，描述",v,"0"};
    	String[] v50={"pose","摆姿势，造作",v,"0"};
    	String[] v51={"poseur","装模作样的人",n,"0"};
        String[] v52={"posit","断定，认为",v,"0"};
        String[] v53={"posse","武装团队",n,"0"};
        String[] v54={"possessed","着迷的，疯狂的",a,"0"};
        String[] v55={"poster","海报",n,"0"};
        String[] v56={"postpone","推迟",v,"0"};
        String[] v57={"postulate","假定，要求",v,"0"};
        String[] v58={"posture","姿势，态度；故作姿态",n+v,"0"};
        String[] v59={"potable","适于饮用的",a,"0"};
        String[] v60={"potation","畅饮，饮料",n,"0"};		
    	String[] v61={"potentate","统治者",n,"0"};
        String[] v62={"potential","潜在的",a,"0"};
       	String[] v63={"potentiate","加强",v,"0"};
       	String[] v64={"potpourri","混杂，杂文集",n,"0"};
       	String[] v65={"pottery","制陶，陶器",n,"0"};
       	String[] v66={"pout","噘嘴，板脸",v,"0"};
        String[] v67={"practitioner","开业者，手艺人",n,"0"};
        String[] v68={"pragmatic","实际的，实用主义的",a,"0"};
        String[] v69={"prank","恶作剧",n,"0"};
        String[] v70={"prate","胡说，瞎扯",v,"0"};
    	String[] v71={"preach","传教，讲道",v,"0"};
        String[] v72={"preamble","前言，序言",n,"0"};
       	String[] v73={"precarious","根据不足的，靠不住的，危险的",a,"0"};
       	String[] v74={"precede","早于，在...之前",v,"0"};
       	String[] v75={"precept","箴言",n,"0"};
        String[] v76={"precipice","悬崖",n,"0"};
        String[] v77={"precipitant","沉淀剂",n,"0"};
        String[] v78={"precipitate","加速，促成；鲁莽的",v+a,"0"};
        String[] v79={"precipitation","降水",n,"0"};
        String[] v80={"precis","摘要，大纲",n,"0"};
    	String[] v81={"preclude","避免，排除",v,"0"};
        String[] v82={"precocious","早熟的",a,"0"};
        String[] v83={"precursor","先驱",n,"0"};
        String[] v84={"predator","食肉动物",n,"0"};
        String[] v85={"predecessor","前任，前辈，原先的东西",n,"0"};
        String[] v86={"predestine","注定",v,"0"};
        String[] v87={"predicament","困境，窘境",n,"0"};
        String[] v88={"predilection","偏袒，爱好",n,"0"};
        String[] v89={"predisposition","倾向，癖性",n,"0"};
        String[] v90={"predominant","有势力的",a,"0"};
        String[] v91={"predominate","支配，统治，占优势",v,"0"};
        String[] v92={"preeminent","出类拔萃的",a,"0"};
        String[] v93={"preempt","以优先买权取得，取代",v,"0"};
        String[] v94={"preen","整理羽毛，打扮",v,"0"};
        String[] v95={"preface","序言",n,"0"};
        String[] v96={"pregnant","怀孕的，充满的",a,"0"};
        String[] v97={"prehistoric","史前的",a,"0"};
        String[] v98={"prejudice","偏见，成见；使产生偏见",v,"0"};
        String[] v99={"preliminary","预备的，初步的",a,"0"};
        String[] v100={"preliterate","文字出现以前的",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"prelude","序幕，前奏",n,"0"};
        	String[] v102={"premature","过早的，早熟的",a,"0"};
        	String[] v103={"premeditate","预先计划",v,"0"};
        	String[] v104={"premeditated","预先计划的",a,"0"};
        	String[] v105={"premiere","首次公演",n+v,"0"};
        	String[] v106={"premise","前提",n,"0"};
        	String[] v107={"premium","保险费，奖金",n,"0"};
        	String[] v108={"premonition","预感，预兆",n,"0"};
        	String[] v109={"preoccupation","全神贯注，使人专注的东西",n,"0"};
        	String[] v110={"preponderate","压倒，超过",v,"0"};
        	String[] v111={"preposition","介词，前置词",n,"0"};
        	String[] v112={"preposterous","荒谬的",a,"0"};
        	String[] v113={"prerequisite","先决条件",n,"0"};
        	String[] v114={"prerogative","特权",n,"0"};
        	String[] v115={"presage","预感；预示",n+v,"0"};
        	String[] v116={"prescience","预知，先见",n,"0"};
        	String[] v117={"prescribe","开处方，规定",v,"0"};
        	String[] v118={"prescription","处方(上的药)",n,"0"};
        	String[] v119={"presentation","表演，介绍",n,"0"};
        	String[] v120={"presenter","主持人",n,"0"};
        	String[] v121={"preservative","防腐的；防腐剂",a+n,"0"};
        	String[] v122={"preside","担任主席，负责，指挥",v,"0"};
        	String[] v123={"press","挤压",v,"0"};
        	String[] v124={"pressing","紧迫的，迫切的，恳切要求的",a,"0"};
        	String[] v125={"prestige","威信，威望",n,"0"};
        	String[] v126={"prestigious","有威望的",a,"0"};
        	String[] v127={"presume","假定",v,"0"};
        	String[] v128={"presumption","冒昧，专横",n,"0"};
        	String[] v129={"presupposition","臆测",n,"0"};
        	String[] v130={"pretend","假装，装扮",v,"0"};
        	String[] v131={"pretension","自命不凡，夸耀",n,"0"};
        	String[] v132={"pretentious","自抬身价的",a,"0"};
        	String[] v133={"preternatural","异常的，超自然的",a,"0"};
        	String[] v134={"pretext","借口",n,"0"};
        	String[] v135={"prevail","战胜，盛行",v,"0"};
        	String[] v136={"prevaricate","支吾其词，说谎",v,"0"};
        	String[] v137={"preview","预演，预展",v+n,"0"};
        	String[] v138={"previous","之前的",a,"0"};
        	String[] v139={"prey","被捕食的动物",n,"0"};
        	String[] v140={"prim","端庄整洁的",a,"0"};
        	String[] v141={"primate","灵长类(动物)",n,"0"};
        	String[] v142={"prime","全盛时期；最初的，原始的，最好的",a,"0"};
        	String[] v143={"primp","(妇女)刻意打扮",v,"0"};
        	String[] v144={"principal","主要的，重要的",a,"0"};
        	String[] v145={"principle","原则，原理，道德准则",n,"0"};
        	String[] v146={"priority","在先，居前",n,"0"};
        	String[] v147={"pristine","太古的，纯洁的，新鲜的",a,"0"};
        	
        	
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    
        	
    }
    private void doList_29(){
        String[] v1={"privation","丧失，贫困",n,"0"};
    	String[] v2={"privilege","特权",n,"0"};
    	String[] v3={"probe","探索",v,"0"};
    	String[] v4={"probity","刚直",n,"0"};
    	String[] v5={"proboscis","(象)长鼻，(昆虫)吸管",n,"0"};
    	String[] v6={"proceeds","收入",n,"0"};
    	String[] v7={"procession","行列，前进",n,"0"};
    	String[] v8={"proclaim","宣告，宣布，显示",v,"0"};
    	String[] v9={"procrastinate","耽搁，拖延",v,"0"};
    	String[] v10={"proctor","代理人，学监",n,"0"};
    	String[] v11={"procure","取得，获得",v,"0"};
    	String[] v12={"prod","刺，捅，激励",v,"0"};
    	String[] v13={"prodigal","挥霍的；挥霍着",a+n,"0"};
    	String[] v14={"prodigious","巨大的",a,"0"};
    	String[] v15={"prodigy","奇事，奇才",n,"0"};
    	String[] v16={"produce","产品，农产品",n,"0"};
    	String[] v17={"productivity","生产力，生产率",n,"0"};
    	String[] v18={"profane","亵渎，玷污",v,"0"};
    	String[] v19={"proffer","献出，赠送，提议",n+v,"0"};
    	String[] v20={"proficient","熟练的，精通的",a,"0"};
    	String[] v21={"profile","外形，轮廓侧面像",n,"0"};
    	String[] v22={"profiteer","奸商，牟取暴利者",n,"0"};
    	String[] v23={"profligate","挥金如土的；挥霍者",a+n,"0"};
    	String[] v24={"profound","深的，深刻的，渊博的，深奥的",a,"0"};
    	String[] v25={"profuse","很多的，浪费的",a,"0"};
    	String[] v26={"progeny","后代，子女",n,"0"};
    	String[] v27={"prognosis","预后，对疾病发作及结果的预言",n,"0"};
    	String[] v28={"prohibitive","抑制的，价格超出承受范围的",a,"0"};
    	String[] v29={"projectile","抛射物，发射体",n,"0"};
    	String[] v30={"projection","突出物",n,"0"};
    	String[] v31={"projector","电影放映机，幻灯机",n,"0"};
    	String[] v32={"proliferate","繁殖，激增",v,"0"};
    	String[] v33={"prolific","多产的",a,"0"};
    	String[] v34={"prolix","啰嗦的，冗长的",a,"0"};
    	String[] v35={"prolixity","啰嗦",n,"0"};
    	String[] v36={"prologue","开场白，序幕",n,"0"};
    	String[] v37={"prolong","延长，拉长",v,"0"};
    	String[] v38={"promenade","散步，兜风",n+v,"0"};
    	String[] v39={"prominent","显著的，著名的",a,"0"};
    	String[] v40={"promote","提升，促进",v,"0"};
    	String[] v41={"prompt","促使，激起；敏捷的，迅速的",v+a,"0"};
    	String[] v42={"promulgate","颁布，宣传",v,"0"};
    	String[] v43={"prone","俯卧的，倾向于...的",a,"0"};
    	String[] v44={"pronounced","(观点)明确的，明显的",a,"0"};
    	String[] v45={"prop","支撑物，靠山；支持",n+v,"0"};
    	String[] v46={"propagate","繁殖，传播",v,"0"};
    	String[] v47={"propel","推进",v,"0"};
    	String[] v48={"propensity","嗜好，习性",n,"0"};
    	String[] v49={"prophecy","预言",n,"0"};
    	String[] v50={"prophet","先知，预言家",n,"0"};
    	String[] v51={"prophetic","预示的，先知的",a,"0"};
        String[] v52={"propitiate","讨好，抚慰",v,"0"};
        String[] v53={"propitious","吉利的，有利的",a,"0"};
        String[] v54={"proposal","提案，建议",n,"0"};
        String[] v55={"proposition","看法，提议",n,"0"};
        String[] v56={"proprietary","私有的",a,"0"};
        String[] v57={"propriety","礼节，适当",n,"0"};
        String[] v58={"propulsion","推进力",n,"0"};
        String[] v59={"prosaic","单调的，无趣的",a,"0"};
        String[] v60={"proscribe","禁止",v,"0"};		
    	String[] v61={"prose","散文",n,"0"};
        String[] v62={"prosecute","告发，检举",v,"0"};
       	String[] v63={"prosecution","起诉，实行，经营",n,"0"};
       	String[] v64={"proselytize","使...皈依",v,"0"};
       	String[] v65={"prospect","勘探；期望，前景",v+n,"0"};
       	String[] v66={"prosperity","繁荣，幸运，健康",n,"0"};
        String[] v67={"prosperous","繁荣富强的",a,"0"};
        String[] v68={"prostrate","俯卧的，沮丧的；使跪下，鞠躬",a+v,"0"};
        String[] v69={"protagonist","提议者，支持者",n,"0"};
        String[] v70={"protean","变化多端的，多变的",a,"0"};
    	String[] v71={"protest","抗议，反对",n,"0"};
        String[] v72={"protocol","外交礼节，协议，草案",n,"0"};
       	String[] v73={"prototype","原型，典型",n,"0"};
       	String[] v74={"protract","延长，拖长",v,"0"};
       	String[] v75={"protuberant","凸出的，隆起的",a,"0"};
        String[] v76={"provenance","(艺术等)出处，起源",n,"0"};
        String[] v77={"provender","草料，粮秣",n,"0"};
        String[] v78={"provident","深谋远虑的，节俭的",a,"0"};
        String[] v79={"providential","幸运的，恰到好处的",a,"0"};
        String[] v80={"provincial","偏狭的",a,"0"};
    	String[] v81={"provision","(粮食)供应，条款",n,"0"};
        String[] v82={"provisional","暂时的",a,"0"};
        String[] v83={"provisory","有附带条件的",a,"0"};
        String[] v84={"provocation","挑衅，激怒",n,"0"};
        String[] v85={"prowess","勇敢，不凡的能力",n,"0"};
        String[] v86={"prowl","潜行",v,"0"};
        String[] v87={"proximate","即将来临的",a,"0"};
        String[] v88={"prude","过分守礼的人",n,"0"};
        String[] v89={"prudent","审慎的，精明的",a,"0"};
        String[] v90={"prudish","过分守礼的，假道学的",a,"0"};
        String[] v91={"prune","梅干；修剪",n+v,"0"};
        String[] v92={"pry","刺探，撬开",v,"0"};
        String[] v93={"pseudonym","假名，笔名",n,"0"};
        String[] v94={"psyche","心智，精神",n,"0"};
        String[] v95={"psychology","心理学，心理状态",n,"0"};
        String[] v96={"publicize","引人注意，宣传",v,"0"};
        String[] v97={"pucker","起皱；皱褶",v+n,"0"};
        String[] v98={"puckish","淘气的",a,"0"};
        String[] v99={"puddle","水坑，洼",n,"0"};
        String[] v100={"puerile","幼稚的，儿童的",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"pugilism","搏击",n,"0"};
        	String[] v102={"pugilist","拳师",n,"0"};
        	String[] v103={"pugnacious","好斗的",a,"0"};
        	String[] v104={"puissance","权力",n,"0"};
        	String[] v105={"puissant","强大的",a,"0"};
        	String[] v106={"pulchritude","美丽",n,"0"};
        	String[] v107={"pullet","小母鸡",n,"0"};
        	String[] v108={"pulley","滑轮，滑车",n,"0"};
        	String[] v109={"pulp","果肉酱，纸浆",n,"0"};
        	String[] v110={"pulse","搏动，跳动；脉搏，脉冲",v+n,"0"};
        	String[] v111={"pulverize","压成粉，彻底击败",v,"0"};
        	String[] v112={"pun","双关语",n,"0"};
        	String[] v113={"punch","以拳猛击，打洞",v,"0"};
        	String[] v114={"punctilious","谨小慎微的",a,"0"};
        	String[] v115={"puncture","刺穿，刺破；刺孔，穿孔",v+n,"0"};
        	String[] v116={"pundit","专家，权威人士",n,"0"};
        	String[] v117={"pungent","味道刺激的，苛刻的",a,"0"};
        	String[] v118={"puny","弱小的，发育不良的",a,"0"};
        	String[] v119={"purchase","(阻止下滑的)支点",n,"0"};
        	String[] v120={"purgative","泻药",n,"0"};
        	String[] v121={"purgatory","炼狱，受苦受难的地方",n,"0"};
        	String[] v122={"purge","清洗，洗涤",v,"0"};
        	String[] v123={"purify","使洁净，净化",v,"0"};
        	String[] v124={"purity","纯净，纯度",n,"0"};
        	String[] v125={"purlieu","邻近地区",n,"0"};
        	String[] v126={"purloin","偷窃",v,"0"};
        	String[] v127={"purported","号称的，谣传的",a,"0"};
        	String[] v128={"pursue","追求",v,"0"};
        	String[] v129={"purvey","(大量)供给",v,"0"};
        	String[] v130={"pusillanimous","胆小的",a,"0"};
        	String[] v131={"pylon","高压电线架，桥塔",n,"0"};
        	String[] v132={"pyre","火葬用的柴堆",n,"0"};
        	String[] v133={"quack","冒充内行之人，庸医",n,"0"};
        	String[] v134={"quaff","痛饮，畅饮",v,"0"};
        	String[] v135={"quail","畏惧，颤抖",v,"0"};
        	String[] v136={"quaint","离奇有趣的",a,"0"};
        	String[] v137={"qualified","有资格的，有限制的",a,"0"};
        	String[] v138={"qualms","疑虑",n,"0"};
        	String[] v139={"quandary","困惑，进退两难",n,"0"};
        	String[] v140={"quantum","量子",n,"0"};
        	String[] v141={"quarantine","隔离检疫期，隔离",n,"0"};
        	String[] v142={"quarry","猎物",n,"0"};
        	String[] v143={"quartet","四重奏，四重唱",n,"0"};
        	String[] v144={"quash","镇压，取消",v,"0"};
        	String[] v145={"quaver","发颤音，颤抖；颤音",v+n,"0"};
        	String[] v146={"quay","码头",n,"0"};
        	String[] v147={"quell","制止，镇压",v,"0"};
        	String[] v148={"quench","熄灭，抑制",v,"0"};
        	String[] v149={"querulous","抱怨的，多牢骚的",a,"0"};
        	String[] v150={"quest","探求",v+n,"0"};
        	
        	
        	
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		
        	
    }
    private void doList_30(){
    	String[] v1={"queue","排队；长队",v+n,"0"};
    	String[] v2={"quibble","遁词，吹毛求疵的反对意见",n,"0"};
    	String[] v3={"quiescent","不动的，静止的",a,"0"};
    	String[] v4={"quill","(豪猪等动物的)刺",n,"0"};
    	String[] v5={"quirk","奇事，怪癖",n,"0"};
    	String[] v6={"quisling","卖国贼，内奸",n,"0"};
    	String[] v7={"quiver","箭筒，箭囊",n,"0"};
    	String[] v8={"quixotic","不切实际的",a,"0"};
    	String[] v9={"quota","定额，配额",n,"0"};
    	String[] v10={"quote","引用，引述",v,"0"};
    	String[] v11={"quotidian","每日的，平凡的",a,"0"};
    	String[] v12={"rabble","乌合之众，下等人",n,"0"};
    	String[] v13={"rabid","患狂犬病的，失去理性的",a,"0"};
    	String[] v14={"rabies","狂犬病",n,"0"};
    	String[] v15={"ranonteur","善于讲故事的人",n,"0"};
    	String[] v16={"racy","活泼的，生动的",a,"0"};
    	String[] v17={"radius","半径",n,"0"};
    	String[] v18={"raffish","粗俗的，俗艳的",a,"0"};
    	String[] v19={"raffle","抽奖",n,"0"};
    	String[] v20={"rafter","椽子",n,"0"};
    	String[] v21={"rag","旧布，碎布，破旧衣服",n,"0"};
    	String[] v22={"ragged","破烂的",a,"0"};
    	String[] v23={"raid","突然袭击",n,"0"};
    	String[] v24={"rail","栏杆，铁轨；咒骂，猛烈指责",n+v,"0"};
    	String[] v25={"raisin","葡萄干",n,"0"};
    	String[] v26={"rakish","潇洒的，放荡的",a,"0"};
    	String[] v27={"rally","召集，集会",n+v,"0"};
    	String[] v28={"ram","公羊，撞击，猛击",n,"0"};
    	String[] v29={"ramble","漫步",n+v,"0"};
    	String[] v30={"rambunctious","骚乱的，(兴奋)失控的",a,"0"};
    	String[] v31={"ramify","分支，分叉",v,"0"};
    	String[] v32={"rampage","狂暴的乱冲；暴怒",v+n,"0"};
    	String[] v33={"rampant","蔓生的，猖獗的",a,"0"};
    	String[] v34={"rampart","壁垒，城墙",n,"0"};
    	String[] v35={"ramshakle","摇摇欲坠的",a,"0"};
    	String[] v36={"rancid","不新鲜的，变味的",a,"0"};
    	String[] v37={"rancor","深仇，怨恨",n,"0"};
    	String[] v38={"random","没有目的的，偶然的，随便的",a,"0"};
    	String[] v39={"ranger","森林管理员，巡逻骑警",n,"0"};
    	String[] v40={"rankle","怨恨，激怒",v,"0"};
    	String[] v41={"ransom","赎金，赎身；赎回",n+v,"0"};
    	String[] v42={"rant","咆哮，口出狂言",v,"0"};
    	String[] v43={"rapacious","强夺的，贪婪的",a,"0"};
    	String[] v44={"rapids","急流，湍流",n,"0"};
    	String[] v45={"rapport","和睦，一致",n,"0"};
    	String[] v46={"rapprochement","和好，和睦",n,"0"};
    	String[] v47={"rapt","专心致志的",a,"0"};
    	String[] v48={"rarefaction","稀薄",n,"0"};
    	String[] v49={"raspy","刺耳的，恼人的",a,"0"};
    	String[] v50={"ratification","正式批准",n,"0"};
    	String[] v51={"ratiocination","推理，推论",n,"0"};
        String[] v52={"ration","配给",n+v,"0"};
        String[] v53={"rational","理性的，合理的",a,"0"};
        String[] v54={"rattle","使咯咯作响，使慌乱",v,"0"};
        String[] v55={"raucous","沙哑的，粗糙的",a,"0"};
        String[] v56={"ravage","摧毁，使荒废",v,"0"};
        String[] v57={"rave","热切赞扬；狂语",n+v,"0"};
        String[] v58={"ravel","纠缠，纠结；拆开，拆散",v,"0"};
        String[] v59={"ravenous","饿极了的，贪婪的",a,"0"};
        String[] v60={"ravishing","令人陶醉的",a,"0"};		
    	String[] v61={"raze","彻底破坏",v,"0"};
        String[] v62={"razor","剃须刀",n,"0"};
       	String[] v63={"reactant","反应物",n,"0"};
       	String[] v64={"reactionary","保守的，反动的",a,"0"};
       	String[] v65={"readily","不迟疑的，迅速的，轻易的",d,"0"};
       	String[] v66={"ready","机敏的，迅速的",a,"0"};
        String[] v67={"reagent","试剂",n,"0"};
        String[] v68={"realign","重新组合(排列)",v,"0"};
        String[] v69={"realm","王国，领域，范围",n,"0"};
        String[] v70={"ream","令(纸张的计数单位)",n,"0"};
    	String[] v71={"reap","收割，收获",v,"0"};
        String[] v72={"rebate","折扣，回扣",n,"0"};
       	String[] v73={"rebellious","反抗的，难控制的",a,"0"};
       	String[] v74={"rebuff","断然拒绝",v,"0"};
       	String[] v75={"rebuke","指责，谴责",v,"0"};
        String[] v76={"rebus","字谜，画谜",n,"0"};
        String[] v77={"rebuttal","反驳，反证",n,"0"};
        String[] v78={"recalcitrant","顽抗的",a,"0"};
        String[] v79={"recall","回想，收回；唤回",v+n,"0"};
        String[] v80={"recant","改变，放弃",v,"0"};
    	String[] v81={"recantation","改变宗教信仰",n,"0"};
        String[] v82={"recapitulate","扼要重述",v,"0"};
        String[] v83={"recast","重铸，更换演员",v,"0"};
        String[] v84={"recede","后退，收回(诺言)",v,"0"};
        String[] v85={"receipt","收到，接到，发票，收据",n,"0"};
        String[] v86={"receptacle","容器",n,"0"};
        String[] v87={"receptive","从善如流的",a,"0"};
        String[] v88={"recess","壁凹",n,"0"};
        String[] v89={"recession","经济萧条时期，撤回，退回",n,"0"};
        String[] v90={"recessive","后退的，(遗传)隐形的",a,"0"};
        String[] v91={"recipe","食谱",n,"0"};
        String[] v92={"recipient","接收者",n,"0"};
        String[] v93={"reciprocal","相互的，互惠的",a,"0"};
        String[] v94={"reciprocate","回报，答谢",v,"0"};
        String[] v95={"recital","独奏，吟诵",n,"0"};
        String[] v96={"reclaim","纠正，开垦",v,"0"};
        String[] v97={"recluse","隐士",n,"0"};
        String[] v98={"recoil","退却",v,"0"};
        String[] v99={"recollection","记忆力，记忆中的往事",n,"0"};
        String[] v100={"recombine","重组，再结合",v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"recompense","报酬，赔偿",v,"0"};
        	String[] v102={"reconcile","和解，调和",v,"0"};
        	String[] v103={"recondite","深奥的",a,"0"};
        	String[] v104={"reconnaissance","侦查，预先探索",n,"0"};
        	String[] v105={"reconstitute","重组，用水泡",v,"0"};
        	String[] v106={"recourse","求助，依靠",n,"0"};
        	String[] v107={"recruit","新兵，新成员；招募",n+v,"0"};
        	String[] v108={"rectangle","矩形",n,"0"};
        	String[] v109={"rectify","改正，调正",v,"0"};
        	String[] v110={"rectitude","诚实，正直",n,"0"};
        	String[] v111={"recumbent","侧卧的，休息的",a,"0"};
        	String[] v112={"recuperate","(身体)恢复，复原",v,"0"};
        	String[] v113={"redeem","赎罪",v,"0"};
        	String[] v114={"redemptive","赎回的，救赎的",a,"0"};
        	String[] v115={"redirect","改寄(信件)，改变方向",v,"0"};
        	String[] v116={"redistribution","重新分配",n,"0"};
        	String[] v117={"redolent","芬芳的",a,"0"};
        	String[] v118={"redoubtable","可敬畏的",a,"0"};
        	String[] v119={"redress","改正，修正",n,"0"};
        	String[] v120={"redundancy","过剩，备份",n,"0"};
        	String[] v121={"redundant","多余的",a,"0"};
        	String[] v122={"reed","芦苇，簧片",n,"0"};
        	String[] v123={"reek","发臭味",v,"0"};
        	String[] v124={"reel","卷轴，旋转；卷...于轴上",n+v,"0"};
        	String[] v125={"refectory","(学院)餐厅，食堂",n,"0"};
        	String[] v126={"referee","裁判员",n,"0"};
        	String[] v127={"refinery","提炼厂",n,"0"};
        	String[] v128={"reflect","反射，仔细考虑",v,"0"};
        	String[] v129={"refraction","折射",n,"0"};
        	String[] v130={"refractory","倔强的，反应迟钝的",a,"0"};
        	String[] v131={"refrain","抑制；歌曲中的反复句，叠句",v+n,"0"};
        	String[] v132={"refresh","消除...的疲劳，使精神振作",v,"0"};
        	String[] v133={"refugee","难民，流亡者",n,"0"};
        	String[] v134={"refulgent","辉煌的，灿烂的",a,"0"};
        	String[] v135={"refurbish","刷新，擦亮",v,"0"};
        	String[] v136={"refute","驳斥",v,"0"};
        	String[] v137={"regale","款待，使享受",v,"0"};
        	String[] v138={"regime","政权，政治制度",n,"0"};
        	String[] v139={"regress","使倒退，复原，逆行",v,"0"};
        	String[] v140={"regressive","退步的，退化的",a,"0"};
        	String[] v141={"regulate","管制，调整",v,"0"};
        	String[] v142={"rehabilitate","修复，恢复(职业等)",v,"0"};
        	String[] v143={"rehearsal","排演，演习",n,"0"};
        	String[] v144={"rehearse","排练，预演，详述",v,"0"};
        	String[] v145={"reign","统治时期，王朝，领域",n,"0"};
        	String[] v146={"reimburse","偿还",v,"0"};
        	String[] v147={"rein","缰绳；控制",n+v,"0"};
        	String[] v148={"reinforce","加强力量，增援",v,"0"};
        	String[] v149={"reinstate","恢复(原职)",v,"0"};
        	String[] v150={"reiterate","重申，反复地说",v,"0"};
        	String[] v151={"rejoice","喜欢，高兴",v,"0"};
        	String[] v152={"rejuvenate","使返老还童",v,"0"};
        	String[] v153={"relapse","旧病复发，再恶化",v+n,"0"};
        	
        	
        	
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    
        	
    }
    private void doList_31(){
    	String[] v1={"relate","讲述，有关联",v,"0"};
    	String[] v2={"relaxation","放松，消遣",n,"0"};
    	String[] v3={"release","释放",n+v,"0"};
    	String[] v4={"relegate","降级，贬谪，交付，托付",v,"0"};
    	String[] v5={"relent","动怜悯心，减弱",v,"0"};
    	String[] v6={"relenting","减弱的，怜悯的",a,"0"};
    	String[] v7={"relentless","无情的",a,"0"};
    	String[] v8={"reliance","信赖",n,"0"};
    	String[] v9={"relic","遗物，遗迹",n,"0"};
    	String[] v10={"relieved","宽慰的，如释重负的",a,"0"};
    	String[] v11={"relinquish","放弃，废除",v,"0"};
    	String[] v12={"relish","味道，喜好；喜好",n+v,"0"};
    	String[] v13={"remainder","剩余物",n,"0"};
    	String[] v14={"remains","遗址，废墟",n,"0"};
    	String[] v15={"reminder","提醒人记忆之物",n,"0"};
    	String[] v16={"reminisce","追忆，怀旧",v,"0"};
    	String[] v17={"remiss","疏忽的，不留心的",a,"0"};
    	String[] v18={"remnant","残余物，零头布料",n,"0"};
    	String[] v19={"remorse","懊悔，悔恨",n,"0"};
    	String[] v20={"remove","移走，脱掉，迁移",v,"0"};
    	String[] v21={"remunerative","报酬高的，有利润的",a,"0"};
    	String[] v22={"rend","撕裂，分裂，猛拉",v,"0"};
    	String[] v23={"render","呈递，表现，提供",v,"0"};
    	String[] v24={"rendering","演出，翻译",n,"0"};
    	String[] v25={"rendezvous","约会，约会地点",n,"0"};
    	String[] v26={"renegade","叛教者，叛徒",n,"0"};
    	String[] v27={"renege","背信，违约",v,"0"};
    	String[] v28={"renounce","(正式)放弃",v,"0"};
    	String[] v29={"renovate","修复，装修，翻新",v,"0"};
    	String[] v30={"renown","名望，声誉",n,"0"};
    	String[] v31={"rent","裂缝，分歧",n,"0"};
    	String[] v32={"reparable","可挽回的，能补救的",a,"0"};
    	String[] v33={"reparation","赔偿，补偿",n,"0"};
    	String[] v34={"repartee","机灵的回答",n,"0"};
    	String[] v35={"repatriate","遣返",v,"0"};
    	String[] v36={"repeal","废除(法律)",v,"0"};
    	String[] v37={"repel","击退，使...反感",v,"0"};
    	String[] v38={"repellent","令人厌恶的",a,"0"};
    	String[] v39={"repercussion","反响，影响",n,"0"};
    	String[] v40={"repertoire","(剧团等)常备剧目",n,"0"};
    	String[] v41={"repine","不满，心中抱怨",v,"0"};
    	String[] v42={"replenish","补充，再装满",v,"0"};
    	String[] v43={"replete","饱满的，塞满的",a,"0"};
    	String[] v44={"reportorial","记者的，纪实的",a,"0"};
    	String[] v45={"repose","躺着休息，安睡",v+n,"0"};
    	String[] v46={"reprehend","谴责，责难",v,"0"};
    	String[] v47={"reprehensible","应受谴责的",a,"0"};
    	String[] v48={"repressed","被压制的，被压抑的",a,"0"};
    	String[] v49={"reprieve","缓刑，暂时解救",v+n,"0"};
    	String[] v50={"reprimand","训诫，谴责",v+n,"0"};
    	String[] v51={"reprisal","(政治或军事的)报复",n,"0"};
        String[] v52={"reprise","(音乐剧中)乐曲的重复，重复(表演)",n,"0"};
        String[] v53={"reproach","谴责，责骂",n,"0"};
        String[] v54={"reprobate","谴责，指责；堕落的；堕落之人",v+a+n,"0"};
        String[] v55={"reproof","责斥，责备",n,"0"};
        String[] v56={"reprove","责骂，申斥",v,"0"};
        String[] v57={"reptile","爬行动物，卑鄙之人",n,"0"};
        String[] v58={"reptilian","爬虫类的，卑下的",a,"0"};
        String[] v59={"repudiate","拒绝，抛弃",v,"0"};
        String[] v60={"repugnance","嫌恶",n,"0"};		
    	String[] v61={"repugnant","令人厌恶的",a,"0"};
        String[] v62={"repulse","驱逐，击退，厌恶；回绝，拒绝",v+n,"0"};
       	String[] v63={"repulsion","厌恶，反感，排斥力",n,"0"};
       	String[] v64={"reputation","名声",n,"0"};
       	String[] v65={"repute","名声",n,"0"};
       	String[] v66={"request","要求，请求",n+v,"0"};
        String[] v67={"requisite","必需物；必要的",n+a,"0"};
        String[] v68={"requite","报答，报复",v,"0"};
        String[] v69={"rescind","废除，取消",v,"0"};
        String[] v70={"rescission","废除",n,"0"};
    	String[] v71={"rescue","解救，把...从法律监管下强行夺回",n+v,"0"};
        String[] v72={"resent","憎恶",v,"0"};
       	String[] v73={"resentment","愤恨",n,"0"};
       	String[] v74={"reserve","储备，储藏量，缄默，谨慎；保留，储备，预订",n+v,"0"};
       	String[] v75={"reside","居住",v,"0"};
        String[] v76={"resident","居民；定居的，常驻的",n+a,"0"};
        String[] v77={"residual","残余的，剩余的",a,"0"};
        String[] v78={"residue","剩余",n,"0"};
        String[] v79={"resignation","听从，顺从，辞职",n,"0"};
        String[] v80={"resigned","逆来顺受的，顺从的",a,"0"};
    	String[] v81={"resilience","弹性，弹力",n,"0"};
        String[] v82={"resilient","有弹性的，能恢复活力的，适应力强的",a,"0"};
        String[] v83={"resonant","(声音)洪亮的，共鸣的",a,"0"};
        String[] v84={"resort","度假胜地",n,"0"};
        String[] v85={"resound","回荡着声音，鸣响",v,"0"};
        String[] v86={"resourceful","机智的",a,"0"};
        String[] v87={"respiration","呼吸",n,"0"};
        String[] v88={"respite","休息，暂缓",n,"0"};
        String[] v89={"resplendent","华丽的，辉煌的",a,"0"};
        String[] v90={"respondent","被告",n,"0"};
        String[] v91={"response","反应，响应，回答",n,"0"};
        String[] v92={"responsive","敏感的，反应快的",a,"0"};
        String[] v93={"responsiveness","应答，响应",n,"0"};
        String[] v94={"resitution","归偿，赔偿",n,"0"};
        String[] v95={"restive","不安静的，不安宁的",a,"0"};
        String[] v96={"restiveness","倔强，难以驾驭",n,"0"};
        String[] v97={"restless","不停的，不安静的",a,"0"};
        String[] v98={"restore","使回复，恢复，修复，修补",v,"0"};
        String[] v99={"restored","恢复的，复修的",a,"0"};
        String[] v100={"restrain","克制，抑制",v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"restraint","克制",n,"0"};
        	String[] v102={"resume","重新开始，继续",v,"0"};
        	String[] v103={"resurgence","再起，复活，再现",n,"0"};
        	String[] v104={"resurrect","使复活，复兴",v,"0"};
        	String[] v105={"resuscitate","使复活，使苏醒",v,"0"};
        	String[] v106={"retail","零售",v+n,"0"};
        	String[] v107={"retain","保留，保持，留住",v,"0"};
        	String[] v108={"retainer","侍从",n,"0"};
        	String[] v109={"retaliate","报复，反击",v,"0"};
        	String[] v110={"retaliation","报复",n,"0"};
        	String[] v111={"retard","妨碍，减速",v,"0"};
        	String[] v112={"reticent","沉默不语的",a,"0"};
        	String[] v113={"retinue","侍从，随员团",n,"0"};
        	String[] v114={"retiring","隐居的，不喜欢社交的",a,"0"};
        	String[] v115={"retort","反驳",v,"0"};
        	String[] v116={"retouch","修描，润色",v,"0"};
        	String[] v117={"retrace","回顾，回想",v,"0"};
        	String[] v118={"retract","缩回，收回",v,"0"};
        	String[] v119={"retreat","撤退，隐居处",n+v,"0"};
        	String[] v120={"retrench","节省，紧缩费用",v,"0"};
        	String[] v121={"retribution","报应，惩罚",n,"0"};
        	String[] v122={"retrieve","寻回，取回，挽回",n+v,"0"};
        	String[] v123={"revealing","暴露的，裸露的，揭露性的",a,"0"};
        	String[] v124={"revelation","显示，泄露的事实",n,"0"};
        	String[] v125={"revelry","狂欢",n,"0"};
        	String[] v126={"revenge","报复，报仇",n,"0"};
        	String[] v127={"revenue","总收入，国家税收收入",n,"0"};
        	String[] v128={"reverberate","起回声，反响",v,"0"};
        	String[] v129={"revere","尊敬",v,"0"};
        	String[] v130={"reverie","幻想，梦幻曲",n,"0"};
        	String[] v131={"reverse","反面，相反；倒车，反转",n+v,"0"};
        	String[] v132={"revert","恢复，回复到，重新考虑",v,"0"};
        	String[] v133={"revile","辱骂，恶言相向",v,"0"};
        	String[] v134={"revise","改变，修正",v+n,"0"};
        	String[] v135={"revitalize","使重新充满活力",v,"0"};
        	String[] v136={"revive","使苏醒，再流行，使复活",v,"0"};
        	String[] v137={"revolt","叛乱，造反",v,"0"};
        	String[] v138={"revue","时事讽刺剧",n,"0"};
        	String[] v139={"reward","酬报，奖赏",n+v,"0"};
        	String[] v140={"rewarding","有益的，值得做的",a,"0"};
        	String[] v141={"rhetoric","修辞学，浮夸的言语",n,"0"};
        	String[] v142={"rhinestone","莱茵石",n,"0"};
        	String[] v143={"rhubarb","【植】大黄；喧闹争吵",n+v,"0"};
        	String[] v144={"rhyme","押韵",n+v,"0"};
        	String[] v145={"rhythmic","有节奏的",a,"0"};
        	String[] v146={"rib","肋骨，伞骨",n,"0"};
        	String[] v147={"ribald","下流的，粗鄙的",a,"0"};
        	String[] v148={"rickety","不牢靠的，摇摇欲坠的",a,"0"};
        	String[] v149={"riddle","谜语",n,"0"};
        	String[] v150={"rider","骑手，附文，附件",n,"0"};
        	String[] v151={"ridge","脊，隆起物",n,"0"};
        	String[] v152={"ridicule","奚落，嘲笑",n+v,"0"};
        	String[] v153={"rife","流行的，普遍的",a,"0"};
        	String[] v154={"rifle","步枪；抢劫",n+v,"0"};
        	String[] v155={"rift","裂口，断裂，矛盾",n,"0"};
        	String[] v156={"rig","欺骗，舞弊，伪造",v,"0"};
        	String[] v157={"rigid","硬性的，刚硬的",a,"0"};
        	String[] v158={"rigor","严格，苛刻，精确，严酷",n,"0"};
        	String[] v159={"rile","使...恼火，激怒",v,"0"};
        	String[] v160={"rind","(西瓜等)外皮",n,"0"};
        	String[] v161={"ringlet","卷发",n,"0"};
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);
    		subInitial(v159);
    		subInitial(v160);
    		subInitial(v161);
    	
        	
    }
    private void doList_32(){
    	String[] v1={"riot","参加暴动",v,"0"};
    	String[] v2={"riotous","暴乱的，骚动的，喧闹的",a,"0"};
    	String[] v3={"ripen","使成熟",v,"0"};
    	String[] v4={"ripple","起涟漪；涟漪",v+n,"0"};
    	String[] v5={"rite","(宗教)仪式",n,"0"};
    	String[] v6={"ritual","仪式，例行习惯",n,"0"};
    	String[] v7={"rival","竞争者，对手；与...匹敌",n+v,"0"};
    	String[] v8={"rivalry","竞争，对抗",n,"0"};
    	String[] v9={"rive","撕开，分裂",v,"0"};
    	String[] v10={"riven","撕裂的，分裂的",a,"0"};
    	String[] v11={"rivet","铆钉；吸引",n+v,"0"};
    	String[] v12={"riveting","非常精彩的",a,"0"};
    	String[] v13={"rivulet","小溪，小河",n,"0"};
    	String[] v14={"robe","长袍，礼服",n,"0"};
    	String[] v15={"robust","健壮的",a,"0"};
    	String[] v16={"roe","鱼卵",n,"0"};
    	String[] v17={"roll","煽动，搅浑",v,"0"};
    	String[] v18={"rookie","新兵，新手",n,"0"};
    	String[] v19={"roster","值班表，花名册",n,"0"};
    	String[] v20={"rostrum","讲台，讲坛",n,"0"};
    	String[] v21={"rotate","旋转，交替",v,"0"};
    	String[] v22={"rotten","腐败的，糟糕的",a,"0"};
    	String[] v23={"roughen","变粗糙，变不平",v,"0"};
    	String[] v24={"royalty","版税",n,"0"};
    	String[] v25={"rubicund","(脸色)红润的",a,"0"};
    	String[] v26={"rudder","船舵，领导者",n,"0"};
    	String[] v27={"rudimentary","初步的，未充分发展的",a,"0"};
    	String[] v28={"rue","后悔，遗憾",n,"0"};
    	String[] v29={"ruffian","恶棍，歹徒；残暴的",n+a,"0"};
    	String[] v30={"ruffle","弄皱，激怒；皱边",v+n,"0"};
    	String[] v31={"ruminant","反刍的，沉思的",a,"0"};
    	String[] v32={"rumple","弄皱，弄乱",v,"0"};
    	String[] v33={"rung","梯子横档，梯级",n,"0"};
    	String[] v34={"runic","北欧古代文字的，神秘的",a,"0"};
    	String[] v35={"rupture","破裂，断裂",n+v,"0"};
    	String[] v36={"rural","乡村的",a,"0"};
    	String[] v37={"ruse","骗术，诡计",n,"0"};
    	String[] v38={"rustic","乡村的，乡土气的",a,"0"};
    	String[] v39={"ruthlessness","无情，残忍",n,"0"};
    	String[] v40={"sabotage","阴谋破坏，颠覆活动",n,"0"};
    	String[] v41={"saboteur","从事破坏活动者",n,"0"};
    	String[] v42={"saccharin","糖精",n,"0"};
    	String[] v43={"sacred","神圣的，庄严的",a,"0"};
    	String[] v44={"sacrifice","牺牲",n+v,"0"};
    	String[] v45={"sacriledge","亵渎，冒犯神灵",n,"0"};
    	String[] v46={"sacrilegious","渎神的",a,"0"};
    	String[] v47={"sadden","使伤心，使悲哀",v,"0"};
    	String[] v48={"saddle","马鞍",n,"0"};
    	String[] v49={"safeguard","防范措施",n,"0"};
    	String[] v50={"sagacious","聪明的，睿智的",a,"0"};
    	String[] v51={"sage","智慧的；智者",a+n,"0"};
        String[] v52={"saintly","圣徒似的，极为圣洁的",a,"0"};
        String[] v53={"salient","显著的，突出的",a,"0"};
        String[] v54={"saliva","唾液，口水",n,"0"};
        String[] v55={"salmon","大马哈鱼，鲜肉色",n,"0"};
        String[] v56={"salubrious","有益健康的",a,"0"};
        String[] v57={"salutary","有益的，有益健康的",a,"0"};
        String[] v58={"salutation","招呼，致意，敬礼",n,"0"};
        String[] v59={"salute","行礼，致意",v,"0"};
        String[] v60={"salvage","抢救，海上救助",n,"0"};		
    	String[] v61={"salve","药膏；减轻，缓和",n+v,"0"};
        String[] v62={"sampler","刺绣花样，采样员",n,"0"};
       	String[] v63={"sactify","使神圣",v,"0"};
       	String[] v64={"sanctimonious","假装神圣的",a,"0"};
       	String[] v65={"sanction","批准，认可",v+n,"0"};
       	String[] v66={"sandal","凉鞋，拖鞋",n,"0"};
        String[] v67={"sane","神志清楚的，明智的",a,"0"};
        String[] v68={"sanguine","乐观的",a,"0"};
        String[] v69={"sanity","神志清楚",n,"0"};
        String[] v70={"sap","树液，活力；削弱，耗尽",n+v,"0"};
    	String[] v71={"sapient","有智慧的",a,"0"};
        String[] v72={"sapphire","青石，蓝宝石；天蓝色的",n+a,"0"};
       	String[] v73={"sarcastic","讽刺的",a,"0"};
       	String[] v74={"sartorial","裁缝的，缝制的",a,"0"};
       	String[] v75={"sash","肩带",n,"0"};
        String[] v76={"sate","使心满意足，使厌腻",v,"0"};
        String[] v77={"satiated","充分满足的，厌倦的，生腻的",a,"0"};
        String[] v78={"satire","讽刺(作品)",n,"0"};
        String[] v79={"satirize","讽刺",v,"0"};
        String[] v80={"saturate","浸透，使充满",v,"0"};
        String[] v81={"saturnine","忧郁的，阴沉的",a,"0"};
        String[] v82={"saunter","闲逛，漫步",n+v,"0"};
        String[] v83={"savage","凶猛的，野蛮的",a,"0"};
        String[] v84={"savant","博学之士，大学士",n,"0"};
        String[] v85={"savvy","有见识的，精明能干的",a,"0"};
        String[] v86={"sawdust","锯屑",n,"0"};
        String[] v87={"scabbard","鞘",n,"0"};
        String[] v88={"scad","许多，大量",n,"0"};
        String[] v89={"scaffold","脚手架",n,"0"};
        String[] v90={"scalding","滚烫的",a,"0"};
        String[] v91={"scale","鱼鳞，音阶",n,"0"};
        String[] v92={"scalpel","外科手术刀，解剖刀",n,"0"};
        String[] v93={"scandal","丑闻，恶意诽谤",n,"0"};
        String[] v94={"scant","不足的，缺乏的",a,"0"};
        String[] v95={"scarcity","不足，缺乏",n,"0"};
        String[] v96={"scarf","围巾，披肩",n,"0"};
        String[] v97={"scathing","苛刻的，严厉的",a,"0"};
        String[] v98={"scatter","散开，驱散",v,"0"};
        String[] v99={"scenario","剧本提纲，剧本",n,"0"};
        String[] v100={"schematic","纲要的，图解的",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"schematize","扼要表示",v,"0"};
        	String[] v102={"scheme","阴谋，(作品)体系、结构",n,"0"};
        	String[] v103={"schism","组织分裂",n,"0"};
        	String[] v104={"school","鱼群",n,"0"};
        	String[] v105={"scion","嫩芽，子孙",n,"0"};
        	String[] v106={"scissor","剪刀",n,"0"};
        	String[] v107={"scoff","嘲笑，笑柄，狼吞虎咽",v+n,"0"};
        	String[] v108={"scoop","小铲，勺子；用勺取出，舀出",v,"0"};
        	String[] v109={"scope","眼界，范围",n,"0"};
        	String[] v110={"scorch","烤焦，烧焦",v,"0"};
        	String[] v111={"score","乐谱",n,"0"};
        	String[] v112={"scorn","轻蔑",n+v,"0"};
        	String[] v113={"scorpion","蝎子",n,"0"};
        	String[] v114={"scotch","镇压，粉碎",v,"0"};
        	String[] v115={"scourge","鞭笞，磨难",n+v,"0"};
        	String[] v116={"scowl","怒容；(生气)皱眉，怒视",n+v,"0"};
        	String[] v117={"scrap","小片，碎屑；废弃",n+v,"0"};
        	String[] v118={"scrappy","碎片的，好斗的，坚毅的",a,"0"};
        	String[] v119={"scrawl","乱涂，潦草地写",v,"0"};
        	String[] v120={"screw","螺钉，螺旋，吝啬鬼",n,"0"};
        	String[] v121={"screwdriver","螺丝刀",n,"0"};
        	String[] v122={"scribble","乱写，乱涂",v,"0"};
        	String[] v123={"script","剧本，脚本",n,"0"};
        	String[] v124={"scripture","经文，圣典",n,"0"};
        	String[] v125={"scroll","卷轴，纸卷，画卷",n,"0"};
        	String[] v126={"scrub","矮树丛，身体矮小之人；用力擦洗",n+v,"0"};
        	String[] v127={"scruple","顾忌，迟疑",n+v,"0"};
        	String[] v128={"scrutable","可以理解的",a,"0"};
        	String[] v129={"scrutinize","详细检查，细读",v,"0"};
        	String[] v130={"scuff","拖着脚走",v,"0"};
        	String[] v131={"sculpt","雕刻",v,"0"};
        	String[] v132={"scurrilous","下流的",a,"0"};
        	String[] v133={"scurry","急跑，疾行",v,"0"};
        	String[] v134={"scurvy","卑鄙的",a,"0"};
        	String[] v135={"scythe","大镰刀",n,"0"};
        	String[] v136={"seam","缝，接缝",n,"0"};
        	String[] v137={"seamy","肮脏的，恶劣的",a,"0"};
        	String[] v138={"sear","烧灼",v,"0"};
        	String[] v139={"seasoned","有经验的，训练有素的",a,"0"};
        	String[] v140={"seasoning","调味品，佐料",n,"0"};
        	String[] v141={"secede","正式脱离或退出",v,"0"};
        	String[] v142={"secrete","隐藏，分泌",v,"0"};
        	String[] v143={"secretive","守口如瓶的",a,"0"};
        	String[] v144={"secular","世俗的",a,"0"};
        	String[] v145={"secure","安全的，稳固的；固定，使安全",a+v,"0"};
        	String[] v146={"securities","证券",n,"0"};
        	String[] v147={"sedate","镇静的",a,"0"};
        	String[] v148={"sedative","(药物)镇静的；镇静剂",a+n,"0"};
        	String[] v149={"sedentary","久坐的",a,"0"};
        	String[] v150={"sediment","沉淀物，渣",n,"0"};
        	String[] v151={"sedulity","勤奋",n,"0"};
        	String[] v152={"sedulous","聚精会神的，勤勉的",a,"0"};
        	String[] v153={"seedling","幼苗",n,"0"};
        	String[] v154={"seemly","得体的，适宜的",a,"0"};
        	String[] v155={"seep","渗漏",v,"0"};
        	String[] v156={"seethe","沸腾，汹涌",v,"0"};
        	String[] v157={"segment","部分",n,"0"};
        	String[] v158={"seine","拉网，大捕鱼网",n,"0"};
        	String[] v159={"seismic","地震的",a,"0"};
        	String[] v160={"semblance","外貌，相似",n,"0"};
        	String[] v161={"seminal","有创意的",a,"0"};
        	String[] v162={"seminary","神学院",n,"0"};
        	String[] v163={"sensation","知觉，轰动(的事)",n,"0"};
        	String[] v164={"sensible","明智的，可感觉到的",a,"0"};
        	String[] v165={"sensitive","敏感的",a,"0"};
        	String[] v166={"sensitivity","敏感，灵敏性",n,"0"};
        	String[] v167={"sensitization","敏化",n,"0"};
        	String[] v168={"sentient","有知觉的，知悉的",a,"0"};
        	String[] v169={"sentiment","多愁善感，思想感情",n,"0"};
        	String[] v170={"sentinel","哨兵，卫兵",n,"0"};
        	String[] v171={"separate","使分开；不同的，独自的",v+a,"0"};
        	String[] v172={"septic","受感染的，腐败的",a,"0"};
        	String[] v173={"sepulchral","坟墓的，阴森的",a,"0"};
        	String[] v174={"sequential","连续的，一连串的",a,"0"};
            String[] v175={"sequester","(使)隐退，(使)隔离",v,"0"};
        	String[] v176={"seraphic","如天使般的，美丽的",a,"0"};
        	String[] v177={"sere","干枯的，枯萎的",a,"0"};
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);
    		subInitial(v159);
    		subInitial(v160);
    		subInitial(v161);
    		subInitial(v162);
    		subInitial(v163);
    		subInitial(v164);
    		subInitial(v165);
    		subInitial(v166);
    		subInitial(v167);
    		subInitial(v168);
    		subInitial(v169);
    		subInitial(v170);
    		subInitial(v171);
    		subInitial(v172);
    		subInitial(v173);
    		subInitial(v174);
    		subInitial(v175);
    		subInitial(v176);
    		subInitial(v177);
    		
        	
    }
    private void doList_33(){
    	String[] v1={"serene","清澈的，晴朗的，安静的",a,"0"};
    	String[] v2={"serial","连接的，一系列的",a,"0"};
    	String[] v3={"sermon","布道，训诫，说教",n,"0"};
    	String[] v4={"serrated","呈锯齿状的",a,"0"};
    	String[] v5={"serried","密集的",a,"0"};
    	String[] v6={"serviceable","可用的，耐用的",a,"0"};
    	String[] v7={"servile","奴性的，百依百顺的",a,"0"};
    	String[] v8={"servitude","奴役，劳役",n,"0"};
    	String[] v9={"setback","挫折",n,"0"};
    	String[] v10={"settle","安置于，决定，栖息",v,"0"};
    	String[] v11={"settled","固定的",a,"0"};
    	String[] v12={"sever","切断，脱离",v,"0"};
    	String[] v13={"severe","严格的，凶猛的",a,"0"};
    	String[] v14={"sewer","下水道",n,"0"};
    	String[] v15={"sextant","六分仪",n,"0"};
    	String[] v16={"shackle","脚镣，枷锁",n,"0"};
    	String[] v17={"shale","页岩",n,"0"};
    	String[] v18={"sham","虚假；伪装",n+v,"0"};
    	String[] v19={"shambles","凌乱景象，杂乱无章",n,"0"};
    	String[] v20={"shard","碎片",n,"0"};
    	String[] v21={"shattered","粉碎的，破坏的",a,"0"};
    	String[] v22={"shavings","刨花",n,"0"};
    	String[] v23={"shear","剪毛，剪发",v,"0"};
    	String[] v24={"sheath","鞘",n,"0"};
    	String[] v25={"sheathe","入鞘",v,"0"};
    	String[] v26={"shed","流出，脱落",v,"0"};
    	String[] v27={"sheer","完全的，陡峭的，极薄的",v,"0"};
    	String[] v28={"shell","贝壳，炮弹；剥壳",n+v,"0"};
    	String[] v29={"shelter","掩蔽处，掩蔽；庇护，保护",n+v,"0"};
    	String[] v30={"shelve","搁置",v,"0"};
    	String[] v31={"sheriff","警长，县治安官",n,"0"};
    	String[] v32={"shield","盾；掩护，遮挡",n+v,"0"};
    	String[] v33={"shiftiness","奸诈",n,"0"};
    	String[] v34={"shiftless","没有决断力的，偷偷的，无能的",a,"0"};
    	String[] v35={"shingle","木瓦，屋顶板，木质小招牌",n,"0"};
    	String[] v36={"shipshape","整洁的，井然有序的",a,"0"};
    	String[] v37={"shirk","逃避，规避",v,"0"};
    	String[] v38={"shoal","浅滩，浅水处，一群(鱼)；水浅的",n+a,"0"};
    	String[] v39={"shoddy","劣质的，冒充好货的",a,"0"};
    	String[] v40={"shoot","嫩芽",n,"0"};
    	String[] v41={"shoplift","在商店偷窃",v,"0"};
    	String[] v42={"shopworn","在商店陈列旧了的",a,"0"};
    	String[] v43={"shoulder","肩，路肩",n,"0"};
    	String[] v44={"shove","推挤，猛推",v,"0"};
    	String[] v45={"shrewd","判断敏捷的，精明的",a,"0"};
    	String[] v46={"shriek","尖叫",v,"0"};
    	String[] v47={"shrine","神龛，圣地",n,"0"};
    	String[] v48={"shrink","收缩，皱缩",v,"0"};
    	String[] v49={"shroud","寿衣，遮蔽物；覆盖",n+v,"0"};
    	String[] v50={"shrub","灌木",n,"0"};
    	String[] v51={"shrug","耸肩",v,"0"};
        String[] v52={"shuck","壳，夹，无用之物",n,"0"};
        String[] v53={"shudder","战栗，发抖",v+n,"0"};
        String[] v54={"shun","避免，闪避",v,"0"};
        String[] v55={"shunt","使(火车)转到另一轨道，转移方向",v,"0"};
        String[] v56={"sibilant","发出咝咝声的",a,"0"};
        String[] v57={"sibling","兄弟或姊妹",n,"0"};
        String[] v58={"sibyl","女预言家，女先知",n,"0"};
        String[] v59={"sidereal","恒星的",a,"0"};
        String[] v60={"sideshow","杂耍，穿插表演",n,"0"};		
    	String[] v61={"sidestep","横跨一步以躲避，回避",v,"0"};
        String[] v62={"siege","包围，围攻",n,"0"};
       	String[] v63={"sift","筛，过滤",v,"0"};
       	String[] v64={"signal","信号；发信号；显著的",n+v+a,"0"};
       	String[] v65={"significant","相当数量的，意义重大的",a,"0"};
       	String[] v66={"signify","表示，有重要性",v,"0"};
        String[] v67={"sill","门槛，窗台",n,"0"};
        String[] v68={"silt","淤泥，淤沙",n,"0"};
        String[] v69={"silversmith","银匠",n,"0"};
        String[] v70={"simper","痴笑，傻笑",v,"0"};
    	String[] v71={"simpleton","笨蛋",n,"0"};
        String[] v72={"simulate","假装，模仿",v,"0"};
       	String[] v73={"simultaneous","同时发生的",a,"0"};
       	String[] v74={"sincere","诚实的，正直的，真挚的，纯净的",a,"0"};
       	String[] v75={"sinecure","闲职，挂名差事",n,"0"};
        String[] v76={"sinew","腱，肌肉，力量",n,"0"};
        String[] v77={"singe","(轻微的)烧焦，烫焦",v,"0"};
        String[] v78={"singularity","独特，(天文学)奇点",n,"0"};
        String[] v79={"sinuous","蜿蜒的，迂回的",a,"0"};
        String[] v80={"sip","啜饮",v,"0"};
    	String[] v81={"siren","汽笛，警报器",n,"0"};
        String[] v82={"skeleton","骨架，骨骼",n,"0"};
        String[] v83={"sketchy","概略的，粗略的",a,"0"};
        String[] v84={"skew","不直的，歪斜的",a,"0"};
        String[] v85={"skewer","烤肉扦；用扦穿好",n+v,"0"};
        String[] v86={"skiff","轻舟，小船",n,"0"};
        String[] v87={"skillet","煎锅",n,"0"};
        String[] v88={"skim","从液体表面撇去，浏览，略读",v,"0"};
        String[] v89={"skimp","节省花费",v,"0"};
        String[] v90={"skinflint","吝啬鬼",n,"0"};
        String[] v91={"skirmish","小战，小争吵",n,"0"};
        String[] v92={"skirt","环绕，躲避",v,"0"};
        String[] v93={"skit","幽默讽刺短剧",n,"0"};
        String[] v94={"skyscraper","摩天大楼",n,"0"};
        String[] v95={"slab","厚板，厚块",n,"0"};
        String[] v96={"slack","懒散的，懈怠的，松弛的；松懈，怠惰",a+v,"0"};
        String[] v97={"slacken","(使)松弛，放松",v,"0"};
        String[] v98={"slag","炉渣，矿渣",n,"0"};
        String[] v99={"slake","解渴，消渴",v,"0"};
        String[] v100={"slander","诽谤，诋毁",v+n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"slanderous","诽谤的",a,"0"};
        	String[] v102={"slant","倾斜；斜面，看法",v+n,"0"};
        	String[] v103={"slate","石板，候选人名单；提名",n+v,"0"};
        	String[] v104={"slaughter","屠杀，屠宰",n+v,"0"};
        	String[] v105={"sleigh","(马拉的)雪橇",n,"0"};
        	String[] v106={"slew","(使)旋转；大量",v+n,"0"};
        	String[] v107={"slice","切成片；薄片",v+n,"0"};
        	String[] v108={"slick","熟练的，圆滑的，光滑的",a,"0"};
        	String[] v109={"slight","微小的；轻蔑；轻蔑",a+v+n,"0"};
        	String[] v110={"slippage","滑动，下降",n,"0"};
        	String[] v111={"slippery","滑的，狡猾的",a,"0"};
        	String[] v112={"slipshod","马虎的，草率的",a,"0"};
        	String[] v113={"slither","(蛇)扭行",v,"0"};
        	String[] v114={"sliver","长条；裂成细片",n+v,"0"};
        	String[] v115={"sloppy","邋遢的，不整洁的",a,"0"};
        	String[] v116={"slot","狭孔",n,"0"};
        	String[] v117={"sloth","懒惰，树懒",n,"0"};
        	String[] v118={"slouch","没精打采",v+n,"0"};
        	String[] v119={"slough","蜕皮",v,"0"};
        	String[] v120={"sluggard","懒鬼",n,"0"};
        	String[] v121={"sluice","水闸；冲洗",n+v,"0"};
        	String[] v122={"slumber","安睡",n+v,"0"};
        	String[] v123={"slur","含糊不清的讲",v,"0"};
        	String[] v124={"slurp","大声的啜喝",v,"0"};
        	String[] v125={"sly","狡猾的，鬼鬼祟祟的",a,"0"};
        	String[] v126={"smarmy","虚情假意的",a,"0"};
        	String[] v127={"smart","痛苦；时髦的，聪明的",n+a,"0"};
        	String[] v128={"smattering","略知，少数",n,"0"};
        	String[] v129={"smear","油渍，污点；玷污，弄脏",n+v,"0"};
        	String[] v130={"smirk","假笑，得意的笑",v,"0"};
        	String[] v131={"smooth","光滑的，平稳的；弄平，使光滑，消除",a,"0"};
        	String[] v132={"smother","覆盖，(使)闷死",v,"0"};
        	String[] v133={"smudge","渍痕；弄脏",n+v,"0"};
        	String[] v134={"smug","自满的，自命不凡的",a,"0"};
        	String[] v135={"smuggle","走私，私运",v,"0"};
        	String[] v136={"snare","罗网，陷阱",n,"0"};
        	String[] v137={"snarl","纠缠，混乱",n+v,"0"};
        	String[] v138={"snatch","攫取",n+v,"0"};
        	String[] v139={"sneaking","秘密的",a,"0"};
        	String[] v140={"sneer","嘲笑，鄙视",v,"0"};
        	String[] v141={"snide","讽刺的，含沙射影的",a,"0"};
        	String[] v142={"snip","剪断",v,"0"};
        	String[] v143={"snitch","告密，偷",v,"0"};
        	String[] v144={"snobbish","势利眼的",a,"0"};
        	String[] v145={"snowdrift","雪堆",n,"0"};
        	String[] v146={"snub","冷落",v,"0"};
        	String[] v147={"snug","温暖的，舒适的",a,"0"};
        	String[] v148={"soak","浸泡",v,"0"};
        	String[] v149={"soar","高飞，翱翔，猛增",v,"0"};
        	String[] v150={"sober","清醒的，庄重的",a,"0"};
        	String[] v151={"sobriety","节制，庄重",n,"0"};
        	String[] v152={"sock","重击，痛打",v,"0"};
        	String[] v153={"sod","草地",n,"0"};
        	String[] v154={"sodden","浸透了的",a,"0"};
        	String[] v155={"soggy","湿透的",a,"0"};
        	String[] v156={"soil","弄脏",n+v,"0"};
        	String[] v157={"solace","安慰，慰藉",n,"0"};
        	String[] v158={"solder","焊接，焊合",v,"0"};
        	String[] v159={"solemn","庄严的，黑色的",a,"0"};
        	String[] v160={"solemnity","庄严，肃穆",n,"0"};
        	String[] v161={"solicit","恳求，教唆",v,"0"};
        	String[] v162={"solicitous","热切的，挂念的",a,"0"};
        	String[] v163={"solicitude","关怀，牵挂",n,"0"};
        	String[] v164={"solidarity","团结，一致",n,"0"};
        	String[] v165={"solidify","巩固，使团结",v,"0"};
        	String[] v166={"solitary","孤独的；隐士",a+n,"0"};
        	String[] v167={"solitude","孤独",n,"0"};
        	String[] v168={"solo","单独的；独唱",a+n,"0"};
        	String[] v169={"soluble","可溶的，可解决的",a,"0"};
        	String[] v170={"solvent","有偿债能力的；溶剂",a+n,"0"};
        	String[] v171={"somatic","肉体的",a,"0"};
        	String[] v172={"somber","忧郁的，阴暗的",a,"0"};
        	String[] v173={"sonata","奏鸣曲",n,"0"};
        	String[] v174={"sonnet","十四行诗",n,"0"};
        	String[] v175={"soot","黑烟灰，油烟",n,"0"};
        	String[] v176={"soothe","抚慰，减轻",v,"0"};
        	String[] v177={"sop","泡过的食品，安慰品",n,"0"};
        	String[] v178={"sophism","诡辩，诡辩术",n,"0"};
        	String[] v179={"sophisticated","老于世故的，(仪器)精密的",a,"0"};
        	
        	
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);
    		subInitial(v159);
    		subInitial(v160);
    		subInitial(v161);
    		subInitial(v162);
    		subInitial(v163);
    		subInitial(v164);
    		subInitial(v165);
    		subInitial(v166);
    		subInitial(v167);
    		subInitial(v168);
    		subInitial(v169);
    		subInitial(v170);
    		subInitial(v171);
    		subInitial(v172);
    		subInitial(v173);
    		subInitial(v174);
    		subInitial(v175);
    		subInitial(v176);
    		subInitial(v177);
    		subInitial(v178);
    		subInitial(v179);
    		
        	
    }
    private void doList_34(){
    	String[] v1={"sophistication","诡辩，世故，精明",n,"0"};
    	String[] v2={"sophistry","诡辩",n,"0"};
    	String[] v3={"soporific","催眠的；安眠药",a+n,"0"};
    	String[] v4={"sopping","混身湿透的",a,"0"};
    	String[] v5={"sorcery","巫术，魔法",n,"0"};
    	String[] v6={"sordid","卑鄙的，肮脏的",a,"0"};
    	String[] v7={"souvenir","纪念品",n,"0"};
    	String[] v8={"sovereign","元首",n,"0"};
    	String[] v9={"sovereignty","主权，统治权",n,"0"};
    	String[] v10={"sow","母猪；播种",n+v,"0"};
    	String[] v11={"spackle","填泥料",n,"0"};
    	String[] v12={"span","跨度，两个界限间的距离",n,"0"};
    	String[] v13={"spank","拍打",v,"0"};
    	String[] v14={"sparing","节俭的",a,"0"};
    	String[] v15={"spark","火花",n,"0"};
    	String[] v16={"sparring","拳击，争斗",n,"0"};
    	String[] v17={"sparse","稀少的，贫乏的",a,"0"};
    	String[] v18={"spartan","简朴的，刻苦的",a,"0"};
    	String[] v19={"spat","口角，小争论",n,"0"};
    	String[] v20={"spate","大批，大量，(水)泛滥",n,"0"};
    	String[] v21={"spatial","有关空间的",a,"0"};
    	String[] v22={"spatula","抹刀",n,"0"};
    	String[] v23={"spawn","(鱼等)卵子；大量生产",n+v,"0"};
    	String[] v24={"spear","矛，嫩叶；刺戳",n+v,"0"};
    	String[] v25={"specialize","专门研究",v,"0"};
    	String[] v26={"specifics","细小问题",n,"0"};
    	String[] v27={"specimen","范例，样品，标本",n,"0"};
    	String[] v28={"specious","似是而非的，华而不实的",a,"0"};
    	String[] v29={"speck","斑点，少量",n,"0"};
    	String[] v30={"spectacular","壮观的，引人入胜的",a,"0"};
    	String[] v31={"spectator","观众，观看者",n,"0"};
    	String[] v32={"specter","鬼魂，幽灵，恐惧",n,"0"};
    	String[] v33={"spectral","幽灵的",a,"0"};
    	String[] v34={"spectrum","光谱，范围",n,"0"};
    	String[] v35={"speculate","沉思，思索，投机",v,"0"};
    	String[] v36={"speculative","投机的，推理的，思索的",a,"0"};
    	String[] v37={"spell","连续的一段时间",n,"0"};
    	String[] v38={"spendthrift","挥金如土的(人)",a+n,"0"};
    	String[] v39={"spike","长钉，大钉",n,"0"};
    	String[] v40={"spin","旋转，纺纱；旋转",v+n,"0"};
    	String[] v41={"spindly","细长的，纤弱的",a,"0"};
    	String[] v42={"spineless","没骨气的，懦弱的",a,"0"};
    	String[] v43={"spiny","针状的，多刺的",a,"0"};
    	String[] v44={"spire","(教堂)尖顶",n,"0"};
    	String[] v45={"spiritual","精神的",a,"0"};
    	String[] v46={"spite","怨恨，恶意",n,"0"};
    	String[] v47={"spleen","怨怒",n,"0"};
    	String[] v48={"splendor","壮丽，辉煌",n,"0"};
    	String[] v49={"splice","结合，衔接",v,"0"};
    	String[] v50={"splint","(固定断骨的)夹板",n,"0"};
    	String[] v51={"split","分裂，分开",v+n,"0"};
        String[] v52={"splurge","炫耀，摆阔",n,"0"};
        String[] v53={"spoil","损坏，破坏，溺爱",v,"0"};
        String[] v54={"spoke","辐条",n,"0"};
        String[] v55={"spongy","像海绵的，不坚实的",a,"0"};
        String[] v56={"spontaneity","自然，自发",n,"0"};
        String[] v57={"spontaneous","自发的，自然的",a,"0"};
        String[] v58={"spoof","揶揄",v,"0"};
        String[] v59={"sporadic","不定时发生的",a,"0"};
        String[] v60={"sport","卖弄，炫耀",v,"0"};		
    	String[] v61={"sprain","扭伤",v,"0"};
        String[] v62={"sprawling","植物蔓生的，(城市)无计划扩展的",a,"0"};
       	String[] v63={"sprig","嫩枝",n,"0"};
       	String[] v64={"sprightly","愉快的，活泼的",a,"0"};
       	String[] v65={"sprout","长出，萌芽；嫩芽",v+n,"0"};
       	String[] v66={"spruce","云杉；整洁的",n+a,"0"};
        String[] v67={"spur","刺激，激励，用马刺刺马",v,"0"};
        String[] v68={"spurious","假的，伪造的",a,"0"};
        String[] v69={"squabble","争吵",n,"0"};
        String[] v70={"squalid","污秽的",a,"0"};
    	String[] v71={"squall","短暂而猛烈的风暴，短暂的骚动",n,"0"};
        String[] v72={"squalor","不洁，污秽",n,"0"};
       	String[] v73={"squander","浪费，挥霍",v,"0"};
       	String[] v74={"square","一直，符合，结清",v,"0"};
       	String[] v75={"squash","压碎，挤压；南瓜",v+n,"0"};
        String[] v76={"squat","蹲下；矮胖的",v+a,"0"};
        String[] v77={"squeeze","挤，压榨",v+n,"0"};
        String[] v78={"squelch","压制，镇压",v,"0"};
        String[] v79={"squint","斜视",v,"0"};
        String[] v80={"squirrel","松鼠",n,"0"};
    	String[] v81={"staccato","断音的，不连贯的",a,"0"};
        String[] v82={"stagnant","停滞的",a,"0"};
        String[] v83={"staid","稳重的，沉着的",a,"0"};
        String[] v84={"stain","玷污，染色",v,"0"};
        String[] v85={"stake","柱桩，赌注",n,"0"};
        String[] v86={"stale","不新鲜的，陈腐的",a,"0"};
        String[] v87={"stalemate","和棋，僵局",n,"0"};
        String[] v88={"stalk","隐伏跟踪",v,"0"};
        String[] v89={"stall","使停止，使延迟",v,"0"};
        String[] v90={"stalwart","健壮的，坚定的",a,"0"};
        String[] v91={"stammer","口吃，结巴",v,"0"};
        String[] v92={"stamp","跺脚，在...上盖印",n+v,"0"};
        String[] v93={"stance","站姿，立场",n,"0"};
        String[] v94={"stanch","制止(血液)，止住",v,"0"};
        String[] v95={"stanza","(诗)节，段",n,"0"};
        String[] v96={"staple","主要产品",n,"0"};
        String[] v97={"starchy","含淀粉的，刻板的",a,"0"};
        String[] v98={"stark","僵硬的，完全的",a,"0"};
        String[] v99={"startle","使吃惊",v,"0"};
        String[] v100={"stasis","停滞",n,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"static","静态的，呆板的",a,"0"};
        	String[] v102={"stationary","静止的，不动的",a,"0"};
        	String[] v103={"statuary","雕像，雕塑艺术",n,"0"};
        	String[] v104={"stature","身高，身材",n,"0"};
        	String[] v105={"status","身份，地位",n,"0"};
        	String[] v106={"statute","法规，法令",n,"0"};
        	String[] v107={"statutory","法定的，受法令约束的",a,"0"};
        	String[] v108={"steadfast","忠实的，不变的",a,"0"};
        	String[] v109={"stealth","秘密的行动",n,"0"};
        	String[] v110={"steep","浸泡，浸透",v,"0"};
        	String[] v111={"steer","操舵，驾驶；公牛，食用牛",v+n,"0"};
        	String[] v112={"stellar","星的，星球的",a,"0"};
        	String[] v113={"stem","茎，叶柄",n,"0"};
        	String[] v114={"stench","臭气",n,"0"};
        	String[] v115={"stencil","(刻字和图案的)模板；用模板刻写",n+v,"0"};
        	String[] v116={"stentorian","极响亮的",a,"0"};
        	String[] v117={"stereotype","固定形式，老套",n,"0"};
        	String[] v118={"sterile","贫瘠的，不孕的，无菌的",a,"0"};
        	String[] v119={"sterile","使不育，杀菌",v,"0"};
        	String[] v120={"stern","船尾",n,"0"};
        	String[] v121={"stethoscope","听诊器",n,"0"};
        	String[] v122={"stickler","坚持细节之人",n,"0"};
        	String[] v123={"stiff","僵直的，呆板的，严厉的",a,"0"};
        	String[] v124={"stifle","感到窒息",v,"0"};
        	String[] v125={"stigma","耻辱的标志，污点",n,"0"};
        	String[] v126={"stigmatize","污蔑，玷污",v,"0"};
        	String[] v127={"stilted","(文章、谈话)不自然的，夸张的",a,"0"};
        	String[] v128={"stimultant","兴奋剂，刺激物",n,"0"};
        	String[] v129={"stimulus","刺激物，激励",n,"0"};
        	String[] v130={"sting","刺痛，叮蛰；刺",v+n,"0"};
        	String[] v131={"stinginess","小气",n,"0"};
        	String[] v132={"stingy","吝啬的，小气的",a,"0"};
        	String[] v133={"stint","吝惜，节省",v,"0"};
        	String[] v134={"stipple","点画，点描",v,"0"};
        	String[] v135={"stipulate","要求以...为条件，约定",v,"0"};
        	String[] v136={"stipulation","规定，约定",n,"0"};
        	String[] v137={"stir","刺激",v,"0"};
        	String[] v138={"stitch","一针，一钩；缝合",v+n,"0"};
        	String[] v139={"stock","普通的，惯用的；存货",a+n,"0"};
        	String[] v140={"stockade","栅栏，围栏",n,"0"};
        	String[] v141={"stocky","矮胖的，粗壮的",a,"0"};
        	String[] v142={"stodgy","乏味的",a,"0"};
        	String[] v143={"stoic","坚忍克己之人",n,"0"};
        	String[] v144={"stoke","给..加燃料",v,"0"};
        	String[] v145={"stolid","无动于衷的",a,"0"};
        	String[] v146={"stomach","容忍",v,"0"};
        	String[] v147={"stonewall","拖延议事，设置障碍",v,"0"};
        	String[] v148={"stout","肥胖的，强壮的",a,"0"};
        	String[] v149={"stowaway","(藏于船，飞机中的)偷乘者",n,"0"};
        	String[] v150={"straightforward","正直的，直截了当的，易懂的",a,"0"};
        	String[] v151={"strand","绳线的一股；搁浅",n+v,"0"};
        	String[] v152={"stranded","搁浅的，进退两难的",a,"0"};
        	String[] v153={"stratagem","谋略",n,"0"};
        	String[] v154={"stratify","层化",v,"0"};
        	String[] v155={"stratum","地层，阶层",n,"0"};
        	String[] v156={"stray","偏离，迷路；迷了路的，零落的",v+a,"0"};
        	String[] v157={"streak","线条，条纹；加线条",n+v,"0"};
        	String[] v158={"stream","小溪，水流，倾注，涌流",n+v,"0"};
        	String[] v159={"stretch","变长，伸展",v,"0"};
        	String[] v160={"strew","撒，撒播",v,"0"};
        	String[] v161={"striate","在...上加上条纹",v,"0"};
        	String[] v162={"striated","有条纹的",a,"0"};
        	String[] v163={"stricture","严厉谴责，束缚",n,"0"};
        	String[] v164={"stride","大步行走",v,"0"};
        	String[] v165={"strident","尖声的，刺耳的",a,"0"};
        	String[] v166={"strife","纷争，冲突",n,"0"};
        	String[] v167={"striking","引人注目的，明显的",a,"0"};
        	String[] v168={"stringent","严格的，苛刻的，缺钱的",a,"0"};
        	String[] v169={"strip","剥去；狭长的一片",v+n,"0"};
        	String[] v170={"strive","奋斗，努力",v,"0"};
        	
        	
        	
        	
        	
        	
   			subInitial(v1);
   			subInitial(v2);
   			subInitial(v3);
   			subInitial(v4);
   			subInitial(v5);
   			subInitial(v6);
   			subInitial(v7);
   			subInitial(v8);
   			subInitial(v9);
   			subInitial(v10);
   			subInitial(v11);
   			subInitial(v12);
   			subInitial(v13);
   			subInitial(v14);
   			subInitial(v15);
   			subInitial(v16);
   			subInitial(v17);
   			subInitial(v18);
   			subInitial(v19);
   			subInitial(v20);
   			subInitial(v21);
   			subInitial(v22);
   			subInitial(v23);
   			subInitial(v24);
   			subInitial(v25);
   			subInitial(v26);
   			subInitial(v27);
   			subInitial(v28);
   			subInitial(v29);
   			subInitial(v30);
   			subInitial(v31);
   			subInitial(v32);
   			subInitial(v33);
   			subInitial(v34);
   			subInitial(v35);
   			subInitial(v36);
   			subInitial(v37);
   			subInitial(v38);
   			subInitial(v39);
   			subInitial(v40);
   			subInitial(v41);
   			subInitial(v42);
   			subInitial(v43);
   			subInitial(v44);
   			subInitial(v45);
   			subInitial(v46);
   			subInitial(v47);
   			subInitial(v48);
   			subInitial(v49);
   			subInitial(v50);
   			
   			subInitial(v51);
   			subInitial(v52);
   			subInitial(v53);
   			subInitial(v54);
   			subInitial(v55);
   			subInitial(v56);
   			subInitial(v57);
   			subInitial(v58);
   			subInitial(v59);
   			subInitial(v60);
   			subInitial(v61);
   			subInitial(v62);
   			subInitial(v63);
   			subInitial(v64);
   			subInitial(v65);
   			subInitial(v66);
   			subInitial(v67);
   			subInitial(v68);
   			subInitial(v69);
   			subInitial(v70);
   			subInitial(v71);
   			subInitial(v72);
   			subInitial(v73);
   			subInitial(v74);
   			subInitial(v75);
   			subInitial(v76);
   			subInitial(v77);
   			subInitial(v78);
   			subInitial(v79);
   			subInitial(v80);
   			subInitial(v81);
   			subInitial(v82);
   			subInitial(v83);
   			subInitial(v84);
   			subInitial(v85);
   			subInitial(v86);
   			subInitial(v87);
   			subInitial(v88);
   			subInitial(v89);
   			subInitial(v90);
   			subInitial(v91);
   			subInitial(v92);
   			subInitial(v93);
   			subInitial(v94);
   			subInitial(v95);
   			subInitial(v96);
   			subInitial(v97);
   			subInitial(v98);
   			subInitial(v99);
   			subInitial(v100);
   			subInitial(v101);
   			subInitial(v102);
   			subInitial(v103);
   			subInitial(v104);
   			subInitial(v105);
   			subInitial(v106);
   			subInitial(v107);
   			subInitial(v108);
   			subInitial(v109);
   			subInitial(v110);
   			subInitial(v111);
   			subInitial(v112);
   			subInitial(v113);
   			subInitial(v114);
   			subInitial(v115);
   			subInitial(v116);
   			subInitial(v117);
   			subInitial(v118);
   			
   			subInitial(v119);
   			subInitial(v120);
   			subInitial(v121);
   			subInitial(v122);
   			subInitial(v123);
   			subInitial(v124);
   			subInitial(v125);
   			subInitial(v126);
   			subInitial(v127);
   			subInitial(v128);
   			subInitial(v129);
   			subInitial(v130);
   			subInitial(v131);
   			subInitial(v132);
   			subInitial(v133);
   			subInitial(v134);
   			subInitial(v135);
   			subInitial(v136);
   			subInitial(v137);
   			subInitial(v138);
   			subInitial(v139);
   			subInitial(v140);
   			subInitial(v141);
   			subInitial(v142);
   			subInitial(v143);
   			subInitial(v144);
   			subInitial(v145);
   			subInitial(v146);
   			subInitial(v147);
   			subInitial(v148);
   			subInitial(v149);
   			subInitial(v150);
   			subInitial(v151);
   			subInitial(v152);
   			subInitial(v153);
   			subInitial(v154);
   			subInitial(v155);
   			subInitial(v156);
   			subInitial(v157);
   			subInitial(v158);
   			subInitial(v159);
   			subInitial(v160);
   			subInitial(v161);
   			subInitial(v162);
   			subInitial(v163);
   			subInitial(v164);
   			subInitial(v165);
   			subInitial(v166);
   			subInitial(v167);
   			subInitial(v168);
   			subInitial(v169);
   			subInitial(v170);
   			
        	
        	
        	
        	
        	
    	
    }
    private void doList_35(){
    	
    	String[] v1={"stroke","抚摸；击打，一笔",v+n,"0"};
    	String[] v2={"stroll","漫步，闲逛",v,"0"};
    	String[] v3={"strut","趾高气扬地走；支柱",v+n,"0"};
    	String[] v4={"stubborn","固执的，难以改变的",a,"0"};
    	String[] v5={"studied","慎重的，认真习得的",a,"0"};
    	String[] v6={"stuffy","(空气)不新鲜的，闷人的",a,"0"};
    	String[] v7={"stultify","使变得荒谬可笑，使无用",v,"0"};
    	String[] v8={"stunning","极富魅力的",a,"0"};
    	String[] v9={"stunt","阻碍(成长)；特技，绝技",v+n,"0"};
    	String[] v10={"stupor","昏迷，不省人事",n,"0"};
    	String[] v11={"sturdy","(身体)强健的，结实的",a,"0"};
    	String[] v12={"stutter","口吃",n+v,"0"};
    	String[] v13={"stygian","阴暗的，阴森森的",a,"0"};
    	String[] v14={"stylus","铁笔",n,"0"};
    	String[] v15={"stymie","妨碍",v,"0"};
    	String[] v16={"subdue","征服，压制，减轻",v,"0"};
    	String[] v17={"subdued","(光和声)柔和的",a,"0"};
    	String[] v18={"subject","受支配的人",n,"0"};
    	String[] v19={"subjective","主观的",a,"0"};
    	String[] v20={"subjugate","征服，镇压",v,"0"};
    	String[] v21={"sublime","崇高的",a,"0"};
    	String[] v22={"subliminal","潜意识的",a,"0"};
    	String[] v23={"submission","丛属，服从",n,"0"};
    	String[] v24={"submit","屈服，提交",v,"0"};
    	String[] v25={"suborn","收买",v,"0"};
    	String[] v26={"subpoena","传票；传讯",n+v,"0"};
    	String[] v27={"subsequent","随后的，后来的",a,"0"};
    	String[] v28={"subside","(建筑物)下陷，(天气)平息",v,"0"};
    	String[] v29={"subsidiary","辅助的，次要的",a,"0"};
    	String[] v30={"subsidy","补助金",n,"0"};
    	String[] v31={"subsistence","生存，生计，存在",n,"0"};
    	String[] v32={"substance","大意，根据，实质，物质",n,"0"};
    	String[] v33={"substantial","坚固的，实质的",a,"0"};
    	String[] v34={"substantiate","证实",v,"0"};
    	String[] v35={"substantive","根本的，独立存在的",a,"0"};
    	String[] v36={"substitute","代替品；代替",n+v,"0"};
    	String[] v37={"subsume","包含，包容",v,"0"};
    	String[] v38={"subterfuge","诡计，托辞",n,"0"};
    	String[] v39={"subterranean","地下的",a,"0"};
    	String[] v40={"subtle","微妙的",a,"0"};
    	String[] v41={"subtract","减掉",v,"0"};
    	String[] v42={"subversive","颠覆性的",a,"0"};
    	String[] v43={"subvert","颠覆，推翻",v,"0"};
    	String[] v44={"succinct","简明的",a,"0"};
    	String[] v45={"succor","救助",v+n,"0"};
    	String[] v46={"succumb","屈从，因...死亡",v,"0"};
    	String[] v47={"suffice","足够，(食物)满足",v,"0"};
    	String[] v48={"sufficient","足够的",a,"0"};
    	String[] v49={"suffocate","(使)窒息而死",v,"0"};
    	String[] v50={"suffrage","选举权，投票权",n,"0"};
    	String[] v51={"suffragist","参政权扩大论者；妇女政权论者",n,"0"};
        String[] v52={"suffuse","(色彩)弥漫，染遍",v,"0"};
        String[] v53={"suitcase","手提箱",n,"0"};
        String[] v54={"sulky","生气的",a,"0"};
        String[] v55={"sullen","忧郁的",a,"0"};
        String[] v56={"sultry","闷热的，风骚的",a,"0"};
        String[] v57={"summarily","概括地，仓促地",d,"0"};
        String[] v58={"summary","总结；概括的",n+a,"0"};
        String[] v59={"summation","总数，合计",n,"0"};
        String[] v60={"summon","召见，召集",v,"0"};		
    	String[] v61={"sumptuous","奢侈的",a,"0"};
        String[] v62={"sunder","分裂，分离",v,"0"};
       	String[] v63={"superb","上乘的",a,"0"};
       	String[] v64={"supercilious","目中无人的",a,"0"};
       	String[] v65={"superficial","表面的，肤浅的",a,"0"};
       	String[] v66={"superficiality","浅薄",n,"0"};
        String[] v67={"superfluity","多余的量",n,"0"};
        String[] v68={"superfluous","多余的",a,"0"};
        String[] v69={"superimpose","加在上面",v,"0"};
        String[] v70={"superintend","监督",v,"0"};
    	String[] v71={"superiority","优越(感)",n,"0"};
        String[] v72={"supernova","超新星",n,"0"};
       	String[] v73={"supersede","淘汰，取代",v,"0"};
       	String[] v74={"supervise","监督，管理",v,"0"};
       	String[] v75={"supine","仰卧的，懒散的",a,"0"};
        String[] v76={"supplant","排挤，取代",v,"0"};
        String[] v77={"supple","伸屈自如的",a,"0"};
        String[] v78={"supplement","补充",n+v,"0"};
        String[] v79={"suppliant","恳求的，哀求的",a,"0"};
        String[] v80={"supplicant","乞求者，恳求者",n,"0"};
    	String[] v81={"supplicate","乞求",v,"0"};
        String[] v82={"supremacy","至高无上，霸权",n,"0"};
        String[] v83={"supreme","至高的",a,"0"};
        String[] v84={"surcharge","对...收取额外费用；附加费",v+n,"0"};
        String[] v85={"surfeit","(食物)过量；使过度",n+v,"0"};
        String[] v86={"surge","波涛汹涌，波动",v,"0"};
        String[] v87={"surgeon","外科医师，军医，船上的医生",n,"0"};
        String[] v88={"surly","脾气暴躁的",a,"0"};
        String[] v89={"surmise","推测，猜测",n+v,"0"};
        String[] v90={"surmount","克服，战胜",v,"0"};
        String[] v91={"surpass","超过",v,"0"};
        String[] v92={"surplus","过剩的，盈余的",a,"0"};
        String[] v93={"surrealism","超现实主义",n,"0"};
        String[] v94={"surrender","投降，放弃，归还",v,"0"};
        String[] v95={"surreptitious","鬼鬼祟祟的",a,"0"};
        String[] v96={"surrogate","代替品，代理人",n,"0"};
        String[] v97={"surveyor","测量员",n,"0"};
        String[] v98={"survive","幸存",v,"0"};
        String[] v99={"susceptibility","易感性",n,"0"};
        String[] v100={"susceptible","易受影响的",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"suspect","怀疑；嫌疑犯；可疑的",v+n+a,"0"};
        	String[] v102={"suspend","暂缓，吊，悬",v,"0"};
        	String[] v103={"suspense","悬念，挂念",n,"0"};
        	String[] v104={"suspicion","怀疑，觉察，嫌疑",n,"0"};
        	String[] v105={"suspicious","怀疑的",a,"0"};
        	String[] v106={"sustain","承受(困难)，支撑(重量)",v,"0"};
        	String[] v107={"sustained","持久的",a,"0"};
        	String[] v108={"sustenance","食物，生计",n,"0"};
        	String[] v109={"suture","缝线；缝合",n+v,"0"};
        	String[] v110={"svelte","(女人)体态苗条的",a,"0"};
        	String[] v111={"swagger","大摇大摆地走",v,"0"};
        	String[] v112={"swallow","吞下，忍受",v,"0"};
        	String[] v113={"swamp","沼泽；使陷入，淹没",n+v,"0"};
        	String[] v114={"sway","摇动",n+v,"0"};
        	String[] v115={"swell","肿胀，增强",v,"0"};
        	String[] v116={"sweltering","酷热的",a,"0"};
        	String[] v117={"swerve","突然改变方向",v,"0"};
        	String[] v118={"swift","迅速的，敏捷的",a,"0"};
        	String[] v119={"swill","冲洗，痛饮",v,"0"};
        	String[] v120={"swindle","诈骗",v,"0"};
        	String[] v121={"swine","猪",n,"0"};
        	String[] v122={"swing","摇摆，旋转；秋千",v+n,"0"};
        	String[] v123={"swirl","旋转；漩涡",v+n,"0"};
        	String[] v124={"sybaritic","放纵的",a,"0"};
        	String[] v125={"sycophant","马屁精",n,"0"};
        	String[] v126={"syllabus","教学纲要",n,"0"};
        	String[] v127={"symbiosis","共生",n,"0"};
        	String[] v128={"symmetry","对称",n,"0"};
        	String[] v129={"symphony","交响乐",n,"0"};
        	String[] v130={"synchronous","同时发生的",a,"0"};
        	String[] v131={"syndrome","综合症状",n,"0"};
        	String[] v132={"synergic","协同作用的",a,"0"};
        	String[] v133={"synopsis","摘要",n,"0"};
        	String[] v134={"synoptic","摘要的",a,"0"};
        	String[] v135={"synthesis","综合，合成",n,"0"};
        	String[] v136={"syringe","注射器",n,"0"};
        	String[] v137={"table","搁置，不加考虑",v,"0"};
        	String[] v138={"taboo","讳忌的；禁忌",a+v,"0"};
        	String[] v139={"tacit","心照不宣的",a,"0"};
        	String[] v140={"taciturn","沉默寡言的",a,"0"};
        	String[] v141={"tackiness","胶黏性",n,"0"};
        	String[] v142={"tackle","处理；滑车",v+n,"0"};
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		
    	
    }
    private void doList_36(){
    	String[] v1={"tact","机智，圆滑",n,"0"};
    	String[] v2={"tactic","手段，战术",n,"0"};
    	String[] v3={"tactile","有触觉的",a,"0"};
    	String[] v4={"tadpole","蝌蚪",n,"0"};
    	String[] v5={"taking","楚楚动人的",a,"0"};
    	String[] v6={"talisman","避邪物，护身符",n,"0"};
    	String[] v7={"tally","(使)一致",v,"0"};
    	String[] v8={"talon","猛禽的锐爪",n,"0"};
    	String[] v9={"tambourine","铃鼓",n,"0"};
    	String[] v10={"tame","驯服的",a,"0"};
    	String[] v11={"tamp","砸实，捣实",v,"0"};
    	String[] v12={"tamper","损害，窜改",v,"0"};
    	String[] v13={"tan","鞣(革)",v,"0"};
    	String[] v14={"tangential","切线的，离题的",a,"0"};
    	String[] v15={"tangible","可触摸的",a,"0"};
    	String[] v16={"tangle","缠结",v,"0"};
    	String[] v17={"tango","探戈舞",n,"0"};
    	String[] v18={"tangy","强烈的",a,"0"};
    	String[] v19={"tantalize","挑逗，使干着急",v,"0"};
    	String[] v20={"tantamount","与...相等的",a,"0"};
    	String[] v21={"tantrum","发脾气，发怒",n,"0"};
    	String[] v22={"taper","细蜡烛；逐渐变细",n+v,"0"};
    	String[] v23={"tapestry","挂毯",n,"0"};
    	String[] v24={"tardy","缓慢的，迟缓的",a,"0"};
    	String[] v25={"tare","杂草",n,"0"};
    	String[] v26={"tariff","关税",n,"0"};
    	String[] v27={"tarnish","失去光泽，晦暗",n+v,"0"};
    	String[] v28={"tarpaulin","防水油布",n,"0"};
    	String[] v29={"tart","酸的，尖酸的",a,"0"};
    	String[] v30={"tasty","味道好的",a,"0"};
    	String[] v31={"tatty","简陋的，不整洁的",a,"0"};
    	String[] v32={"taut","绷紧的",a,"0"};
    	String[] v33={"tauten","拉紧，绷紧",v,"0"};
    	String[] v34={"tawdry","华而不实的",a,"0"};
    	String[] v35={"taxing","繁重的",a,"0"};
    	String[] v36={"taxonomist","分类学家",n,"0"};
    	String[] v37={"tear","撕裂",v,"0"};
    	String[] v38={"tease","逗乐，戏弄，强求",n+v,"0"};
    	String[] v39={"technocrat","技术管理人员",n,"0"};
    	String[] v40={"tedious","冗长的",a,"0"};
    	String[] v41={"tedium","单调乏味",n,"0"};
    	String[] v42={"teeter","摇摆",v,"0"};
    	String[] v43={"telling","有效的，显著的",a,"0"};
    	String[] v44={"temerity","鲁莽，大胆",n,"0"};
    	String[] v45={"temp","做临时工作",v,"0"};
    	String[] v46={"temper","锤炼，缓和；脾气",v+n,"0"};
    	String[] v47={"tempest","暴风雨，骚动",n,"0"};
    	String[] v48={"tempestuous","狂暴的",a,"0"};
    	String[] v49={"tempo","(动作、生活的)步调，速度",n,"0"};
    	String[] v50={"temporal","时间的，世俗的",a,"0"};
    	String[] v51={"temporize","拖延，见风使舵",v,"0"};
        String[] v52={"temptation","诱惑，诱惑物",n,"0"};
        String[] v53={"tenable","站得住脚的，无懈可击的",a,"0"};
        String[] v54={"tenacious","坚韧不拔的",a,"0"};
        String[] v55={"tenacity","坚持，固执",n,"0"};
        String[] v56={"tenant","房客",n,"0"};
        String[] v57={"tend","照料，看顾",v,"0"};
        String[] v58={"tendentious","有偏见的",a,"0"};
        String[] v59={"tender","提出(意见)",v,"0"};
        String[] v60={"tenet","信念，教条，教义",n,"0"};		
    	String[] v61={"tenor","男高音，要点，要旨",n,"0"};
        String[] v62={"tension","紧张，焦虑，张力",n,"0"};
       	String[] v63={"tentative","试探性的",a,"0"};
       	String[] v64={"tenuous","稀薄的，空洞的",a,"0"};
       	String[] v65={"tenure","任期，终身职位",n,"0"};
       	String[] v66={"tepid","微温的",a,"0"};
        String[] v67={"terminal","终点，末端(的)",n+a,"0"};
        String[] v68={"terminate","终止",v,"0"};
        String[] v69={"termination","终点",n,"0"};
        String[] v70={"terminology","术语，术语学",n,"0"};
    	String[] v71={"terminus","终点站",n,"0"};
        String[] v72={"termite","白蚁",n,"0"};
       	String[] v73={"terrace","一层梯田，阳台",n,"0"};
       	String[] v74={"terrain","地势，地形",n,"0"};
       	String[] v75={"terrestrial","地球的，陆地的",a,"0"};
        String[] v76={"terse","简洁的，简明的",a,"0"};
        String[] v77={"testament","遗嘱，证明",n,"0"};
        String[] v78={"testater","立遗嘱的人",n,"0"};
        String[] v79={"testify","见证，证实",v,"0"};
        String[] v80={"testimony","证言，证明",n,"0"};
    	String[] v81={"testiness","易怒",n,"0"};
        String[] v82={"testy","性急的",a,"0"};
        String[] v83={"tether","用绳拴住；绳、链，限度，范围",v+n,"0"};
        String[] v84={"texture","质地，结构",n,"0"};
        String[] v85={"thatch","以茅草覆盖；茅草",v+n,"0"};
        String[] v86={"thaw","解冻，融化",v,"0"};
        String[] v87={"thematic","主题的",a,"0"};
        String[] v88={"theocracy","神权政治",n,"0"};
        String[] v89={"theoretical","不切实际的，理论上的",a,"0"};
        String[] v90={"therapeutic","治病的",a,"0"};
        String[] v91={"thermal","热量的，温暖的",a,"0"};
        String[] v92={"thesis","论题，论文",n,"0"};
        String[] v93={"thicket","树丛，灌木丛",n,"0"};
        String[] v94={"thorn","刺，荆棘",n,"0"};
        String[] v95={"thread","螺纹",n,"0"};
        String[] v96={"threadbare","磨破的，陈腐的",a,"0"};
        String[] v97={"threat","威胁，恐吓，凶兆",n,"0"};
        String[] v98={"thrive","茁壮成长",v,"0"};
        String[] v99={"throne","宝座，王位",n,"0"};
        String[] v100={"throng","一大群；拥挤",n+v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"throwback","返租现象，复旧",n,"0"};
        	String[] v102={"thrust","猛力推，刺，戳",v,"0"};
        	String[] v103={"thwart","阻挠，使...受挫",v,"0"};
        	String[] v104={"tickler","棘手的问题，难题",n,"0"};
        	String[] v105={"ticklish","怕痒的，易怒的",a,"0"};
        	String[] v106={"tidy","整齐的，整洁的",a,"0"};
        	String[] v107={"tiff","吵嘴，怄气",n,"0"};
        	String[] v108={"tightfisted","吝啬的",a,"0"};
        	String[] v109={"tilt","使倾斜；倾斜，斜坡",v+n,"0"};
        	String[] v110={"timber","木材，(人)品质",n,"0"};
        	String[] v111={"timbre","音色，音质",n,"0"};
        	String[] v112={"timely","适时的，及时的",a,"0"};
        	String[] v113={"timid","胆怯的",a,"0"};
        	String[] v114={"timidity","胆怯",n,"0"};
        	String[] v115={"timorous","胆小的，胆怯的",a,"0"};
        	String[] v116={"tinder","火种",n,"0"};
        	String[] v117={"tined","尖端的",a,"0"};
        	String[] v118={"tinker","补锅工人；拙劣修补",n+v,"0"};
        	String[] v119={"tint","色泽；给...淡淡着色",n+v,"0"};
        	String[] v120={"tirade","长篇的攻击性讲话",n,"0"};
        	String[] v121={"tire","轮胎；变疲劳",n+v,"0"};
        	String[] v122={"tissue","细胞组织，薄纸，棉纸",n,"0"};
        	String[] v123={"titanic","巨大的，力大无比的",a,"0"};
        	String[] v124={"titular","有名无实的，名义上的",a,"0"};
        	String[] v125={"toady","谄媚者",n,"0"};
        	String[] v126={"toil","辛苦，辛勤劳作",n+v,"0"};
        	String[] v127={"tolerance","容忍，容许量，公差",n,"0"};
        	String[] v128={"toll","过路费，伤亡人数，损失；(缓慢而又规律的)敲",n+v,"0"};
        	String[] v129={"tombstone","墓碑",n,"0"};
        	String[] v130={"tongs","夹子，钳子",n,"0"};
        	String[] v131={"tonic","增进健康之物，补品；滋补的",n+a,"0"};
        	String[] v132={"tonsorial","理发师的，理发的",a,"0"};
        	String[] v133={"topple","倾覆，推倒",v,"0"};
        	String[] v134={"torment","折磨，痛苦",n,"0"};
        	String[] v135={"tornado","飓风，龙卷风",n,"0"};
        	String[] v136={"torpid","懒散的，死气沉沉的",a,"0"};
        	String[] v137={"torpor","死气沉沉",n,"0"};
        	String[] v138={"torque","转矩，项圈",n,"0"};
        	String[] v139={"torrent","洪流，急流",n,"0"};
        	String[] v140={"tortuous","弯弯曲曲的",a,"0"};
        	String[] v141={"toss","投、掷，使摇动",v,"0"};
        	String[] v142={"totalitarian","极权主义的",a,"0"};
        	String[] v143={"totem","图腾，徽章",n,"0"};
        	String[] v144={"totter","摇摇欲坠，步履蹒跚",v,"0"};
        	String[] v145={"touchy","敏感的，易发脾气的",a,"0"};
        	String[] v146={"toupee","男用假发",n,"0"};
        	String[] v147={"tournament","比赛，骑士比武大会",n,"0"};
        	String[] v148={"tourniquet","止血带",n,"0"};
        	String[] v149={"tout","招徕顾客，极力赞扬",n,"0"};
        	String[] v150={"toxic","有毒的，中毒的",a,"0"};
        	String[] v151={"toxin","毒素",n,"0"};
        	String[] v152={"toy","不认真考虑，玩弄",v,"0"};
        	String[] v153={"traceable","可追踪的",a,"0"};
        	String[] v154={"track","足迹，踪迹，轨道，小道；跟踪",n+v,"0"};
        	String[] v155={"tract","传单，大片土地",n,"0"};
        	String[] v156={"tractability","温顺",n,"0"};
        	String[] v157={"tractable","易于驾驭的，温顺的",a,"0"};
        	String[] v158={"tragedy","悲剧，灾难",n,"0"};
        	String[] v159={"trait","人的显著特性",n,"0"};
        	String[] v160={"traitor","卖国贼，叛徒",n,"0"};
        	String[] v161={"trajectory","抛射弹道",n,"0"};
        	String[] v162={"trample","踩坏，践踏",v,"0"};
        	String[] v163={"trance","恍惚，昏睡状态",n,"0"};
        	String[] v164={"tranquility","宁静，安静",n,"0"};
        	String[] v165={"transaction","办理，交易",n,"0"};
        	String[] v166={"transcend","超越，胜过",v,"0"};
        	String[] v167={"transcendent","卓越的",a,"0"};
        	String[] v168={"transcendental","超越经验的",a,"0"};
        	String[] v169={"transcribe","抄写，转录",v,"0"};
        	String[] v170={"transfer","转移，传递，调任，转让",v,"0"};
        	String[] v171={"transfigure","美化，改观",v,"0"};
        	String[] v172={"transgress","冒犯，违背",v,"0"};
        	String[] v173={"transgression","违法，罪过",n,"0"};
        	String[] v174={"transience","短暂",n,"0"};
        	String[] v175={"transient","短暂的",a,"0"};
        	String[] v176={"transition","过渡时期",n,"0"};
        	String[] v177={"transitory","短暂的",a,"0"};
        	String[] v178={"translucent","(半)透明的",a,"0"};
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);
    		subInitial(v159);
    		subInitial(v160);
    		subInitial(v161);
    		subInitial(v162);
    		subInitial(v163);
    		subInitial(v164);
    		subInitial(v165);
    		subInitial(v166);
    		subInitial(v167);
    		subInitial(v168);
    		subInitial(v169);
    		subInitial(v170);
    		subInitial(v171);
    		subInitial(v172);
    		subInitial(v173);
    		subInitial(v174);
    		subInitial(v175);
    		subInitial(v176);
    		subInitial(v177);
    		subInitial(v178);
    		
        	
    	
    }
    private void doList_37(){
    	
    	String[] v1={"transmit","传送，传播",v,"0"};
    	String[] v2={"transmute","变化，变作",v,"0"};
    	String[] v3={"transparent","透明的，直率的",a,"0"};
    	String[] v4={"transplantation","移植",n,"0"};
    	String[] v5={"transport","运输；狂喜",v+n,"0"};
    	String[] v6={"transpose","变换位置，调换",v,"0"};
    	String[] v7={"trapeze","空中秋千",n,"0"};
    	String[] v8={"traverse","横穿过，横跨",v,"0"};
    	String[] v9={"travesty","歪曲模仿，曲解",v+n,"0"};
    	String[] v10={"treacherous","背叛的，奸诈的",a,"0"};
    	String[] v11={"treason","叛国罪",n,"0"};
    	String[] v12={"treatise","论文",n,"0"};
    	String[] v13={"treaty","条约，协议",n,"0"};
    	String[] v14={"tremendous","惊人的",a,"0"};
    	String[] v15={"tremor","震动，地震",n,"0"};
    	String[] v16={"trenchant","一针见血的",a,"0"};
    	String[] v17={"trend","趋势，倾向",n+v,"0"};
    	String[] v18={"trepidation","恐惧，惶恐",n,"0"};
    	String[] v19={"trespass","侵犯，闯入私人领地",v,"0"};
    	String[] v20={"tribunal","法庭，裁判所",n,"0"};
    	String[] v21={"tribute","赞辞，贡物",n,"0"};
    	String[] v22={"trickle","一滴滴地流；细流",v+n,"0"};
    	String[] v23={"trifle","微不足道，琐事",n,"0"};
    	String[] v24={"trigger","扳机；引发，导致",n+v,"0"};
    	String[] v25={"trilogy","三部曲",n,"0"};
    	String[] v26={"trim","修剪；井井有条",v+a,"0"};
    	String[] v27={"trinket","小装饰品，不值钱的珠宝",n,"0"};
    	String[] v28={"trio","三重奏，三重唱，三人一组",n,"0"};
    	String[] v29={"tripod","三脚架",n,"0"};
    	String[] v30={"trite","陈腐的",a,"0"};
    	String[] v31={"triumph","凯旋，欢欣",n+v,"0"};
    	String[] v32={"trivial","琐细的",a,"0"};
    	String[] v33={"trophy","奖品",n,"0"};
    	String[] v34={"troupe","歌唱团，剧团",n,"0"};
    	String[] v35={"trowel","泥刀，小铲",n,"0"};
    	String[] v36={"truancy","逃学，旷课",n,"0"};
    	String[] v37={"truce","停战",n,"0"};
    	String[] v38={"truculent","残暴的，凶狠的",a,"0"};
    	String[] v39={"trudge","跋涉",v,"0"};
    	String[] v40={"trumpet","喇叭，小号",n,"0"};
    	String[] v41={"truncate","把...截短，去尾",v,"0"};
    	String[] v42={"trunk","树干，大衣箱",n,"0"};
    	String[] v43={"truss","支架，一捆(干草)",n,"0"};
    	
    	String[] v45={"trustworthy","值得信赖的",a,"0"};
    	String[] v46={"tuber","块茎，球根",n,"0"};
    	String[] v47={"tumult","乱哄哄",n,"0"};
    	String[] v48={"turbulent","导致动乱的，骚乱的",a,"0"};
    	String[] v49={"turgid","浮肿的，肿胀的，浮夸的",a,"0"};
    	String[] v50={"turmoil","混乱，骚乱",n,"0"};
    	String[] v51={"turncoat","背叛者",n,"0"};
        String[] v52={"turpitude","邪恶，卑鄙(行为)",n,"0"};
        String[] v53={"turquoise","绿松石；碧绿的",n+a,"0"};
        String[] v54={"turret","塔楼，角塔",n,"0"};
        String[] v55={"tusk","(大象的)长牙",n,"0"};
        String[] v56={"tussle","扭打，搏斗，争辩",n+v,"0"};
        String[] v57={"tutor","助教，监护人；辅导",n+v,"0"};
        String[] v58={"tuxedo","礼服，无尾礼服",n,"0"};
        String[] v59={"twig","小枝，嫩枝",n,"0"};
        String[] v60={"twinge","(生理、心理)剧痛",n,"0"};		
    	String[] v61={"typo","排印错误",n,"0"};
        String[] v62={"typographical","印刷上的",a,"0"};
       	String[] v63={"tyranny","暴行，暴政，专制统治",n,"0"};
       	String[] v64={"tyrant","暴君",n,"0"};
       	String[] v65={"tyro","新手",n,"0"};
       	String[] v66={"ubiquitous","无所不在的",a,"0"};
        String[] v67={"ugly","难看的，可怕的",a,"0"};
        String[] v68={"ulcer","溃疡，腐烂物",n,"0"};
        String[] v69={"ultimate","最后的",a,"0"};
        String[] v70={"umbrage","不快，愤怒",n,"0"};
    	String[] v71={"umpire","裁判；对...仲裁",n+v,"0"};
        String[] v72={"unaffected","自然的，不娇柔造作的",a,"0"};
       	String[] v73={"unanimous","全体意见一致的",a,"0"};
       	String[] v74={"unassuming","不摆架子的，不造作的",a,"0"};
       	String[] v75={"unbecoming","不合身的，不得体的",a,"0"};
        String[] v76={"unbend","弄直，放松",v,"0"};
        String[] v77={"uncanny","神秘的，不可思议的",a,"0"};
        String[] v78={"uncommited","不受约束的，不承担责任的",a,"0"};
        String[] v79={"unconscionable","无节制的，过度的",a,"0"};
        String[] v80={"unconscious","不省人事的，未意识到的",a,"0"};
    	String[] v81={"uncouth","粗野笨拙的",a,"0"};
        String[] v82={"unctuous","油质的",a,"0"};
        String[] v83={"underbid","要价过低",v,"0"};
        String[] v84={"undercut","削价抢生意",v,"0"};
        String[] v85={"underdog","失败者，受压迫者",n,"0"};
        String[] v86={"underestimated","低估的",a,"0"};
        String[] v87={"undergird","加强，巩固...的底部",v,"0"};
        String[] v88={"underhanded","不光明的，",a,"0"};
        String[] v89={"underling","下属，手下",n,"0"};
        String[] v90={"underlying","在下面的，根本的",a,"0"};
        String[] v91={"undermine","破坏，损坏",v,"0"};
        String[] v92={"underplay","淡化...的重要性，表演(角色)不够充分",v,"0"};
        String[] v93={"underrate","低估，轻视",v,"0"};
        String[] v94={"underscore","在...之下画线，强调",v,"0"};
        String[] v95={"understate","掩饰地说，轻描淡写地说",v,"0"};
        String[] v96={"understated","不完全陈述的",a,"0"};
        String[] v97={"understatement","轻描淡写的陈述，不完全的陈述",n,"0"};
        String[] v98={"understudy","预备演员，替角；充当...的替角",n+v,"0"};
        String[] v99={"underutilized","为充分利用的",a,"0"};
        String[] v100={"underwrite","同意负担...的费用，为...保险",v,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"undeserved","不应得的",a,"0"};
        	String[] v102={"undesirable","令人不悦的",a,"0"};
        	String[] v103={"undirected","未受指导的",a,"0"};
        	String[] v104={"unearth","挖出，发现",v,"0"};
        	String[] v105={"unearthly","奇异的",a,"0"};
        	String[] v106={"unenlightened","愚昧无知的，不文明的",a,"0"};
        	String[] v107={"unexceptionable","无可非议的",a,"0"};
        	String[] v108={"unfailing","无尽的，无穷的",a,"0"};
        	String[] v109={"unfasten","解开",v,"0"};
        	String[] v110={"unfeigned","真实的，不做假的",a,"0"};
        	String[] v111={"unflappable","不惊慌的，镇定的",a,"0"};
        	String[] v112={"unfold","展开，打开，逐渐呈现",v,"0"};
        	String[] v113={"unfounded","无事实根据的",a,"0"};
        	String[] v114={"ungainly","笨拙的",a,"0"};
        	String[] v115={"ungrudging","慷慨的",a,"0"};
        	String[] v116={"unguent","药膏，软膏",n,"0"};
        	String[] v117={"unicorn","独角兽",n,"0"};
        	String[] v118={"unidimensional","一方面的，一维的",a,"0"};
        	String[] v119={"unification","统一，一致",n,"0"};
        	String[] v120={"uniform","制服；相同的，一致的",n+a,"0"};

            String[] v1202={"unify","统一，使成一体，使相同",v,"0"};
        	String[] v121={"unimpassioned","没有激情的",a,"0"};
        	String[] v122={"unimpeachable","无可指责的，无可置疑的",a,"0"};
        	String[] v123={"uninitiated","外行的，缺乏经验的",a,"0"};
        	String[] v124={"unique","独一无二的，独特的",a,"0"};
        	String[] v125={"univocal","意思明确的，单一意思的",a,"0"};
        	String[] v126={"unjustified","未被证明正当的，无法解释的",a,"0"};
        	String[] v127={"unjustly","不义地，不法地",d,"0"};
        	String[] v128={"unkempt","(仪表)不整洁的",a,"0"};
        	String[] v129={"unleash","发泄，释放",v,"0"};
        	String[] v130={"unmitigated","未缓和的，未减轻的，全然的",a,"0"};
        	String[] v131={"unmoved","无动于衷的，冷漠的，镇定的",a,"0"};
        	String[] v132={"unnoticed","不引人注意的",a,"0"};
        	String[] v133={"unobtrusive","不引人注目的",a,"0"};
        	String[] v134={"unpalatable","令人讨厌的",a,"0"};
        	String[] v135={"unprecedented","前所未有的",a,"0"};
        	String[] v136={"unpremeditated","非预谋的",a,"0"};
        	String[] v137={"unprepossessing","不吸引人的",a,"0"};
        	String[] v138={"unpretentious","不炫耀的",a,"0"};
        	String[] v139={"unprincipled","肆无忌惮的，不道德的",a,"0"};
        	String[] v140={"unproductive","徒然的，无成效的",a,"0"};
        	String[] v141={"unprovoked","无缘无故的(生气)",a,"0"};
        	String[] v142={"unqualified","无资格的，无限制的，绝对的",a,"0"};
        	String[] v143={"unravel","解开，拆散",v,"0"};
        	String[] v144={"unregenerate","不知悔改的",a,"0"};
        	String[] v145={"unregulated","未受管理的，未受约束的",a,"0"};
        	String[] v146={"unremitting","不间断的，持续的",a,"0"};
        	String[] v147={"unrepentant","不悔悟的，不后悔的",a,"0"};
        	String[] v148={"unrequited","无报答的",a,"0"};
        	String[] v149={"unreserved","无限制的，未被预定的",a,"0"};
        	String[] v150={"unscathed","未受损伤的，伪造伤害的",a,"0"};
        	String[] v151={"unscented","无气味的",a,"0"};
        	String[] v152={"unscrupulous","肆无忌惮的",a,"0"};
        	String[] v153={"unscrupulousness","放肆",n,"0"};
        	String[] v154={"unseemly","不适当的，不宜的",a,"0"};
        	String[] v155={"unsettle","使不安宁，搅乱",v,"0"};
        	String[] v156={"unsettling","令人不安的，扰乱的",a,"0"};
        	String[] v157={"unsound","无根据的，不结实的，不坚固的",a,"0"};
        	String[] v158={"unspoiled","未损坏的，未宠坏的",a,"0"};
        	String[] v159={"unspotted","清白的，无污点的",a,"0"};
        	String[] v160={"unstinting","极为慷慨的",a,"0"};
        	String[] v161={"unsubstantiated","未经证实的，无事实根据的",a,"0"};
        	String[] v162={"untapped","未开发的，未利用的",a,"0"};
        	String[] v163={"unthreatening","不威胁的",a,"0"};
        	String[] v164={"untimely","过早的，不适时的",a,"0"};
        	String[] v165={"untold","无数的",a,"0"};
        	String[] v166={"untoward","不幸的，(坏事)没料到的",a,"0"};
        	String[] v167={"untutored","未经教育的",a,"0"};
        	String[] v168={"unwarranted","没有根据的",a,"0"};
        	String[] v169={"unwieldy","笨重的，笨拙的",a,"0"};
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v1202);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);
    		subInitial(v159);
    		subInitial(v160);
    		subInitial(v161);
    		subInitial(v162);
    		subInitial(v163);
    		subInitial(v164);
    		subInitial(v165);
    		subInitial(v166);
    		subInitial(v167);
    		subInitial(v168);
    		subInitial(v169);
    	
        	
    	
    }
    private void doList_38(){
    	
    	
    	
    	String[] v1={"unwitting","无心的，不经意的",a,"0"};
    	String[] v2={"unwonted","不寻常的，不习惯的",a,"0"};
    	String[] v3={"unworldly","非世俗的，精神上的",a,"0"};
    	String[] v4={"upbraid","斥责，责骂",v,"0"};
    	String[] v5={"upgrade","提升，给...升级",v,"0"};
    	String[] v6={"upheaval","动乱，大变动",n,"0"};
    	String[] v7={"uphold","维护，支持",v,"0"};
    	String[] v8={"upright","垂直的，正直的",a,"0"};
    	String[] v9={"uproar","喧闹，骚动",n,"0"};
    	String[] v10={"uproarious","骚动的，喧嚣的，令人捧腹的",a,"0"};
    	String[] v11={"upstage","骄傲的，高傲的",a,"0"};
    	String[] v12={"upswing","上升，增长",n,"0"};
    	String[] v13={"urgent","迫切的，紧急的",a,"0"};
    	String[] v14={"usurp","篡夺，霸占",v,"0"};
    	String[] v15={"usury","高利贷",n,"0"};
    	String[] v16={"utilitarian","功利的",a,"0"};
    	String[] v17={"utilize","利用，使用",v,"0"};
    	String[] v18={"utopia","乌托邦，理想国",n,"0"};
    	String[] v19={"utopian","乌托邦式的",a,"0"};
    	String[] v20={"utter","完全的；发出声音",a+v,"0"};
    	String[] v21={"vaccinate","给...接种疫苗",v,"0"};
    	String[] v22={"vaccine","牛痘苗，疫苗",n,"0"};
    	String[] v23={"vaccillate","游移不定，踌躇",v,"0"};
    	String[] v24={"vacuous","发呆的",a,"0"};
    	String[] v25={"vagary","奇想，异想天开",n,"0"};
    	String[] v26={"vagrancy","游荡，流浪",n,"0"};
    	String[] v27={"vagrant","漂泊的；流浪汉，无赖",a+n,"0"};
    	String[] v28={"vague","模糊的",a,"0"};
    	String[] v29={"vain","自负的，徒劳的",a,"0"};
    	String[] v30={"valediction","告别演说",n,"0"};
    	String[] v31={"valedictory","告别的",a,"0"};
    	String[] v32={"valiant","勇敢的",a,"0"};
    	String[] v33={"validate","使...生效",v,"0"};
    	String[] v34={"valorous","勇敢的",a,"0"};
    	String[] v35={"valve","阀门",n,"0"};
    	String[] v36={"vandalism","恶意破坏(公物)",n,"0"};
    	String[] v37={"vandalize","肆意破坏",v,"0"};
    	String[] v38={"vanilla","香草",n,"0"};
    	String[] v39={"vanity","虚荣，自负",n,"0"};
    	String[] v40={"vanquish","征服",v,"0"};
    	String[] v41={"vantage","优势，有利地位",n,"0"};
    	String[] v42={"vapid","索然无味的",a,"0"};
    	String[] v43={"vaporization","蒸发",n,"0"};
    	String[] v44={"vaporize","(使)蒸发",v,"0"};
    	String[] v45={"vaporous","无实质的",a,"0"};
    	String[] v46={"variance","矛盾，不同",n,"0"};
    	String[] v47={"variegate","使...多样化",v,"0"};
    	String[] v48={"variegation","杂色，斑驳",n,"0"};
    	String[] v49={"varnish","清漆；上清漆",n+v,"0"};
    	String[] v50={"vascular","血管的",a,"0"};
    	String[] v51={"vault","拱顶，地窖",n,"0"};
        String[] v52={"veer","转向，改变(话题等)",v,"0"};
        String[] v53={"vehicle","交通工具，传播媒介",n,"0"};
        String[] v54={"veil","面纱，遮蔽物；用面纱遮蔽",n+v,"0"};
        String[] v55={"velocity","速度，迅速",n,"0"};
        String[] v56={"venal","唯利是图的，贪赃枉法的",a,"0"};
        String[] v57={"vendetta","世仇，宿怨",n,"0"};
        String[] v58={"vendor","小贩",n,"0"};
        String[] v59={"veneer","镶面板，外表",n,"0"};
        String[] v60={"venerate","崇敬，敬仰",v,"0"};		
    	String[] v61={"vengeance","报仇，报复",n,"0"};
        String[] v62={"vengeful","报复的，复仇心理的",a,"0"};
       	String[] v63={"venial","轻微的，可原谅的(错误)",a,"0"};
       	String[] v64={"venom","毒液，恶毒，痛恨",n,"0"};
       	String[] v65={"vent","发泄，开孔；孔",v+n,"0"};
       	String[] v66={"ventilate","使...通风",v,"0"};
        String[] v67={"ventriloquist","口技表演者",n,"0"};
        String[] v68={"veracious","诚实的",a,"0"};
        String[] v69={"veracity","真实性，诚实",n,"0"};
        String[] v70={"verbal","口头的，与言辞有关的",a,"0"};
    	String[] v71={"verbiage","啰嗦，冗长",n,"0"};
        String[] v72={"verbose","冗长的",a,"0"};
       	String[] v73={"verdant","青葱的，翠绿的",a,"0"};
       	String[] v74={"verdict","判决，决定",n,"0"};
       	String[] v75={"verdigris","铜锈，铜绿",n,"0"};
        String[] v76={"verified","检验的，核实的",a,"0"};
        String[] v77={"verify","证明，证实",v,"0"};
        String[] v78={"verisimilar","好像真实的，可能的",a,"0"};
        String[] v79={"veritable","确实的，名副其实的",a,"0"};
        String[] v80={"vernacular","本国语，地方语",n,"0"};
    	String[] v81={"versatile","多才多艺的，多用途的",a,"0"};
        String[] v82={"verse","诗歌",n,"0"};
        String[] v83={"vertex","(几何图形的)顶点",n,"0"};
        String[] v84={"vertical","垂直的",a,"0"};
        String[] v85={"vertigo","眩晕",n,"0"};
        String[] v86={"verve","神韵，生机",n,"0"};
        String[] v87={"vessel","血管，容器，船只",n,"0"};
        String[] v88={"vestige","痕迹，遗迹",n,"0"};
        String[] v89={"vestigial","退化的",a,"0"};
        String[] v90={"vestment","法衣，官服",n,"0"};
        String[] v91={"veteran","老兵，老手；经验丰富的",n+a,"0"};
        String[] v92={"veterinary","兽医的",a,"0"};
        String[] v93={"veto","否决，禁止",n,"0"};
        String[] v94={"vex","恼火",v,"0"};
        String[] v95={"vexation","困扰，苦恼",n,"0"};
        String[] v96={"viability","生存能力，存活力",n,"0"};
        String[] v97={"viable","可行的，能活下去的",a,"0"};
        String[] v98={"viaduct","高架桥",n,"0"};
        String[] v99={"vibrancy","生机勃勃，活泼",n,"0"};
        String[] v100={"vibrant","振动的，明快的，生机勃勃的",a,"0"};
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String[] v101={"vibrate","颤动，振动",v,"0"};
        	String[] v102={"vicar","教区牧师",n,"0"};
        	String[] v103={"vicarious","替代的，代理的",a,"0"};
        	String[] v104={"vicinity","附近，接近",n,"0"};
        	String[] v105={"vicious","残酷的，凶猛的，恶劣的",a,"0"};
        	String[] v106={"vicissitudinous","有变化的，变迁的",a,"0"};
        	String[] v107={"victimize","使受害，迫害",v,"0"};
        	String[] v108={"vie","竞争",v,"0"};
        	String[] v109={"vigilant","机警的，警惕的",a,"0"};
        	String[] v110={"vigorous","精力旺盛的，健壮的",a,"0"};
        	String[] v111={"vile","恶劣的，卑鄙的",a,"0"};
        	String[] v112={"vilify","辱骂，诽谤",v,"0"};
        	String[] v113={"vindicate","为...平反，证明...正确",v,"0"};
        	String[] v114={"vindictive","报复性的",a,"0"};
        	String[] v115={"vintner","酒商",n,"0"};
        	String[] v116={"violate","违反，触犯",v,"0"};
        	String[] v117={"violet","紫罗兰色的；紫罗兰",a+n,"0"};
        	String[] v118={"viral","病毒性的",a,"0"};
        	String[] v119={"virtual","实质上的",a,"0"};
        	String[] v120={"virtuosity","精湛，高超",n,"0"};
        	String[] v121={"virtuoso","演艺精湛的人",n,"0"};
        	String[] v122={"virtuous","有美德的，自命清高的",a,"0"};
        	String[] v123={"virulent","剧毒的，恶毒的",a,"0"};
        	String[] v124={"virus","病毒",n,"0"};
        	String[] v125={"viscid","黏性的",a,"0"};
        	String[] v126={"viscous","黏的",a,"0"};
        	String[] v127={"visionary","有远见的，幻想的；空想家",a+n,"0"};
        	String[] v128={"vista","远景，展望",n,"0"};
        	String[] v129={"vital","极其重要的，充满活力的",a,"0"};
        	String[] v130={"vitalize","激发活力",v,"0"};
        	String[] v131={"vitiate","削弱，损害",v,"0"};
        	String[] v132={"vitrify","使成玻璃",v,"0"};
        	String[] v133={"vitriolic","刻薄的",a,"0"};
        	String[] v134={"vituperate","痛斥，辱骂",v,"0"};
        	String[] v135={"vituperative","辱骂的",a,"0"};
        	String[] v136={"vivacious","活泼的，快活的",a,"0"};
        	String[] v137={"vivid","清晰的，鲜艳的，大胆的，活泼的，逼真的",a,"0"};
        	String[] v138={"vocalist","流行歌手，声乐家",n,"0"};
        	String[] v139={"vocation","擅长，职业",n,"0"};
        	String[] v140={"vogue","流行(的)",n+a,"0"};
        	String[] v141={"void","空的，缺乏的；空隙，空虚感",a+n,"0"};
        	String[] v142={"volatile","反复无常的，挥发性的",a,"0"};
        	String[] v143={"volition","决断力，意志",n,"0"};
        	String[] v144={"volley","齐发，群射",n+v,"0"};
        	String[] v145={"voluble","健谈的，易旋转的",a,"0"};
        	String[] v146={"voluminous","长篇的，多产的",a,"0"};
        	String[] v147={"voluptuous","撩人的，沉溺于酒色的",a,"0"};
        	String[] v148={"voracious","狼吞虎咽的，贪婪的",a,"0"};
        	String[] v149={"voracity","贪婪",n,"0"};
        	String[] v150={"votary","崇拜者，热心支持者",n,"0"};
        	String[] v151={"vouch","担保，证明",v,"0"};
        	String[] v152={"vulgar","无教养的",a,"0"};
        	String[] v153={"vulnerable","易受攻击的",a,"0"};
        	String[] v154={"vulture","秃鹫",n,"0"};
        	String[] v155={"vying","竞争的",a,"0"};
        	String[] v156={"waddle","(鸭子等)摇摇摆摆地走",v,"0"};
        	String[] v157={"waffle","蛋奶烘饼；胡扯，唠叨",n+v,"0"};
        	String[] v158={"waft","飘荡",v,"0"};
        	String[] v159={"wag","(狗尾等)摆动；幽默的人",v+n,"0"};
        	String[] v160={"wage","开始，进行(战争、运动)",v,"0"};
        	String[] v161={"waggish","诙谐的",a,"0"};
        	String[] v162={"walrus","海象",n,"0"};
        	String[] v163={"wan","虚弱的，病态的",a,"0"};
        	String[] v164={"wanderlust","漫游癖，旅游热",n,"0"};
        	String[] v165={"wane","减少，衰微",v,"0"};
        	String[] v166={"want","缺乏，需要",n,"0"};
        	String[] v167={"wardrobe","衣橱，全部服装",n,"0"};
        	String[] v168={"warehouse","仓库，货栈",n,"0"};
        	String[] v169={"warmonger","好战者，战争贩子",n,"0"};
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	subInitial(v1);
    		subInitial(v2);
    		subInitial(v3);
    		subInitial(v4);
    		subInitial(v5);
    		subInitial(v6);
    		subInitial(v7);
    		subInitial(v8);
    		subInitial(v9);
    		subInitial(v10);
    		subInitial(v11);
    		subInitial(v12);
    		subInitial(v13);
    		subInitial(v14);
    		subInitial(v15);
    		subInitial(v16);
    		subInitial(v17);
    		subInitial(v18);
    		subInitial(v19);
    		subInitial(v20);
    		subInitial(v21);
    		subInitial(v22);
    		subInitial(v23);
    		subInitial(v24);
    		subInitial(v25);
    		subInitial(v26);
    		subInitial(v27);
    		subInitial(v28);
    		subInitial(v29);
    		subInitial(v30);
    		subInitial(v31);
    		subInitial(v32);
    		subInitial(v33);
    		subInitial(v34);
    		subInitial(v35);
    		subInitial(v36);
    		subInitial(v37);
    		subInitial(v38);
    		subInitial(v39);
    		subInitial(v40);
    		subInitial(v41);
    		subInitial(v42);
    		subInitial(v43);
    		subInitial(v44);
    		subInitial(v45);
    		subInitial(v46);
    		subInitial(v47);
    		subInitial(v48);
    		subInitial(v49);
    		subInitial(v50);
    		
    		subInitial(v51);
    		subInitial(v52);
    		subInitial(v53);
    		subInitial(v54);
    		subInitial(v55);
    		subInitial(v56);
    		subInitial(v57);
    		subInitial(v58);
    		subInitial(v59);
    		subInitial(v60);
    		subInitial(v61);
    		subInitial(v62);
    		subInitial(v63);
    		subInitial(v64);
    		subInitial(v65);
    		subInitial(v66);
    		subInitial(v67);
    		subInitial(v68);
    		subInitial(v69);
    		subInitial(v70);
    		subInitial(v71);
    		subInitial(v72);
    		subInitial(v73);
    		subInitial(v74);
    		subInitial(v75);
    		subInitial(v76);
    		subInitial(v77);
    		subInitial(v78);
    		subInitial(v79);
    		subInitial(v80);
    		subInitial(v81);
    		subInitial(v82);
    		subInitial(v83);
    		subInitial(v84);
    		subInitial(v85);
    		subInitial(v86);
    		subInitial(v87);
    		subInitial(v88);
    		subInitial(v89);
    		subInitial(v90);
    		subInitial(v91);
    		subInitial(v92);
    		subInitial(v93);
    		subInitial(v94);
    		subInitial(v95);
    		subInitial(v96);
    		subInitial(v97);
    		subInitial(v98);
    		subInitial(v99);
    		subInitial(v100);
    		subInitial(v101);
    		subInitial(v102);
    		subInitial(v103);
    		subInitial(v104);
    		subInitial(v105);
    		subInitial(v106);
    		subInitial(v107);
    		subInitial(v108);
    		subInitial(v109);
    		subInitial(v110);
    		subInitial(v111);
    		subInitial(v112);
    		subInitial(v113);
    		subInitial(v114);
    		subInitial(v115);
    		subInitial(v116);
    		subInitial(v117);
    		subInitial(v118);
    		
    		subInitial(v119);
    		subInitial(v120);
    		subInitial(v121);
    		subInitial(v122);
    		subInitial(v123);
    		subInitial(v124);
    		subInitial(v125);
    		subInitial(v126);
    		subInitial(v127);
    		subInitial(v128);
    		subInitial(v129);
    		subInitial(v130);
    		subInitial(v131);
    		subInitial(v132);
    		subInitial(v133);
    		subInitial(v134);
    		subInitial(v135);
    		subInitial(v136);
    		subInitial(v137);
    		subInitial(v138);
    		subInitial(v139);
    		subInitial(v140);
    		subInitial(v141);
    		subInitial(v142);
    		subInitial(v143);
    		subInitial(v144);
    		subInitial(v145);
    		subInitial(v146);
    		subInitial(v147);
    		subInitial(v148);
    		subInitial(v149);
    		subInitial(v150);
    		subInitial(v151);
    		subInitial(v152);
    		subInitial(v153);
    		subInitial(v154);
    		subInitial(v155);
    		subInitial(v156);
    		subInitial(v157);
    		subInitial(v158);
    		subInitial(v159);
    		subInitial(v160);
    		subInitial(v161);
    		subInitial(v162);
    		subInitial(v163);
    		subInitial(v164);
    		subInitial(v165);
    		subInitial(v166);
    		subInitial(v167);
    		subInitial(v168);
    		subInitial(v169);
  
    	
    }
    private void doList_39(){
    	
    	
    	String[] v1={"warp","翘起，弯曲",n+v,"0"};
    	String[] v2={"warrant","正当理由，许可证",n,"0"};
    	String[] v3={"warranted","保证的，凭正当理由的",a,"0"};
    	String[] v4={"warranty","保证，辩解，有正当理由，批准",n,"0"};
    	String[] v5={"wary","谨慎的，小心翼翼的",a,"0"};
    	String[] v6={"waste","使身体消瘦，损耗",v,"0"};
    	String[] v7={"wastrel","挥霍无度的人",n,"0"};
    	String[] v8={"watershed","分水岭，转折点",n,"0"};
    	String[] v9={"waver","摇摆，犹豫",v,"0"};
    	String[] v10={"wax","蜡；给...打蜡，增大",n+v,"0"};
    	String[] v11={"wean","断奶，戒掉",v,"0"};
    	String[] v12={"wearisome","使人疲倦的、使人厌倦的",a,"0"};
    	String[] v13={"weary","疲劳的，使人厌倦的；厌烦",a+v,"0"};
    	String[] v14={"weasel","黄鼠狼；逃避",n+v,"0"};
    	String[] v15={"weather","经受住，平安渡过危难",v,"0"};
    	String[] v16={"weed","杂草；除草",n+v,"0"};
    	String[] v17={"weld","焊接，结合",v,"0"};
    	String[] v18={"well-groomed","非常整洁的",a,"0"};
    	String[] v19={"welter","混乱，杂乱无章",n,"0"};
    	String[] v20={"wheedle","哄骗",v,"0"};
    	String[] v21={"whet","磨快，刺激",v,"0"};
    	String[] v22={"whiff","轻吹；轻风",v+n,"0"};
    	String[] v23={"whim","乖张，怪念头",n,"0"};
    	String[] v24={"whimsical","古怪的，异想天开的",a,"0"};
    	String[] v25={"whimsy","古怪，异想天开",n,"0"};
    	String[] v26={"whine","哀号",v,"0"};
    	String[] v27={"whirlpool","漩涡",n,"0"};
    	String[] v28={"whisper","耳语，悄悄话",v,"0"};
    	String[] v29={"whistle","口哨,口哨声，汽笛声；吹口哨",n+v,"0"};
    	String[] v30={"whittle","削(木头)，削减",v,"0"};
    	String[] v31={"wholesome","促进健康的",a,"0"};
    	String[] v32={"wick","蜡烛芯，灯芯",n,"0"};
    	String[] v33={"wicked","极坏的，淘气的",a,"0"};
    	String[] v34={"wield","支配，掌权",v,"0"};
    	String[] v35={"willful","任性的，故意的",a,"0"};
    	String[] v36={"willow","柳树",n,"0"};
    	String[] v37={"willowy","苗条的",a,"0"};
    	String[] v38={"wilt","使...凋谢，枯萎",v,"0"};
    	String[] v39={"wily","狡猾的",a,"0"};
    	String[] v40={"wince","避开，畏缩",v,"0"};
    	String[] v41={"windbag","饶舌之人",n,"0"};
    	String[] v42={"winding","蜿蜒的，迂回的",a,"0"};
    	String[] v43={"windy","有风的，长篇累牍的",a,"0"};
    	String[] v44={"wink","使眼色；眨眼",v+n,"0"};
    	String[] v45={"winnow","把(谷物的)杂质去掉,扬去",v,"0"};
    	String[] v46={"winsome","媚人的，漂亮的",a,"0"};
    	String[] v47={"wistful","惆怅的，渴望的",a,"0"};
    	String[] v48={"wit","智力，机智",n,"0"};
    	String[] v49={"withdraw","撤退，收回，隐居",v,"0"};
    	String[] v50={"wither","枯萎，凋零",v,"0"};
    	String[] v51={"withhold","扣留，保留",v,"0"};
        String[] v52={"withstand","顶住，经受住",v,"0"};
        String[] v53={"witness","目击者；目击",n+v,"0"};
        String[] v54={"witticism","妙语，俏皮话",n,"0"};
        String[] v55={"wizened","干皱的",a,"0"};
        String[] v56={"wobble","动摇，犹豫",v,"0"};
        String[] v57={"woe","悲痛，苦难",n,"0"};
        String[] v58={"woo","向(女人)求爱，争取...的支持",v,"0"};
        String[] v59={"worship","崇拜，敬仰",v+n,"0"};
        String[] v60={"wrangler","口角者，争论者，牧马者",n,"0"};		
    	String[] v61={"wrench","扭，拧；扳手",v+n,"0"};
        String[] v62={"wretched","可怜的",a,"0"};
       	String[] v63={"wrinkle","皱纹，窍门",n,"0"};
       	String[] v64={"wrist","腕，腕关节",n,"0"};
       	String[] v65={"writ","命令状，书面命令",n,"0"};
       	String[] v66={"wrought","做成的，精炼的",a,"0"};
        String[] v67={"wry","扭曲的，冷嘲性幽默的",a,"0"};
        String[] v68={"xenophobe","惧外者",n,"0"};
        String[] v69={"xerophyte","旱生植物",n,"0"};
        String[] v70={"yacht","帆船，游艇",n,"0"};
    	String[] v71={"yarn","纱线",n,"0"};
        String[] v72={"yawn","打哈欠",v,"0"};
       	String[] v73={"yearn","盼望，渴望",v,"0"};
       	String[] v74={"yeast","酵母，兴奋",n,"0"};
       	String[] v75={"yielding","弯曲自如的，柔顺的",a,"0"};
        String[] v76={"yoke","牛轭；把...套上轭",n+v,"0"};
        String[] v77={"yokel","乡巴佬",n,"0"};
        String[] v78={"zealotry","狂热行为",n,"0"};
        String[] v79={"zenith","天顶，极点",n,"0"};
        String[] v80={"zephyr","和风，西风",n,"0"};
    	String[] v81={"zest","刺激性，热心，兴趣",n,"0"};
        String[] v82={"zigzag","之字形(的)(行进)",n+a+v,"0"};
        String[] v83={"zone","分成区",v,"0"};
        
        
        
        
        
        subInitial(v1);
		subInitial(v2);
		subInitial(v3);
		subInitial(v4);
		subInitial(v5);
		subInitial(v6);
		subInitial(v7);
		subInitial(v8);
		subInitial(v9);
		subInitial(v10);
		subInitial(v11);
		subInitial(v12);
		subInitial(v13);
		subInitial(v14);
		subInitial(v15);
		subInitial(v16);
		subInitial(v17);
		subInitial(v18);
		subInitial(v19);
		subInitial(v20);
		subInitial(v21);
		subInitial(v22);
		subInitial(v23);
		subInitial(v24);
		subInitial(v25);
		subInitial(v26);
		subInitial(v27);
		subInitial(v28);
		subInitial(v29);
		subInitial(v30);
		subInitial(v31);
		subInitial(v32);
		subInitial(v33);
		subInitial(v34);
		subInitial(v35);
		subInitial(v36);
		subInitial(v37);
		subInitial(v38);
		subInitial(v39);
		subInitial(v40);
		subInitial(v41);
		subInitial(v42);
		subInitial(v43);
		subInitial(v44);
		subInitial(v45);
		subInitial(v46);
		subInitial(v47);
		subInitial(v48);
		subInitial(v49);
		subInitial(v50);
		
		subInitial(v51);
		subInitial(v52);
		subInitial(v53);
		subInitial(v54);
		subInitial(v55);
		subInitial(v56);
		subInitial(v57);
		subInitial(v58);
		subInitial(v59);
		subInitial(v60);
		subInitial(v61);
		subInitial(v62);
		subInitial(v63);
		subInitial(v64);
		subInitial(v65);
		subInitial(v66);
		subInitial(v67);
		subInitial(v68);
		subInitial(v69);
		subInitial(v70);
		subInitial(v71);
		subInitial(v72);
		subInitial(v73);
		subInitial(v74);
		subInitial(v75);
		subInitial(v76);
		subInitial(v77);
		subInitial(v78);
		subInitial(v79);
		subInitial(v80);
		subInitial(v81);
		subInitial(v82);
		subInitial(v83);
	
    	
    }

    
    
    
    
    
    private void doList_40(){
    	
    	String[] v1={"abase","降低自己，贬抑，使卑下","v.","0"};
    	String[] v2={"abduct","绑架，拐走","v.","0"};
    	String[] v3={"abnegation","放弃，自我牺牲","n.","0"};
    	String[] v4={"aboriginal","原始居民，土著","n.","0"};
    	String[] v5={"abortive","无结果，失败的","adj.","0"};
    	String[] v6={"abound","充满","v.","0"};
    	String[] v7={"abrupt","突然的，意外的，唐突的","adj.","0"};
    	String[] v8={"abstinent","饮食有度的，有节制的，禁欲的","adj.","0"};
    	String[] v9={"acarpous","不结果实的","n.","0"};
    	String[] v10={"acerbity","涩，酸，刻薄","n.","0"};
    	String[] v11={"achromatic","非彩色的，无色的","adj.","0"};
    	String[] v12={"acronym","首字母缩略词","n.","0"};
    	
    	String[] v13={"actuarial","（保险）精算的，保险计算的","adj.","0"};
    	String[] v14={"actuate","驱使，激励","v.","0"};
    	String[] v15={"addle","使腐坏，使混乱","v.","0"};

    	String[] v16={"adduce","给予（理由）","v.","0"};
    	String[] v17={"adjudicate","充当裁判","v.","0"};
    	String[] v18={"adlib","临时讲话，即兴表演","v.","0"};


    	String[] v19={"advert","注意，留意","v.","0"};
    	String[] v20={"aeronautics","航空学","n.","0"};
    	String[] v21={"aftermath","事件的后果，余波","n.","0"};

    	String[] v22={"agape","（嘴）大张着的","adv./adj.","0"};
    	String[] v23={"aghast","惊骇的，吓呆的","adj.","0"};
    	String[] v24={"ailment","(不严重的)疾病","n.","0"};

    	String[] v25={"albino","白化病者，白化变种","n.","0"};
    	String[] v26={"alliterate","押头韵","v.","0"};
    	String[] v27={"almond","杏树，杏仁","n.","0"};


    	String[] v28={"alms","施舍物，救济品","n.","0"};
    	String[] v29={"ambience","环境，气氛","n.","0"};
    	String[] v30={"ambrosial","芳香的，特别气味的","adj.","0"};

    	String[] v31={"ambulatory","（适宜于）步行的","adj.","0"};
    	String[] v32={"amethyst","紫水晶","n.","0"};
    	String[] v33={"amiss","有毛病地，出差错地","adv.","0"};

    	String[] v34={"amoral","与道德无关的","adj.","0"};
    	String[] v35={"amputate","截肢","v.","0"};
    	String[] v36={"anemic","贫血的，患贫血症的","adj.","0"};

    	String[] v37={"anodyne","止痛药","n.","0"};
    	String[] v38={"antedote","（在信，文件上）写上较早日期；早于","v.","0"};
    	String[] v39={"anthropoid","像人类的","adj.","0"};
    	String[] v40={"anthropoid","类人猿","n.","0"};

    	String[] v41={"aperture","孔隙，窄的缺口","n.","0"};
    	String[] v42={"apothegm","格言，警句","n.","0"};
    	String[] v43={"aptheosis","神化，典范","n.","0"};

    	String[] v44={"appendage","附加物","n.","0"};
    	String[] v45={"aquiline","鹰的，似鹰的","adj.","0"};
    	String[] v46={"arachnid","蜘蛛类节肢动物","n.","0"};

    	String[] v47={"aracher","弓箭手，射手","n.","0"};
    	String[] v47_2={"arraign","传讯，指责","n.","0"};
    	String[] v48={"artillery","大炮","n.","0"};

    	String[] v49={"asinine","愚笨的","adj.","0"};
    	String[] v50={"askance","侧目而视，瞟","v.","0"};
    	String[] v51={"askew","歪斜的","adj.","0"};

    	String[] v52={"asphyxia","窒息","n.","0"};
    	String[] v53={"astigmatic","散光的，乱视的","adj.","0"};
    	String[] v54={"atheism","无神论，不信神","n.","0"};


    	String[] v55={"atone","赎罪，补偿","v.","0"};
    	String[] v56={"attire","穿着","v.","0"};
    	String[] v57={"attrition","摩擦，磨损","n.","0"};

    	String[] v58={"auger","螺丝钻，钻孔机","n.","0"};
    	String[] v59={"augmentation","增加","n.","0"};
    	String[] v60={"auricular","耳的","adj.","0"};

    	String[] v61={"automation","自动装置","n.","0"};
    	String[] v62={"avowal","声明","n.","0"};
    	String[] v63={"avuncular","伯父的","adj.","0"};

    	String[] v64={"azure","天蓝色、蔚蓝的","adj./n.","0"};
    	String[] v65={"bacchanall","狂欢会","n.","0"};
    	String[] v66={"backslide","故态复萌","v.","0"};


    	String[] v67={"backwater","死水","n.","0"};
    	String[] v68={"baffle","使迷惑，难倒","v.","0"};
    	String[] v69={"balky","停止不前的；倔强的","adj.","0"};

    	String[] v70={"bamboozle","欺骗；隐瞒","v.","0"};
    	String[] v71={"bandy","来回跑球；轻率谈论","v.","0"};
    	String[] v72={"baron","贵族","adj.","0"};


    	String[] v73={"barrister","讼务，律师","n.","0"};
    	String[] v74={"bassoon","低音管，巴松管","n.","0"};
    	String[] v75={"bather","入浴者，浴疗者","n.","0"};

    	String[] v76={"bauble","花哨的小玩意儿，没价值的东西","n.","0"};
    	String[] v77={"bawl","大叫，大喊","v.","0"};
    	String[] v78={"beatific","祝福的，快乐的","adj.","0"};

    	String[] v79={"beckon","召唤某人，示意","v.","0"};
    	String[] v80={"bedizen","把...装饰得艳丽而俗气","v.","0"};
    	String[] v81={"bedraggled","弄湿的，凌乱不堪的","adj.","0"};

    	String[] v82={"beet","甜菜","n.","0"};
    	String[] v83={"befuddle","使迷惑，使为难；使醉酒昏迷","v.","0"};
    	String[] v84={"beget","产生，引起","v.","0"};

    	String[] v85={"beguile","欺骗，诱骗","v.","0"};
    	String[] v86={"behold","目睹，看见","v.","0"};
    	String[] v87={"beholden","感激某人的，欠人情的","adj.","0"};

    	String[] v88={"belch","打嗝；火山喷发","n./v.","0"};
    	String[] v89={"belongings","所有物，财产","n.","0"};
    	String[] v90={"bemused","茫然的，困惑的","adj.","0"};
    	
    	String[] v91={"bereave","丧亲，夺去","v.","0"};
    	String[] v92={"berserk","狂怒的，疯狂的","adj.","0"};
    	String[] v93={"betoken","预示，表示","v.","0"};

    	String[] v94={"bibulous","高度吸收的","adj.","0"};
    	String[] v95={"biennial","两年一次的","adj.","0"};
    	String[] v96={"bilious","胆汁质的，坏脾气的","adj.","0"};

    	String[] v97={"billow","巨浪；翻腾","n./v.","0"};
    	String[] v98={"blackball","投反对票以阻止","v.","0"};
    	String[] v99={"blare","高声鸣叫","v.","0"};

    	String[] v100={"blase","厌倦享乐的，冷漠的","adj.","0"};
    	String[] v101={"blackball","投反对票以阻止","v.","0"};
    	String[] v102={"blare","高声鸣叫","v.","0"};

    	String[] v103={"bleachers","露天座位","n.","0"};
    	String[] v104={"bloated","肿胀的","adj.","0"};
    	String[] v105={"blossom","花；开花","n./v.","0"};

    	String[] v106={"bludgeon","大头棒","n.","0"};
    	String[] v107={"bluff","虚张声势；悬崖峭壁","n.","0"};
    	String[] v108={"bode","预示","v.","0"};

    	String[] v109={"boding","凶兆，前兆，预感","n.","0"};
    	String[] v110={"bohemian","放荡不羁的（人）","adj./n.","0"};
    	String[] v111={"bombardment","炮炸，炮轰","n.","0"};

    	String[] v112={"bonhomie","好性情，温和，和蔼","n.","0"};
    	String[] v113={"boo","作嘘声，嘘（某人），用嘘声表示不满","v.","0"};
    	String[] v114={"botch","弄坏某事","v.","0"};

    	String[] v115={"bottleneck","瓶颈口，交通易阻塞的狭口","n.","0"};
    	String[] v116={"bough","粗大的树枝或树干","n.","0"};
    	String[] v117={"bounteous","慷慨的；丰富的","adj.","0"};
    	
    	String[] v118={"bovine","牛的；迟钝的","adj.","0"};
    	String[] v119={"bowdlerize","删除，删改","v.","0"};
    	String[] v120={"bower","凉亭，树阴下凉快之处","n.","0"};

    	String[] v121={"brackish","（指水）略咸的","adj.","0"};
    	String[] v122={"brattish","讨厌的，宠坏的，不礼貌的","adj.","0"};
    	String[] v123={"brawny","（人）强壮的","adj.","0"};

    	String[] v124={"bray","大声而刺耳地发出","v.","0"};
    	String[] v125={"breezeway","有屋顶的通路","n.","0"};
    	String[] v126={"brim","（杯）边，缘","n.","0"};
    		
    	String[] v127={"brindled","有棕色斑纹的","adj.","0"};
    	String[] v128={"brocade","织锦","n.","0"};
    	String[] v129={"broil","烧烤","v.","0"};
    	
    	String[] v130={"brooch","胸针","n.","0"};
    	String[] v131={"browse","吃嫩草或叶；浏览；嫩芽","v./n.","0"};
    	
    	
    	
			subInitial(v1);
			subInitial(v2);
			subInitial(v3);
			subInitial(v4);
			subInitial(v5);
			subInitial(v6);
			subInitial(v7);
			subInitial(v8);
			subInitial(v9);
			subInitial(v10);
			subInitial(v11);
			subInitial(v12);
			subInitial(v13);
			subInitial(v14);
			subInitial(v15);
			subInitial(v16);
			subInitial(v17);
			subInitial(v18);
			subInitial(v19);
			subInitial(v20);
			subInitial(v21);
			subInitial(v22);
			subInitial(v23);
			subInitial(v24);
			subInitial(v25);
			subInitial(v26);
			subInitial(v27);
			subInitial(v28);
			subInitial(v29);
			subInitial(v30);
			subInitial(v31);
			subInitial(v32);
			subInitial(v33);
			subInitial(v34);
			subInitial(v35);
			subInitial(v36);
			subInitial(v37);
			subInitial(v38);
			subInitial(v39);
			subInitial(v40);
			subInitial(v41);
			subInitial(v42);
			subInitial(v43);
			subInitial(v44);
			subInitial(v45);
			subInitial(v46);
			subInitial(v47);
			subInitial(v47_2);
			subInitial(v48);
			subInitial(v49);
			subInitial(v50);
			
			subInitial(v51);
			subInitial(v52);
			subInitial(v53);
			subInitial(v54);
			subInitial(v55);
			subInitial(v56);
			subInitial(v57);
			subInitial(v58);
			subInitial(v59);
			subInitial(v60);
			subInitial(v61);
			subInitial(v62);
			subInitial(v63);
			subInitial(v64);
			subInitial(v65);
			subInitial(v66);
			subInitial(v67);
			subInitial(v68);
			subInitial(v69);
			subInitial(v70);
			subInitial(v71);
			subInitial(v72);
			subInitial(v73);
			subInitial(v74);
			subInitial(v75);
			subInitial(v76);
			subInitial(v77);
			subInitial(v78);
			subInitial(v79);
			subInitial(v80);
			subInitial(v81);
			subInitial(v82);
			subInitial(v83);
			subInitial(v84);
			subInitial(v85);
			subInitial(v86);
			subInitial(v87);
			subInitial(v88);
			subInitial(v89);
			subInitial(v90);
			subInitial(v91);
			subInitial(v92);
			subInitial(v93);
			subInitial(v94);
			subInitial(v95);
			subInitial(v96);
			subInitial(v97);
			subInitial(v98);
			subInitial(v99);
			subInitial(v100);
			subInitial(v101);
			subInitial(v102);
			subInitial(v103);
			subInitial(v104);
			subInitial(v105);
			subInitial(v106);
			subInitial(v107);
			subInitial(v108);
			subInitial(v109);
			subInitial(v110);
			subInitial(v111);
			subInitial(v112);
			subInitial(v113);
			subInitial(v114);
			subInitial(v115);
			subInitial(v116);
			subInitial(v117);
			subInitial(v118);
			
			subInitial(v119);
			subInitial(v120);
			subInitial(v121);
			subInitial(v122);
			subInitial(v123);
			subInitial(v124);
			subInitial(v125);
			subInitial(v126);
			subInitial(v127);
			subInitial(v128);
			subInitial(v129);
			subInitial(v130);
			subInitial(v131);
	
    	
    	
    	

    }
    private void doList_41(){
    	
    	String[] v1={"bubble","起泡；气泡，水泡","v./n.","0"};
    	String[] v2={"buckle","皮带扣环；扣紧","n./v.","0"};
    	String[] v3={"buffer","缓冲，为...充当缓冲器","v.","0"};
    	
    	String[] v4={"bugaboo","吓人的东西，妖怪","n.","0"};
    	String[] v5={"buggy","轻型马车，婴儿车","n.","0"};
    	String[] v6={"bullion","金条，银条","n.","0"};

    	String[] v7={"bumble","说话含糊，拙劣地做","v.","0"};
    	String[] v8={"bump","碰撞；碰撞声","v./n.","0"};
    	String[] v9={"burrow","挖掘，钻进，翻寻；地洞","v./n.","0"};

    	String[] v10={"buxom","体态丰满的","adj.","0"};
    	String[] v11={"cachet","赞同的标志，优越的标志","n.","0"};
    	String[] v12={"cactus","仙人掌","n.","0"};

    	String[] v13={"cadaver","尸体","n.","0"};
    	String[] v14={"cadence","抑扬顿挫，节奏，韵律","n.","0"};
    	String[] v15={"calibre","（枪等）口径，（人或事）品德，才能","n.","0"};

    	String[] v16={"callus","老茧","n.","0"};
    	String[] v17={"canard","谣言，假新闻","n.","0"};
    	String[] v18={"canker","溃疡病，祸害","n.","0"};

    	String[] v19={"cantata","清唱剧，大合唱","n.","0"};
    	String[] v20={"capacious","容量大的，宽敞的","adj.","0"};
    	String[] v21={"caper","雀跃，欢蹦","n./v","0"};

    	String[] v22={"capitalize","资本化，获利，利用","v.","0"};
    	String[] v23={"capitation","人头税","n.","0"};
    	String[] v24={"capsize","使船翻","v.","0"};

    	String[] v25={"carat","克拉","n.","0"};
    	String[] v26={"careen","倾斜；使倾斜","n./v.","0"};
    	String[] v27={"carnage","大屠杀","n.","0"};

    	String[] v28={"carpentry","木工工作","n.","0"};
    	String[] v29={"cascade","小瀑布","n.","0"};
    	String[] v30={"cautionary","劝人谨慎的，警戒的","adj.","0"};

    	String[] v31={"cavalcade","骑兵队伍","n.","0"};
    	String[] v32={"celerity","快速，迅速","n.","0"};
    	String[] v33={"celibate","独身者；不结婚的","n./adj.","0"};

    	String[] v34={"cemetery","坟墓，公墓","n.","0"};
    	String[] v35={"centrifugal","离心的","adj.","0"};
    	String[] v36={"centripetal","向心的","adj.","0"};

    	String[] v37={"cephalic","头部的，头的","adj.","0"};
    	String[] v38={"chasten","改正，磨练","v.","0"};
    	String[] v39={"checkered","盛衰无常的","adj.","0"};

    	String[] v40={"chic","漂亮的，时髦的","adj.","0"};
    	String[] v41={"chirp","唧唧叫","v.","0"};
    	String[] v42={"chore","家务琐事，讨厌的工作","n.","0"};

    	String[] v43={"chortle","开心地笑","adv.","0"};
    	String[] v44={"chunk","短厚块状物，大量","n.","0"};
    	String[] v45={"ciliate","有纤毛的，有睫毛的","adj.","0"};

    	String[] v46={"cineaste","影迷，热衷于电影的人","n.","0"};
    	String[] v47={"circumlocutory","委婉曲折的，迂回的","adj.","0"};
    	String[] v48={"citation","引证，引用文，传票","n.","0"};

    	String[] v49={"clairvoyant","透视的","adj.","0"};
    	String[] v50={"clench","握紧，咬紧","v.","0"};
    	String[] v51={"cliche","陈腐的","adj.","0"};

    	String[] v52={"closed-minded","倔强的，顽固的","adj.","0"};
    	String[] v53={"closure","关闭，终止","n.","0"};
    	String[] v54={"cloy","（吃甜食）生腻，吃腻","v.","0"};
    	
    	String[] v55={"coffer","保险柜","n.","0"};
    	String[] v56={"cognate","同词源的，同类的","adj.","0"};
    	String[] v57={"cognomen","（古罗马人的）姓，名字","n.","0"};
    	
    	String[] v58={"colloquy","（非正式的）交谈，会谈","n.","0"};
    	String[] v59={"colt","小雄驹，新手","n.","0"};
    	String[] v60={"comestible","食物，食品","n.","0"};

    	String[] v61={"commiserate","同情，怜悯","v.","0"};
    	String[] v62={"complexion","肤色，外表特征","n.","0"};
    	String[] v63={"complicity","合谋，串通","n.","0"};

    	String[] v64={"comport","举止","v.","0"};
    	String[] v65={"compulsory","强制性的，命令性的","adj.","0"};
    	String[] v66={"concentric","（指数个圆）有同一中心的","adj.","0"};

    	String[] v67={"concoct","调制，捏造","v.","0"};
    	String[] v68={"condign","罪有应得的，适宜的","adj.","0"};
    	String[] v69={"condiment","调味品，作料","n.","0"};

    	String[] v671={"condole","向...吊慰","v.","0"};
    	String[] v681={"condor","秃鹰，神鹰","n.","0"};
    	String[] v691={"confidant","心腹朋友，知己，密友","n.","0"};

    	String[] v672={"congential","（病等）先天的，天生的","adj.","0"};
    	String[] v682={"conjugal","婚姻的，夫妻之间的","adj.","0"};
    	String[] v692={"connubial","婚姻的，夫妻的","adj.","0"};

    	String[] v70={"consecrate","用作祭祀，献给，使神圣","v.","0"};
    	String[] v71={"consonance","一致，调和，和音","n.","0"};
    	String[] v72={"consort","结交，配对；配偶","v./n.","0"};

    	String[] v73={"conspectus","摘要，大纲","n.","0"};
    	String[] v74={"constringe","使收缩 ","v.","0"};
    	String[] v75={"contumacy","抗命，不服从","n.","0"};

    	String[] v76={"contumely","无礼，傲慢","n.","0"};
    	String[] v77={"convene","集合，召集 ","v.","0"};
    	String[] v78={"convoy","护航，护送","v.","0"};

    	String[] v79={"contumely","无礼，傲慢","n.","0"};
    	String[] v80={"convene","集合，召集 ","v.","0"};
    	String[] v81={"convoy","护航，护送","v.","0"};

    	String[] v82={"cordial","热诚的；兴奋剂","adj./n.","0"};
    	String[] v83={"cornet","短号，圆锥形蛋卷","n.","0"};
    	String[] v84={"corny","平淡无奇的，乡巴佬的","adj.","0"};

    	String[] v85={"corporal","肉体的，身体的","adj.","0"};
    	String[] v86={"corpulent","肥胖的","adj.","0"};
    	String[] v87={"corpus","全集，全部资料","n.","0"};

    	String[] v88={"coruscate","闪亮","v.","0"};
    	String[] v89={"cosy","温暖而舒适的","adj.","0"};
    	String[] v90={"counterpoise","平均，平衡","n./v.","0"};

    	String[] v91={"coven","女巫的集会","n.","0"};
    	String[] v92={"crafty","狡诈的，熟练的","adj.","0"};
    	String[] v93={"crag","悬崖，峭壁","n.","0"};

    	String[] v94={"credo","信条","n.","0"};
    	String[] v95={"crepuscular","朦胧的，微明的","adj.","0"};
    	String[] v96={"crevice","缺口，裂缝","n.","0"};

    	String[] v97={"crinkle","使变皱","v.","0"};
    	String[] v98={"cripple","跛子；使残废","n./v.","0"};
    	String[] v99={"croon","低声歌唱","v.","0"};

    	String[] v100={"crotchety","脾气坏的","adj.","0"};
    	String[] v101={"crypt","地下室，地窖","n.","0"};
    	String[] v102={"cuddle","搂抱，拥抱","n./v.","0"};

    	String[] v103={"cuff","袖口","n.","0"};
    	String[] v104={"culprit","犯罪者","n.","0"};
    	String[] v105={"cumber","拖累，妨碍","n.","0"};

    	String[] v106={"curd","凝乳","n.","0"};
    	String[] v107={"curfew","宵禁","n.","0"};
    	String[] v108={"currish","下贱的，杂种的","adj.","0"};

    	String[] v109={"cursive","草书的","adj.","0"};
    	String[] v110={"curvaceous","婀娜多姿的，曲线的","adj.","0"};
    	String[] v111={"cygnet","小天鹅","n.","0"};

    	String[] v112={"cynosure","注意的焦点","n.","0"};
    	String[] v113={"dalliance","虚度光阴，调情","n.","0"};
    	String[] v114={"damn","严厉地批评，谴责","v.","0"};

    	String[] v115={"damper","起抑制作用的因素，节气闸，断音装置","n.","0"};
    	String[] v116={"dangle","摇摆，悬荡，悬而未定","v.","0"};
    	String[] v117={"dank","阴湿的，阴冷的","adj.","0"};

    	String[] v118={"dastard","懦夫，胆小的人","n.","0"};
    	String[] v119={"daub","涂抹","v.","0"};
    	String[] v120={"daubster","拙劣的画家","n.","0"};

    	String[] v121={"daze","使茫然","v.","0"};
    	String[] v122={"debar","阻止","v.","0"};
    	String[] v123={"debility","衰弱，虚弱","n.","0"};

    	String[] v124={"debonair","迷人的，友好的","adj.","0"};
    	String[] v125={"decamp","（士兵）离营，匆忙而秘密地离开","v.","0"};
    	String[] v126={"decant","轻松倒出","v.","0"};
    	String[] v127={"decentralize","分散，权力下放","v.","0"};
    	
    	
    	
    	
    	
    	
    	subInitial(v1);
		subInitial(v2);
		subInitial(v3);
		subInitial(v4);
		subInitial(v5);
		subInitial(v6);
		subInitial(v7);
		subInitial(v8);
		subInitial(v9);
		subInitial(v10);
		subInitial(v11);
		subInitial(v12);
		subInitial(v13);
		subInitial(v14);
		subInitial(v15);
		subInitial(v16);
		subInitial(v17);
		subInitial(v18);
		subInitial(v19);
		subInitial(v20);
		subInitial(v21);
		subInitial(v22);
		subInitial(v23);
		subInitial(v24);
		subInitial(v25);
		subInitial(v26);
		subInitial(v27);
		subInitial(v28);
		subInitial(v29);
		subInitial(v30);
		subInitial(v31);
		subInitial(v32);
		subInitial(v33);
		subInitial(v34);
		subInitial(v35);
		subInitial(v36);
		subInitial(v37);
		subInitial(v38);
		subInitial(v39);
		subInitial(v40);
		subInitial(v41);
		subInitial(v42);
		subInitial(v43);
		subInitial(v44);
		subInitial(v45);
		subInitial(v46);
		subInitial(v47);
		subInitial(v48);
		subInitial(v49);
		subInitial(v50);
		
		subInitial(v51);
		subInitial(v52);
		subInitial(v53);
		subInitial(v54);
		subInitial(v55);
		subInitial(v56);
		subInitial(v57);
		subInitial(v58);
		subInitial(v59);
		subInitial(v60);
		subInitial(v61);
		subInitial(v62);
		subInitial(v63);
		subInitial(v64);
		subInitial(v65);
		subInitial(v66);
		subInitial(v67);
		subInitial(v68);
		subInitial(v69);
		
		subInitial(v671);
		subInitial(v681);
		subInitial(v691);
		
		subInitial(v672);
		subInitial(v682);
		subInitial(v692);
		
		subInitial(v70);
		subInitial(v71);
		subInitial(v72);
		subInitial(v73);
		subInitial(v74);
		subInitial(v75);
		subInitial(v76);
		subInitial(v77);
		subInitial(v78);
		subInitial(v79);
		subInitial(v80);
		subInitial(v81);
		subInitial(v82);
		subInitial(v83);
		subInitial(v84);
		subInitial(v85);
		subInitial(v86);
		subInitial(v87);
		subInitial(v88);
		subInitial(v89);
		subInitial(v90);
		subInitial(v91);
		subInitial(v92);
		subInitial(v93);
		subInitial(v94);
		subInitial(v95);
		subInitial(v96);
		subInitial(v97);
		subInitial(v98);
		subInitial(v99);
		subInitial(v100);
		subInitial(v101);
		subInitial(v102);
		subInitial(v103);
		subInitial(v104);
		subInitial(v105);
		subInitial(v106);
		subInitial(v107);
		subInitial(v108);
		subInitial(v109);
		subInitial(v110);
		subInitial(v111);
		subInitial(v112);
		subInitial(v113);
		subInitial(v114);
		subInitial(v115);
		subInitial(v116);
		subInitial(v117);
		subInitial(v118);
		
		subInitial(v119);
		subInitial(v120);
		subInitial(v121);
		subInitial(v122);
		subInitial(v123);
		subInitial(v124);
		subInitial(v125);
		subInitial(v126);
		subInitial(v127);
		

    	
    }
    private void doList_42(){
    	
    	String[] v1={"declassify","撤销保密","v.","0"};
    	String[] v2={"declination","倾斜，衰微","n.","0"};
    	String[] v3={"decoy","诱骗","v.","0"};
    	String[] v4={"decree","命令，法令；颁布命令","n./v.","0"};

    	String[] v5={"defalcate","盗用公款","v.","0"};
    	String[] v6={"defame","诽谤，中伤","v.","0"};
    	String[] v7={"defoliant","脱叶剂","n.","0"};
    	String[] v8={"defoliate","使...掉叶子","v.","0"};

    	String[] v9={"deforest","采伐森林","v.","0"};
    	String[] v10={"defray","付款","v.","0"};
    	String[] v11={"defunct","死亡的","adj.","0"};
    	String[] v12={"delectation","享受，愉快","n.","0"};

    	String[] v13={"demarcate","划分，划界","v.","0"};
    	String[] v14={"demeanour","行为，举止","n.","0"};
    	String[] v15={"demented","疯狂的","adj.","0"};
    	String[] v16={"demure","严肃的，矜持的","adj.","0"};

    	String[] v17={"denominate","命名","v.","0"};
    	String[] v18={"denunciate","公开指责，公然抨击，谴责","v.","0"};
    	String[] v19={"deportment","风度，举止","n.","0"};
    	String[] v20={"deposit","存放，使淤泥","v.","0"};

    	String[] v21={"depredatoion","掠夺，蹂躏","n.","0"};
    	String[] v22={"depressant","有镇静作用；镇静剂","v./n.","0"};
    	String[] v23={"depute","派...为代表或代理","v.","0"};
    	String[] v24={"deputize","代替某人行事或说话","v.","0"};

    	String[] v25={"derangement","精神错乱","n.","0"};
    	String[] v26={"desalinize","除去盐分","v.","0"};
    	String[] v27={"desideratum","必需品","n.","0"};
    	String[] v28={"designate","指明，指出；任命，指派","v.","0"};

    	String[] v29={"desirous","渴望的","adj.","0"};
    	String[] v30={"desolate","荒凉的，被遗弃的","adj.","0"};
    	String[] v31={"desperado","亡命之徒","n.","0"};
    	String[] v32={"despoil","夺取，抢夺","v.","0"};

    	String[] v33={"destitute","贫乏的，穷困的","adj.","0"};
    	String[] v34={"destructible","可破坏的","adj.","0"};
    	String[] v35={"desuetude","废止，不用","n.","0"};
    	String[] v36={"detestable","嫌恶的，可憎的，可厌恶的","adj.","0"};

    	String[] v37={"detonate","使爆炸，引爆","v.","0"};
    	String[] v38={"detract","减去，贬低，转移","v.","0"};
    	String[] v39={"devolve","（指工作，职务）移交给某人","v.","0"};
    	String[] v40={"diabolic","恶魔的，魔鬼性格的","adj.","0"};

    	String[] v401={"dictator","独裁者","n.","0"};
    	String[] v41={"ductum","格言，声明","n.","0"};
    	String[] v42={"dietetics","饮食学，营养学","n.","0"};
    	String[] v43={"dignitary","显要人物","n.","0"};
    	
    	String[] v44={"dilapidation","破旧，荒废","n.","0"};
    	String[] v45={"diminuendo","（音乐，演奏）渐弱","n.","0"};
    	String[] v46={"diocesan","主教管区的","adj.","0"};
    	String[] v47={"dipsomania","嗜酒症","n.","0"};
    	
    	String[] v48={"disavow","否认，否定，抵赖","v.","0"};
    	String[] v49={"disband","解放","v.","0"};
    	String[] v50={"disclaimer","否认，拒绝","v.","0"};
    	String[] v51={"disembody","使脱离实体，使脱离现实","v.","0"};
    	
    	String[] v52={"disfranchise","剥夺...的权利","v.","0"};
    	String[] v53={"dishearten","使...灰心","v.","0"};
    	String[] v54={"dishevel","使蓬乱，使头发凌乱","v.","0"};
    	String[] v55={"disheveled","（指毛发或衣服）凌乱的","adj.","0"};

    	String[] v56={"disintegrate","使...瓦解","v.","0"};
    	String[] v57={"disport","玩弄，嬉戏","v.","0"};
    	String[] v58={"disquisition","长篇演讲，专题论文","n.","0"};
    	String[] v59={"dissection","解剖，剖析","v.","0"};

    	String[] v60={"dissociate","分离，游离，分裂","v.","0"};
    	String[] v61={"distain","贬损，伤害名誉","v.","0"};
    	String[] v62={"distal","远离中心的，神经末梢的","adj.","0"};
    	String[] v63={"distention","膨胀","n.","0"};

    	String[] v64={"distrait","心不在焉的","adj.","0"};
    	String[] v65={"ditch","沟，沟渠，壕沟","n.","0"};
    	String[] v66={"divagate","离题，飘泊","v.","0"};
    	String[] v67={"dock","剪短，扣除...的一部分工资","v.","0"};

    	String[] v68={"doggo","隐藏着","adv.","0"};
    	String[] v69={"dotage","老年糊涂，溺爱","n.","0"};
    	String[] v70={"double-cross","欺骗，出卖","v.","0"};
    	String[] v71={"dowdy","不整洁，过旧的","adj.","0"};

    	String[] v641={"dowry","嫁妆","n.","0"};
    	String[] v651={"doze","瞌睡，假寐","v.","0"};
    	String[] v661={"dribble","往下滴，淌","v.","0"};
    	String[] v671={"drollery","笑谈，滑稽","n.","0"};

    	String[] v681={"ductile","易拉长的，易变性的","adj.","0"};
    	String[] v691={"dulcet","美妙的","adj.","0"};
    	String[] v701={"dullard","愚人，笨蛋","n.","0"};
    	String[] v711={"dumbfound","使...惊讶，发愣","v.","0"};

    	String[] v72={"dunce","笨人","n.","0"};
    	String[] v73={"eaglet","小鹰","n.","0"};
    	String[] v74={"earthshaking","极其重要或重要的","adj.","0"};
    	String[] v75={"ecdysis","（动物）蜕皮，换羽毛","v.","0"};

    	String[] v76={"eclat","辉煌成就","n.","0"};
    	String[] v77={"eclogue","田园诗，牧歌","n.","0"};
    	String[] v78={"ecumenical","世界范围的","adj.","0"};
    	String[] v79={"edict","法令","n.","0"};

    	String[] v80={"eerie","可怕的，阴森恐怖的","adj.","0"};
    	String[] v81={"effeminate","缺乏勇气的，柔弱的","adj.","0"};
    	String[] v82={"effigy","模拟像","n.","0"};
    	String[] v83={"egoism","利己主义","n.","0"};

    	String[] v84={"ejaculate","突然叫出或说出","v.","0"};
    	String[] v85={"electorate","选民，选区；有选举权者","n.","0"};
    	String[] v86={"elixir","万灵药，长生不老药","n.","0"};
    	String[] v87={"emasculate","削弱，阉割；柔弱的","v./adj.","0"};

    	String[] v88={"embankment","堤岸","n.","0"};
    	String[] v89={"embitter","使痛苦，使难受","v.","0"};
    	String[] v90={"emblazon","以纹章或其他方式装饰","v.","0"};
    	String[] v91={"embodiment","化身，体现","n.","0"};

    	String[] v92={"embroil","牵连，卷入纠纷","v.","0"};
    	String[] v93={"embryonic","胚胎的，萌芽期的","adj.","0"};
    	String[] v94={"emerald","翡翠；翠绿色的","n./adj.","0"};
    	String[] v95={"emolument","报酬，薪水","n.","0"};

    	String[] v96={"empyrean","天空，天神居处","n.","0"};
    	String[] v97={"encipher","译成密码","v.","0"};
    	String[] v98={"encyclopedic","广博的，知识渊博的","adj.","0"};
    	String[] v99={"endue","赋予","v.","0"};

    	String[] v100={"engrossment","正式誉写的文件","n.","0"};
    	String[] v101={"ennoble","授予爵位，使高贵","v.","0"};
    	String[] v102={"enshrine","奉为神圣","v.","0"};
    	String[] v103={"enslave","奴役","v.","0"};

    	String[] v104={"ensnare","诱入陷阱","v.","0"};
    	String[] v105={"enthrall","迷惑，迷住","v.","0"};
    	String[] v106={"entourage","随从，环境","n.","0"};
    	String[] v107={"entrench","挖壕沟，确立","v.","0"};

    	String[] v108={"entwine","使缠绕，交织","v.","0"};
    	String[] v109={"environs","郊外，郊区","n.","0"};
    	String[] v110={"envisage","正视，想象","v.","0"};
    	String[] v111={"epicurean","好享乐的，享乐主义的","adj.","0"};

    	String[] v112={"episode","一段情节","n.","0"};
    	String[] v113={"equestrian","骑师；骑马的","n./adj.","0"};
    	String[] v114={"escort","护送，护送者","v./n.","0"};
    	String[] v115={"estrange","使疏远","n.","0"};

    	String[] v116={"estuary","河口，三角湾","n.","0"};
    	String[] v117={"eugenic","优生的","adj.","0"};
    	String[] v118={"even-tempered","性情平和的，不易生气的","adj.","0"};
    	String[] v119={"everlasting","永恒的，持久的，无止境的，耐用的","adj.","0"};

    	String[] v120={"eviscerate","取出肠及内脏","v.","0"};
    	String[] v121={"exceptionable","引起反感的","adj.","0"};
    	String[] v122={"excerpt","摘录，选录，节录","n.","0"};
    	String[] v123={"exchequer","国库，财源","n.","0"};

    	String[] v124={"excogitate","认真想起","v.","0"};
    	String[] v125={"excruciate","施酷刑，拷问，折磨","v.","0"};
    	String[] v126={"execration","憎恨，厌恶","n.","0"};
    	String[] v127={"exhume","掘出，发掘","v.","0"};

    	String[] v128={"exiguous","太少的，不足的","adj.","0"};
    	String[] v129={"expatiate","细说，详述","v.","0"};
    	String[] v130={"expatriate","驱逐出境，脱离国籍","v.","0"};
    	String[] v131={"expiation","赎罪，补偿","n.","0"};

    	
    	
    	
    	subInitial(v1);
		subInitial(v2);
		subInitial(v3);
		subInitial(v4);
		subInitial(v5);
		subInitial(v6);
		subInitial(v7);
		subInitial(v8);
		subInitial(v9);
		subInitial(v10);
		subInitial(v11);
		subInitial(v12);
		subInitial(v13);
		subInitial(v14);
		subInitial(v15);
		subInitial(v16);
		subInitial(v17);
		subInitial(v18);
		subInitial(v19);
		subInitial(v20);
		subInitial(v21);
		subInitial(v22);
		subInitial(v23);
		subInitial(v24);
		subInitial(v25);
		subInitial(v26);
		subInitial(v27);
		subInitial(v28);
		subInitial(v29);
		subInitial(v30);
		subInitial(v31);
		subInitial(v32);
		subInitial(v33);
		subInitial(v34);
		subInitial(v35);
		subInitial(v36);
		subInitial(v37);
		subInitial(v38);
		subInitial(v39);
		subInitial(v40);
		
		subInitial(v401);
		
		subInitial(v41);
		subInitial(v42);
		subInitial(v43);
		subInitial(v44);
		subInitial(v45);
		subInitial(v46);
		subInitial(v47);
		subInitial(v48);
		subInitial(v49);
		subInitial(v50);
		
		subInitial(v51);
		subInitial(v52);
		subInitial(v53);
		subInitial(v54);
		subInitial(v55);
		subInitial(v56);
		subInitial(v57);
		subInitial(v58);
		subInitial(v59);
		subInitial(v60);
		subInitial(v61);
		subInitial(v62);
		subInitial(v63);
		subInitial(v64);
		subInitial(v65);
		subInitial(v66);
		subInitial(v67);
		subInitial(v68);
		subInitial(v69);
		subInitial(v70);
		subInitial(v71);
		
		subInitial(v641);
		subInitial(v651);
		subInitial(v661);
		subInitial(v671);
		subInitial(v681);
		subInitial(v691);
		subInitial(v701);
		subInitial(v711);
		
		subInitial(v72);
		subInitial(v73);
		subInitial(v74);
		subInitial(v75);
		subInitial(v76);
		subInitial(v77);
		subInitial(v78);
		subInitial(v79);
		subInitial(v80);
		subInitial(v81);
		subInitial(v82);
		subInitial(v83);
		subInitial(v84);
		subInitial(v85);
		subInitial(v86);
		subInitial(v87);
		subInitial(v88);
		subInitial(v89);
		subInitial(v90);
		subInitial(v91);
		subInitial(v92);
		subInitial(v93);
		subInitial(v94);
		subInitial(v95);
		subInitial(v96);
		subInitial(v97);
		subInitial(v98);
		subInitial(v99);
		subInitial(v100);
		subInitial(v101);
		subInitial(v102);
		subInitial(v103);
		subInitial(v104);
		subInitial(v105);
		subInitial(v106);
		subInitial(v107);
		subInitial(v108);
		subInitial(v109);
		subInitial(v110);
		subInitial(v111);
		subInitial(v112);
		subInitial(v113);
		subInitial(v114);
		subInitial(v115);
		subInitial(v116);
		subInitial(v117);
		subInitial(v118);
		
		subInitial(v119);
		subInitial(v120);
		subInitial(v121);
		subInitial(v122);
		subInitial(v123);
		subInitial(v124);
		subInitial(v125);
		subInitial(v126);
		subInitial(v127);
		subInitial(v128);
		subInitial(v129);
		subInitial(v130);
		subInitial(v131);
		
    }
    private void doList_43(){
    	
    	
    	String[] v1={"explicable","可解释的","adj.","0"};
    	String[] v2={"expropriate","充公，没收","v.","0"};
    	String[] v3={"expulsion","驱逐，开除","n.","0"};
    	String[] v4={"extradite","引渡回国，拿获归案","v.","0"};
    	String[] v5={"explicable","可解释的","adj.","0"};
    	
    	String[] v6={"extrinsic","外来的，外在的，外部的","adj.","0"};
    	String[] v7={"extrude","挤出，逐出","v.","0"};
    	String[] v8={"exultant","非常高兴，欢悦的","adj.","0"};
    	String[] v9={"fabulous","难以置信的，寓言里的","adj.","0"};
    	String[] v10={"facsimile","复制本，摹本","n.","0"};

    	String[] v11={"factitious","人为的，不真实的","adj.","0"};
    	String[] v12={"fag","苦干；苦工","v./n.","0"};
    	String[] v13={"fail-safe","自动防故障装置","n.","0"};
    	String[] v14={"fainthearted","懦弱的，无精神的，胆小的","adj.","0"};
    	String[] v15={"fake","伪造，佯装","v.","0"};

    	String[] v16={"falsify","篡改，说谎","v.","0"};
    	String[] v17={"fanfare","夸耀性旅行，嘹亮的喇叭声","n.","0"};
    	String[] v18={"fantasia","幻想曲，组合乐曲","n.","0"};
    	String[] v19={"farrow","（母猪）生产；一窝小猪","v./n.","0"};
    	String[] v20={"fascia","饰带，招牌","n.","0"};

    	String[] v21={"fascinate","迷惑，迷住","v.","0"};
    	String[] v22={"fealthy","效忠","n.","0"};
    	String[] v23={"febrile","发烧的，热病的","adj.","0"};
    	String[] v24={"feisty","活跃的，一怒的","adj.","0"};
    	String[] v25={"felicitate","祝贺，庆祝","v.","0"};

    	String[] v26={"feline","猫科","n.","0"};
    	String[] v27={"fencing","剑术，击剑法","n.","0"};
    	String[] v28={"ferocious","凶猛的，残暴的","adj.","0"};
    	String[] v29={"ferry","渡船，渡口；运送","n./v.","0"};
    	String[] v30={"festal","节日的，欢乐的","adj.","0"};

    	String[] v31={"fetish","神物，偶像","n.","0"};
    	String[] v32={"fiend","恶魔","n.","0"};
    	String[] v33={"filament","灯丝，细丝","n.","0"};
    	String[] v34={"filch","偷","v.","0"};
    	String[] v35={"filial","子女的","adj.","0"};

    	String[] v36={"fillet","束发带，鱼肉片","n.","0"};
    	String[] v37={"finable","应罚款的","adj.","0"};
    	String[] v38={"finery","华丽、优雅的服装或服饰","n.","0"};
    	String[] v39={"firebrand","燃烧的木块，引起动乱的人","n.","0"};
    	String[] v40={"fishery","渔场，渔业","n.","0"};

    	String[] v41={"fissile","易分裂的","adj.","0"};
    	String[] v42={"fitful","一阵阵的，不安的","adj.","0"};
    	String[] v43={"flabby","松软的，意志薄弱的","adj.","0"};
    	String[] v44={"flagellate","鞭打，鞭笞","v.","0"};
    	String[] v45={"flair","天赋，本领，才华","n.","0"};

    	String[] v46={"flannel","法兰绒","n.","0"};
    	String[] v47={"flatulence","肠胃气胀","n.","0"};
    	String[] v48={"flavoring","香料，调味品","n.","0"};
    	String[] v49={"flay","剥皮，诈取，严厉谴责","v.","0"};
    	String[] v50={"fleck","斑点，微粒","n.","0"};

    	String[] v51={"fleece","生羊皮，羊毛；骗取","n./v.","0"};
    	String[] v52={"fleet","快速的；消磨，疾驰，飞逝，掠过","adj./v.","0"};
    	String[] v53={"flick","轻打，轻弹","v./n.","0"};
    	String[] v54={"flicker","闪烁，摇曳","v.","0"};
    	String[] v55={"floppy","松软的，衰弱的","adj.","0"};

    	String[] v56={"florescence","繁花时期","n.","0"};
    	String[] v57={"flunk","考试不及格","n.","0"};
    	String[] v58={"fodder","草料","n.","0"};
    	String[] v59={"fondle","抚弄，抚摸","v.","0"};
    	String[] v60={"foothold","立足点，根据地","n.","0"};

    	String[] v61={"footle","胡闹，浪费（时间）","v.","0"};
    	String[] v62={"fop","花花公子","n.","0"};
    	String[] v63={"foray","突袭，偷袭","v./n.","0"};
    	String[] v64={"forefear","祖宗，祖先","n.","0"};
    	String[] v65={"foreclose","排除，取消押品的赎回权","v.","0"};

    	String[] v66={"forensic","法庭的，辩论的","adj.","0"};
    	String[] v67={"foreword","前言，序","n.","0"};
    	String[] v68={"forfeiture","（名誉等）丧失","n.","0"};
    	String[] v69={"forlorn","孤独的，凄凉的","adj.","0"};
    	String[] v70={"formative","形成的，影响发展的","adj.","0"};

    	String[] v71={"forswear","誓绝，放弃","v.","0"};
    	String[] v72={"fort","要塞，城堡","n.","0"};
    	String[] v73={"fractional","微笑的，极小的","adj.","0"};
    	String[] v74={"fraternal","兄弟的，友善的","adj.","0"};
    	String[] v75={"fraternity","同类人，友爱","n.","0"};

    	String[] v76={"fray","吵架，打斗；磨破","n./v.","0"};
    	String[] v77={"freak","怪物，奇事；反常的","n./adj.","0"};
    	String[] v78={"fretwork","个子细工","n.","0"};
    	String[] v79={"frisk","欢跃；娱乐","v./n.","0"};
    	String[] v80={"fritter","愚蠢地浪费，切碎","v.","0"};

    	String[] v81={"frolic","嬉戏，雀跃","v./n.","0"};
    	String[] v82={"frolicsome","快活的，欢乐的","adj.","0"};
    	String[] v83={"frowzy","不整洁的，污秽的","adj.","0"};
    	String[] v84={"fructify","结果实，成功","v.","0"};
    	String[] v85={"funereal","适于葬礼的，忧郁的","adj.","0"};

    	String[] v86={"furbish","磨光，刷新","v.","0"};
    	String[] v87={"fury","狂怒，狂暴，激烈；狂怒的人；复仇女神","n.","0"};
    	String[] v88={"fustian","空洞的话，无意义的高调","n.","0"};
    	String[] v89={"gab","饶舌，爱说话；空提案，瞎扯；闲逛，游荡","n./v.","0"};
    	String[] v90={"gabble","欢乐，快活","n.","0"};

    	String[] v91={"gaiety","欢乐，快活","n.","0"};
    	String[] v92={"gale","狂风，一阵(欢笑)","n.","0"};
    	String[] v93={"gallop","飞奔，疾驰","v.","0"};
    	String[] v94={"gallows","绞刑台","n.","0"};
    	String[] v95={"gamut","全音阶，全部知识","n.","0"};
    	
    	String[] v96={"gander","雄鹅，笨人；闲逛","n./v.","0"};
    	String[] v97={"gangling","瘦长难看的","n./adj.","0"};
    	String[] v98={"gangly","身材瘦长的","adj.","0"};
    	String[] v99={"gangrene","坏人","n.","0"};
    	String[] v100={"garland","花环，奖品","n.","0"};

    	String[] v101={"garret","阁楼，顶楼小室","n.","0"};
    	String[] v102={"gastric","胃的，胃部的","adj.","0"};
    	String[] v103={"gastritis","胃炎","n.","0"};
    	String[] v104={"gastronomy","美食法","n.","0"};
    	String[] v105={"gauche","笨拙的，不会社交的","adj.","0"};

    	String[] v106={"gaunt","憔悴的，瘦的","adj.","0"};
    	String[] v107={"genuflect","屈膝半跪（以示敬意）","v.","0"};
    	String[] v108={"gestate","怀孕，孕育","v.","0"};
    	String[] v109={"gesticulate","做手势表达","v.","0"};
    	String[] v110={"ghastly","可怕的，惊人的","adj.","0"};
    	
    	String[] v111={"girdle","腰带，转绕物；环绕","n./v.","0"};
    	String[] v112={"glamorous","迷人的，富有魅力的","adj.","0"};
    	String[] v113={"gleam","亮光，闪光；使闪光","n./v.","0"};
    	String[] v114={"glee","欢喜，高兴","n.","0"};
    	String[] v115={"glimpse","瞥见，看一眼","n./v.","0"};

    	String[] v116={"glitter","闪烁，闪耀；灿烂的光华，诱惑力，魅力","v./n.","0"};
    	String[] v117={"gloaming","黄昏，薄暮","n.","0"};
    	String[] v118={"gloss-over","潦草地或敷衍地处理某事","v.","0"};
    	String[] v119={"gnat","对小事斤斤计较","n.","0"};
    	String[] v120={"gnawing","痛苦的，折磨人的","adj.","0"};

    	String[] v121={"gnome","地下宝藏的守护神","n.","0"};
    	String[] v122={"gnomic","格言的，精辟的","adj.","0"};
    	String[] v123={"goggle","护目镜；睁眼看","n./v.","0"};
    	String[] v124={"gorgeous","美丽的，极好的","adj.","0"};
    	String[] v125={"gormandize","拼命吃，贪吃","v.","0"};
    	
    	String[] v126={"gosling","小鹅，年轻无知的人","n.","0"};
    	String[] v127={"governance","统治，支配","n.","0"};
    	String[] v128={"granary","谷仓，粮仓","n.","0"};
    	String[] v129={"granule","小粒，微粒","n.","0"};
    	String[] v130={"gratis","不付款的，免费的","adj.","0"};

    	String[] v131={"greenhorn","初学者，容易受骗的人","n.","0"};
    	String[] v132={"gridiron","烤架，橄榄球场","n.","0"};
    	String[] v133={"grotesque","怪诞的，古怪的","adj.","0"};
    	String[] v134={"growl","咆哮，吼叫","v.","0"};
    	String[] v135={"grudge","吝啬，不满","v.","0"};

    	String[] v136={"gruesome","令人毛骨悚然的，恶心的","adj.","0"};
    	String[] v137={"gruff","（指人、声音）粗野的","adj.","0"};
    	String[] v138={"grumpy","脾气暴躁的","adj.","0"};
    	String[] v139={"gulch","深谷，峡谷","n.","0"};
    	String[] v140={"gull","海鸥，易上当的人；欺骗","n./v.","0"};

    	String[] v141={"gusto","爱好，兴致勃勃","n.","0"};
    	String[] v142={"gutless","没有勇气，怯懦的","adj.","0"};
    	String[] v143={"guttle","狼吞虎咽","v.","0"};
    	String[] v144={"gynaecocracy","妇女当政","n.","0"};
    	String[] v145={"habitable","可居住的","adj.","0"};

    	String[] v146={"haft","柄，把柄","n.","0"};
    	String[] v147={"haggard","憔悴的，消瘦的","adj.","0"};
    	String[] v148={"haggle","讨价还价","v.","0"};
    	String[] v149={"hamstring","切断腿筋使残废","v.","0"};
    	String[] v150={"hardbitten","不屈的，顽强的","adj.","0"};
    	
    	String[] v151={"hardihood","大胆，鲁莽","n.","0"};
    	String[] v152={"hassle","激烈的辩论","n.","0"};
    	String[] v153={"hatchet","短柄小斧","n.","0"};
    	String[] v154={"hawker","沿街叫卖的小贩","n.","0"};
    	String[] v155={"hawser","粗绳，大钢索","n.","0"};

    	String[] v156={"hearsay","谣传，道听途说","n.","0"};
    	String[] v157={"heave","用力举","v.","0"};
    	String[] v158={"hedgehog","刺猬","n.","0"};
    	
    	
    	
    	
    	
    	
    	subInitial(v1);
		subInitial(v2);
		subInitial(v3);
		subInitial(v4);
		subInitial(v5);
		subInitial(v6);
		subInitial(v7);
		subInitial(v8);
		subInitial(v9);
		subInitial(v10);
		subInitial(v11);
		subInitial(v12);
		subInitial(v13);
		subInitial(v14);
		subInitial(v15);
		subInitial(v16);
		subInitial(v17);
		subInitial(v18);
		subInitial(v19);
		subInitial(v20);
		subInitial(v21);
		subInitial(v22);
		subInitial(v23);
		subInitial(v24);
		subInitial(v25);
		subInitial(v26);
		subInitial(v27);
		subInitial(v28);
		subInitial(v29);
		subInitial(v30);
		subInitial(v31);
		subInitial(v32);
		subInitial(v33);
		subInitial(v34);
		subInitial(v35);
		subInitial(v36);
		subInitial(v37);
		subInitial(v38);
		subInitial(v39);
		subInitial(v40);
		subInitial(v41);
		subInitial(v42);
		subInitial(v43);
		subInitial(v44);
		subInitial(v45);
		subInitial(v46);
		subInitial(v47);
		subInitial(v48);
		subInitial(v49);
		subInitial(v50);
		
		subInitial(v51);
		subInitial(v52);
		subInitial(v53);
		subInitial(v54);
		subInitial(v55);
		subInitial(v56);
		subInitial(v57);
		subInitial(v58);
		subInitial(v59);
		subInitial(v60);
		subInitial(v61);
		subInitial(v62);
		subInitial(v63);
		subInitial(v64);
		subInitial(v65);
		subInitial(v66);
		subInitial(v67);
		subInitial(v68);
		subInitial(v69);
		subInitial(v70);
		subInitial(v71);
		subInitial(v72);
		subInitial(v73);
		subInitial(v74);
		subInitial(v75);
		subInitial(v76);
		subInitial(v77);
		subInitial(v78);
		subInitial(v79);
		subInitial(v80);
		subInitial(v81);
		subInitial(v82);
		subInitial(v83);
		subInitial(v84);
		subInitial(v85);
		subInitial(v86);
		subInitial(v87);
		subInitial(v88);
		subInitial(v89);
		subInitial(v90);
		subInitial(v91);
		subInitial(v92);
		subInitial(v93);
		subInitial(v94);
		subInitial(v95);
		subInitial(v96);
		subInitial(v97);
		subInitial(v98);
		subInitial(v99);
		subInitial(v100);
		subInitial(v101);
		subInitial(v102);
		subInitial(v103);
		subInitial(v104);
		subInitial(v105);
		subInitial(v106);
		subInitial(v107);
		subInitial(v108);
		subInitial(v109);
		subInitial(v110);
		subInitial(v111);
		subInitial(v112);
		subInitial(v113);
		subInitial(v114);
		subInitial(v115);
		subInitial(v116);
		subInitial(v117);
		subInitial(v118);
		
		subInitial(v119);
		subInitial(v120);
		subInitial(v121);
		subInitial(v122);
		subInitial(v123);
		subInitial(v124);
		subInitial(v125);
		subInitial(v126);
		subInitial(v127);
		subInitial(v128);
		subInitial(v129);
		subInitial(v130);
		subInitial(v131);
		subInitial(v132);
		subInitial(v133);
		subInitial(v134);
		subInitial(v135);
		subInitial(v136);
		subInitial(v137);
		subInitial(v138);
		subInitial(v139);
		subInitial(v140);
		subInitial(v141);
		subInitial(v142);
		subInitial(v143);
		subInitial(v144);
		subInitial(v145);
		subInitial(v146);
		subInitial(v147);
		subInitial(v148);
		subInitial(v149);
		subInitial(v150);
		subInitial(v151);
		subInitial(v152);
		subInitial(v153);
		subInitial(v154);
		subInitial(v155);
		subInitial(v156);
		subInitial(v157);
		subInitial(v158);

    	
    }
    private void doList_44(){
    	
    	
    	
    	String[] v1={"hedonic","享乐的，享乐主义学说","adj./n.","0"};
    	String[] v2={"hedonism","享乐主义，享乐","n.","0"};
    	String[] v3={"heliotrope","向阳植物","n.","0"};
    	String[] v4={"helm","舵，驾驶盘","n.","0"};
    	String[] v5={"helot","奴隶，受人轻视的人","n.","0"};

    	String[] v6={"helve","斧柄","n.","0"};
    	String[] v7={"henpecked","顺从妻子的，惧内的","adj.","0"};
    	String[] v8={"hepatitis","肝炎","n.","0"};
    	String[] v9={"herald","传令官，预示，先驱","n.","0"};
    	String[] v10={"herdsman","牧人","n.","0"};

    	String[] v11={"heyday","全盛时期，青春期","n.","0"};
    	String[] v12={"hilt","（剑或刀之）柄","n.","0"};
    	String[] v13={"hinterland","内地","n.","0"};
    	String[] v14={"hippopotamus","河马","n.","0"};
    	String[] v15={"hoarse","嘶哑的，粗哑的","adj.","0"};

    	String[] v16={"hobble","蹒跚","n.","0"};
    	String[] v17={"holocaust","大屠杀，浩劫","n.","0"};
    	String[] v18={"holograph","亲笔信","n.","0"};
    	String[] v19={"homely","朴实的","adj.","0"};
    	String[] v20={"homily","说教，训诫","n.","0"};

    	String[] v21={"homograph","同形异义子","n.","0"};
    	String[] v22={"horology","测时法，钟表制造术","n.","0"};
    	String[] v23={"horrendous","可怕的，令人恐惧的","adj.","0"};
    	String[] v24={"howler","嚎叫的人或动物，滑稽可笑的错误","n.","0"};
    	String[] v25={"hubbub","嘈杂，喧哗","v.","0"};

    	String[] v26={"huddle","挤成一堆；一堆人","v./n.","0"};
    	String[] v27={"hunk","大块（食物）","n.","0"};
    	String[] v28={"hut","简陋的房子","n.","0"};
    	String[] v29={"hygiene","卫生学，卫生","n.","0"};
    	String[] v30={"hypodermic","皮下注射的","adj.","0"};

    	String[] v31={"icing","糖衣，糖霜","n.","0"};
    	String[] v32={"idol","神像，偶像","n.","0"};
    	String[] v33={"idolatrize","奉为偶像，盲目崇拜","v.","0"};
    	String[] v34={"idolize","将...当作偶像崇拜，极度喜爱或仰慕","v.","0"};
    	String[] v35={"illegible","难读的，难认的","adj.","0"};

    	String[] v36={"illiberal","气量狭窄的","adj.","0"};
    	String[] v37={"illustrious","著名的，显赫的","adj.","0"};
    	String[] v38={"imbecile","心智能力极低的人","n.","0"};
    	String[] v39={"immortal","不朽的，流芳百世的","adj.","0"};
    	String[] v40={"impend","进行威胁，即将发生","v.","0"};

    	String[] v41={"imperil","使陷于危险中，危及","v.","0"};
    	String[] v42={"imprecation","祈求，诅咒","n.","0"};
    	String[] v43={"imputation","归咎，归罪","n.","0"};
    	String[] v44={"impute","归咎于","v.","0"};
    	String[] v45={"incertitude","疑惑，不确定","n.","0"};

    	String[] v46={"incisor","门牙","n.","0"};
    	String[] v47={"incongruent","不协调的，不和谐的，不合适的","adj.","0"};
    	String[] v48={"incorporeal","无实体的，非物质的，灵魂的","adj.","0"};
    	String[] v49={"incrustation","硬壳，外层","n.","0"};
    	String[] v50={"indite","写，赋","v.","0"};

    	String[] v51={"ineffaceable","抹不掉的","adj.","0"};
    	String[] v52={"ineligible","没有资格的","adj.","0"};
    	String[] v53={"inexpedient","不适当的，不明智的","adj.","0"};
    	String[] v54={"inexpiable","不能补偿的","adj.","0"};
    	String[] v55={"infatuate","使迷恋，使糊涂","v.","0"};

    	String[] v56={"infatuated","迷恋（人）的","adj.","0"};
    	String[] v57={"infernal","地狱的，可恶的","adj.","0"};
    	String[] v58={"infliction","痛苦，刑罚","n.","0"};
    	String[] v59={"informer","告发者，告密者","n.","0"};
    	String[] v60={"ingress","进入","n.","0"};

    	String[] v511={"insane","疯狂的","adj.","0"};
    	String[] v521={"insanity","疯狂，愚昧","n.","0"};
    	String[] v531={"inscription","铭刻，题字","n.","0"};
    	String[] v541={"insolate","使暴晒","v.","0"};
    	String[] v551={"insouciance","漠不关心，漫不经心","n.","0"};

    	String[] v561={"installment","分期付款，安装","v.","0"};
    	String[] v571={"insuperable","难以克服的","adj.","0"};
    	String[] v581={"interdisciplinary","跨学科的","adj.","0"};
    	String[] v591={"interlace","编织，交错","v.","0"};
    	String[] v601={"interlocutor","对话者，谈话者","n.","0"};

    	String[] v61={"interlope","干涉他人之事；闯入","v.","0"};
    	String[] v62={"interloper","闯入","n.","0"};
    	String[] v63={"interstice","细裂缝，空隙","n.","0"};
    	String[] v64={"interweave","交织，编结","v.","0"};
    	String[] v65={"intestate","未留遗属的","adj.","0"};

    	String[] v66={"intestine","肠，内部的","v.","0"};
    	String[] v67={"intumescence","肿大，肿胀","n.","0"};
    	String[] v68={"investiture","（宗教）任职仪式，授权仪式","n.","0"};
    	String[] v69={"invigilate","监考","v.","0"};
    	String[] v70={"invoice","发票，发货清单；给开发票","n./v.","0"};

    	String[] v71={"iridescence","彩虹色","n.","0"};
    	String[] v72={"irradiate","使明亮","n.","0"};
    	String[] v73={"iterate","重做，反复重申","v.","0"};
    	String[] v74={"jamboree","快乐，喧闹的集会","n.","0"};
    	String[] v75={"jape","开玩笑或讽刺","v.","0"};

    	String[] v76={"jesting","滑稽的，爱开玩笑的","adj.","0"};
    	String[] v77={"jitters","紧张不安","n.","0"};
    	String[] v78={"jolly","喜悦的，欢呼的","adj.","0"};
    	String[] v79={"jubilant","欢悦的，欢呼的","adj.","0"};
    	String[] v80={"juncture","危急关头，结合处","n.","0"};

    	String[] v81={"jurisprudence","法律学，法学","n.","0"};
    	String[] v82={"kaleidoscopic","千变万化的","adj.","0"};
    	String[] v83={"kiosk","售货亭，电话亭","n.","0"};
    	String[] v84={"knoll","小山，小圆丘","n.","0"};
    	String[] v85={"laceration","撕裂，裂口","n.","0"};

    	String[] v86={"lackey","卑躬屈膝者，走卒","n.","0"};
    	String[] v87={"laggerd","缓慢的，落后的；落后者","adj./n.","0"};
    	String[] v88={"lamentable","令人惋惜的，，悔恨的","adj.","0"};
    	String[] v89={"laminate","切成薄板","v.","0"};
    	String[] v90={"lapidary","宝石工，宝石专家","n.","0"};

    	String[] v91={"latch","门把，用门把扣牢","n./v.","0"};
    	String[] v92={"layman","普通信徒，门外汉","n.","0"};
    	String[] v93={"layover","旅途中的短暂停留","n.","0"};
    	String[] v94={"lean","倾斜，斜靠；瘦骨嶙峋","v./adj.","0"};
    	String[] v95={"lash","（系狗的）绳子","n.","0"};

    	String[] v96={"leeward","顺风的","adj.","0"};
    	String[] v97={"leeway","（可供活动的）余地","adj./n.","0"};
    	String[] v98={"legible","易读的","adj.","0"};
    	String[] v99={"lesion","伤口，损害","n.","0"};
    	String[] v100={"lexical","词汇的，词典的","adj.","0"};

    	String[] v101={"lexicon","词典","n.","0"};
    	String[] v102={"libelous","诽谤的","adj.","0"};
    	String[] v103={"libido","性欲，生命力","n.","0"};
    	String[] v104={"licit","不禁止的，合法的","adj.","0"};
    	String[] v105={"ligature","绑缚之物","n.","0"};

    	String[] v106={"limbo","不稳定，中间状态","n.","0"};
    	String[] v107={"lineal","直系的，嫡系的","adj.","0"};
    	String[] v108={"lineaments","（面部等的）特征，轮廓","n.","0"};
    	String[] v109={"lingual","舌的","adj.","0"};
    	String[] v110={"littoral","海岸的；海滨，沿海地区","adj./n.","0"};

    	String[] v111={"livid","青灰色的，苍白的，狂怒的","adj.","0"};
    	String[] v112={"loam","沃土","n.","0"};
    	String[] v113={"locust","蝗虫，贪吃的人","n.","0"};
    	String[] v114={"locution","语言风格，惯用语","n.","0"};
    	String[] v115={"loft","阁楼，顶楼","n.","0"};

    	String[] v116={"logjam","浮木阻塞，阻塞状态，僵局","n.","0"};
    	String[] v117={"loiter","游荡，徘徊","n.","0"};
    	String[] v118={"lore","知识，传说","n.","0"};
    	String[] v119={"lout","粗人","n.","0"};
    	String[] v120={"lowbred","粗野的，鲁莽的","adj.","0"};

    	String[] v121={"lubricious","光滑的，好色的","adj.","0"};
    	String[] v122={"locre","钱，利益","n.","0"};
    	String[] v123={"lucubrate","刻苦攻读，埋头苦干","v.","0"};
    	String[] v124={"lure","诱惑力；引诱","n./v.","0"};
    	String[] v125={"luscious","美味的，肉感的","adj.","0"};

    	String[] v126={"lusty","精力充沛的","adj.","0"};
    	String[] v127={"lynch","私刑处死","v.","0"};
    	String[] v128={"mackintosh","雨衣，防水胶布","n.","0"};
    	String[] v129={"maculate","有斑点的","adj.","0"};
    	String[] v130={"maestro","艺术大师，音乐大师","n.","0"};

    	String[] v131={"magniloquent","夸张的","adj.","0"};
    	String[] v132={"maim","使残废","v.","0"};
    	String[] v133={"makeshift","代用品，权宜之计","n.","0"};
    	String[] v134={"malediction","诅咒","n.","0"};
    	String[] v135={"malefactor","罪犯，作恶者","n.","0"};

    	String[] v136={"maleficent","有害的，犯罪的","n.","0"};
    	String[] v137={"malice","恶意，怨恨","n.","0"};
    	String[] v138={"malignant","恶毒的，充满恨意的","adj.","0"};
    	String[] v139={"mallet","木槌，大头锤","n.","0"};
    	String[] v140={"malodor","恶臭","n.","0"};

    	String[] v141={"manacle","手铐","n.","0"};
    	String[] v142={"maneuver","调遣，策略，操纵","v./n.","0"};
    	String[] v143={"mangy","患疥藓的","adj.","0"};
    	String[] v144={"maraud","抢掠，掠夺","v.","0"};
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	subInitial(v1);
		subInitial(v2);
		subInitial(v3);
		subInitial(v4);
		subInitial(v5);
		subInitial(v6);
		subInitial(v7);
		subInitial(v8);
		subInitial(v9);
		subInitial(v10);
		subInitial(v11);
		subInitial(v12);
		subInitial(v13);
		subInitial(v14);
		subInitial(v15);
		subInitial(v16);
		subInitial(v17);
		subInitial(v18);
		subInitial(v19);
		subInitial(v20);
		subInitial(v21);
		subInitial(v22);
		subInitial(v23);
		subInitial(v24);
		subInitial(v25);
		subInitial(v26);
		subInitial(v27);
		subInitial(v28);
		subInitial(v29);
		subInitial(v30);
		subInitial(v31);
		subInitial(v32);
		subInitial(v33);
		subInitial(v34);
		subInitial(v35);
		subInitial(v36);
		subInitial(v37);
		subInitial(v38);
		subInitial(v39);
		subInitial(v40);
		subInitial(v41);
		subInitial(v42);
		subInitial(v43);
		subInitial(v44);
		subInitial(v45);
		subInitial(v46);
		subInitial(v47);
		subInitial(v48);
		subInitial(v49);
		subInitial(v50);
		
		subInitial(v51);
		subInitial(v52);
		subInitial(v53);
		subInitial(v54);
		subInitial(v55);
		subInitial(v56);
		subInitial(v57);
		subInitial(v58);
		subInitial(v59);
		subInitial(v60);
		
		
		subInitial(v511);
		subInitial(v521);
		subInitial(v531);
		subInitial(v541);
		subInitial(v551);
		subInitial(v561);
		subInitial(v571);
		subInitial(v581);
		subInitial(v591);
		subInitial(v601);
		
		
		
		subInitial(v61);
		subInitial(v62);
		subInitial(v63);
		subInitial(v64);
		subInitial(v65);
		subInitial(v66);
		subInitial(v67);
		subInitial(v68);
		subInitial(v69);
		subInitial(v70);
		subInitial(v71);
		subInitial(v72);
		subInitial(v73);
		subInitial(v74);
		subInitial(v75);
		subInitial(v76);
		subInitial(v77);
		subInitial(v78);
		subInitial(v79);
		subInitial(v80);
		subInitial(v81);
		subInitial(v82);
		subInitial(v83);
		subInitial(v84);
		subInitial(v85);
		subInitial(v86);
		subInitial(v87);
		subInitial(v88);
		subInitial(v89);
		subInitial(v90);
		subInitial(v91);
		subInitial(v92);
		subInitial(v93);
		subInitial(v94);
		subInitial(v95);
		subInitial(v96);
		subInitial(v97);
		subInitial(v98);
		subInitial(v99);
		subInitial(v100);
		subInitial(v101);
		subInitial(v102);
		subInitial(v103);
		subInitial(v104);
		subInitial(v105);
		subInitial(v106);
		subInitial(v107);
		subInitial(v108);
		subInitial(v109);
		subInitial(v110);
		subInitial(v111);
		subInitial(v112);
		subInitial(v113);
		subInitial(v114);
		subInitial(v115);
		subInitial(v116);
		subInitial(v117);
		subInitial(v118);
		
		subInitial(v119);
		subInitial(v120);
		subInitial(v121);
		subInitial(v122);
		subInitial(v123);
		subInitial(v124);
		subInitial(v125);
		subInitial(v126);
		subInitial(v127);
		subInitial(v128);
		subInitial(v129);
		subInitial(v130);
		subInitial(v131);
		subInitial(v132);
		subInitial(v133);
		subInitial(v134);
		subInitial(v135);
		subInitial(v136);
		subInitial(v137);
		subInitial(v138);
		subInitial(v139);
		subInitial(v140);
		subInitial(v141);
		subInitial(v142);
		subInitial(v143);
		subInitial(v144);
		


    	
    }
    private void doList_45(){
    	
    	
    	
    	String[] v1={"mariner","水手，海员","n.","0"};
    	String[] v2={"marrow","骨髓，精华","n.","0"};
    	String[] v3={"matador","斗牛士","n.","0"};
    	String[] v4={"matriarchy","母权制，妇女统治","n.","0"};
    	String[] v5={"matriculate","录取","v.","0"};

    	String[] v6={"maxim","格言，普遍真理","n.","0"};
    	String[] v7={"mayhem","严重伤害罪","n.","0"};
    	String[] v8={"medicate","用药医治，加入药物","v.","0"};
    	String[] v9={"megalomania","自大狂","n.","0"};
    	String[] v10={"memento","纪念品","n.","0"};

    	String[] v11={"menial","仆人的，卑微的；家仆","adj./n.","0"};
    	String[] v12={"mermaid","美人鱼","n.","0"};
    	String[] v13={"mesmerism","催眠术，催眠状态","n.","0"};
    	String[] v14={"mesmerize","对...催眠，迷住","v.","0"};
    	String[] v15={"metallurgy","冶金","n.","0"};

    	String[] v16={"miasma","瘴气；不健康的环境或影响","n.","0"};
    	String[] v17={"midget","侏儒","n.","0"};
    	String[] v18={"mien","风采，风度","n.","0"};
    	String[] v19={"militant","好战的，好暴力的","adj.","0"};
    	String[] v20={"millennium","一千年，太平盛世","n.","0"};

    	String[] v21={"miraculous","奇迹的，不可思议的","adj.","0"};
    	String[] v22={"miscellany","混合物","n.","0"};
    	String[] v23={"missive","信件，公函","n.","0"};
    	String[] v24={"mistimed","不合时机的","adj.","0"};
    	String[] v25={"mistral","寒冷干燥的强风","n.","0"};

    	String[] v26={"molest","骚扰，干扰","v.","0"};
    	String[] v27={"monastery","男修道院，僧院","n.","0"};
    	String[] v28={"monograph","专题论文","n.","0"};
    	String[] v29={"monopolize","垄断，独占","v.","0"};
    	String[] v30={"monotone","单调的","adj.","0"};

    	String[] v31={"monstrous","巨大的，可怕的","adj.","0"};
    	String[] v32={"moody","喜怒无常的，脾气坏的","adj.","0"};
    	String[] v33={"moor","旷野地，荒野；使（船）停泊","n./v.","0"};
    	String[] v34={"mope","抑郁不乐，生闷气；忧郁的人，情绪低落","v./n.","0"};
    	String[] v35={"morass","沼泽地，困境；陷入困境","n./v.","0"};

    	String[] v36={"moron","极蠢之人，低能儿","n.","0"};
    	String[] v37={"motile","能动的，有自动力的","adj.","0"};
    	String[] v38={"mottle","使成杂色","v.","0"};
    	String[] v39={"mountebank","江湖郎中，骗子","n.","0"};
    	String[] v40={"muddle","混乱，迷惑","n.","0"};

    	String[] v41={"muddy","多你的，浑浊的，不纯的","adj.","0"};
    	String[] v42={"muggy","闷热而潮湿的","adj.","0"};
    	String[] v43={"mulct","罚金；处以罚金，诈取","n./v.","0"};
    	String[] v44={"multifarious","多种的，各式各样的","adj.","0"};
    	String[] v45={"multitude","多数，大众，平民","n.","0"};

    	String[] v46={"muniments","契据，房契","n.","0"};
    	String[] v47={"musty","发霉的，有霉臭的","adj.","0"};
    	String[] v48={"mutilate","残害，切断","v.","0"};
    	String[] v49={"mutinous","叛变的，反抗的","adj.","0"};
    	String[] v50={"mutton","羊肉","n.","0"};

    	String[] v51={"muzzy","头脑糊涂的","adj.","0"};
    	String[] v52={"naivety","天真，纯朴","n.","0"};
    	String[] v53={"nasai","鼻的，有鼻音的","adj.","0"};
    	String[] v54={"natation","游泳，游泳术","n.","0"};
    	String[] v55={"naysayer","怀疑者，否定者","n.","0"};

    	String[] v56={"necessitous","贫困的，急需的","n.","0"};
    	String[] v57={"necropolis","大墓地，公墓","n.","0"};
    	String[] v58={"nectar","琼浆玉液，花蜜","n.","0"};
    	String[] v59={"nemesis","报应，天罚","n.","0"};
    	String[] v60={"neonate","初生儿","n.","0"};

    	String[] v71={"nephritis","肾炎","n.","0"};
    	String[] v72={"nestle","舒适地安顿，依偎","v.","0"};
    	String[] v73={"nestling","尚未离巢的小鸟","n.","0"};
    	String[] v74={"nethermost","最低的，最下方的","adj.","0"};
    	String[] v75={"niggard","吝啬鬼","n.","0"};

    	String[] v76={"niggling","琐碎的","adj.","0"};
    	String[] v77={"nihilism","虚无主义，民粹主义","n.","0"};
    	String[] v78={"nimble","敏捷的，灵活的","adj.","0"};
    	String[] v79={"nippers","钳子，镊子","n.","0"};
    	String[] v80={"nipping","尖酸的，刺骨的","adj.","0"};

    	String[] v81={"nonesuch","无匹敌的人","n.","0"};
    	String[] v82={"nonpareil","无匹敌的（人）","adj./v.","0"};
    	String[] v83={"noose","绳索，绞索","n.","0"};
    	String[] v84={"notability","著名，显著","n.","0"};
    	String[] v85={"nude","赤裸裸的；裸体者","adj./n.","0"};

    	String[] v86={"numerology","数字命理学","n.","0"};
    	String[] v87={"numismatic","钱币学的","adj.","0"};
    	String[] v88={"nuptial","婚姻的，婚礼的","adj.","0"};
    	String[] v89={"nymph","年轻女神，少女","n.","0"};
    	String[] v90={"oar","桨；划","n./v.","0"};


    	String[] v91={"oatmeal","燕麦片","n.","0"};
    	String[] v92={"obelisk","方尖碑","n.","0"};
    	String[] v93={"oblation","宗教的供品","n.","0"};
    	String[] v94={"observance","遵守，奉行","n.","0"};
    	String[] v95={"obstrude","突出，强加","v.","0"};

    	String[] v96={"ocular","眼睛的，视觉的","adj.","0"};
    	String[] v97={"oddment","残余物，零头","n.","0"};
    	String[] v98={"odoriferous","有气味的","adj.","0"};
    	String[] v99={"olfactory","嗅觉的","adj.","0"};
    	String[] v100={"oligarch","寡头政治执政者","n.","0"};

    	String[] v101={"omnivorous","杂食的，兴趣多的","adj.","0"};
    	String[] v102={"onslaught","猛攻，猛袭","n.","0"};
    	String[] v103={"onus","义务，负担","n.","0"};
    	String[] v104={"ooze","慢慢地流，渗出，逐渐消失","v.","0"};
    	String[] v105={"opiate","安眠药，鸦片制剂","n.","0"};

    	String[] v106={"optimization","最优化","n.","0"};
    	String[] v107={"opus","巨著，音乐作品","n.","0"};
    	String[] v108={"oracular","神谕的，意识模糊的","adj.","0"};
    	String[] v109={"orifice","小开口，小孔","n.","0"};
    	String[] v110={"orotund","洪亮的，夸张的","adj.","0"};

    	String[] v111={"otiose","不必要的，多余的","adj.","0"};
    	String[] v112={"outfox","以机智胜过","v.","0"};
    	String[] v113={"oversight","疏忽，失察","v.","0"};
    	String[] v114={"overweening","字符的，过于自信的","adj.","0"};
    	String[] v115={"palaver","空谈，奉承","v./n.","0"};

    	String[] v116={"paling","篱笆，木栅栏","n.","0"};
    	String[] v117={"pamper","纵容，过分关怀","v.","0"};
    	String[] v118={"pane","窗格玻璃","n.","0"};
    	String[] v119={"panoramic","全景的，全貌的，概论的","adj.","0"};
    	String[] v120={"pantechnicon","家具仓库，家具搬运车","n.","0"};

    	String[] v121={"pantheon","万神殿","n.","0"};
    	String[] v122={"paralyze","使瘫痪","v.","0"};
    	String[] v123={"parley","和谈，会谈；和谈，会谈","n./v.","0"};
    	String[] v124={"parlous","靠不住的，危险的","adj.","0"};
    	String[] v125={"parochial","教区的，地方性的，狭小的","adj.","0"};

    	String[] v126={"parturition","生产，分娩","v.","0"};
    	String[] v127={"pastor","牧师，牧人","n.","0"};
    	String[] v128={"pathetic","引起怜悯的，令人难过的","adj.","0"};
    	String[] v129={"pathos","赶上，哀婉","v.","0"};
    	String[] v130={"pawn","典当，抵押；被利用的小人物","n./v.","0"};

    	String[] v131={"peaky","消瘦的，虚弱的","adj.","0"};
    	String[] v132={"peculate","挪用（公款）","v.","0"};
    	String[] v133={"pecuniary","金钱的","adj.","0"};
    	String[] v134={"peddle","兜售","adj.","0"};
    	String[] v135={"peek","偷看","v.","0"};

    	String[] v136={"peep","瞥见，偷看","n./v.","0"};
    	String[] v137={"peery","窥视的；好奇的","adj.","0"};
    	String[] v138={"pelt","扔；毛皮","v./n.","0"};
    	String[] v139={"pendent","吊着的，悬挂的","adj.","0"};
    	String[] v140={"penetration","穿透，洞察力","n.","0"};

    	String[] v141={"pension","养老金，退休金","n.","0"};
    	String[] v142={"pensive","沉思的，愁眉苦脸的","adj.","0"};
    	String[] v143={"penumbra","半明半暗之处，边缘部分","n.","0"};
    	String[] v144={"peptic","产生胃酶的，助消化的","adj.","0"};
    	String[] v145={"peptic","过滤出，渗透","v.","0"};

    	String[] v146={"percussion","敲击乐器","n.","0"};
    	String[] v147={"perigee","近地点","adj.","0"};
    	String[] v148={"periphrastic","迂回的，冗赘的","adj.","0"};
    	String[] v149={"perishable","易腐败的，腐败的东西","adj.","0"};
    	String[] v150={"persnickety","势力的，挑剔的","adj.","0"};

    	String[] v151={"personage","名人，角色","n.","0"};
    	String[] v152={"perverse","不合适的，刚愎自用的，故意作对的","adj.","0"};
    	String[] v153={"pervert","使堕落，误用，歪曲","v.","0"};
    	
    	
    	
    	
    	
    	
    	
    	subInitial(v1);
		subInitial(v2);
		subInitial(v3);
		subInitial(v4);
		subInitial(v5);
		subInitial(v6);
		subInitial(v7);
		subInitial(v8);
		subInitial(v9);
		subInitial(v10);
		subInitial(v11);
		subInitial(v12);
		subInitial(v13);
		subInitial(v14);
		subInitial(v15);
		subInitial(v16);
		subInitial(v17);
		subInitial(v18);
		subInitial(v19);
		subInitial(v20);
		subInitial(v21);
		subInitial(v22);
		subInitial(v23);
		subInitial(v24);
		subInitial(v25);
		subInitial(v26);
		subInitial(v27);
		subInitial(v28);
		subInitial(v29);
		subInitial(v30);
		subInitial(v31);
		subInitial(v32);
		subInitial(v33);
		subInitial(v34);
		subInitial(v35);
		subInitial(v36);
		subInitial(v37);
		subInitial(v38);
		subInitial(v39);
		subInitial(v40);
		subInitial(v41);
		subInitial(v42);
		subInitial(v43);
		subInitial(v44);
		subInitial(v45);
		subInitial(v46);
		subInitial(v47);
		subInitial(v48);
		subInitial(v49);
		subInitial(v50);
		
		subInitial(v51);
		subInitial(v52);
		subInitial(v53);
		subInitial(v54);
		subInitial(v55);
		subInitial(v56);
		subInitial(v57);
		subInitial(v58);
		subInitial(v59);
		subInitial(v60);

		subInitial(v71);
		subInitial(v72);
		subInitial(v73);
		subInitial(v74);
		subInitial(v75);
		subInitial(v76);
		subInitial(v77);
		subInitial(v78);
		subInitial(v79);
		subInitial(v80);
		subInitial(v81);
		subInitial(v82);
		subInitial(v83);
		subInitial(v84);
		subInitial(v85);
		subInitial(v86);
		subInitial(v87);
		subInitial(v88);
		subInitial(v89);
		subInitial(v90);
		subInitial(v91);
		subInitial(v92);
		subInitial(v93);
		subInitial(v94);
		subInitial(v95);
		subInitial(v96);
		subInitial(v97);
		subInitial(v98);
		subInitial(v99);
		subInitial(v100);
		subInitial(v101);
		subInitial(v102);
		subInitial(v103);
		subInitial(v104);
		subInitial(v105);
		subInitial(v106);
		subInitial(v107);
		subInitial(v108);
		subInitial(v109);
		subInitial(v110);
		subInitial(v111);
		subInitial(v112);
		subInitial(v113);
		subInitial(v114);
		subInitial(v115);
		subInitial(v116);
		subInitial(v117);
		subInitial(v118);
		
		subInitial(v119);
		subInitial(v120);
		subInitial(v121);
		subInitial(v122);
		subInitial(v123);
		subInitial(v124);
		subInitial(v125);
		subInitial(v126);
		subInitial(v127);
		subInitial(v128);
		subInitial(v129);
		subInitial(v130);
		subInitial(v131);
		subInitial(v132);
		subInitial(v133);
		subInitial(v134);
		subInitial(v135);
		subInitial(v136);
		subInitial(v137);
		subInitial(v138);
		subInitial(v139);
		subInitial(v140);
		subInitial(v141);
		subInitial(v142);
		subInitial(v143);
		subInitial(v144);
		subInitial(v145);
		subInitial(v146);
		subInitial(v147);
		subInitial(v148);
		subInitial(v149);
		subInitial(v150);
		subInitial(v151);
		subInitial(v152);
		subInitial(v153);
		
    }
    private void doList_46(){
    	
    	
    	
    	
    	String[] v1={"pesky","讨厌的，烦人的","adj.","0"};
    	String[] v2={"pettish","易怒的，使性子的","adj.","0"};
    	String[] v3={"pharisaic","伪善的，伪装虔诚的","adj.","0"};
    	String[] v4={"phial","小瓶","n.","0"};
    	String[] v5={"philology","语文学，文学语言学","n.","0"};

    	String[] v6={"phobia","恐惧症","n.","0"};
    	String[] v7={"phony","假的，伪造的","adj.","0"};
    	String[] v8={"piazza","阳台，广场","n.","0"};
    	String[] v9={"piebald","花斑的，斑驳的","adj.","0"};
    	String[] v10={"piecemeal","一件一件的，零碎的","adj.","0"};

    	String[] v11={"pier","桥墩","n.","0"};
    	String[] v12={"pilfer","偷窃","v.","0"};
    	String[] v13={"pillage","抢劫，掠夺","v.","0"};
    	String[] v14={"pincers","钳子，镊子","n.","0"};
    	String[] v15={"piscatorial","捕鱼的，渔民的","adj.","0"};

    	String[] v16={"pitiless","无情的，冷酷的，无怜悯之心的","adj.","0"};
    	String[] v17={"pivot","枢轴，中心；旋转","n./v.","0"};
    	String[] v18={"plank","厚木板，要点","n.","0"};
    	String[] v19={"plaza","广场，集市","n.","0"};
    	String[] v20={"plebeian","全权的，全体出席的","adj.","0"};

    	String[] v21={"plenary","全权的，全体出席的","adj.","0"};
    	String[] v22={"plentitude","充分","n.","0"};
    	String[] v23={"pleonastic","啰嗦的","adj.","0"};
    	String[] v24={"pliers","钳子","n.","0"};
    	String[] v25={"plump","颇胖的，丰满的","adj.","0"};

    	String[] v26={"poach","偷取，窃取","v.","0"};
    	String[] v27={"poltroon","懦夫","n.","0"};
    	String[] v28={"polyandry","一妻多夫制","n.","0"};
    	String[] v29={"polyglot","通晓多种语言的","adj.","0"};
    	String[] v30={"polymath","知识广博者","n.","0"};

    	String[] v31={"pony","小型马","n.","0"};
    	String[] v32={"porcine","猪的，似猪的","adj.","0"};
    	String[] v33={"porridge","麦片粥","n.","0"};
    	String[] v34={"portable","轻便的，手提式的","adj.","0"};
    	String[] v35={"portend","预兆，预示","n.","0"};

    	String[] v36={"positiveness","肯定，确信","v.","0"};
    	String[] v37={"posterior","较后的","adj.","0"};
    	String[] v38={"postscript","附言，后记","n.","0"};
    	String[] v39={"potboiler","粗制滥造的文艺作品","n.","0"};
    	String[] v40={"prance","昂首阔步","v.","0"};

    	String[] v41={"prefigure","预示，预想","v.","0"};
    	String[] v42={"prehensile","能抓东西的，能缠绕东西的","adj.","0"};
    	String[] v43={"preponderant","以重生的，优势的，压倒性的","adj.","0"};
    	String[] v44={"prepossessing","给人好感的","adj.","0"};
    	String[] v45={"presentiment","预感，预觉","n.","0"};

    	String[] v46={"presumable","可能的，可假定的","adj.","0"};
    	String[] v47={"pretence","虚伪，接口","n.","0"};
    	String[] v48={"prevision","先见，预感","n.","0"};
    	String[] v49={"prick","小刺，刺痛；刺伤，戳穿","n./v.","0"};
    	String[] v50={"prickle","刺，棘；刺痛","n./v.","0"};

    	String[] v51={"prig","自命不凡这，道学先生","n.","0"};
    	String[] v52={"prissy","谨小慎微的，神经质的，为小事挂虑的","adj.","0"};
    	String[] v53={"procreate","生育","v.","0"};
    	String[] v54={"procrustean","强求一致的","adj.","0"};
    	String[] v55={"progenitor","祖先，始祖","n.","0"};

    	String[] v56={"prognosticate","预示，预测","v.","0"};
    	String[] v57={"proofread","校对","v.","0"};
    	String[] v58={"prorogue","体会，延期","v.","0"};
    	String[] v59={"protrude","突出，伸出","v.","0"};
    	String[] v60={"proverbially","无人不知地","adv.","0"};

    	String[] v61={"psalm","赞美诗，圣诗","n.","0"};
    	String[] v62={"puberty","青春期","n.","0"};
    	String[] v63={"puffery","极力称赞，夸大的广告，吹捧","n.","0"};
    	String[] v64={"pullulate","繁殖，剧增","v.","0"};
    	String[] v65={"pulpit","讲坛","n.","0"};

    	String[] v66={"pulsate","有规律地振动","v.","0"};
    	String[] v67={"pulsation","脉动，跳动，有节奏的鼓动","n.","0"};
    	String[] v68={"pummel","接连地打，打击","v.","0"};
    	String[] v69={"purblind","愚钝的，视力不佳的","adj.","0"};
    	String[] v70={"purport","意义，涵义","n.","0"};

    	String[] v71={"purse","缩拢或撅起；钱包","v./n.","0"};
    	String[] v72={"putative","公认的，普遍认为的","adj.","0"};
    	String[] v73={"putrefy","使腐烂","v.","0"};
    	String[] v74={"putrid","腐臭的","adj.","0"};
    	String[] v75={"pygmy","矮人，侏儒","n.","0"};

    	String[] v76={"pyromania","纵火狂","n.","0"};
    	String[] v77={"quadrangle","四边形","n.","0"};
    	String[] v78={"quadruped","四足兽","n.","0"};
    	String[] v79={"quagmire","沼泽地，困境","n.","0"};
    	String[] v80={"qualm","疑惧，紧张不安","n.","0"};

    	String[] v81={"queasy","令人恶心的，充满疑虑的","adj.","0"};
    	String[] v82={"queer","奇怪的，疯狂的","adj.","0"};
    	String[] v83={"quintessence","完美的榜样，精华","n.","0"};
    	String[] v84={"quip","俏皮话，妙语","n.","0"};
    	String[] v85={"racketeer","敲诈者，获取不正当钱财的人","n.","0"};

    	String[] v86={"raillery","善意的嘲弄","v.","0"};
    	String[] v87={"rapscallion","流氓，恶棍","n.","0"};
    	String[] v88={"rasp","发出刺耳的声音","v.","0"};
    	String[] v89={"ratify","批准（等协定等）","v.","0"};
    	String[] v90={"ravish","迷住，强夺","v.","0"};

    	String[] v91={"rebarbative","令人讨厌的，冒犯人的","adj.","0"};
    	String[] v92={"reckon","推断，估计，猜想，设想","v.","0"};
    	String[] v93={"recline","斜倚，躺卧","v.","0"};
    	String[] v94={"reconnoiter","侦查，勘察","v.","0"};
    	String[] v95={"reedy","长满芦苇的，（声音）高而尖的","n.","0"};

    	String[] v96={"regal","帝王的，华丽的","adj.","0"};
    	String[] v97={"regent","摄政者","n.","0"};
    	String[] v98={"regiment","团；严格控制","n./v.","0"};
    	String[] v99={"reincarnate","使化身，转生","v.","0"};
    	String[] v100={"rejoin","回答，答辩","v.","0"};

    	String[] v101={"rejoinder","回答，答辩","n.","0"};
    	String[] v102={"remission","赦免","n.","0"};
    	String[] v103={"remit","免除","v.","0"};
    	String[] v104={"remittance","汇款","n.","0"};
    	String[] v105={"remittent","间歇性的，忽好忽坏的","adj.","0"};

    	String[] v106={"remonstrance","抗议，抱怨","n.","0"};
    	String[] v107={"remunerate","报酬，补偿","v.","0"};
    	String[] v108={"renascent","再生的，复活的","adj.","0"};
    	String[] v109={"rendition","表演，扮演，演奏，演唱","n.","0"};
    	String[] v110={"renunciate","放弃","v.","0"};

    	String[] v111={"repent","懊悔，后悔","v.","0"};
    	String[] v112={"replica","复制品","n.","0"};
    	String[] v113={"reportage","报道，报道的消息，报告文学","v.","0"};
    	String[] v114={"repository","储藏室，仓库","n.","0"};
    	String[] v115={"rescript","公告，法令","n.","0"};

    	String[] v116={"reshuffle","再洗牌，改组","v.","0"};
    	String[] v117={"restorative","恢复健康的","adj.","0"};
    	String[] v118={"resurge","复活","v.","0"};
    	String[] v119={"retention","保留，保持","n.","0"};
    	String[] v120={"retentive","有记忆里的","adj.","0"};

    	String[] v121={"reticulation","网目，网状","n.","0"};
    	String[] v122={"retrenchment","节省，削减","v.","0"};
    	String[] v123={"retroactive","溯及既往的，有追溯效力的","adj.","0"};
    	String[] v124={"reversion","返回，逆转","n.","0"};
    	String[] v125={"revulsion","厌恶，憎恶，剧烈反应","n.","0"};

    	String[] v126={"rhapsody","赞美之诗，狂想曲","n.","0"};
    	String[] v127={"riffle","涟漪","n.","0"};
    	String[] v128={"riffraff","乌合之众，群氓","n.","0"};
    	String[] v129={"rigmarole","冗长的废话","n.","0"};
    	String[] v130={"rinse","以清水冲洗，漂洗","v.","0"};

    	String[] v1211={"rip","撕裂，撕破","v.","0"};
    	String[] v1221={"roister","喝酒喧哗","v.","0"};
    	String[] v1231={"rollicking","欢闹的","adj.","0"};
    	String[] v1241={"rosy","玫瑰色的，美好的，乐观的，健康的","adj.","0"};
    	String[] v1251={"rote","死记硬背","n.","0"};

    	String[] v1261={"rotund","圆胖的","n.","0"};
    	String[] v1271={"roundabout","绕远道的，转弯抹角的","adj.","0"};
    	String[] v1281={"rout","大败，溃败","n.","0"};
    	String[] v1291={"rove","流浪，漂泊","v.","0"};
    	String[] v1301={"rowdy","吵闹的，粗暴的","adj.","0"};

    	String[] v131={"rubble","（一堆）砾石，瓦砾","n.","0"};
    	String[] v132={"ruck","皱褶","n.","0"};
    	String[] v133={"rucksack","（旅行等的）背包","n.","0"};
    	String[] v134={"ruddy","（脸色）红润的，红色的","adj.","0"};
    	String[] v135={"rumble","发出低沉的隆隆声","v.","0"};

    	String[] v136={"ruminate","深思","v.","0"};
    	String[] v137={"rustle","（使某物）发出轻而爽的声音","v.","0"};
    	String[] v138={"rustler","偷牛贼","n.","0"};
    	String[] v139={"saccharine","（态度）娇媚的，（说话声）娇滴滴的","v.","0"};
    	String[] v140={"sack","粗布袋；掠夺","n./v.","0"};

    	String[] v141={"sacrament","圣礼，圣事","n.","0"};
    	String[] v142={"sadistic","施虐狂的，性施虐狂的","adj.","0"};
    	String[] v143={"safe","保险柜，冷藏室，饭橱","n.","0"};
    	String[] v144={"saga","英雄故事，长篇小说","n.","0"};
    	String[] v145={"saliferous","含盐的，产盐的","adj.","0"};
    	
    	
    	
    	
    	
    	subInitial(v1);
		subInitial(v2);
		subInitial(v3);
		subInitial(v4);
		subInitial(v5);
		subInitial(v6);
		subInitial(v7);
		subInitial(v8);
		subInitial(v9);
		subInitial(v10);
		subInitial(v11);
		subInitial(v12);
		subInitial(v13);
		subInitial(v14);
		subInitial(v15);
		subInitial(v16);
		subInitial(v17);
		subInitial(v18);
		subInitial(v19);
		subInitial(v20);
		subInitial(v21);
		subInitial(v22);
		subInitial(v23);
		subInitial(v24);
		subInitial(v25);
		subInitial(v26);
		subInitial(v27);
		subInitial(v28);
		subInitial(v29);
		subInitial(v30);
		subInitial(v31);
		subInitial(v32);
		subInitial(v33);
		subInitial(v34);
		subInitial(v35);
		subInitial(v36);
		subInitial(v37);
		subInitial(v38);
		subInitial(v39);
		subInitial(v40);
		subInitial(v41);
		subInitial(v42);
		subInitial(v43);
		subInitial(v44);
		subInitial(v45);
		subInitial(v46);
		subInitial(v47);
		subInitial(v48);
		subInitial(v49);
		subInitial(v50);
		
		subInitial(v51);
		subInitial(v52);
		subInitial(v53);
		subInitial(v54);
		subInitial(v55);
		subInitial(v56);
		subInitial(v57);
		subInitial(v58);
		subInitial(v59);
		subInitial(v60);
		subInitial(v61);
		subInitial(v62);
		subInitial(v63);
		subInitial(v64);
		subInitial(v65);
		subInitial(v66);
		subInitial(v67);
		subInitial(v68);
		subInitial(v69);
		subInitial(v70);
		subInitial(v71);
		subInitial(v72);
		subInitial(v73);
		subInitial(v74);
		subInitial(v75);
		subInitial(v76);
		subInitial(v77);
		subInitial(v78);
		subInitial(v79);
		subInitial(v80);
		subInitial(v81);
		subInitial(v82);
		subInitial(v83);
		subInitial(v84);
		subInitial(v85);
		subInitial(v86);
		subInitial(v87);
		subInitial(v88);
		subInitial(v89);
		subInitial(v90);
		subInitial(v91);
		subInitial(v92);
		subInitial(v93);
		subInitial(v94);
		subInitial(v95);
		subInitial(v96);
		subInitial(v97);
		subInitial(v98);
		subInitial(v99);
		subInitial(v100);
		subInitial(v101);
		subInitial(v102);
		subInitial(v103);
		subInitial(v104);
		subInitial(v105);
		subInitial(v106);
		subInitial(v107);
		subInitial(v108);
		subInitial(v109);
		subInitial(v110);
		subInitial(v111);
		subInitial(v112);
		subInitial(v113);
		subInitial(v114);
		subInitial(v115);
		subInitial(v116);
		subInitial(v117);
		subInitial(v118);
		
		subInitial(v119);
		subInitial(v120);
		subInitial(v121);
		subInitial(v122);
		subInitial(v123);
		subInitial(v124);
		subInitial(v125);
		subInitial(v126);
		subInitial(v127);
		subInitial(v128);
		subInitial(v129);
		subInitial(v130);
		subInitial(v1211);
		subInitial(v1221);
		subInitial(v1231);
		subInitial(v1241);
		subInitial(v1251);
		subInitial(v1261);
		subInitial(v1271);
		subInitial(v1281);
		subInitial(v1291);
		subInitial(v1301);
		subInitial(v131);
		subInitial(v132);
		subInitial(v133);
		subInitial(v134);
		subInitial(v135);
		subInitial(v136);
		subInitial(v137);
		subInitial(v138);
		subInitial(v139);
		subInitial(v140);
		subInitial(v141);
		subInitial(v142);
		subInitial(v143);
		subInitial(v144);
		subInitial(v145);

    }
    private void doList_47(){
    	String[] v1={"sanatorium","疗养院","n.","0"};
    	String[] v2={"sangfroid","沉着，临危不惧","n.","0"};
    	String[] v3={"sanitary","卫生的，清洁的","adj.","0"};
    	String[] v4={"sapling","树苗，年轻人","n.","0"};
    	String[] v5={"sardonic","嘲笑的","adj.","0"};

    	String[] v6={"satanic","穷凶极恶的","adj.","0"};
    	String[] v7={"sated","厌腻的","adj.","0"};
    	String[] v8={"scab","创口上所结的疤","n.","0"};
    	String[] v9={"scabrous","粗糙的","adj.","0"};
    	String[] v10={"scads","大量，巨额","n.","0"};

    	String[] v11={"scald","烫，用沸水消毒","v.","0"};
    	String[] v12={"scamper","奔跑，快跑","v.","0"};
    	String[] v13={"scan","细查，细看，浏览，扫描，分析韵律","v.","0"};
    	String[] v14={"scar","伤痕，伤疤","n.","0"};
    	String[] v15={"scare","惊吓，受惊，威吓","n./v.","0"};

    	String[] v16={"scarp","悬崖，陡坡","n.","0"};
    	String[] v17={"scathe","损害，烧伤，烧焦；严厉批评","n./v.","0"};
    	String[] v18={"sceptical","怀疑的，不相信的","adj.","0"};
    	String[] v19={"scintillate","闪烁，流露机智","v.","0"};
    	String[] v20={"scission","切断，分离，分裂","n.","0"};

    	String[] v21={"scooter","滑行车，踏板车","n.","0"};
    	String[] v22={"scorching","酷热的","adj.","0"};
    	String[] v23={"scour","擦洗，擦亮，四处搜索","v.","0"};
    	String[] v24={"scramble","攀登，争夺 ","n.","0"};
    	String[] v25={"scrape","刮掉，擦掉","v.","0"};

    	String[] v26={"screed","冗长的演说，长篇大论的文章","n.","0"};
    	String[] v27={"scrumptious","（食物）很可口的","adj.","0"};
    	String[] v28={"scud","疾行，疾驶","v.","0"};
    	String[] v29={"scutter","疾走","v.","0"};
    	String[] v30={"scuttle","舱口盖","n.","0"};

    	String[] v31={"seafaring","航海的，跟航海有关的","adj.","0"};
    	String[] v32={"seclude","和别人隔离","v.","0"};
    	String[] v33={"sect","（宗教等）派系","v.","0"};
    	String[] v34={"sedition","煽动叛乱","n.","0"};
    	String[] v35={"seditious","煽动性的","adj.","0"};

    	String[] v36={"self-abasement","自卑，自谦","n.","0"};
    	String[] v37={"self-absorbed","自恋的","adj.","0"};
    	String[] v38={"self-assertion","坚持己见","n.","0"};
    	String[] v39={"senile","年老的","adj.","0"};
    	String[] v40={"sensitize","使某人或某事物敏感","v.","0"};

    	String[] v41={"sensual","肉欲的，淫荡的","adj.","0"};
    	String[] v42={"sententious","好说教的","adj.","0"};
    	String[] v43={"sentry","哨兵，步哨","n.","0"};
    	String[] v44={"sequacious","盲从的","adj.","0"};
    	String[] v45={"sequela","后继者，后遗症","n.","0"};

    	String[] v46={"sequestrate","扣押，没收","v.","0"};
    	String[] v47={"serenade","夜曲","n.","0"};
    	String[] v48={"serendipity","善于发掘新奇事物的天赋","n.","0"};
    	String[] v49={"serfdom","农奴身份，农奴境遇","n.","0"};
    	String[] v50={"sermonize","说教，讲道","v.","0"};

    	String[] v51={"serpentine","似蛇般绕曲的，蜿蜒的","adj.","0"};
    	String[] v52={"shabby","破烂的，卑鄙的","adj.","0"};
    	String[] v53={"shack","简陋小屋，棚屋","n.","0"};
    	String[] v54={"shanty","简陋的小木屋","n.","0"};
    	String[] v55={"shawl","（妇女用）披肩","n.","0"};

    	String[] v56={"sheaf","一捆，一束","n.","0"};
    	String[] v57={"sheen","光辉，光泽","n.","0"};
    	String[] v58={"shibboleth","陈旧语句","n.","0"};
    	String[] v59={"shimmer","闪烁，微微发亮","v.","0"};
    	String[] v60={"shipwright","造船者","n.","0"};

    	String[] v61={"showy","俗艳的，炫耀的","adj.","0"};
    	String[] v62={"shred","碎片，破布","n.","0"};
    	String[] v63={"shrivel","使枯萎","v.","0"};
    	String[] v64={"shuffle","拖步走，支吾，洗牌","v.","0"};
    	String[] v65={"shuttle","使穿梭移动，往返运送","v.","0"};

    	String[] v66={"sidesplitting","令人捧腹大笑的","adj.","0"};
    	String[] v67={"sidle","（偷偷地）侧身而行","v.","0"};
    	String[] v68={"signatory","签署者，签署国","n.","0"};
    	String[] v69={"signature","签名，签字","n.","0"};
    	String[] v70={"simian","猿的，猴的；猴类人猿","adj./n.","0"};

    	String[] v71={"simile","明喻","n.","0"};
    	String[] v72={"sinister","不吉祥的，险恶的","adj.","0"};
    	String[] v73={"sizzler","炎热天气，大热天","n.","0"};
    	String[] v74={"skein","一束","n.","0"};
    	String[] v75={"skittish","轻浮的，轻佻的","adj.","0"};

    	String[] v76={"skullduggery","舞弊","n.","0"};
    	String[] v77={"skunk","臭鼬，黄鼠狼；欺骗","n./v.","0"};
    	String[] v78={"skyrocket","陡升，猛涨","v.","0"};
    	String[] v79={"slapdash","马虎地（的）","adv./adj.","0"};
    	String[] v80={"slaver","流口水，奉承；口水","v./n.","0"};

    	String[] v81={"slay","杀，残杀","v.","0"};
    	String[] v82={"sleazy","邋遢的，格调低下的","adj.","0"};
    	String[] v83={"sledge","雪橇","n.","0"};
    	String[] v84={"sledgehammer","长柄大锤","n.","0"};
    	String[] v85={"sleight","巧妙手法，巧计","n.","0"};

    	String[] v86={"sling","投掷，扔；吊腕带，吊索","v./n.","0"};
    	String[] v87={"slit","撕裂；裂缝","v./n.","0"};
    	String[] v88={"slobber","口水；流口水","n./v.","0"};
    	String[] v89={"sloven","不修边幅的人","n.","0"};
    	String[] v90={"slue","（使）旋转","v.","0"};

    	String[] v91={"slump","猛然落下，暴跌","v.","0"};
    	String[] v92={"smirch","玷污；污点","v./n.","0"};
    	String[] v93={"snappish","脾气暴躁的","adj.","0"};
    	String[] v94={"snappy","精力充沛的，潇洒的","adj.","0"};
    	String[] v95={"snicker","窃笑；暗笑","v./n.","0"};

    	String[] v96={"snob","势利小人","n.","0"};
    	String[] v97={"snuggle","挨近，依偎","v.","0"};
    	String[] v98={"sociable","好交际的，友好的，合群的","adj.","0"};
    	String[] v99={"sojourn","逗留，寄居","v./n.","0"};
    	String[] v100={"somnolent","思睡的，催眠的","adj.","0"};

    	String[] v101={"sonorous","（声音）洪亮的","adj.","0"};
    	String[] v102={"souse","浸在水中","v.","0"};
    	String[] v103={"spacious","广阔的，宽敞的","adj.","0"};
    	String[] v104={"spangle","（缝在衣服上的）金属片；闪光","n./v.","0"};
    	String[] v105={"spasmodic","痉挛的，间歇性的","adj.","0"};

    	String[] v106={"speleology","洞窟学","n.","0"};
    	String[] v107={"splashy","溅水的，炫耀显眼的","adj.","0"};
    	String[] v108={"spool","（缠录音带等的）卷盘","n.","0"};
    	String[] v109={"spout","喷出","v.","0"};
    	String[] v110={"sprawl","伸展手脚而卧","v.","0"};

    	String[] v111={"sprint","短距离全速奔跑","v.","0"};
    	String[] v112={"spunk","勇气，胆量","n.","0"};
    	String[] v113={"spurn","拒绝，摈弃","v.","0"};
    	String[] v114={"squeamish","易受惊的","adj.","0"};
    	String[] v115={"stab","刺伤，戳","v.","0"};

    	String[] v116={"stagger","蹒跚，摇晃","v.","0"};
    	String[] v117={"stagy","不自然的，演习一般的","adj.","0"};
    	String[] v118={"standstill","处于停顿状态，中止","n.","0"};
    	String[] v119={"star-crossed","时运不济的","adj.","0"};
    	String[] v120={"stash","藏匿，隐藏","v.","0"};

    	String[] v121={"steeple","尖塔，尖阁","n.","0"};
    	String[] v122={"stoop","俯身，降低身份","v.","0"};
    	String[] v123={"stouthearted","刚毅的，大胆的","adj.","0"};
    	String[] v124={"straggle","迷路，落伍，蔓延","v.","0"};
    	String[] v125={"strangulation","扼杀，勒死","v.","0"};

    	String[] v126={"studio","工作室，画室，演播室","n.","0"};
    	String[] v127={"stun","使晕倒，使惊吓，打晕","v.","0"};
    	String[] v128={"stupefy","使茫然，吓呆","v.","0"};
    	String[] v129={"stupendous","巨大的，大得惊人的","adj.","0"};
    	String[] v130={"sublimate","使升华","v.","0"};

    	String[] v131={"subscribe","捐助，订购","v.","0"};
    	String[] v132={"subsist","俯身，降低身份","v.","0"};
    	String[] v133={"substratum","基础，地基","n.","0"};
    	String[] v134={"subvention","补助金，津贴","n.","0"};
    	String[] v135={"sully","玷污，污染","v.","0"};

    	String[] v136={"sundry","各式各样的，各种的","adj.","0"};
    	String[] v137={"superannuated","老迈的","adj.","0"};
    	String[] v138={"superlative","最佳的","adj.","0"};
    	String[] v139={"superstition","迷信，盲目恐惧","v.","0"};
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	subInitial(v1);
		subInitial(v2);
		subInitial(v3);
		subInitial(v4);
		subInitial(v5);
		subInitial(v6);
		subInitial(v7);
		subInitial(v8);
		subInitial(v9);
		subInitial(v10);
		subInitial(v11);
		subInitial(v12);
		subInitial(v13);
		subInitial(v14);
		subInitial(v15);
		subInitial(v16);
		subInitial(v17);
		subInitial(v18);
		subInitial(v19);
		subInitial(v20);
		subInitial(v21);
		subInitial(v22);
		subInitial(v23);
		subInitial(v24);
		subInitial(v25);
		subInitial(v26);
		subInitial(v27);
		subInitial(v28);
		subInitial(v29);
		subInitial(v30);
		subInitial(v31);
		subInitial(v32);
		subInitial(v33);
		subInitial(v34);
		subInitial(v35);
		subInitial(v36);
		subInitial(v37);
		subInitial(v38);
		subInitial(v39);
		subInitial(v40);
		subInitial(v41);
		subInitial(v42);
		subInitial(v43);
		subInitial(v44);
		subInitial(v45);
		subInitial(v46);
		subInitial(v47);
		subInitial(v48);
		subInitial(v49);
		subInitial(v50);
		
		subInitial(v51);
		subInitial(v52);
		subInitial(v53);
		subInitial(v54);
		subInitial(v55);
		subInitial(v56);
		subInitial(v57);
		subInitial(v58);
		subInitial(v59);
		subInitial(v60);
		subInitial(v61);
		subInitial(v62);
		subInitial(v63);
		subInitial(v64);
		subInitial(v65);
		subInitial(v66);
		subInitial(v67);
		subInitial(v68);
		subInitial(v69);
		subInitial(v70);
		subInitial(v71);
		subInitial(v72);
		subInitial(v73);
		subInitial(v74);
		subInitial(v75);
		subInitial(v76);
		subInitial(v77);
		subInitial(v78);
		subInitial(v79);
		subInitial(v80);
		subInitial(v81);
		subInitial(v82);
		subInitial(v83);
		subInitial(v84);
		subInitial(v85);
		subInitial(v86);
		subInitial(v87);
		subInitial(v88);
		subInitial(v89);
		subInitial(v90);
		subInitial(v91);
		subInitial(v92);
		subInitial(v93);
		subInitial(v94);
		subInitial(v95);
		subInitial(v96);
		subInitial(v97);
		subInitial(v98);
		subInitial(v99);
		subInitial(v100);
		subInitial(v101);
		subInitial(v102);
		subInitial(v103);
		subInitial(v104);
		subInitial(v105);
		subInitial(v106);
		subInitial(v107);
		subInitial(v108);
		subInitial(v109);
		subInitial(v110);
		subInitial(v111);
		subInitial(v112);
		subInitial(v113);
		subInitial(v114);
		subInitial(v115);
		subInitial(v116);
		subInitial(v117);
		subInitial(v118);
		
		subInitial(v119);
		subInitial(v120);
		subInitial(v121);
		subInitial(v122);
		subInitial(v123);
		subInitial(v124);
		subInitial(v125);
		subInitial(v126);
		subInitial(v127);
		subInitial(v128);
		subInitial(v129);
		subInitial(v130);
		subInitial(v131);
		subInitial(v132);
		subInitial(v133);
		subInitial(v134);
		subInitial(v135);
		subInitial(v136);
		subInitial(v137);
		subInitial(v138);
		subInitial(v139);
		

    }
    private void doList_48(){
    	String[] v1={"surveillance","监视，盯梢","n.","0"};
    	String[] v2={"swank","夸耀，炫耀","v.","0"};
    	String[] v3={"swarm","（蜜蜂）一群，一群人","n.","0"};
    	String[] v4={"swarthy","黝黑的","adj.","0"};
    	String[] v5={"swear","诅咒","v.","0"};

    	String[] v6={"swipe","猛击","n./v.","0"};
    	String[] v7={"symposium","专题讨论会","n.","0"};
    	String[] v8={"tack","大头钉，图钉","n.","0"};
    	String[] v9={"tarry","徘徊，耽搁","v.","0"};
    	String[] v10={"tattered","衣衫褴褛的，破旧的","adj.","0"};

    	String[] v11={"tautological","用语重复的","adj.","0"};
    	String[] v12={"teem","充满，到处都是，下倾盆大雨","v.","0"};
    	String[] v13={"teetotal","滴酒不沾的","adj.","0"};
    	String[] v14={"tendinous","腱的","adj.","0"};
    	String[] v15={"tensile","张力的，可伸展的","adj.","0"};

    	String[] v16={"thespian","戏剧的，演戏的","adj.","0"};
    	String[] v17={"thorny","多刺的，痛苦的，困难的","adj.","0"};
    	String[] v18={"thrall","奴隶，农奴","n.","0"};
    	String[] v19={"thrash","鞭打","v.","0"};
    	String[] v20={"thrifty","打谷，脱粒","v.","0"};

    	String[] v21={"throes","剧痛","n.","0"};
    	String[] v22={"throttle","掐脖子，扼杀；节流阀","v./n.","0"};
    	String[] v23={"timeworn","陈旧的，老旧的","adj.","0"};
    	String[] v24={"tinge","染色，使带气息","v.","0"};
    	String[] v25={"tipple","酗酒","v.","0"};

    	String[] v26={"topsy-turvy","颠倒的，相反的，乱七八糟的，混乱的","adj.","0"};
    	String[] v27={"torpedo","鱼雷","n.","0"};
    	String[] v28={"torrid","酷热的","adj.","0"};
    	String[] v29={"torso","躯干，躯干像","n.","0"};
    	String[] v30={"tortune","酷刑，折磨；对施以酷刑","n./v.","0"};

    	String[] v31={"touching","引起同情的","adj.","0"};
    	String[] v32={"touchstone","试金石","n.","0"};
    	String[] v33={"tousle","弄乱","v.","0"};
    	String[] v34={"traduce","中伤，诽谤","v.","0"};
    	String[] v35={"trammel","束缚，妨碍","v./n.","0"};

    	String[] v36={"tramp","重步走，长途跋涉","v.","0"};
    	String[] v37={"transfuse","输血，充满","v.","0"};
    	String[] v38={"trawl","拖网；用拖网捕鱼","n./v.","0"};
    	String[] v39={"treachery","阴险，背叛","n.","0"};
    	String[] v40={"tread","践踏；步履，车轮","v./n.","0"};

    	String[] v41={"treasurer","司库，财务员，出纳员","n.","0"};
    	String[] v42={"trek","艰苦跋涉","v.","0"};
    	String[] v43={"tremulous","颠动的，不安的","adj.","0"};
    	String[] v44={"trench","沟，壕沟","n.","0"};
    	String[] v45={"tresses","女人的头发","n.","0"};

    	String[] v46={"tribulation","苦难，灾难","n.","0"};
    	String[] v47={"tributary","苦难，灾难","adj.","0"};
    	String[] v48={"trickery","欺骗，诡计","n.","0"};
    	String[] v49={"trident","三叉戟","n.","0"};
    	String[] v50={"trivia","琐事，无价值之物","n.","0"};

    	String[] v51={"truant","逃避责任的；逃学者，逃避者","adj./n.","0"};
    	String[] v52={"truism","自明之理，真理","n.","0"};
    	String[] v53={"trumpery","中看不中用的","adj.","0"};
    	String[] v54={"tumid","肿起的","adj.","0"};
    	String[] v55={"tundra","冻原，苔原","n.","0"};

    	String[] v56={"tutelage","监护，指导","n.","0"};
    	String[] v57={"twaddle","胡说八道，瞎扯","v.","0"};
    	String[] v58={"tycoon","有钱有势的企业家，大亨","n.","0"};
    	String[] v59={"typhoon","台风","n.","0"};
    	String[] v60={"ulcerate","溃烂，生恶疮","v.","0"};

    	String[] v61={"ulterior","较晚的，较远的，不可告人的","adj.","0"};
    	String[] v62={"ultramundane","超俗的，世界之外的","adj.","0"};
    	String[] v63={"unbidden","未经邀请的","adj.","0"};
    	String[] v64={"unbridled","放纵的","adj.","0"};
    	String[] v65={"uncoopoerative","不愿合作的","adj.","0"};

    	String[] v66={"undisputable","无可争辩的，毫无疑问的","adj.","0"};
    	String[] v67={"undulate","波动，起伏","v.","0"};
    	String[] v68={"unexceptional","非例外的，普通的，平凡的","adj.","0"};
    	String[] v69={"unilateral","单方面的","adj.","0"};
    	String[] v70={"unison","齐奏，齐唱，一致的行动","n.","0"};

    	String[] v71={"upfront","坦率的","adj.","0"};
    	String[] v72={"upstart","突然升官的人","n.","0"};
    	String[] v73={"upsurge","（情绪）高涨","n.","0"};
    	String[] v74={"uptight","焦虑不安的","adj.","0"};
    	String[] v75={"urchin","顽童，海胆","n.","0"};

    	String[] v76={"ursine","熊的，像熊的","adj.","0"};
    	String[] v77={"utensil","工具，用具","n.","0"};
    	String[] v78={"uxorious","宠爱妻子的","adj.","0"};
    	String[] v79={"vagabond","浪荡子，流浪者；流浪的","n./adj.","0"};
    	String[] v80={"valetudinarian","体弱的人，过分担心生病的人","n.","0"};

    	String[] v81={"valor","勇武，英勇","n.","0"};
    	String[] v82={"vampire","吸血鬼","n.","0"};
    	String[] v83={"vanguard","前卫","n.","0"};
    	String[] v84={"vegetate","像植物般生活，无所事事","v.","0"};
    	String[] v85={"ventral","腹部的","adj.","0"};

    	String[] v86={"verbatim","逐字的，照字面的","adj.","0"};
    	String[] v87={"verge","边缘","n.","0"};
    	String[] v88={"vermin","害虫，寄生虫","n.","0"};
    	String[] v89={"vernal","春季的，春季似的","adj.","0"};
    	String[] v90={"versemonger","拙劣诗人，打油诗人","n.","0"};

    	String[] v91={"vesture","衣服，覆盖物","n.","0"};
    	String[] v92={"viand","食品，食物","n.","0"};
    	String[] v93={"vicissitude","变化，变迁，荣枯，盛衰","n.","0"};
    	String[] v94={"villainous","邪恶的，恶毒的","adj.","0"};
    	String[] v95={"vim","精力，活力","n.","0"};

    	String[] v96={"vindication","洗冤，证实","n.","0"};
    	String[] v97={"vinegared","酸的，尖刻的","adj.","0"};
    	String[] v98={"virago","泼妇，好骂人或好支配人的女人","n.","0"};
    	String[] v99={"virile","有男子气的，雄健的","adj.","0"};
    	String[] v100={"visage","脸，面貌","n.","0"};

    	String[] v101={"visceral","内心深处的","adj.","0"};
    	String[] v102={"vitreous","玻璃的，玻璃状的","adj.","0"};
    	String[] v103={"vomit","呕吐，呕吐物","n.","0"};
    	String[] v104={"vulpine","狐狸般的，狡猾的","adj.","0"};
    	String[] v105={"wade","涉水，跋涉","v.","0"};

    	String[] v106={"wail","哀号，痛哭","v.","0"};
    	String[] v107={"waive","放弃，推迟考虑","v.","0"};
    	String[] v108={"wallop","重击，猛打","n./v.","0"};
    	String[] v109={"wallow","（猪等）在泥水中打滚，沉溺","n./v.","0"};
    	String[] v110={"wangle","用巧计或花言巧语获得某事物","v.","0"};

    	String[] v111={"wanton","无节制的，放纵的，顽皮的","adj.","0"};
    	String[] v112={"warble","（尤指鸟）叫出柔和的颤音","v.","0"};
    	String[] v113={"warden","看守人，管理员","n.","0"};
    	String[] v114={"waspish","易怒的，尖刻的","adj.","0"};
    	String[] v115={"waylay","埋伏，伏击","v.","0"};

    	String[] v116={"weird","古怪的，荒唐的","adj.","0"};
    	String[] v117={"welsh","赖债不还，失信","v.","0"};
    	String[] v118={"whelm","用...覆盖，淹没","v.","0"};
    	String[] v119={"whelp","犬科的幼兽","n.","0"};
    	String[] v120={"whit","一点儿，少量","n.","0"};

    	String[] v121={"wig","假发","n.","0"};
    	String[] v122={"wiggle","扭动，蠕动","v.","0"};
    	String[] v123={"windfall","风吹落的果实，意外的好运","n.","0"};
    	String[] v124={"winkle","缓慢而费力地把某人弄出","v.","0"};
    	String[] v125={"wiretap","窃听","n.","0"};

    	String[] v126={"witch","巫婆，女巫","n.","0"};
    	String[] v127={"wizardry","魔术，熟练","n.","0"};
    	String[] v128={"wizen","凋谢的，枯萎的","adj.","0"};
    	String[] v129={"wont","习惯，习俗","n.","0"};
    	String[] v130={"woodcut","木刻，木版画","n.","0"};

    	String[] v131={"wraith","幽灵，骨瘦如柴的人","n.","0"};
    	String[] v132={"wrangle","争吵，吵架","v.","0"};
    	String[] v133={"wrath","愤怒，大怒","n.","0"};
    	String[] v134={"wreak","发泄怒火，报仇","v.","0"};
    	String[] v135={"wreathe","盘绕，把...做成花环","v.","0"};
    	
    	String[] v136={"wreckage","残骸","n.","0"};
    	String[] v137={"xenophobia","仇外，排外","n.","0"};
    	String[] v138={"yaw","偏航","v.","0"};
    	String[] v139={"yeoman","自耕农","n.","0"};
    	String[] v140={"zesty","热望的","adj.","0"};
    	
    	
    	
    	
    	
    	subInitial(v1);
		subInitial(v2);
		subInitial(v3);
		subInitial(v4);
		subInitial(v5);
		subInitial(v6);
		subInitial(v7);
		subInitial(v8);
		subInitial(v9);
		subInitial(v10);
		subInitial(v11);
		subInitial(v12);
		subInitial(v13);
		subInitial(v14);
		subInitial(v15);
		subInitial(v16);
		subInitial(v17);
		subInitial(v18);
		subInitial(v19);
		subInitial(v20);
		subInitial(v21);
		subInitial(v22);
		subInitial(v23);
		subInitial(v24);
		subInitial(v25);
		subInitial(v26);
		subInitial(v27);
		subInitial(v28);
		subInitial(v29);
		subInitial(v30);
		subInitial(v31);
		subInitial(v32);
		subInitial(v33);
		subInitial(v34);
		subInitial(v35);
		subInitial(v36);
		subInitial(v37);
		subInitial(v38);
		subInitial(v39);
		subInitial(v40);
		subInitial(v41);
		subInitial(v42);
		subInitial(v43);
		subInitial(v44);
		subInitial(v45);
		subInitial(v46);
		subInitial(v47);
		subInitial(v48);
		subInitial(v49);
		subInitial(v50);
		
		subInitial(v51);
		subInitial(v52);
		subInitial(v53);
		subInitial(v54);
		subInitial(v55);
		subInitial(v56);
		subInitial(v57);
		subInitial(v58);
		subInitial(v59);
		subInitial(v60);
		subInitial(v61);
		subInitial(v62);
		subInitial(v63);
		subInitial(v64);
		subInitial(v65);
		subInitial(v66);
		subInitial(v67);
		subInitial(v68);
		subInitial(v69);
		subInitial(v70);
		subInitial(v71);
		subInitial(v72);
		subInitial(v73);
		subInitial(v74);
		subInitial(v75);
		subInitial(v76);
		subInitial(v77);
		subInitial(v78);
		subInitial(v79);
		subInitial(v80);
		subInitial(v81);
		subInitial(v82);
		subInitial(v83);
		subInitial(v84);
		subInitial(v85);
		subInitial(v86);
		subInitial(v87);
		subInitial(v88);
		subInitial(v89);
		subInitial(v90);
		subInitial(v91);
		subInitial(v92);
		subInitial(v93);
		subInitial(v94);
		subInitial(v95);
		subInitial(v96);
		subInitial(v97);
		subInitial(v98);
		subInitial(v99);
		subInitial(v100);
		subInitial(v101);
		subInitial(v102);
		subInitial(v103);
		subInitial(v104);
		subInitial(v105);
		subInitial(v106);
		subInitial(v107);
		subInitial(v108);
		subInitial(v109);
		subInitial(v110);
		subInitial(v111);
		subInitial(v112);
		subInitial(v113);
		subInitial(v114);
		subInitial(v115);
		subInitial(v116);
		subInitial(v117);
		subInitial(v118);
		
		subInitial(v119);
		subInitial(v120);
		subInitial(v121);
		subInitial(v122);
		subInitial(v123);
		subInitial(v124);
		subInitial(v125);
		subInitial(v126);
		subInitial(v127);
		subInitial(v128);
		subInitial(v129);
		subInitial(v130);
		subInitial(v131);
		subInitial(v132);
		subInitial(v133);
		subInitial(v134);
		subInitial(v135);
		subInitial(v136);
		subInitial(v137);
		subInitial(v138);
		subInitial(v139);
		subInitial(v140);
		
    }
    private void doList_49(){
    	
    	
    	
    	String[] v1={"access","得到","v.","0"};
    	String[] v2={"annex","附件","n.","0"};
    	String[] v3={"asphalt","沥青","n.","0"};
    	String[] v4={"barbarian","野蛮人","n.","0"};
    	String[] v5={"bar code","条形码","n.","0"};

    	String[] v6={"behoove","应该，有必要，适宜","v.","0"};
    	String[] v7={"bewitching","迷人的","adj.","0"};
    	String[] v8={"bumpkingly","乡巴佬的","adj.","0"};
    	String[] v9={"cell","单人牢房","n.","0"};
    	String[] v10={"chaperone","（陪少女上交际场所的）女伴","n.","0"};

    	String[] v11={"coat","涂抹","v.","0"};
    	String[] v12={"columnist","专栏作家","n.","0"};
    	String[] v13={"dab","轻拍","v.","0"};
    	String[] v14={"dashing","时髦的，活跃的","adj.","0"};
    	String[] v15={"dike","堤防","n.","0"};

    	String[] v16={"dissect","仔细分析，剖析","v.","0"};
    	String[] v17={"employ","使用","v.","0"};
    	String[] v18={"epistolary","书信体的","adj.","0"};
    	String[] v19={"evildoer","坏人，坏蛋","n.","0"};
    	String[] v20={"fair-minded","公平的，公正的","adj.","0"};

    	String[] v21={"fetching","动人的，迷人的","adj.","0"};
    	String[] v22={"fibrous","纤维的","adj.","0"};
    	String[] v23={"foreordain","预先注定","v.","0"};
    	String[] v24={"gag","恶作剧，开玩笑，插科打诨","n.","0"};
    	String[] v25={"granulate","使呈颗粒状的","v.","0"};

    	String[] v26={"hardihood","大胆，鲁莽","n.","0"};
    	String[] v27={"heavy-handed","笨拙的","adj.","0"};
    	String[] v28={"jettison","抛弃","n.","0"};
    	String[] v29={"ladle","杓子，长柄杓","n.","0"};
    	String[] v30={"lance","切开","v.","0"};

    	String[] v31={"leverage","杠杆作用，力量上的优势","n.","0"};
    	String[] v32={"liken","把...比作","v.","0"};
    	String[] v33={"madcap","轻率的，狂妄的","adj.","0"};
    	String[] v34={"marbled","有大理石花纹的，肥瘦混合的","adj.","0"};
    	String[] v35={"mastermind","策划，设计者","n.","0"};

    	String[] v36={"memorandum","备忘录","n.","0"};
    	String[] v37={"nicety","精确","n.","0"};
    	String[] v38={"observant","注意的，当心的","adj.","0"};
    	String[] v39={"pat","合适的","adj.","0"};
    	String[] v40={"photorespiration","光呼吸作用","n.","0"};

    	String[] v51={"privy","个人的，秘密参与的","adj.","0"};
    	String[] v52={"proscenium","舞台","n.","0"};
    	String[] v53={"radical","激进的","adj.","0"};
    	String[] v54={"rascal","流氓，不诚实的人","n.","0"};
    	String[] v55={"rosy","乐观的，有希望的","adj.","0"};

    	String[] v66={"scratch","乱涂乱画","v.","0"};
    	String[] v67={"screen","筛选，系统地测试以决定是否适合","v.","0"};
    	String[] v68={"scrimp","节省或精打细算","v.","0"};
    	String[] v69={"simpleton","笨蛋，傻瓜","n.","0"};
    	String[] v70={"slink","潜逃","v.","0"};

    	String[] v71={"snarl","咆哮，怒骂","v.","0"};
    	String[] v72={"spike","钉牢，扣球","v.","0"};
    	String[] v73={"spoilsport","破坏他人兴致的人","adj.","0"};
    	String[] v74={"staunch","坚定地","adj.","0"};
    	String[] v75={"steward","乘务员，管家","n.","0"};

    	String[] v76={"traipse","漫步，闲逛","v.","0"};
    	String[] v77={"tureen","有改的汤碗","n.","0"};
    	String[] v78={"untrammeled","自由自在的","adj.","0"};
    	String[] v79={"verisimilitude","逼真","n.","0"};
    	String[] v80={"weather","经受住风雨","v.","0"};

    	String[] v81={"windfall","意料之外的好运或收入","n.","0"};
    	String[] v82={"willy-nilly","不可避免的，乱糟糟的","adj.","0"};
    	String[] v83={"winning","动人的","adj.","0"};
    	String[] v84={"wrest","用猛烈的，拉，扭的动作取得","v.","0"};
    	
    	
    	
    	
    	subInitial(v1);
		subInitial(v2);
		subInitial(v3);
		subInitial(v4);
		subInitial(v5);
		subInitial(v6);
		subInitial(v7);
		subInitial(v8);
		subInitial(v9);
		subInitial(v10);
		subInitial(v11);
		subInitial(v12);
		subInitial(v13);
		subInitial(v14);
		subInitial(v15);
		subInitial(v16);
		subInitial(v17);
		subInitial(v18);
		subInitial(v19);
		subInitial(v20);
		subInitial(v21);
		subInitial(v22);
		subInitial(v23);
		subInitial(v24);
		subInitial(v25);
		subInitial(v26);
		subInitial(v27);
		subInitial(v28);
		subInitial(v29);
		subInitial(v30);
		subInitial(v31);
		subInitial(v32);
		subInitial(v33);
		subInitial(v34);
		subInitial(v35);
		subInitial(v36);
		subInitial(v37);
		subInitial(v38);
		subInitial(v39);
		subInitial(v40);
		
		
		subInitial(v51);
		subInitial(v52);
		subInitial(v53);
		subInitial(v54);
		subInitial(v55);
		
		subInitial(v66);
		subInitial(v67);
		subInitial(v68);
		subInitial(v69);
		subInitial(v70);
		subInitial(v71);
		subInitial(v72);
		subInitial(v73);
		subInitial(v74);
		subInitial(v75);
		subInitial(v76);
		subInitial(v77);
		subInitial(v78);
		subInitial(v79);
		subInitial(v80);
		subInitial(v81);
		subInitial(v82);
		subInitial(v83);
		subInitial(v84);
		


    }
    
    
    
    
    public void subInitial(String[] values)
{
    	ArrayList<String> content = new ArrayList<String>();
    	content.add(values[1]);
    	content.add(values[2]);
    	content.add(values[3]);
    	
    	map.put(values[0], content);
    	set.add(values[0]);
    	list.add(values[0]);
}

    public ArrayList<String> topKsimilarwords(String target, int k) {
    	MinHeap<StringDistanceE> topKHeap = new MinHeap<StringDistanceE>();
    	ArrayList<String> results = new ArrayList<String>();
    	Iterator<String> it = set.iterator();
    	
    	while(it.hasNext()) {
    		String word = it.next();
    		int distance2target = strDistance(target, word);
    		
    		if(distance2target != 0)
    		topKHeap.add(new StringDistanceE(word, distance2target));
    	}
    	
    	for(int i = 0;i < k;i++) {
    		String word = topKHeap.pop_minValue().getWord();
    		
    		results.add(word);
    	}
    	return results;
		
    }
    
    public ArrayList<String> topSValuesimilarwords(String target, int s) {
    	MinHeap<StringDistanceE> topSValuesHeap = new MinHeap<StringDistanceE>();
    	ArrayList<String> results = new ArrayList<String>();
    	Iterator<String> it = set.iterator();
    	
    	while(it.hasNext()) {
    		String word = it.next();
    		int distance2target = strDistance(target, word);
    		
    		if(distance2target != 0 && distance2target <= s)
    			topSValuesHeap.add(new StringDistanceE(word, distance2target));
    	}
    	
    	for(int i = 0;i < topSValuesHeap.size();i++) {
    		String word = topSValuesHeap.pop_minValue().getWord();
    		
    		results.add(word);
    	}
    	return results;
		
    }

    private int strDistance(String ptrX, String ptrY)
	{
		
	    int i, j;
	    int xlen = ptrX.length(), ylen = ptrY.length();
	    int arrayLength = (xlen > ylen ? xlen : ylen) + 1;
	    
	    int[][] dp = new int [arrayLength][arrayLength];
	    
	    for(i = 1; i <= xlen; i++)
	    {
	        dp[i][0] = i;
	    }
	    for(j = 1; j <= ylen; j++)
	    {
	        dp[0][j] = j;
	    }
	    for(i = 1; i <= xlen; i++)
	    {
	        for(j = 1; j <= ylen; j++)
	        {
	            if(ptrX.charAt(i - 1) == ptrY.charAt(j - 1))
	            {
	                dp[i][j] = dp[i-1][j-1];
	            }else
	            {
	                int t1 = dp[i-1][j];
	                t1 = t1 < dp[i][j-1] ? t1 :dp[i][j-1];
	                t1 = t1 < dp[i-1][j-1] ? t1 : dp[i-1][j-1];
	                dp[i][j] = t1 + 1;
	            }
	        }
	    }
	    return dp[xlen][ylen];
	}
    
    public List<String> getList() {
    	return list;
    }
    
    public Map<String, ArrayList<String>> getMap() {
    	return map;
    }

}
