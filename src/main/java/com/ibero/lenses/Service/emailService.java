package com.ibero.lenses.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.ibero.lenses.Model.Email;
import com.ibero.lenses.Repository.emailRepository;
import com.ibero.lenses.Templates.messageHtml;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor=@__(@Autowired))
@Transactional
public class emailService {
	

    private JavaMailSender emailSender;
	private emailRepository mailRepo;
	
	
	//metodo encargado de enviar el email
	public void sendEmail(String names, String email, String message) throws MessagingException {

		MimeMessage msg = emailSender.createMimeMessage();
		String content = messageHtml.TEMPLATE_MESSAGE;
		
		msg.setSubject("Nueva comentario de "+ names);
		MimeMessageHelper help = new MimeMessageHelper(msg, true);

		help.setFrom("burbujasdealgodon4@gmail.com");
		help.setTo("burbujasdealgodon4@gmail.com");
		
		
		content = setCodeInTemplate(content, 0, names);
		content = setCodeInTemplate(content, 1, email);
		content = setCodeInTemplate(content, 2, message);
		
		help.setText(content, true);
		
		emailSender.send(msg);
		
	}
	
	//Remplazar el codigo en en html
	private String setCodeInTemplate(String template, int index, String code) {
		return template.replace("{"+index+"}", code);
	}
	
	//Agregar informacion del mensaje a la base de datos
	public Email create(Email mail) {
		return mailRepo.save(mail);
	}

}
