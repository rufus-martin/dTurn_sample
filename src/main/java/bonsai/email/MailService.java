package bonsai.email;

import com.sendgrid.SendGrid;

import bonsai.Constants;

public class MailService {

	public void sendMail(String from, String to, String title, String content) throws Exception {
		 SendGrid sendGrid = new SendGrid(Constants.SEND_GRID_API_KEY);
		 SendGrid.Email email = new SendGrid.Email();
		 email.addTo(to);
		 email.setFrom(from);
		 email.setSubject(title);
		 email.setHtml(content);
		 sendGrid.send(email);
	}
}
