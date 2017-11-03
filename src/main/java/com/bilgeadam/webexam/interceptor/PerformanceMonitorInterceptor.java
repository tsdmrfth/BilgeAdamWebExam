package com.bilgeadam.webexam.interceptor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.util.StopWatch;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Fatih Taşdemir Oct 31, 2017
 */

public class PerformanceMonitorInterceptor implements HandlerInterceptor {

	ThreadLocal<StopWatch> stopWatchLocal = new ThreadLocal<>();
	Logger logger = Logger.getLogger(this.getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("=======================================================");
		StopWatch stopwatch = new StopWatch(handler.toString());
		stopwatch.start(handler.toString());
		stopWatchLocal.set(stopwatch);
		logger.info("Accessing URL Path : " + getURLPath(request));
		logger.info("Request processing started on: " + getCurrentTime());
		logger.info("=======================================================");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("=======================================================");
		logger.info("Request processing ended on " + getCurrentTime());
		logger.info("=======================================================");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("=======================================================");
		StopWatch stopWatch = stopWatchLocal.get();
		stopWatch.stop();
		logger.info("Total time taken for processing: " + stopWatch.getTotalTimeMillis() + " ms");
		stopWatchLocal.set(null);
		logger.info("=======================================================");
	}

	private String getURLPath(HttpServletRequest request) {
		String currentPath = request.getRequestURI();
		String queryString = request.getQueryString();
		queryString = queryString == null ? "" : "?" + queryString;
		return currentPath + queryString;
	}

	private String getCurrentTime() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		return formatter.format(calendar.getTime());
	}
}
