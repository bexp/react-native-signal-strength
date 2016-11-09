//
//  RNSignalStrength.m
//  RNSignalStrength
//
//  Created by Leanid Vouk on 10/23/16.
//
//

#import "RCTBridge.h"
#import "RNSignalStrength.h"
#import <PZSpeed/PZSpeed.h>

@import CoreLocation;
@import SystemConfiguration;
@import CoreTelephony;
@import Foundation;

@implementation RNSignalStrength

@synthesize bridge = _bridge;

RCT_EXPORT_MODULE()

- (id) init {
    self = [super init];
    NSLog(@"RNSignalStrength init");
    [PZSpeedController controllerWithAppID: @"dca51e6ecd4fd71df12a26c8f5014ce6" apiKey: @"69fe84992a5242317d7235ce16c1b845090ec2d8"];
    
    return self;
}

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}


- (NSDictionary *)constantsToExport
{
    return @{
             @"signal": @"1",
             @"hello": @"world",
             };
}

RCT_EXPORT_METHOD(addEvent:(NSString *)name location:(NSString *)location)
{
    NSLog(@"Pretending to create an event %@ at %@", name, location);
}

@end
