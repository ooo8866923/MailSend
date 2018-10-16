public class MailSend {
	
	static MailUtil mu = new MailUtil();
	
	public static void main(String arg[]){
			try {
			    MailConfig mc = new MailConfig();
			    
			    //设置发件人地址
			    mc.setSenderAddress("sender@163.com");
			    //设置发件人账户名
			    mc.setSenderAccount("sender@163.com");
			    //设置发件人密码(备注：密码需要用邮箱SMTP客户端授权密码，而非登录密码，此处需注意)
			    mc.setSenderPassword("mypassword");
			    
			    //设置邮件主题
				mc.setSubject("邮件发送测试");
				//设置收件人地址，多个地址可用逗号隔开
				mc.setRecipientAddresses("xx@qq.com,xxx@163.com"); 
				//设置抄送人地址，多个地址可用逗号隔开
				mc.setCopyToAddresses("xxxx@qq.com");	
				//设置邮件内容
				mc.setContent("邮件发送成功啦!");		
				//设置附件地址，多个附件地址用逗号隔开
				String[] s = {"C:/测试附件1.txt","C:/测试附件2.pdf"};
				mc.setAttachmentPaths(s);
				
				mu.sendMail(mc);
			} catch (Exception e) {
			        e.printStackTrace();
			}
	}
}
