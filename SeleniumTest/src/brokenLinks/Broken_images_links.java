	@Test
			url=lst.get(j).getAttribute("href");
			URL url2=new URL(url);
			con.connect();
			if(con.getResponseCode()>=400) {
				continue;
			}
			{
				System.out.println("No broken links"+url);
