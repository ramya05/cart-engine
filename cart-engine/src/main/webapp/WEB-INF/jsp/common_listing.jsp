<%@page import="java.util.Date"%>
<%@page import="com.mmt.engine.core.utils.FlightCombination"%>
<%@page import="com.mmt.util.ApplicationUtil"%>
<%@ page isELIgnored="false"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>

<head>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/jquery.mobile-1.1.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.21.custom.min.js"></script>
<link rel="stylesheet" href="css/jquery.mobile-1.1.1.min.css" />
<link rel="stylesheet" href="css/jquery.mobile.structure-1.1.1.min.css" />
<!-- <link rel="stylesheet" href="css/jquery.mobile.theme-1.1.1.min.css" /> -->
<link rel="stylesheet" href="css/jqm-docs.css" />
<style type="text/css">
.ui-effects-transfer {
	border: 1px solid black;
	background: #FAFAFA;
	opacity: 0.5;
}
</style>
</head>

<body>
	<h2>Hello World!</h2>
	<div data-role="page" class="type-interior">

		<div data-role="content">
			<div class="content-primary">
				<ul data-role="listview" data-split-icon="arrow-r"
					data-split-theme="d" data-theme="d" data-divider-theme="d"
					data-filter="true"
					data-filter-placeholder="Filter by airline / refundable / stops"
					data-inset="true">


					<c:if test="${result.type=='FLIGHT'}">
						<c:forEach var="flight"
							items="${result.response.response.searchResult.results }"
							varStatus="status">

							<c:if test="${status.index==0 }">

								<fmt:parseDate value="${flight.flightSegmentList[0].departure}"
									var="depDate" pattern="yyyy-MM-dd'T'HH:mm:ss" />

								<li data-role="list-divider">${flight.flightSegmentList[0].origin
									} to ${flight.flightSegmentList[0].destination } - <fmt:formatDate
										pattern="EEEEE, MMMM d, yyyy" value="${depDate}" /><span
									class="ui-li-count">${fn:length(result.response.response.searchResult.results)}
										Flights</span>


								</li>
							</c:if>

							<c:set var="flight" value="${flight}" scope="request"></c:set>
							<%
								request.setAttribute("fare", ApplicationUtil
												.getCombinationPrice((FlightCombination) request
														.getAttribute("flight")));
							%>


							<li><a href="index.html"> <c:forEach var="leg"
										varStatus="statleg" items="${flight.flightSegmentList}">

										<fmt:parseDate value="${leg.departure}" var="dep"
											pattern="yyyy-MM-dd'T'HH:mm:ss" />
										<fmt:parseDate value="${leg.arrival}" var="arv"
											pattern="yyyy-MM-dd'T'HH:mm:ss" />
										<c:set var="depD" scope="request" value="${dep}"></c:set>
										<c:set var="arvD" scope="request" value="${arv}"></c:set>

										<div class="ui-grid-d">
											<div class="ui-block-a">


												<p class="logo L${leg.carrierCode}"></p>
												<p>
													<strong>${leg.airlineName }</strong>
												</p>
												<p>${leg.carrierCode}-${leg.flightNumber }</p>
											</div>
											<div class="ui-block-b">
												</br>
												<p>
													<strong><fmt:formatDate pattern="H:mm a"
															value="${dep}" /></strong>
												</p>
												<p>${leg.origin}</p>
											</div>
											<div class="ui-block-c">
												</br>
												<p>
													<strong><fmt:formatDate pattern="H:mm a"
															value="${arv}" /></strong>
												</p>
												<p>${leg.destination}</p>
											</div>
											<div class="ui-block-d">
												</br>
												<p>
													<strong><%=ApplicationUtil.getDuration(
								(Date) request.getAttribute("depD"),
								(Date) request.getAttribute("arvD"))%></strong>
												</p>
												<p>

													<c:if test="${leg.numOfStops==0}">Non Stop</c:if>
													<c:if test="${leg.numOfStops>0}">


														<span> <c:if test="${leg.numOfStops==1}">One Stop</c:if>
															<c:if test="${leg.numOfStops==2}">Two Stop</c:if>
														</span>
													</c:if>
												</p>
												<p>
													<c:if test="${leg.quotesList[0].refundable}">Refundable</c:if>
													<c:if test="${not leg.quotesList[0].refundable}">Non Refundable</c:if>
												</p>
											</div>

											<c:if test="${statleg.index==0}">
												<div class="ui-block-e">
													</br>
													<h1 class="big"
														title="Rs <fmt:formatNumber type="number" value="${fare}" />">
														Rs
														<fmt:formatNumber type="number" value="${fare}" />
													</h1>
												</div>
											</c:if>

										</div>

									</c:forEach>




							</a></li>
						</c:forEach>
					</c:if>

					<c:if test="${result.type=='BUS'}">


						<li data-role="list-divider">${result.response.wsCheckAvailabilityRS.trip[0].fromCity}
							- ${result.response.wsCheckAvailabilityRS.trip[0].toCity}<span
							class="ui-li-count">${fn:length(result.response.wsCheckAvailabilityRS.trip)}
								Buses</span>


						</li>

						<c:forEach var="busitem"
							items="${result.response.wsCheckAvailabilityRS.trip }">
							<li data-filtertext="IT,Kingfisher"><a href="index.html">
									<div class="ui-grid-d">
										<div class="ui-block-a">
											<br />
											<p class="bus"></p>

											<p>
												<strong>${busitem.groupName }</strong>
											</p>
											<p>${busitem.seatType }</p>
										</div>
										<div class="ui-block-b">
											</br>
											<p>

												<fmt:parseDate value="${busitem.tripTime }" var="dep"
													pattern="E MMM dd HH:mm:ss z yyyy" />
												<strong> <fmt:formatDate pattern="hh:mm a"
														value="${dep}" />
												</strong>
											</p>
											<p>${busitem.fromCity}</p>
										</div>
										<div class="ui-block-c">
											</br>
											<p>
												<c:if
													test="${not empty busitem.arrivalTime and (not busitem.arrivalTime=='null' )}">
													<fmt:parseDate value="${busitem.arrivalTime }" var="arv"
														pattern="E MMM dd HH:mm:ss z yyyy" />
													<strong> <fmt:formatDate pattern="hh:mm a"
															value="${arv}" />
													</strong>
												</c:if>

												<c:if
													test="${ empty busitem.arrivalTime or busitem.arrivalTime=='null'}">
												N/A
												</c:if>

											</p>
											<p>${busitem.toCity}</p>
											<div data-role="fieldcontain">
												<select name="select-choice-1" data-native-menu="false"
													data-inline="true" data-mini="true">
													<c:forEach items="${busitem.pickupPoints.pickupPoint }"
														var="point">
														<option value="${point.pickupPointid }">${point.name}
															- ${point.arivalTime }</option>
													</c:forEach>

												</select>
											</div>

										</div>
										<div class="ui-block-d">
											</br>
											<!-- 											<p>Non Stop</p> -->
											<p>
												<c:if test="${fn:contains(busitem.busType,'A/C')}">
													<span class="sprite_bus bus_ac_on"></span>
												</c:if>
												<c:if test="${not fn:contains(busitem.busType,'A/C')}">
													<span class="sprite_bus bus_ac"></span>
												</c:if>

												<c:if
													test="${fn:contains(busitem.busType,'VOLVO') or fn:contains(busitem.busType,'Volvo')}">
													<span class="sprite_bus bus_volvo_on"></span>
												</c:if>
												<c:if
													test="${not (fn:contains(busitem.busType,'VOLVO') or fn:contains(busitem.busType,'Volvo'))}">
													<span class="sprite_bus bus_volvo"></span>
												</c:if>

												<c:if
													test="${fn:contains(busitem.busType,'Seater') or (not empty busitem.seatFare) }">
													<span class="sprite_bus bus_seater_on"></span>
												</c:if>
												<c:if
													test="${not fn:contains(busitem.busType,'Seater') and ( empty busitem.seatFare) }">
													<span class="sprite_bus bus_seater"></span>
												</c:if>

												<c:if
													test="${fn:contains(busitem.busType,'Sleeper') or (not empty busitem.sleeperFare)}">
													<span class="sprite_bus bus_sl_on"></span>
												</c:if>
												<c:if
													test="${not fn:contains(busitem.busType,'Sleeper') and ( empty busitem.sleeperFare)}">
													<span class="sprite_bus bus_sl"></span>
												</c:if>

											</p>
										</div>

										<div class="ui-block-e">
											</br>

											<c:if test="${not empty  busitem.sleeperFare }">
												<h1 class="big"
													title="Rs <fmt:formatNumber type="number" value="${busitem.sleeperFare }" />">
													Rs
													<fmt:formatNumber type="number"
														value="${busitem.sleeperFare }" />
													<c:if
														test="${not empty  busitem.sleeperFare and not empty busitem.seatFare}">
														<span class="sprite_bus bus_sl_on flr"></span>
													</c:if>
												</h1>
											</c:if>
											<c:if test="${not empty  busitem.seatFare }">
												<h1 class="big"
													title="Rs <fmt:formatNumber type="number" value="${busitem.seatFare }" />">
													Rs
													<fmt:formatNumber type="number"
														value="${busitem.seatFare }" />
													<c:if
														test="${not empty  busitem.sleeperFare and not empty busitem.seatFare}">
														<span class="sprite_bus bus_seater_on flr"></span>
													</c:if>

												</h1>
											</c:if>

										</div>



									</div>

							</a></li>
						</c:forEach>

					</c:if>




				</ul>

			</div>




		</div>
		<div class="content-secondary">
			<!-- 			<select> -->
			<%-- 				<c:forEach items="${cities}" var="city"> --%>
			<%-- 					<option value="${city.ctyFltcode}">${city.ctyName }</option> --%>
			<%-- 				</c:forEach> --%>

			<!-- 			</select> -->
		</div>


	</div>
	<!-- /page -->

</body>
</html>
