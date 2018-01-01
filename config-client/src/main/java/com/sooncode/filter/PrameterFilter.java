package com.sooncode.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import com.sooncode.verification.filter.HttpServletStream;
import com.sooncode.verification.filter.ParameterVerificationFilter;
import com.sooncode.verification.filter.VerificationFailure;
import com.sooncode.verification.moduler.VerificationResult;

@Order(1)
@WebFilter(filterName = "prameterFilter", urlPatterns = "/*")
public class PrameterFilter implements Filter {

	@Autowired
	private ParameterVerificationFilter parameterVerificationFilter;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

		this.parameterVerificationFilter.doFilter(servletRequest, servletResponse, filterChain, new VerificationFailure() {

			@Override
			public void callBack(VerificationResult vr, ServletResponse servletResponse) {
				HttpServletStream.putString(vr.getReason(), servletResponse);

			}
		});

	}

	@Override
	public void destroy() {

	}
}
