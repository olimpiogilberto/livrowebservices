<pre>
Demo de OAuth Client com Twitter

Hello
<a href="<%=request.getContextPath()%>/rest/twitter">/rest/twitter</a>

Mostra a URL de autoriza��o do Twitter
<a href="<%=request.getContextPath()%>/rest/twitter/auth">/rest/twitter/auth</a>

Valida o c�digo verificador e imprime o Access Token (precisa do par�metro (/verify/{verifier})
<%=request.getContextPath()%>/rest/twitter/verify/{verifier}

Timeline, informe nos par�metros o Access Token
<%=request.getContextPath()%>/rest/twitter/timeline?

<hr>

Vers�o 2, faz o fluxo de autoriza��o automaticamente com um filtro

Mostra o JSON com a timeline do Twitter

<a href="<%=request.getContextPath()%>/rest/twitterv2/timeline">/rest/twitterv2/timeline</a>

<a href="<%=request.getContextPath()%>/rest/twitterv2/ultimoTweet">/rest/twitterv2/ultimoTweet</a>

</pre>