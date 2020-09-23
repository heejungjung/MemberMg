package com.yi.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.BoardVO;
import com.yi.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Setter(onMethod_ = { @Autowired })
	private BoardService service;

	@Test
	public void testExist() {

		log.info(service);
		assertNotNull(service);
	}

	@Test
	public void testRegister() {

		BoardVO board = new BoardVO();
		board.setName("정희정");
		board.setAge(20);
		board.setAddress("제주도");
		board.setCphone("010-5359-7043");

		service.register(board);

		log.info("생성된 게시물의 번호: " );
	}

	@Test
	public void testGetList() {

		// service.getList().forEach(board -> log.info(board));
		service.getList(new Criteria()).forEach(board -> log.info(board));
	}

	@Test
	public void testGet() {

		log.info(service.get("김뚱땅"));
	}

	@Test
	public void testDelete() {

		// 게시물 번호의 존재 여부를 확인하고 테스트할 것
		log.info("REMOVE RESULT: " + service.remove(3));

	}

	@Test
	public void testUpdate() {

		BoardVO board = service.get("오리");

		if (board == null) {
			return;
		}

		board.setName("백조");
		log.info("MODIFY RESULT: " + service.modify(board));
	}

}
