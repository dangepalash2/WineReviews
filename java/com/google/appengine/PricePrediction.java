package com.google.appengine;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PricePrediction
 */
@WebServlet("/PricePrediction")
public class PricePrediction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PricePrediction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		response.setContentType("text/html");
//		response.getWriter().println("<html>\r\n" + 
//				"<head>\r\n" + 
//				"	<title>CA675-G10</title>\r\n" + 
//				"	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
//				"	\r\n" + 
//				"	<link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n" + 
//				"	\r\n" + 
//				"	<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n" + 
//				"	<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n" + 
//				"</head>\r\n" + 
//				"	\r\n" + 
//				"<body>\r\n" + 
//				"	<header>\r\n" + 
//				"		<div class=\"main\">\r\n" + 
//				"			<ul>\r\n" + 
//				"				<li><a href=\"index.html\">Home</a></li>\r\n" + 
//				"				<li><a href=\"About Project.html\">About Project</a></li>\r\n" + 
//				"				<li><a href=\"Contact Us.html\">Contact Us</a></li>\r\n" + 
//				"			</ul>\r\n" + 
//				"		</div>\r\n" + 
//				"		<div class=\"title\">\r\n" + 
//				"			<h1>Most Expensive Wines</h1>\r\n" + 
//				"		</div>\r\n" + 
//				"<div class=\"container\">\r\n" + 
//				"			<div class=\"input-group\">\r\n" + 
//				"				<form action=\"SearchEngine\" method=\"GET\">\r\n" + 
//				"					<input type=\"text\" class=\"form-control\"\r\n" + 
//				"						placeholder=\"Search Your Wine..\" name=\"search\">\r\n" + 
//				"					<div class=\"input-group-btn\">\r\n" + 
//				"						<button class=\"btn btn-default\" type=\"submit\">Search</button>\r\n" + 
//				"					</div>\r\n" + 
//				"				</form>\r\n" + 
//				"			</div>\r\n" + 
//				"		</div>\r\n" +
//				"	</header>");
//		//	  	response.getWriter().println("This is Palash123");
//		response.getWriter().println("       <fieldset>\r\n" + 
//				"          <legend>Selecting elements</legend>\r\n" +
//				"          <p>\r\n" + 
//		  		"             <label>Select Points : </label>\r\n" + 
//				"<form action=\"PredictedData\" method=\"GET\">\r\n" + 
//		  		"             <select name=\"points\">\r\n" + 
//		  		"               <option value = \"87\">87</option>\r\n" + 
//		  		"               <option value = \"89\">89</option>\r\n" + 
//		  		"               <option value = \"90\">90</option>\r\n" + 
//		  		"               <option value = \"95\">95</option>\r\n" + 
//		  		"             </select>\r\n"); 
//		response.getWriter().println( 
//						"             <label>Select Countries : </label>\r\n" + 
//						"             <select name=\"country\">\r\n" + 
//						"               <option value = \"1\">US</option>\r\n" + 
//						"               <option value = \"2\">Spain</option>\r\n" + 
//						"               <option value = \"3\">France</option>\r\n" + 
//						"               <option value = \"4\">Italy</option>\r\n" + 
//						"             </select>\r\n"); 
//		response.getWriter().println( 
//						"             <label>Select Variety : </label>\r\n" + 
//						"             <select name=\"variety\">\r\n" + 
//						"               <option value = \"50\">Cabernet Sauvignon</option>\r\n" + 
//						"               <option value = \"51\">Tinta de Toro</option>\r\n" + 
//						"               <option value = \"52\">Sauvignon Blanc</option>\r\n" + 
//						"               <option value = \"53\">Pinot Noir</option>\r\n" + 
//						"             </select>\r\n");
//		response.getWriter().println( 
//						"					<div class=\"input-group-btn\">\r\n" + 
//						"						<button class=\"btn btn-default\" type=\"submit\">Submit</button>\r\n" + 
//						"					</div>\r\n" + 
//						"    </form>");
//		response.getWriter().println("<img src=\"LR_cloud.PNG\" width=\"200\" height=\"100\">");			
//		response.getWriter().println("</body></html>");
		
		response.getWriter().println("<html>\r\n" + 
				"<head>\r\n" + 
				"	<title>CA675-G10</title>\r\n" + 
				"	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"	\r\n" + 
				"	<link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n" + 
				"	\r\n" + 
				"	<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n" + 
				"	<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n" + 
				"</head>\r\n" + 
				"	\r\n" + 
				"<body>\r\n" + 
				"	<header>\r\n" + 
				"		<div class=\"main\">\r\n" + 
				"			<ul>\r\n" + 
				"				<li><a href=\"Test1.html\">Home</a></li>\r\n" + 
				"				<li><a href=\"About Project.html\">About Project</a></li>\r\n" + 
				"				<li><a href=\"Contact Us.html\">Contact Us</a></li>\r\n" + 
				"			</ul>\r\n" + 
				"		</div>\r\n" + 
				"		<div class=\"title\">\r\n" + 
				"			<h1>Predict the Cost of Wine</h1>\r\n" + 
				"		</div>\r\n" + 
				"		<div class=\"container\">\r\n" + 
				"			<form> \r\n" + 
				"\r\n" + 
				"			</form>\r\n" + 
				"		</div>\r\n" + 
				"	</header>	\r\n" + 
				"	\r\n" + 
				"	<form action=\"PredictedData\" method=\"GET\" class=\"container1\">\r\n" + 
				"    <label>Select Variety : </label>\r\n" + 
				"	<select name=\"points\" class=\"form-predict\">\r\n" + 
				"<option value = \"1\">Cabernet Sauvignon50</option>\r\n" + 
				"<option value = \"2\">Tinta de Toro51</option>\r\n" + 
				"<option value = \"3\">Sauvignon Blanc52</option>\r\n" + 
				"<option value = \"4\">Pinot Noir53</option>\r\n" + 
				"<option value = \"5\">Provence red blend54</option>\r\n" + 
				"<option value = \"6\">Friulano55</option>\r\n" + 
				"<option value = \"7\">Tannat56</option>\r\n" + 
				"<option value = \"8\">Chardonnay57</option>\r\n" + 
				"<option value = \"9\">Tempranillo58</option>\r\n" + 
				"<option value = \"10\">Malbec59</option>\r\n" + 
				"<option value = \"11\">Rosé60</option>\r\n" + 
				"<option value = \"12\">Tempranillo Blend61</option>\r\n" + 
				"<option value = \"13\">Syrah62</option>\r\n" + 
				"<option value = \"14\">Mavrud63</option>\r\n" + 
				"<option value = \"15\">Sangiovese64</option>\r\n" + 
				"<option value = \"16\">Sparkling Blend65</option>\r\n" + 
				"<option value = \"17\">Rhône-style White Blend66</option>\r\n" + 
				"<option value = \"18\">Red Blend67</option>\r\n" + 
				"<option value = \"19\">Mencía68</option>\r\n" + 
				"<option value = \"20\">Palomino69</option>\r\n" + 
				"<option value = \"21\">Petite Sirah70</option>\r\n" + 
				"<option value = \"22\">Riesling71</option>\r\n" + 
				"<option value = \"23\">Cabernet Sauvignon-Syrah72</option>\r\n" + 
				"<option value = \"24\">Portuguese Red73</option>\r\n" + 
				"<option value = \"25\">Nebbiolo74</option>\r\n" + 
				"<option value = \"26\">Pinot Gris75</option>\r\n" + 
				"<option value = \"27\">Meritage76</option>\r\n" + 
				"<option value = \"28\">Baga77</option>\r\n" + 
				"<option value = \"29\">Glera78</option>\r\n" + 
				"<option value = \"30\">Malbec-Merlot79</option>\r\n" + 
				"<option value = \"31\">Merlot-Malbec80</option>\r\n" + 
				"<option value = \"32\">Ugni Blanc-Colombard81</option>\r\n" + 
				"<option value = \"33\">Viognier82</option>\r\n" + 
				"<option value = \"34\">Cabernet Sauvignon-Cabernet Franc83</option>\r\n" + 
				"<option value = \"35\">Moscato84</option>\r\n" + 
				"<option value = \"36\">Pinot Grigio85</option>\r\n" + 
				"<option value = \"37\">Cabernet Franc86</option>\r\n" + 
				"<option value = \"38\">White Blend87</option>\r\n" + 
				"<option value = \"39\">Monastrell88</option>\r\n" + 
				"<option value = \"40\">Gamay89</option>\r\n" + 
				"<option value = \"41\">Zinfandel90</option>\r\n" + 
				"<option value = \"42\">Greco91</option>\r\n" + 
				"<option value = \"43\">Barbera92</option>\r\n" + 
				"<option value = \"44\">Grenache93</option>\r\n" + 
				"<option value = \"45\">Rhône-style Red Blend94</option>\r\n" + 
				"<option value = \"46\">Albariño95</option>\r\n" + 
				"<option value = \"47\">Malvasia Bianca96</option>\r\n" + 
				"<option value = \"48\">Assyrtiko97</option>\r\n" + 
				"<option value = \"49\">Malagouzia98</option>\r\n" + 
				"<option value = \"50\">Carmenère99</option>\r\n" + 
				"<option value = \"51\">Bordeaux-style Red Blend100</option>\r\n" + 
				"<option value = \"52\">Touriga Nacional101</option>\r\n" + 
				"<option value = \"53\">Agiorgitiko102</option>\r\n" + 
				"<option value = \"54\">Picpoul103</option>\r\n" + 
				"<option value = \"55\">Godello104</option>\r\n" + 
				"<option value = \"56\">Gewürztraminer105</option>\r\n" + 
				"<option value = \"57\">Merlot106</option>\r\n" + 
				"<option value = \"58\">Syrah-Grenache107</option>\r\n" + 
				"<option value = \"59\">G-S-M108</option>\r\n" + 
				"<option value = \"60\">Mourvèdre109</option>\r\n" + 
				"<option value = \"61\">Bordeaux-style White Blend110</option>\r\n" + 
				"<option value = \"62\">Petit Verdot111</option>\r\n" + 
				"<option value = \"63\">Muscat112</option>\r\n" + 
				"<option value = \"64\">Chenin Blanc-Chardonnay113</option>\r\n" + 
				"<option value = \"65\">Cabernet Sauvignon-Merlot114</option>\r\n" + 
				"<option value = \"66\">Pinot Bianco115</option>\r\n" + 
				"<option value = \"67\">Alvarinho116</option>\r\n" + 
				"<option value = \"68\">Portuguese White117</option>\r\n" + 
				"<option value = \"69\">Garganega118</option>\r\n" + 
				"<option value = \"70\">Sauvignon119</option>\r\n" + 
				"<option value = \"71\">Gros and Petit Manseng120</option>\r\n" + 
				"<option value = \"72\">Tannat-Cabernet121</option>\r\n" + 
				"<option value = \"73\">Alicante Bouschet122</option>\r\n" + 
				"<option value = \"74\">Aragonês123</option>\r\n" + 
				"<option value = \"75\">Silvaner124</option>\r\n" + 
				"<option value = \"76\">Ugni Blanc125</option>\r\n" + 
				"<option value = \"77\">Grüner Veltliner126</option>\r\n" + 
				"<option value = \"78\">Frappato127</option>\r\n" + 
				"<option value = \"79\">Lemberger128</option>\r\n" + 
				"<option value = \"80\">Sylvaner129</option>\r\n" + 
				"<option value = \"81\">Chasselas130</option>\r\n" + 
				"<option value = \"82\">Alsace white blend131</option>\r\n" + 
				"<option value = \"83\">Früburgunder132</option>\r\n" + 
				"<option value = \"84\">Kekfrankos133</option>\r\n" + 
				"<option value = \"85\">Vermentino134</option>\r\n" + 
				"<option value = \"86\">Sherry135</option>\r\n" + 
				"<option value = \"87\">Aglianico136</option>\r\n" + 
				"<option value = \"88\">Torrontés137</option>\r\n" + 
				"<option value = \"89\">Primitivo138</option>\r\n" + 
				"<option value = \"90\">Semillon-Sauvignon Blanc139</option>\r\n" + 
				"<option value = \"91\">Portuguese Rosé140</option>\r\n" + 
				"<option value = \"92\">Grenache-Syrah141</option>\r\n" + 
				"<option value = \"93\">Prié Blanc142</option>\r\n" + 
				"<option value = \"94\">Negrette143</option>\r\n" + 
				"<option value = \"95\">Furmint144</option>\r\n" + 
				"<option value = \"96\">Carignane145</option>\r\n" + 
				"<option value = \"97\">Pinot Blanc146</option>\r\n" + 
				"<option value = \"98\"> Nero d'Avola: 147</option>\r\n" + 
				"<option value = \"99\">St. Laurent148</option>\r\n" + 
				"<option value = \"100\">Blauburgunder149</option>\r\n" + 
				"<option value = \"101\">Blaufränkisch150</option>\r\n" + 
				"<option value = \"102\">Scheurebe151</option>\r\n" + 
				"<option value = \"103\">Ribolla Gialla152</option>\r\n" + 
				"<option value = \"104\">Charbono153</option>\r\n" + 
				"<option value = \"105\">Malbec-Cabernet Sauvignon154</option>\r\n" + 
				"<option value = \"106\">Pinot Noir-Gamay155</option>\r\n" + 
				"<option value = \"107\">Pinot Nero156</option>\r\n" + 
				"<option value = \"108\">Gros Manseng157</option>\r\n" + 
				"<option value = \"109\">Nerello Mascalese158</option>\r\n" + 
				"<option value = \"110\">Shiraz159</option>\r\n" + 
				"<option value = \"111\">Negroamaro160</option>\r\n" + 
				"<option value = \"112\">Champagne Blend161</option>\r\n" + 
				"<option value = \"113\">Romorantin162</option>\r\n" + 
				"<option value = \"114\">Syrah-Cabernet Sauvignon163</option>\r\n" + 
				"<option value = \"115\">Tannat-Merlot164</option>\r\n" + 
				"<option value = \"116\">Duras165</option>\r\n" + 
				"<option value = \"117\">Garnacha166</option>\r\n" + 
				"<option value = \"118\">Tinta Francisca167</option>\r\n" + 
				"<option value = \"119\">Portuguese Sparkling168</option>\r\n" + 
				"<option value = \"120\">Chenin Blanc169</option>\r\n" + 
				"<option value = \"121\">Turbiana170</option>\r\n" + 
				"<option value = \"122\">Petite Verdot171</option>\r\n" + 
				"<option value = \"123\">Posip172</option>\r\n" + 
				"<option value = \"124\">Fumé Blanc173</option>\r\n" + 
				"<option value = \"125\">Roussanne174</option>\r\n" + 
				"<option value = \"126\">Grillo175</option>\r\n" + 
				"<option value = \"127\">Müller-Thurgau176</option>\r\n" + 
				"<option value = \"128\">Pinot Auxerrois177</option>\r\n" + 
				"<option value = \"129\">Port178</option>\r\n" + 
				"<option value = \"130\">Cabernet Blend179</option>\r\n" + 
				"<option value = \"131\">Cabernet Franc-Cabernet Sauvignon180</option>\r\n" + 
				"<option value = \"132\">Castelão181</option>\r\n" + 
				"<option value = \"133\">Encruzado182</option>\r\n" + 
				"<option value = \"134\">Touriga Nacional-Cabernet Sauvignon183</option>\r\n" + 
				"<option value = \"135\">Colombard-Sauvignon Blanc184</option>\r\n" + 
				"<option value = \"136\">Moscatel185</option>\r\n" + 
				"<option value = \"137\">Marsanne186</option>\r\n" + 
				"<option value = \"138\">Siria187</option>\r\n" + 
				"<option value = \"139\">Garnacha Blanca188</option>\r\n" + 
				"<option value = \"140\">Merlot-Cabernet Sauvignon189</option>\r\n" + 
				"<option value = \"141\">Arinto190</option>\r\n" + 
				"<option value = \"142\">Petit Manseng191</option>\r\n" + 
				"<option value = \"143\">Loureiro192</option>\r\n" + 
				"<option value = \"144\">Melon193</option>\r\n" + 
				"<option value = \"145\">Carricante194</option>\r\n" + 
				"<option value = \"146\">Fiano195</option>\r\n" + 
				"<option value = \"147\">Schwartzriesling196</option>\r\n" + 
				"<option value = \"148\">Sangiovese-Syrah197</option>\r\n" + 
				"<option value = \"149\">Tannat-Cabernet Franc198</option>\r\n" + 
				"<option value = \"150\">Cabernet Franc-Merlot199</option>\r\n" + 
				"<option value = \"151\">Sauvignon Blanc-Semillon200</option>\r\n" + 
				"<option value = \"152\">Macabeo201</option>\r\n" + 
				"<option value = \"153\">Alfrocheiro202</option>\r\n" + 
				"<option value = \"154\">Aligoté203</option>\r\n" + 
				"<option value = \"155\">Verdejo204</option>\r\n" + 
				"<option value = \"156\">Grenache Blanc205</option>\r\n" + 
				"<option value = \"157\">Fernão Pires206</option>\r\n" + 
				"<option value = \"158\">Spätburgunder207</option>\r\n" + 
				"<option value = \"159\">Ciliegiolo208</option>\r\n" + 
				"<option value = \"160\">Cabernet Sauvignon-Carmenère209</option>\r\n" + 
				"<option value = \"161\">Auxerrois210</option>\r\n" + 
				"<option value = \"162\">Sirica211</option>\r\n" + 
				"<option value = \"163\">Zweigelt212</option>\r\n" + 
				"<option value = \"164\">Pugnitello213</option>\r\n" + 
				"<option value = \"165\">Rosado214</option>\r\n" + 
				"<option value = \"166\">Rosato215</option>\r\n" + 
				"<option value = \"167\">Malvazija216</option>\r\n" + 
				"<option value = \"168\">Kalecik Karasi217</option>\r\n" + 
				"<option value = \"169\">Muskat Ottonel218</option>\r\n" + 
				"<option value = \"170\">Malbec-Bonarda219</option>\r\n" + 
				"<option value = \"171\">Tempranillo-Cabernet Sauvignon220</option>\r\n" + 
				"<option value = \"172\">Rivaner221</option>\r\n" + 
				"<option value = \"173\">Trepat222</option>\r\n" + 
				"<option value = \"174\">Baco Noir223</option>\r\n" + 
				"<option value = \"175\">Trebbiano224</option>\r\n" + 
				"<option value = \"176\">Chardonnay-Viognier225</option>\r\n" + 
				"<option value = \"177\">Syrah-Mourvèdre226</option>\r\n" + 
				"<option value = \"178\">Graciano227</option>\r\n" + 
				"<option value = \"179\">Roviello228</option>\r\n" + 
				"<option value = \"180\">Perricone229</option>\r\n" + 
				"<option value = \"181\">Falanghina230</option>\r\n" + 
				"<option value = \"182\">Vranec231</option>\r\n" + 
				"<option value = \"183\">Carignan232</option>\r\n" + 
				"<option value = \"184\">Cabernet-Shiraz233</option>\r\n" + 
				"<option value = \"185\">Verdelho234</option>\r\n" + 
				"<option value = \"186\">Pedro Ximénez235</option>\r\n" + 
				"<option value = \"187\">Marsanne-Roussanne236</option>\r\n" + 
				"<option value = \"188\">Malbec Blend237</option>\r\n" + 
				"<option value = \"189\">Weissburgunder238</option>\r\n" + 
				"<option value = \"190\">Morava239</option>\r\n" + 
				"<option value = \"191\">Ruen240</option>\r\n" + 
				"<option value = \"192\">Hondarrabi Zuri241</option>\r\n" + 
				"<option value = \"193\">Catarratto242</option>\r\n" + 
				"<option value = \"194\">Chardonnay-Sauvignon Blanc243</option>\r\n" + 
				"<option value = \"195\">Vidal244</option>\r\n" + 
				"<option value = \"196\">Rieslaner245</option>\r\n" + 
				"<option value = \"197\">Dornfelder246</option>\r\n" + 
				"<option value = \"198\">Tinto Fino247</option>\r\n" + 
				"<option value = \"199\">Gelber Muskateller248</option>\r\n" + 
				"<option value = \"200\">Roter Veltliner249</option>\r\n" + 
				"<option value = \"201\">Aragonez250</option>\r\n" + 
				"<option value = \"202\">Vitovska251</option>\r\n" + 
				"<option value = \"203\">Pinot Noir-Syrah252</option>\r\n" + 
				"<option value = \"204\">Gamay Noir253</option>\r\n" + 
				"<option value = \"205\">Grauburgunder254</option>\r\n" + 
				"<option value = \"206\">Cannonau255</option>\r\n" + 
				"<option value = \"207\">Mauzac256</option>\r\n" + 
				"<option value = \"208\">Austrian Red Blend257</option>\r\n" + 
				"<option value = \"209\">Sémillon258</option>\r\n" + 
				"<option value = \"210\">Lambrusco di Sorbara259</option>\r\n" + 
				"<option value = \"211\">Teran260</option>\r\n" + 
				"<option value = \"212\">Dolcetto261</option>\r\n" + 
				"<option value = \"213\">Cinsault262</option>\r\n" + 
				"<option value = \"214\">Assyrtico263</option>\r\n" + 
				"<option value = \"215\">Teroldego264</option>\r\n" + 
				"<option value = \"216\">Tamjanika265</option>\r\n" + 
				"<option value = \"217\">Boğazkere266</option>\r\n" + 
				"<option value = \"218\">Kadarka267</option>\r\n" + 
				"<option value = \"219\">Narince268</option>\r\n" + 
				"<option value = \"220\">Malbec-Petit Verdot269</option>\r\n" + 
				"<option value = \"221\">Veltliner270</option>\r\n" + 
				"<option value = \"222\">Traminer271</option>\r\n" + 
				"<option value = \"223\">Lambrusco272</option>\r\n" + 
				"<option value = \"224\">Arneis273</option>\r\n" + 
				"<option value = \"225\">Cabernet Sauvignon-Shiraz274</option>\r\n" + 
				"<option value = \"226\">Tocai Friulano275</option>\r\n" + 
				"<option value = \"227\">Fer Servadou276</option>\r\n" + 
				"<option value = \"228\">Muskateller277</option>\r\n" + 
				"<option value = \"229\">Nerello Cappuccio278</option>\r\n" + 
				"<option value = \"230\">Moscatel Roxo279</option>\r\n" + 
				"<option value = \"231\">Elbling280</option>\r\n" + 
				"<option value = \"232\">Saperavi281</option>\r\n" + 
				"<option value = \"233\">Antão Vaz282</option>\r\n" + 
				"<option value = \"234\">Pinot Meunier283</option>\r\n" + 
				"<option value = \"235\">Petite Syrah284</option>\r\n" + 
				"<option value = \"236\">Malvasia285</option>\r\n" + 
				"<option value = \"237\">Malbec-Tannat286</option>\r\n" + 
				"<option value = \"238\">Kallmet287</option>\r\n" + 
				"<option value = \"239\">Syrah-Merlot288</option>\r\n" + 
				"<option value = \"240\">Montepulciano289</option>\r\n" + 
				"<option value = \"241\">Kerner290</option>\r\n" + 
				"<option value = \"242\">Alvarinho-Chardonnay291</option>\r\n" + 
				"<option value = \"243\">Žilavka292</option>\r\n" + 
				"<option value = \"244\">Vinhão293</option>\r\n" + 
				"<option value = \"245\">Chardonnay-Semillon294</option>\r\n" + 
				"<option value = \"246\">Carmenère-Cabernet Sauvignon295</option>\r\n" + 
				"<option value = \"247\">Merlot-Cabernet Franc296</option>\r\n" + 
				"<option value = \"248\">Orangetraube297</option>\r\n" + 
				"<option value = \"249\">Cabernet Sauvignon-Sangiovese298</option>\r\n" + 
				"<option value = \"250\">Okuzgozu299</option>\r\n" + 
				"<option value = \"251\">Viura300</option>\r\n" + 
				"<option value = \"252\">Garnacha-Syrah301</option>\r\n" + 
				"<option value = \"253\">Zibibbo302</option>\r\n" + 
				"<option value = \"254\">Feteasca303</option>\r\n" + 
				"<option value = \"255\">Xarel-lo304</option>\r\n" + 
				"<option value = \"256\">Prokupac305</option>\r\n" + 
				"<option value = \"257\">Códega do Larinho306</option>\r\n" + 
				"<option value = \"258\">Touriga Nacional Blend307</option>\r\n" + 
				"<option value = \"259\">Inzolia308</option>\r\n" + 
				"<option value = \"260\">Cabernet-Syrah309</option>\r\n" + 
				"<option value = \"261\">Lambrusco Grasparossa310</option>\r\n" + 
				"<option value = \"262\">Malagousia311</option>\r\n" + 
				"<option value = \"263\">Cabernet Franc-Malbec312</option>\r\n" + 
				"<option value = \"264\">Feteasca Neagra313</option>\r\n" + 
				"<option value = \"265\">Yapincak314</option>\r\n" + 
				"<option value = \"266\">Tempranillo-Shiraz315</option>\r\n" + 
				"<option value = \"267\">Cabernet Sauvignon Grenache316</option>\r\n" + 
				"<option value = \"268\">Tinta Roriz317</option>\r\n" + 
				"<option value = \"269\">Merlot-Syrah318</option>\r\n" + 
				"<option value = \"270\">Tinta Fina319</option>\r\n" + 
				"<option value = \"271\">Colombard-Ugni Blanc320</option>\r\n" + 
				"<option value = \"272\">Colombard321</option>\r\n" + 
				"<option value = \"273\">Roditis322</option>\r\n" + 
				"<option value = \"274\">Grenache-Carignan323</option>\r\n" + 
				"<option value = \"275\">Emir324</option>\r\n" + 
				"<option value = \"276\">Orange Muscat325</option>\r\n" + 
				"<option value = \"277\">Karalahna326</option>\r\n" + 
				"<option value = \"278\">Trincadeira327</option>\r\n" + 
				"<option value = \"279\">Refosco328</option>\r\n" + 
				"<option value = \"280\">Pied de Perdrix329</option>\r\n" + 
				"<option value = \"281\">Vignoles330</option>\r\n" + 
				"<option value = \"282\">Carignan-Grenache331</option>\r\n" + 
				"<option value = \"283\"> Muscat d'Alexandrie: 332</option>\r\n" + 
				"<option value = \"284\">Bobal333</option>\r\n" + 
				"<option value = \"285\">Symphony334</option>\r\n" + 
				"<option value = \"286\">Norton335</option>\r\n" + 
				"<option value = \"287\">Sauvignon Blanc-Sauvignon Gris336</option>\r\n" + 
				"<option value = \"288\">Rkatsiteli337</option>\r\n" + 
				"<option value = \"289\">Roussanne-Viognier338</option>\r\n" + 
				"<option value = \"290\">Pinela339</option>\r\n" + 
				"<option value = \"291\">Blatina340</option>\r\n" + 
				"<option value = \"292\">Shiraz-Viognier341</option>\r\n" + 
				"<option value = \"293\">Bonarda342</option>\r\n" + 
				"<option value = \"294\">Sauvignon Blanc-Chardonnay343</option>\r\n" + 
				"<option value = \"295\">Chambourcin344</option>\r\n" + 
				"<option value = \"296\">Traminette345</option>\r\n" + 
				"<option value = \"297\">Grenache Blend346</option>\r\n" + 
				"<option value = \"298\">Jaen347</option>\r\n" + 
				"<option value = \"299\">Mondeuse348</option>\r\n" + 
				"<option value = \"300\">Feteascǎ Regalǎ349</option>\r\n" + 
				"<option value = \"301\">Teroldego Rotaliano350</option>\r\n" + 
				"<option value = \"302\">Sangiovese-Cabernet Sauvignon351</option>\r\n" + 
				"<option value = \"303\">Listán Negro352</option>\r\n" + 
				"<option value = \"304\">Syrah-Petite Sirah353</option>\r\n" + 
				"<option value = \"305\">Viognier-Chardonnay354</option>\r\n" + 
				"<option value = \"306\">Kuntra355</option>\r\n" + 
				"<option value = \"307\">Jacquère356</option>\r\n" + 
				"<option value = \"308\">Portuguiser357</option>\r\n" + 
				"<option value = \"309\">Grecanico358</option>\r\n" + 
				"<option value = \"310\">Verdejo-Viura359</option>\r\n" + 
				"<option value = \"311\">Tinto del Pais360</option>\r\n" + 
				"<option value = \"312\">Moscato Giallo361</option>\r\n" + 
				"<option value = \"313\">Cabernet Sauvignon-Malbec362</option>\r\n" + 
				"<option value = \"314\">Mission363</option>\r\n" + 
				"<option value = \"315\">Neuburger364</option>\r\n" + 
				"<option value = \"316\">Bastardo365</option>\r\n" + 
				"<option value = \"317\">Bical366</option>\r\n" + 
				"<option value = \"318\">Sacy367</option>\r\n" + 
				"<option value = \"319\">Carineña368</option>\r\n" + 
				"<option value = \"320\">Garnacha-Tempranillo369</option>\r\n" + 
				"<option value = \"321\">Pecorino370</option>\r\n" + 
				"<option value = \"322\">Garnacha Blend371</option>\r\n" + 
				"<option value = \"323\">Cococciola372</option>\r\n" + 
				"<option value = \"324\">Passerina373</option>\r\n" + 
				"<option value = \"325\">Gaglioppo374</option>\r\n" + 
				"<option value = \"326\">Garnacha Tintorera375</option>\r\n" + 
				"<option value = \"327\">Prieto Picudo376</option>\r\n" + 
				"<option value = \"328\">Tempranillo Blanco377</option>\r\n" + 
				"<option value = \"329\"> Cesanese d'Affile: 378</option>\r\n" + 
				"<option value = \"330\">Muscat Canelli379</option>\r\n" + 
				"<option value = \"331\">Cabernet380</option>\r\n" + 
				"<option value = \"332\">Malvasia Nera381</option>\r\n" + 
				"<option value = \"333\">Premsal382</option>\r\n" + 
				"<option value = \"334\">Mansois383</option>\r\n" + 
				"<option value = \"335\">Welschriesling384</option>\r\n" + 
				"<option value = \"336\">Shiraz-Tempranillo385</option>\r\n" + 
				"<option value = \"337\">Verdicchio386</option>\r\n" + 
				"<option value = \"338\">Sagrantino387</option>\r\n" + 
				"<option value = \"339\">Rolle388</option>\r\n" + 
				"<option value = \"340\">Trousseau Gris389</option>\r\n" + 
				"<option value = \"341\">Counoise390</option>\r\n" + 
				"<option value = \"342\">Mantonico391</option>\r\n" + 
				"<option value = \"343\">Cariñena-Garnacha392</option>\r\n" + 
				"<option value = \"344\">Insolia393</option>\r\n" + 
				"<option value = \"345\">Tokaji394</option>\r\n" + 
				"<option value = \"346\">Austrian white blend395</option>\r\n" + 
				"<option value = \"347\">Shiraz-Grenache396</option>\r\n" + 
				"<option value = \"348\">Claret397</option>\r\n" + 
				"<option value = \"349\">Syrah-Tempranillo398</option>\r\n" + 
				"<option value = \"350\">Uva di Troia399</option>\r\n" + 
				"<option value = \"351\">Aleatico400</option>\r\n" + 
				"<option value = \"352\">Piedirosso401</option>\r\n" + 
				"<option value = \"353\">Viognier-Marsanne402</option>\r\n" + 
				"<option value = \"354\">Pinot Grigio-Sauvignon Blanc403</option>\r\n" + 
				"<option value = \"355\">Pallagrello Nero404</option>\r\n" + 
				"<option value = \"356\">Chardonnay-Albariño405</option>\r\n" + 
				"<option value = \"357\">Savagnin406</option>\r\n" + 
				"<option value = \"358\">Pinotage407</option>\r\n" + 
				"<option value = \"359\">Braucol408</option>\r\n" + 
				"<option value = \"360\">Moschofilero409</option>\r\n" + 
				"<option value = \"361\">Nero di Troia410</option>\r\n" + 
				"<option value = \"362\">Carignano411</option>\r\n" + 
				"<option value = \"363\">Susumaniello412</option>\r\n" + 
				"<option value = \"364\">Baga-Touriga Nacional413</option>\r\n" + 
				"<option value = \"365\">Vidal Blanc414</option>\r\n" + 
				"<option value = \"366\">Vernaccia415</option>\r\n" + 
				"<option value = \"367\">Corvina Rondinella Molinara416</option>\r\n" + 
				"<option value = \"368\">Mavrotragano417</option>\r\n" + 
				"<option value = \"369\">Garnacha-Monastrell418</option>\r\n" + 
				"<option value = \"370\">Lagrein419</option>\r\n" + 
				"<option value = \"371\">Cabernet Merlot420</option>\r\n" + 
				"<option value = \"372\">Monastrell-Syrah421</option>\r\n" + 
				"<option value = \"373\">Malbec-Tempranillo422</option>\r\n" + 
				"<option value = \"374\">Syrah-Viognier423</option>\r\n" + 
				"<option value = \"375\">Verdeca424</option>\r\n" + 
				"<option value = \"376\">Sangiovese Grosso425</option>\r\n" + 
				"<option value = \"377\">Merlot-Argaman426</option>\r\n" + 
				"<option value = \"378\">Chenin Blanc-Viognier427</option>\r\n" + 
				"<option value = \"379\">Garnacha-Cabernet428</option>\r\n" + 
				"<option value = \"380\">Maturana429</option>\r\n" + 
				"<option value = \"381\">Malvar430</option>\r\n" + 
				"<option value = \"382\">Airen431</option>\r\n" + 
				"<option value = \"383\">Monica432</option>\r\n" + 
				"<option value = \"384\">Gewürztraminer-Riesling433</option>\r\n" + 
				"<option value = \"385\">Prugnolo Gentile434</option>\r\n" + 
				"<option value = \"386\">Steen435</option>\r\n" + 
				"<option value = \"387\">Chenin Blanc-Sauvignon Blanc436</option>\r\n" + 
				"<option value = \"388\">Shiraz-Cabernet Sauvignon437</option>\r\n" + 
				"<option value = \"389\">Picolit438</option>\r\n" + 
				"<option value = \"390\">Prosecco439</option>\r\n" + 
				"<option value = \"391\">White Riesling440</option>\r\n" + 
				"<option value = \"392\">White Port441</option>\r\n" + 
				"<option value = \"393\">Zierfandler442</option>\r\n" + 
				"<option value = \"394\">Petroulianos443</option>\r\n" + 
				"<option value = \"395\">Mavrodaphne444</option>\r\n" + 
				"<option value = \"396\">Savatiano445</option>\r\n" + 
				"<option value = \"397\">Tempranillo-Garnacha446</option>\r\n" + 
				"<option value = \"398\">Vidadillo447</option>\r\n" + 
				"<option value = \"399\">Syrah-Cabernet448</option>\r\n" + 
				"<option value = \"400\">Gelber Traminer449</option>\r\n" + 
				"<option value = \"401\">Grenache-Shiraz450</option>\r\n" + 
				"<option value = \"402\">Rotgipfler451</option>\r\n" + 
				"<option value = \"403\">Cabernet Sauvignon-Tempranillo452</option>\r\n" + 
				"<option value = \"404\">Edelzwicker453</option>\r\n" + 
				"<option value = \"405\">Cortese454</option>\r\n" + 
				"<option value = \"406\">Chardonnay Weissburgunder455</option>\r\n" + 
				"<option value = \"407\">Torbato456</option>\r\n" + 
				"<option value = \"408\">Verduzzo457</option>\r\n" + 
				"<option value = \"409\">Debit458</option>\r\n" + 
				"<option value = \"410\">Bovale459</option>\r\n" + 
				"<option value = \"411\">Tempranillo-Merlot460</option>\r\n" + 
				"<option value = \"412\">Xinisteri461</option>\r\n" + 
				"<option value = \"413\">Merlot-Cabernet462</option>\r\n" + 
				"<option value = \"414\">Verdejo-Sauvignon Blanc463</option>\r\n" + 
				"<option value = \"415\">Black Muscat464</option>\r\n" + 
				"<option value = \"416\">Koshu465</option>\r\n" + 
				"<option value = \"417\">Királyleányka466</option>\r\n" + 
				"<option value = \"418\">Favorita467</option>\r\n" + 
				"<option value = \"419\">Xinomavro468</option>\r\n" + 
				"<option value = \"420\">Cserszegi Fűszeres469</option>\r\n" + 
				"<option value = \"421\">Hárslevelü470</option>\r\n" + 
				"<option value = \"422\">Pallagrello471</option>\r\n" + 
				"<option value = \"423\">Mavroudi472</option>\r\n" + 
				"<option value = \"424\">Muscat Blanc473</option>\r\n" + 
				"<option value = \"425\">Schiava474</option>\r\n" + 
				"<option value = \"426\">Meoru475</option>\r\n" + 
				"<option value = \"427\">Nuragus476</option>\r\n" + 
				"<option value = \"428\">Trebbiano di Lugana477</option>\r\n" + 
				"<option value = \"429\">Coda di Volpe478</option>\r\n" + 
				"<option value = \"430\">Raboso479</option>\r\n" + 
				"<option value = \"431\">Shiraz-Pinotage480</option>\r\n" + 
				"<option value = \"432\">Enantio481</option>\r\n" + 
				"<option value = \"433\">Greco Bianco482</option>\r\n" + 
				"<option value = \"434\">Tai483</option>\r\n" + 
				"<option value = \"435\">Tokay484</option>\r\n" + 
				"<option value = \"436\">Muscadel485</option>\r\n" + 
				"<option value = \"437\">Cabernet Franc-Carmenère486</option>\r\n" + 
				"<option value = \"438\">Tintilia: 487</option>\r\n" + 
				"<option value = \"439\">Segalin488</option>\r\n" + 
				"<option value = \"440\">Lacrima489</option>\r\n" + 
				"<option value = \"441\">Cerceal490</option>\r\n" + 
				"<option value = \"442\">Cayuga491</option>\r\n" + 
				"<option value = \"443\">Sauvignon Gris492</option>\r\n" + 
				"<option value = \"444\">Albana493</option>\r\n" + 
				"<option value = \"445\">Corvina494</option>\r\n" + 
				"<option value = \"446\">Macabeo-Moscatel495</option>\r\n" + 
				"<option value = \"447\">Macabeo-Chardonnay496</option>\r\n" + 
				"<option value = \"448\">Moscadello497</option>\r\n" + 
				"<option value = \"449\">Nasco498</option>\r\n" + 
				"<option value = \"450\">Viognier-Roussanne499</option>\r\n" + 
				"<option value = \"451\">Plavac Mali500</option>\r\n" + 
				"<option value = \"452\">Cabernet Sauvignon-Merlot-Shiraz501</option>\r\n" + 
				"<option value = \"453\">Sauvignon Blanc-Chenin Blanc502</option>\r\n" + 
				"<option value = \"454\">Shiraz-Mourvèdre503</option>\r\n" + 
				"<option value = \"455\">Albarín504</option>\r\n" + 
				"<option value = \"456\">Black Monukka505</option>\r\n" + 
				"<option value = \"457\">Morio Muskat506</option>\r\n" + 
				"<option value = \"458\">Nielluciu507</option>\r\n" + 
				"<option value = \"459\">Alicante508</option>\r\n" + 
				"<option value = \"460\">Cabernet Sauvignon and Tinta Roriz509</option>\r\n" + 
				"<option value = \"461\">Viura-Chardonnay510</option>\r\n" + 
				"<option value = \"462\"> Loin de l'Oeil: 511</option>\r\n" + 
				"<option value = \"463\">Roter Traminer512</option>\r\n" + 
				"<option value = \"464\">Karasakiz513</option>\r\n" + 
				"<option value = \"465\">Casavecchia514</option>\r\n" + 
				"<option value = \"466\">Malvasia-Viura515</option>\r\n" + 
				"<option value = \"467\">Nosiola516</option>\r\n" + 
				"<option value = \"468\">Incrocio Manzoni517</option>\r\n" + 
				"<option value = \"469\">Viura-Verdejo518</option>\r\n" + 
				"<option value = \"470\">Erbaluce519</option>\r\n" + 
				"<option value = \"471\">Forcallà520</option>\r\n" + 
				"<option value = \"472\">Pansa Blanca521</option>\r\n" + 
				"<option value = \"473\">Catalanesca522</option>\r\n" + 
				"<option value = \"474\">Muscadelle523</option>\r\n" + 
				"<option value = \"475\">Malbec-Syrah524</option>\r\n" + 
				"<option value = \"476\">Petit Meslier525</option>\r\n" + 
				"<option value = \"477\">Johannisberg Riesling526</option>\r\n" + 
				"<option value = \"478\">Pignoletto527</option>\r\n" + 
				"<option value = \"479\">Cabernet Pfeffer528</option>\r\n" + 
				"<option value = \"480\">Syrah-Cabernet Franc529</option>\r\n" + 
				"<option value = \"481\">Valdiguié530</option>\r\n" + 
				"<option value = \"482\">Mazuelo531</option>\r\n" + 
				"<option value = \"483\">Brachetto532</option>\r\n" + 
				"<option value = \"484\">Jacquez533</option>\r\n" + 
				"<option value = \"485\">Moscofilero534</option>\r\n" + 
				"<option value = \"486\">Chardonnay-Sauvignon535</option>\r\n" + 
				"<option value = \"487\">Madeleine Angevine536</option>\r\n" + 
				"<option value = \"488\">Ruché537</option>\r\n" + 
				"<option value = \"489\">Merlot-Petite Verdot538</option>\r\n" + 
				"<option value = \"490\">Roussanne-Marsanne539</option>\r\n" + 
				"<option value = \"491\">Moscatel de Alejandría540</option>\r\n" + 
				"<option value = \"492\">Muscat Blanc à Petit Grain541</option>\r\n" + 
				"<option value = \"493\">Sämling542</option>\r\n" + 
				"<option value = \"494\">Mtsvane543</option>\r\n" + 
				"<option value = \"495\">Zlahtina544</option>\r\n" + 
				"<option value = \"496\">Zelen545</option>\r\n" + 
				"<option value = \"497\">Doña Blanca546</option>\r\n" + 
				"<option value = \"498\">Carmenère-Syrah547</option>\r\n" + 
				"<option value = \"499\">Roussanne-Grenache Blanc548</option>\r\n" + 
				"<option value = \"500\">Kinali Yapincak549</option>\r\n" + 
				"<option value = \"501\">Robola550</option>\r\n" + 
				"<option value = \"502\">Pinot Blanc-Chardonnay551</option>\r\n" + 
				"<option value = \"503\">Chardonnay-Pinot Blanc552</option>\r\n" + 
				"<option value = \"504\">Saperavi-Merlot553</option>\r\n" + 
				"<option value = \"505\">Malvasia Istriana554</option>\r\n" + 
				"<option value = \"506\">Torontel555</option>\r\n" + 
				"<option value = \"507\">Picapoll556</option>\r\n" + 
				"<option value = \"508\">Zierfandler-Rotgipfler557</option>\r\n" + 
				"<option value = \"509\">Malvasia Fina558</option>\r\n" + 
				"<option value = \"510\">Chinuri559</option>\r\n" + 
				"<option value = \"511\">Muscatel560</option>\r\n" + 
				"<option value = \"512\">Sousão561</option>\r\n" + 
				"<option value = \"513\">Silvaner-Traminer562</option>\r\n" + 
				"<option value = \"514\">Syrah-Carignan563</option>\r\n" + 
				"<option value = \"515\">Bukettraube564</option>\r\n" + 
				"<option value = \"516\">Muskat565</option>\r\n" + 
				"<option value = \"517\">Argaman566</option>\r\n" + 
				"<option value = \"518\">Provence white blend567</option>\r\n" + 
				"<option value = \"519\">Touriga Franca568</option>\r\n" + 
				"<option value = \"520\">Morillon569</option>\r\n" + 
				"<option value = \"521\">Carignan-Syrah570</option>\r\n" + 
				"<option value = \"522\">Aidani571</option>\r\n" + 
				"<option value = \"523\">Viognier-Grenache Blanc572</option>\r\n" + 
				"<option value = \"524\">Albarossa573</option>\r\n" + 
				"<option value = \"525\">Sauvignon Blanc-Verdejo574</option>\r\n" + 
				"<option value = \"526\">Grenache-Mourvèdre575</option>\r\n" + 
				"<option value = \"527\">Tannat-Syrah576</option>\r\n" + 
				"<option value = \"528\">Seyval Blanc577</option>\r\n" + 
				"<option value = \"529\">Tocai Rosso578</option>\r\n" + 
				"<option value = \"530\">Pinot-Chardonnay579</option>\r\n" + 
				"<option value = \"531\">Moscatel Graúdo580</option>\r\n" + 
				"<option value = \"532\">Pigato581</option>\r\n" + 
				"<option value = \"533\">Siegerrebe582</option>\r\n" + 
				"<option value = \"534\">Bombino Bianco583</option>\r\n" + 
				"<option value = \"535\">Trebbiano-Malvasia584</option>\r\n" + 
				"<option value = \"536\">Magliocco585</option>\r\n" + 
				"<option value = \"537\">Verduzzo Friulano: 586</option>\r\n" + 
				"<option value = \"538\">Vespaiolo587</option>\r\n" + 
				"<option value = \"539\">Marzemino588</option>\r\n" + 
				"<option value = \"540\">Tempranillo-Malbec589</option>\r\n" + 
				"<option value = \"541\">Crespiello590</option>\r\n" + 
				"<option value = \"542\">Cabernet Franc-Tempranillo591</option>\r\n" + 
				"<option value = \"543\">Gouveio592</option>\r\n" + 
				"<option value = \"544\">Caprettone593</option>\r\n" + 
				"<option value = \"545\">Garnacha-Graciano594</option>\r\n" + 
				"<option value = \"546\">Mataro595</option>\r\n" + 
				"<option value = \"547\"> Pineau d'Aunis: 596</option>\r\n" + 
				"<option value = \"548\">Bual597</option>\r\n" + 
				"<option value = \"549\">Sercial598</option>\r\n" + 
				"<option value = \"550\">Moscato di Noto599</option>\r\n" + 
				"<option value = \"551\">Sauvignonasse600</option>\r\n" + 
				"<option value = \"552\">Madeira Blend601</option>\r\n" + 
				"<option value = \"553\">St. George602</option>\r\n" + 
				"<option value = \"554\">Rebula603</option>\r\n" + 
				"<option value = \"555\">Pallagrello Bianco604</option>\r\n" + 
				"<option value = \"556\">Vilana605</option>\r\n" + 
				"<option value = \"557\">Pelaverga Piccolo606</option>\r\n" + 
				"<option value = \"558\">Syrah-Grenache-Viognier607</option>\r\n" + 
				"<option value = \"559\">Alvarelhão608</option>\r\n" + 
				"<option value = \"560\">Durif609</option>\r\n" + 
				"<option value = \"561\">Angevine610</option>\r\n" + 
				"<option value = \"562\">Semillon-Chardonnay611</option>\r\n" + 
				"<option value = \"563\">Pinot Blanc-Pinot Noir612</option>\r\n" + 
				"<option value = \"564\">Manzoni613</option>\r\n" + 
				"<option value = \"565\">Maréchal Foch614</option>\r\n" + 
				"<option value = \"566\">Blauer Portugieser615</option>\r\n" + 
				"<option value = \"567\">Tocai616</option>\r\n" + 
				"<option value = \"568\">Shiraz-Malbec617</option>\r\n" + 
				"<option value = \"569\">Cabernet Moravia618</option>\r\n" + 
				"<option value = \"570\">Espadeiro619</option>\r\n" + 
				"<option value = \"571\">País620</option>\r\n" + 
				"<option value = \"572\">Altesse621</option>\r\n" + 
				"<option value = \"573\">Avesso622</option>\r\n" + 
				"<option value = \"574\">Grignolino623</option>\r\n" + 
				"<option value = \"575\">Mandilaria624</option>\r\n" + 
				"<option value = \"576\">Freisa625</option>\r\n" + 
				"<option value = \"577\">Merlot-Shiraz626</option>\r\n" + 
				"<option value = \"578\">Dafni627</option>\r\n" + 
				"<option value = \"579\">Xynisteri628</option>\r\n" + 
				"<option value = \"580\">Grechetto629</option>\r\n" + 
				"<option value = \"581\">Roscetto630</option>\r\n" + 
				"<option value = \"582\">Sideritis631</option>\r\n" + 
				"<option value = \"583\">Pinotage-Merlot632</option>\r\n" + 
				"<option value = \"584\">Asprinio633</option>\r\n" + 
				"<option value = \"585\">Grolleau634</option>\r\n" + 
				"<option value = \"586\">Gragnano635</option>\r\n" + 
				"<option value = \"587\">Ansonica636</option>\r\n" + 
				"<option value = \"588\">Sangiovese Cabernet637</option>\r\n" + 
				"<option value = \"589\">Tinta Barroca638</option>\r\n" + 
				"<option value = \"590\">Syrah-Bonarda639</option>\r\n" + 
				"<option value = \"591\">Marsanne-Viognier640</option>\r\n" + 
				"<option value = \"592\">Azal641</option>\r\n" + 
				"<option value = \"593\">Durello642</option>\r\n" + 
				"<option value = \"594\">Syrah-Malbec643</option>\r\n" + 
				"<option value = \"595\">Malbec-Cabernet Franc644</option>\r\n" + 
				"<option value = \"596\">Franconia645</option>\r\n" + 
				"<option value = \"597\">Rufete646</option>\r\n" + 
				"<option value = \"598\">Parraleta647</option>\r\n" + 
				"<option value = \"599\">St. Vincent648</option>\r\n" + 
				"<option value = \"600\">Groppello649</option>\r\n" + 
				"<option value = \"601\">Athiri650</option>\r\n" + 
				"<option value = \"602\">Muscat of Alexandria651</option>\r\n" + 
				"<option value = \"603\">Malvoisie652</option>\r\n" + 
				"<option value = \"604\">Colorino653</option>\r\n" + 
				"<option value = \"605\">Merlot-Grenache654</option>\r\n" + 
				"<option value = \"606\">Terret Blanc655</option>\r\n" + 
				"<option value = \"607\">Chardonel656</option>\r\n" + 
				"<option value = \"608\">Macabeo-Gewürztraminer657</option>\r\n" + 
				"<option value = \"609\">Grenache Gris658</option>\r\n" + 
				"<option value = \"610\">Rabigato659</option>\r\n" + 
				"<option value = \"611\">Muscat Hamburg660</option>\r\n" + 
				"<option value = \"612\">Sarba661</option>\r\n" + 
				"<option value = \"613\">Irsai Oliver662</option>\r\n" + 
				"<option value = \"614\">Chardonnay-Pinot Gris663</option>\r\n" + 
				"<option value = \"615\">Vermentino Nero664</option>\r\n" + 
				"<option value = \"616\">Pardina665</option>\r\n" + 
				"<option value = \"617\">Apple666</option>\r\n" + 
				"<option value = \"618\">Clairette667</option>\r\n" + 
				"<option value = \"619\">Sauvignon Musqué668</option>\r\n" + 
				"<option value = \"620\">Shiraz-Merlot669</option>\r\n" + 
				"<option value = \"621\">Viognier-Valdiguié670</option>\r\n" + 
				"<option value = \"622\">Chardonelle671</option>\r\n" + 
				"<option value = \"623\">Malmsey672</option>\r\n" + 
				"<option value = \"624\">Tinta Negra Mole673</option>\r\n" + 
				"<option value = \"625\">Pinot Grigio-Chardonnay674</option>\r\n" + 
				"<option value = \"626\">Muscadet675</option>\r\n" + 
				"<option value = \"627\">Viura-Sauvignon Blanc676</option>\r\n" + 
				"<option value = \"628\">Huxelrebe677</option>\r\n" + 
				"<option value = \"629\">Tokay Pinot Gris678</option>\r\n" + 
				"<option value = \"630\">Chardonnay-Pinot Grigio679</option>\r\n" + 
				"<option value = \"631\">Moristel680</option>\r\n" + 
				"<option value = \"632\">Carnelian681</option>\r\n" + 
				"\r\n" + 
				"             </select>\r\n" + 
				"\r\n" + 
				"             <label>Select Countries: </label>\r\n" + 
				"                       <select name=\"country\" class=\"form-predict\">\r\n" + 
				"                <option value = \"31\">Albania</option>\r\n" + 
				"				<option value = \"7\">Argentina</option>\r\n" + 
				"				<option value = \"8\">Australia</option>\r\n" + 
				"				<option value = \"3\">Austria</option>\r\n" + 
				"				<option value = \"4\">Bosnia and Herzegovina 32</option>\r\n" + 
				"				<option value = \"5\">Brazil</option>\r\n" + 
				"				<option value = \"6\">Bulgaria</option>\r\n" + 
				"				<option value = \"7\">Canada</option>\r\n" + 
				"				<option value = \"8\">Chile</option>\r\n" + 
				"				<option value = \"9\">China</option>\r\n" + 
				"				<option value = \"10\">Croatia</option>\r\n" + 
				"				<option value = \"11\">Cyprus</option>\r\n" + 
				"				<option value = \"12\">Czech Republic</option>\r\n" + 
				"				<option value = \"13\">Egypt</option>\r\n" + 
				"				<option value = \"14\">England</option>\r\n" + 
				"				<option value = \"15\">France</option>\r\n" + 
				"				<option value = \"16\">Georgia</option>\r\n" + 
				"				<option value = \"17\">Germany</option>\r\n" + 
				"				<option value = \"18\">Greece</option>\r\n" + 
				"				<option value = \"19\">Hungary</option>\r\n" + 
				"				<option value = \"20\">India</option>\r\n" + 
				"				<option value = \"21\">Israel</option>\r\n" + 
				"				<option value = \"22\">Italy</option>\r\n" + 
				"				<option value = \"23\">Japan</option>\r\n" + 
				"				<option value = \"24\">Lebanon</option>\r\n" + 
				"				<option value = \"25\">Lithuania</option>\r\n" + 
				"				<option value = \"26\">Luxembourg</option>\r\n" + 
				"				<option value = \"27\">Macedonia</option>\r\n" + 
				"				<option value = \"28\">Mexico</option>\r\n" + 
				"				<option value = \"29\">Moldova</option>\r\n" + 
				"				<option value = \"30\">Montenegro</option>\r\n" + 
				"				<option value = \"31\">Morocco</option>\r\n" + 
				"				<option value = \"32\">New Zealand</option>\r\n" + 
				"				<option value = \"33\">Portugal</option>\r\n" + 
				"				<option value = \"34\">Romania</option>\r\n" + 
				"				<option value = \"35\">Serbia</option>\r\n" + 
				"				<option value = \"36\">Slovakia</option>\r\n" + 
				"				<option value = \"37\">Slovenia</option>\r\n" + 
				"				<option value = \"38\">South Africa</option>\r\n" + 
				"				<option value = \"39\">South Korea</option>\r\n" + 
				"				<option value = \"40\">Spain</option>\r\n" + 
				"				<option value = \"41\">Switzerland</option>\r\n" + 
				"				<option value = \"42\">Tunisia</option>\r\n" + 
				"				<option value = \"43\">Turkey</option>\r\n" + 
				"				<option value = \"44\">Ukraine</option>\r\n" + 
				"				<option value = \"45\">Uruguay</option>\r\n" + 
				"                <option value = \"46\">US</option>\r\n" + 
				"             </select>\r\n" + 
				"\r\n" + 
				"           <label>Select Variety: </label>\r\n" + 
				"                          <select name=\"points\" class=\"form-predict\">\r\n" + 
				"               <option value = \"80\">80</option>\r\n" +
				"               <option value = \"81\">81</option>\r\n" +
				"               <option value = \"82\">82</option>\r\n" +
				"               <option value = \"83\">83</option>\r\n" +
				"               <option value = \"84\">84</option>\r\n" +
				"               <option value = \"85\">85</option>\r\n" +
				"               <option value = \"86\">86</option>\r\n" +
				"               <option value = \"87\">87</option>\r\n" +
				"               <option value = \"88\">88</option>\r\n" +
				"               <option value = \"89\">89</option>\r\n" +
				"               <option value = \"90\">90</option>\r\n" +
				"               <option value = \"91\">91</option>\r\n" +
				"               <option value = \"92\">92</option>\r\n" +
				"               <option value = \"93\">93</option>\r\n" +
				"               <option value = \"94\">94</option>\r\n" +
				"               <option value = \"95\">95</option>\r\n" +
				"               <option value = \"96\">96</option>\r\n" +
				"               <option value = \"97\">97</option>\r\n" +
				"               <option value = \"98\">98</option>\r\n" +
				"               <option value = \"99\">99</option>\r\n" +
				"             </select>\r\n" + 
				"\r\n" + 
				"				<div class=\"input-group-btn\">\r\n" + 
				"					<button class=\"btn btn-default\" type=\"submit\">Submit</button>\r\n" + 
				"				</div>\r\n" + 
				"				\r\n" + 
				"				<div class=\"p1\">\r\n" + 
				"  <img src=\"LR_cloud.PNG\" alt=\"Top\" style=\"width:800px; height:400px;\">\r\n" + 
				"</div>\r\n" + 
				"		</form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
