package service.motion;

import java.io.File;

public class Motion {
	//private File dir; 可设置成局部变量只在readDir中使用
	private SQL sql_data;
	private HashMap<String, Structure> dir_words;
	//words存储结构：<word,<type(emotion/adv.),degree>>
	
	public Motion(SQL sql){
		//Requires: 数据采集完毕
		//Effects: 初始化sql_data、HashMap等
	}
	public HashMap<String, Structure> readDir(){
		//Requires:情绪词与程度词等txt文件
		//Effects:读取文件，将词典中的词语与情绪保存在(HashMap)words中
		
	}
	public ArrayList<ArrayList<String>> getWords(){
		//Requires: HanLP配置完成、sql文件、sql Cursor
		//Effects: 得到词语列表
	}
}
