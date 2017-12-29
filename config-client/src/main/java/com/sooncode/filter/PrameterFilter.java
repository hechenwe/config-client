package com.sooncode.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.Order;

import com.sooncode.verification.filter.HttpServletStream;
import com.sooncode.verification.filter.ParameterVerificationFailure;
import com.sooncode.verification.filter.ParameterVerificationFilter;
import com.sooncode.verification.moduler.VerificationResult;

@Order(1)
@WebFilter(filterName = "prameterFilter", urlPatterns = "/*")
public class PrameterFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, final ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

		System.out.println(((HttpServletRequest)servletRequest).getMethod() );
		
		
		ParameterVerificationFilter fvf = new ParameterVerificationFilter();
		fvf.setConfLocation("classpath:parameter");
		fvf.setRegexConfLocation("classpath:regex.properties");

		fvf.doFilter(servletRequest, servletResponse, filterChain, new ParameterVerificationFailure() {

			@Override
			public void callBack(VerificationResult vr) {

				System.out.println("-----------------" + vr.getReason());

				HttpServletStream.putString(vr.getReason(), servletResponse);
			}
		});

	}

	@Override
	public void destroy() {

	}
}
