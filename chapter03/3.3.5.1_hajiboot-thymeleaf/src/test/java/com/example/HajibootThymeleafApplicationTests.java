package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.repository.CustomerRepository;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = "logging.level.org.springframework.web.client.RestTemplate=DEBUG")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HajibootThymeleafApplicationTests {
	@LocalServerPort
	int port;
	WebClient webClient;
	@Autowired
	CustomerRepository customerRepository;

	@Before
	public void init() throws Exception {
		webClient = new WebClient();
		webClient.getOptions().setCssEnabled(false);
	}

	@After
	public void close() throws Exception {
		webClient.close();
	}

	@Test
	public void step01_listCustomers() throws Exception {
		HtmlPage top = webClient.getPage("http://localhost:" + port + "/customers");
		String text = top.getBody().asText();
		assertThat(text).isEqualTo("顧客管理システム\n" + //
				"\n" + //
				"顧客情報作成\n" + //
				" 姓\n" + //
				"\n" + //
				" 名\n" + //
				"\n" + //
				" 作成\n" + //
				"\n" + //
				"\n" + //
				"ID\t姓\t名\t編集\n" + //
				"1\tNobi\tNobita\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"4\tMinamoto\tShizuka\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"3\tHonekawa\tSuneo\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"2\tGoda\tTakeshi\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除");
	}

	@Test
	public void step02_createCustomers_error() throws Exception {
		HtmlPage top = webClient.getPage("http://localhost:" + port + "/customers");
		HtmlForm form = top.getForms().get(0);
		form.getInputByName("firstName").setValueAttribute("");
		form.getInputByName("lastName").setValueAttribute("");
		HtmlButton submit = form.getButtonByName("");
		HtmlPage created = submit.click();

		String text = created.getBody().asText();
		assertThat(text).isEqualTo("顧客管理システム\n" + //
				"\n" + //
				"顧客情報作成\n" + //
				" 姓\n" + //
				"size must be between 1 and 127\n" + //
				"\n" + //
				"名\n" + //
				"size must be between 1 and 127\n" + //
				"\n" + //
				"作成\n" + //
				"\n" + //
				"\n" + //
				"ID\t姓\t名\t編集\n" + //
				"1\tNobi\tNobita\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"4\tMinamoto\tShizuka\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"3\tHonekawa\tSuneo\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"2\tGoda\tTakeshi\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除");
	}

	@Test
	public void step03_createCustomers() throws Exception {
		HtmlPage top = webClient.getPage("http://localhost:" + port + "/customers");
		HtmlForm form = top.getForms().get(0);
		form.getInputByName("firstName").setValueAttribute("Toshiaki");
		form.getInputByName("lastName").setValueAttribute("Maki");
		HtmlButton submit = form.getButtonByName("");
		HtmlPage created = submit.click();

		String text = created.getBody().asText();
		assertThat(text).isEqualTo("顧客管理システム\n" + //
				"\n" + //
				"顧客情報作成\n" + //
				" 姓\n" + //
				"\n" + //
				" 名\n" + //
				"\n" + //
				" 作成\n" + //
				"\n" + //
				"\n" + //
				"ID\t姓\t名\t編集\n" + //
				"1\tNobi\tNobita\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"4\tMinamoto\tShizuka\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"3\tHonekawa\tSuneo\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"2\tGoda\tTakeshi\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"5\tMaki\tToshiaki\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除");
	}

	@Test
	public void step04_editCustomer_error() throws Exception {
		HtmlPage top = webClient.getPage("http://localhost:" + port + "/customers");
		HtmlForm form = top.getForms().get(1); // Edit Form for customer 1
		HtmlInput submit = form.getInputByName("form");
		HtmlPage editPage = submit.click();

		assertThat(editPage.getUrl().toString()).isEqualTo("http://localhost:" + port
				+ "/customers/edit?form=%E7%B7%A8%E9%9B%86&id=1");

		HtmlForm editForm = editPage.getForms().get(0);
		editForm.getInputByName("lastName").setValueAttribute("");
		editForm.getInputByName("firstName").setValueAttribute("");
		HtmlInput edit = editForm.getInputByValue("更新");
		HtmlPage edited = edit.click();

		String text = edited.getBody().asText();
		assertThat(text).isEqualTo("顧客管理システム\n" + //
				"\n" + //
				"顧客情報編集\n" + //
				" 姓\n" + //
				"size must be between 1 and 127\n" + //
				"\n" + //
				"名\n" + //
				"size must be between 1 and 127\n" + //
				"\n" + //
				"戻る 更新");
	}

	@Test
	public void step05_editCustomer() throws Exception {
		HtmlPage top = webClient.getPage("http://localhost:" + port + "/customers");
		HtmlForm form = top.getForms().get(1); // Edit Form for customer 1
		HtmlInput submit = form.getInputByName("form");
		HtmlPage editPage = submit.click();

		assertThat(editPage.getUrl().toString()).isEqualTo("http://localhost:" + port
				+ "/customers/edit?form=%E7%B7%A8%E9%9B%86&id=1");

		HtmlForm editForm = editPage.getForms().get(0);
		editForm.getInputByName("lastName").setValueAttribute("Suzuki");
		HtmlInput edit = editForm.getInputByValue("更新");
		HtmlPage edited = edit.click();

		String text = edited.getBody().asText();
		assertThat(text).startsWith("顧客管理システム\n" + //
				"\n" + //
				"顧客情報作成\n" + //
				" 姓\n" + //
				"\n" + //
				" 名\n" + //
				"\n" + //
				" 作成\n" + //
				"\n" + //
				"\n" + //
				"ID\t姓\t名\t編集\n" + //
				"1\tSuzuki\tNobita\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"4\tMinamoto\tShizuka\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"3\tHonekawa\tSuneo\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"2\tGoda\tTakeshi\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除");
	}

	@Test
	public void step06_deleteCustomer() throws Exception {
		HtmlPage top = webClient.getPage("http://localhost:" + port + "/customers");
		HtmlForm form = top.getForms().get(2); // Delete Form for customer 1
		HtmlInput submit = form.getInputByValue("削除");
		HtmlPage deleted = submit.click();

		String text = deleted.getBody().asText();
		assertThat(text).startsWith("顧客管理システム\n" + //
				"\n" + //
				"顧客情報作成\n" + //
				" 姓\n" + //
				"\n" + //
				" 名\n" + //
				"\n" + //
				" 作成\n" + //
				"\n" + //
				"\n" + //
				"ID\t姓\t名\t編集\n" + //
				"4\tMinamoto\tShizuka\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"3\tHonekawa\tSuneo\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除\n" + //
				"2\tGoda\tTakeshi\t\n" + //
				"編集\n" + //
				"\t\n" + //
				"削除");
	}
}
