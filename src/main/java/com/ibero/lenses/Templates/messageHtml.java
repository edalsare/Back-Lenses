package com.ibero.lenses.Templates;

public class messageHtml {
	
	public static final String TEMPLATE_MESSAGE = "<!DOCTYPE html>\r\n"
			+ "<html lang=\"es\">\r\n"
			+ "<head>\r\n"
			+ "    <meta charset=\"UTF-8\">\r\n"
			+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
			+ "    <title>Mi Página</title>\r\n"
			+ "    <style>\r\n"
			+ "	.container {\r\n"
			+ "	display: flex;\r\n"
			+ " 	 justify-content: center;\r\n"
			+ "	}\r\n"
			+ "        /* Estilos para el encabezado */\r\n"
			+ "        .Header {\r\n"
			+ "\r\n"
			+ "            background-color: #3498db;\r\n"
			+ "            color: #fff;\r\n"
			+ "            text-align: center;\r\n"
			+ "            padding: 20px;\r\n"
			+ "	    width:70%;\r\n"
			+ "		\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        /* Estilos para la sección del mensaje */\r\n"
			+ "        .mensaje {\r\n"
			+ "            margin-top: 20px;\r\n"
			+ "            padding: 20px;\r\n"
			+ "            border: 1px solid #ccc;\r\n"
			+ "            border-radius: 5px;\r\n"
			+ "            background-color: #f5f5f5;\r\n"
			+ "	    width:70%;\r\n"
			+ "        }\r\n"
			+ "    </style>\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "<div\">\r\n"
			+ "<div class=\"container\">\r\n"
			+ "    <div class=\"Header\">\r\n"
			+ "        <h1>{0}</h1>\r\n"
			+ "        <p>Correo: {1}</p>\r\n"
			+ "    </div>\r\n"
			+ "</div>\r\n"
			+ "\r\n"
			+ "<div class=\"container\">\r\n"
			+ "    <div class=\"mensaje\">\r\n"
			+ "        <h2>Mensaje</h2>\r\n"
			+ "        <p>{2}</p>\r\n"
			+ "    </div>\r\n"
			+ "</div>\r\n"
			+ "</div>\r\n"
			+ "</body>\r\n"
			+ "</html>";


}
