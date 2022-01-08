#A filter is an object that is invoked at the preprocessing and postprocessing of a request.

##uses
 * conversion
 * logging (logs of IP addresses of computers from which request comes)
 * compression
 * encryption and decryption
 * input validation
 * Authentication
 * load balancing
 
 

The servlet filter is pluggable, i.e. its entry is defined in the web.xml file, if we remove the entry of filter from the web.xml file, filter will be removed automatically and we don't need to change the servlet.
No dependency on any other resource.




##How to use
####1. javax.servlet have three interfaces for filter apis
	a. Filter
	b. FilterChain
	c. FilterConfig
####2. For creating filter you must implement Filter interface.
	a. Filter Interface contains 3 life cycle methods
	1. public void init(FilterConfig config)
	2. public void doFilter(HttpServletRequest request,HttpServletResponse response, FilterChain chain)
	
		doFilter() method is invoked every time when user request to any resource, to which the filter 		is mapped.It is used to perform filtering tasks.
		
	3. public void destroy()-
  

