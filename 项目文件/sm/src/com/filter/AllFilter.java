package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * ȫ�ֹ�����
 * @author Ytt
 *
 */
public class AllFilter implements Filter{
	/**
	 * charSet���ַ������ʽ
	 */
	private String charSet="";
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		req.setCharacterEncoding(this.charSet);
		resp.setCharacterEncoding(this.charSet);
		chain.doFilter(req, resp);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.charSet=arg0.getInitParameter("charSet");
	}

}
